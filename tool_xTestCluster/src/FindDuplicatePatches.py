import csv

from src.ProjectSupport import *


def get_affected_files(patch):
    affected_files = list()
    for patch_line in patch:
        if patch_line.startswith('--- '):
            file_name = patch_line.split('--- ')[1]
            if file_name.startswith('/'):
                file_name = file_name[1:]

            affected_files.append(file_name)

    return affected_files


def get_num_hunks(patch, file_name):
    num_hunks = 0
    current_file_name = ''
    for patch_line in patch:
        if patch_line.startswith('--- '):
            current_file_name = patch_line.split('--- ')[1]
            if current_file_name.startswith('/'):
                current_file_name = current_file_name[1:]

            continue

        if current_file_name == file_name and patch_line.startswith('@@ -'):
            num_hunks += 1

    return num_hunks


def get_hunk_start_lines(patch, file_name):
    start_lines = list()
    current_file_name = ''
    for patch_line in patch:
        if patch_line.startswith('--- '):
            current_file_name = patch_line.split('--- ')[1]
            if current_file_name.startswith('/'):
                current_file_name = current_file_name[1:]

            continue

        if current_file_name == file_name and patch_line.startswith('@@ -'):
            start_line = patch_line.split('@@ -')[1].split(',')[0]
            start_lines.append(start_line)

    return start_lines


def clean_hunks(hunk):
    cleaned_hunk = list()
    for line in hunk:
        if line.startswith('+'):
            line = line[1:]
            if line.startswith(' '):
                line.strip()
                line = line.lstrip()

            if line.startswith('//'):
                continue

            line = '+' + line
            if line.endswith('\n'):
                line = line[:-1]
            cleaned_hunk.append(line)
            continue

        if line.endswith('\n'):
            line = line[:-1]
        cleaned_hunk.append(line)

    return cleaned_hunk


def compare_hunks(hunk_key, hunk_search):
    hunk_key = clean_hunks(hunk_key)
    hunk_search = clean_hunks(hunk_search)

    for line_index in range(0, len(hunk_key)):
        line_key = hunk_key[line_index]
        if line_index >= len(hunk_search):
            if line_key.startswith('+') or line_key.startswith('-'):
                return False

            continue

        line_search = hunk_search[line_index]

        if line_key != line_search:
            return False

    if len(hunk_search) > len(hunk_key):
        for trailing_index in range(len(hunk_key), len(hunk_search)):
            line_search = hunk_search[trailing_index]
            if line_search.startswith('+') or line_search.startswith('-'):
                return False

    return True


def get_hunk(patch, file_name, start_line):
    hunk = list()
    hunk_found = False
    current_file_name = ''
    for patch_line in patch:
        if patch_line.startswith('--- '):
            current_file_name = patch_line.split('--- ')[1]
            if current_file_name.startswith('/'):
                current_file_name = current_file_name[1:]

            continue

        if current_file_name == file_name and patch_line.startswith('@@ -'):
            hunk_start_line = patch_line.split('@@ -')[1].split(',')[0]
            if hunk_start_line == start_line:
                hunk_found = True
                continue

        if hunk_found and patch_line.startswith('@@ -'):
            hunk_found = False

        if hunk_found:
            hunk.append(patch_line)

    return hunk


def compare_patches(patch_key, patch_search):
    affected_files_key = get_affected_files(patch_key)
    affected_files_search = get_affected_files(patch_search)
    if len(affected_files_key) != len(affected_files_search):
        return False

    for affected_file_key in affected_files_key:
        if affected_file_key not in affected_files_search:
            return False

    for affected_file in affected_files_key:
        num_hunks_key = get_num_hunks(patch_key, affected_file)
        num_hunks_search = get_num_hunks(patch_search, affected_file)

        if num_hunks_key != num_hunks_search:
            return False

        hunk_start_lines_key = get_hunk_start_lines(patch_key, affected_file)
        hunk_start_lines_search = get_hunk_start_lines(patch_search, affected_file)

        for hunk_index in range(0, num_hunks_key):
            if hunk_start_lines_key[hunk_index] != hunk_start_lines_search[hunk_index]:
                return False

            hunk_start_line = hunk_start_lines_key[hunk_index]
            hunk_key = get_hunk(patch_key, affected_file, hunk_start_line)
            hunk_search = get_hunk(patch_search, affected_file, hunk_start_line)
            is_hunk_match = compare_hunks(hunk_key, hunk_search)
            if not is_hunk_match:
                return False

    return True


def find_duplicate_patches(patchesFolderPaths, results_dir, considerUnassessed = True):

    if not os.path.exists(results_dir):
        os.makedirs(results_dir)

    all_bugs = retrieveAllBugs(patchesDirs=patchesFolderPaths)
    max_num_groups = 0
    all_patch_groups = dict()
    for bug_id in all_bugs:
        print('Finding duplicate patches in %s' % bug_id)
        patches = retrieveAllPatchesFromBugid(bug_id, patchesFolderPaths, considerUnassessed)
        if len(patches) == 0:
            continue

        all_patches_per_id = dict()
        patch_groups = list()
        for patch_path in patches:
            with open(patch_path) as patch_file:
                patch_lines = patch_file.readlines()
                all_patches_per_id[patch_path] = patch_lines

            patch_file.close()

        # check for duplicates
        duplicate_indices = set()
        for patch_index in range(0, len(patches)):
            if patch_index in duplicate_indices:
                continue

            patch_name_key = patches[patch_index]
            patch_key = all_patches_per_id[patch_name_key]
            patch_groups.append([patch_name_key])
            for search_index in range(patch_index + 1, len(patches)):
                if search_index in duplicate_indices:
                    continue

                patch_name_search = patches[search_index]
                patch_search = all_patches_per_id[patch_name_search]
                is_duplicate = compare_patches(patch_key, patch_search)
                if is_duplicate:
                    patch_groups[-1].append(patch_name_search)
                    duplicate_indices.add(search_index)

        all_patch_groups[bug_id] = patch_groups
        max_num_groups = max(len(patch_groups), max_num_groups)

    duplicate_patches_out_fp = os.path.join(results_dir, 'duplicate_patches.csv')

    header = list()
    header.append('bugid')
    for group_id in range(1, max_num_groups + 1):
        header.append('gid ' + str(group_id))

    with open(duplicate_patches_out_fp, 'w', newline='') as duplicate_patches_out_csv:
        csv.writer(duplicate_patches_out_csv).writerow(header)

    for bug_id in all_patch_groups:
        out_row = list()
        out_row.append(bug_id)
        patch_groups = all_patch_groups[bug_id]
        num_groups = len(patch_groups)
        for group_id in range(0, num_groups):
            cell = ''
            for patch in patch_groups[group_id]:
                if cell != '':
                    cell += '|'
                cell += patch

            out_row.append(cell)

        with open(duplicate_patches_out_fp, 'a', newline='') as duplicate_patches_out_csv:
            csv.writer(duplicate_patches_out_csv).writerow(out_row)

    return all_patch_groups