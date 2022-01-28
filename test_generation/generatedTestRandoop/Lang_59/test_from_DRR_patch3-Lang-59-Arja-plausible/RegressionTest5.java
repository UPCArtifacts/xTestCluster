import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test2501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2501");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.append(15);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        int int14 = strBuilder9.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strBuilder19.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder9.appendWithSeparators((java.util.Iterator) strTokenizer20, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding((int) (short) 10, '#');
        int int29 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strBuilder34.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.appendWithSeparators((java.util.Iterator) strTokenizer35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray62 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder49.insert(0, charArray62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder42.append(charArray62);
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.replaceFirst(strMatcher65, "hi!");
        char[] charArray68 = strBuilder64.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder40.append(charArray68, (int) (byte) 1, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder22.append(charArray68, 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder1.append(charArray68, 20, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        int int14 = strBuilder9.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.clear();
        java.lang.String str24 = strBuilder23.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst("######################0", "\n\nfalse");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder1.append((java.lang.Object) "\n\nfalse");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.appendFixedWidthPadLeft(21, 2, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.appendNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendFixedWidthPadLeft(10, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.replace((int) (short) 0, 2, "##########10");
        java.lang.String str10 = strBuilder9.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.deleteAll("###10");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append((int) (byte) 10);
        char[] charArray21 = strBuilder18.toCharArray();
        java.lang.String str23 = strBuilder18.leftString((int) (short) -1);
        boolean boolean24 = strBuilder9.equals((java.lang.Object) strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[1, 0]");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.appendWithSeparators(collection10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.minimizeCapacity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteCharAt(16);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendFixedWidthPadLeft(10, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setNewLineText("           ");
        int int9 = strBuilder5.indexOf('1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.append("-1.0hi!#####10###", 106, 102);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.appendWithSeparators(collection10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.setLength(102);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray39 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder26.insert(0, charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder19.append(charArray39);
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceFirst(strMatcher42, "hi!");
        char[] charArray45 = strBuilder41.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder17.append(charArray45);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int23 = strBuilder3.lastIndexOf(strMatcher21, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int36 = strBuilder27.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder27.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder27.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder41, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceFirst('a', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.insert(15, true);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder47.append(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        int int54 = strBuilder47.lastIndexOf(strMatcher53);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        boolean boolean6 = strBuilder3.endsWith("4");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.setNewLineText("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (short) 10, '#');
        boolean boolean15 = strBuilder13.startsWith("hi!");
        boolean boolean17 = strBuilder13.contains("hi!");
        java.lang.String str19 = strBuilder13.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst('-', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.replaceAll(strMatcher25, "##4##########101                                                                                                #");
        boolean boolean28 = strBuilder3.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.append("true########0         ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "##" + "'", str19, "##");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendPadding((int) (short) 10, '#');
        java.lang.String str21 = strBuilder16.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray38 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder25.insert(0, charArray38);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder25.appendPadding(0, 'a');
        java.lang.Object obj44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.insert((int) (short) 0, obj44);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) strBuilder45, (int) ' ', '4');
        int int53 = strBuilder45.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int67 = strBuilder64.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder64.replaceFirst("", "##");
        java.util.Collection collection71 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.appendWithSeparators(collection71, "\n");
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.appendWithSeparators(objArray74, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder54.appendWithSeparators(objArray74, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder9.appendWithSeparators(objArray74, "a###################");
        int int82 = strBuilder9.lastIndexOf('1');
        java.util.Collection collection83 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder9.appendWithSeparators(collection83, "a#########01##########4##");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 20 + "'", int82 == 20);
        org.junit.Assert.assertNotNull(strBuilder85);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer56 = strBuilder52.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder36.append(stringBuffer56);
        boolean boolean59 = strBuilder36.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder36.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.Object[] objArray64 = new java.lang.Object[] { strBuilder18, strBuilder36 };
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder14.appendWithSeparators(objArray64, "4##########101                                                                                                ");
        boolean boolean68 = strBuilder66.startsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.append((float) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.appendPadding((int) (short) 10, '#');
        int int77 = strBuilder72.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder79 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = strBuilder82.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder72.appendWithSeparators((java.util.Iterator) strTokenizer83, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder85.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder70.appendFixedWidthPadLeft((java.lang.Object) "##########true", 22, 't');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(stringBuffer56);
        org.junit.Assert.assertEquals(stringBuffer56.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray64), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray64), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(13);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll("#");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.reverse();
        java.lang.String str7 = strBuilder1.midString((-1), 5);
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        int int10 = strBuilder1.indexOf(strMatcher8, 42);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.append("true########10          ", 35, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int32 = strBuilder3.lastIndexOf(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer56 = strBuilder52.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder36.append(stringBuffer56);
        boolean boolean59 = strBuilder36.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean65 = strBuilder62.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean70 = strBuilder67.equalsIgnoreCase(strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder69.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder69.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray82 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder69.insert(0, charArray82);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder62.append(charArray82);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder36.insert((int) (short) 10, charArray82);
        char[] charArray86 = strBuilder3.getChars(charArray82);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder3.appendFixedWidthPadLeft(24, (-1), 'e');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(stringBuffer56);
        org.junit.Assert.assertEquals(stringBuffer56.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, #, #, #, #, #, #, #, #, #, #, 1, 0, 0, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a]");
        org.junit.Assert.assertNotNull(strBuilder90);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(12);
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        int int3 = strBuilder1.lastIndexOf(strMatcher2);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder5.equalsIgnoreCase(strBuilder7);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray25 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder12.insert(0, charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder5.append(charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder5.insert((int) (byte) 0, "-1.0");
        java.lang.Object obj31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder5.appendFixedWidthPadRight(obj31, 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder5.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.ensureCapacity(39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder38, 23, 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.appendPadding((int) (short) 10, '#');
        int int7 = strBuilder2.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder2.setNullText("");
        java.lang.String str11 = strBuilder9.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray28 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder15.insert(0, charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder15.appendPadding(0, 'a');
        java.lang.Object obj34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.insert((int) (short) 0, obj34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder9.append((java.lang.Object) strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.setNewLineText("");
        int int43 = strBuilder40.indexOf("##########true", (int) (byte) 10);
        boolean boolean44 = strBuilder0.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder0.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder55.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteFirst(strMatcher57);
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strBuilder56.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder0.append(strBuilder56);
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strBuilder60.asTokenizer();
        int int64 = strBuilder60.lastIndexOf("##########", (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder60.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.replaceAll('4', ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder65.insert(14, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll("4##########101                                                                                                ", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append("");
        java.lang.String str36 = strBuilder32.leftString(5);
        boolean boolean38 = strBuilder32.contains("##4##########10#");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder32.insert(55, 25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "     " + "'", str36, "     ");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        int int19 = strBuilder16.lastIndexOf("########10##########100aaaaaaa-1.0a", 36);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append((java.lang.Object) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.deleteAll("                               #");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.delete((int) (short) 0, 0);
        int int32 = strBuilder31.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendWithSeparators(collection35, "");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder31.append(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder31.append(true);
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder31.replace(strMatcher46, "##########true", 0, 0, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder17.append((java.lang.Object) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 32 + "'", int32 == 32);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder4.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        int int30 = strBuilder4.lastIndexOf(strMatcher28, 11);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendPadding((int) (short) 10, '#');
        int int37 = strBuilder32.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.setNullText("");
        java.lang.String str41 = strBuilder39.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray58 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder45.insert(0, charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder45.appendPadding(0, 'a');
        java.lang.Object obj64 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (short) 0, obj64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder39.append((java.lang.Object) strBuilder65);
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder39.replaceAll(strMatcher69, "4##########101                                                                                                ");
        int int74 = strBuilder71.lastIndexOf(' ', 0);
        java.lang.String str75 = strBuilder71.getNewLineText();
        int int77 = strBuilder71.indexOf('t');
        java.lang.StringBuffer stringBuffer78 = strBuilder71.toStringBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder4.append(stringBuffer78, 111, (int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer78);
        org.junit.Assert.assertEquals(stringBuffer78.toString(), "##########");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.ensureCapacity((int) (byte) 0);
        int int17 = strBuilder16.capacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.replace(44, 157, "##4##########10\000");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean26 = strBuilder3.endsWith("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder3.deleteFirst('4');
        boolean boolean30 = strBuilder3.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder3.appendNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.append('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder10.appendPadding(0, 'a');
        java.lang.Object obj29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert((int) (short) 0, obj29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, (int) ' ', '4');
        int int38 = strBuilder30.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder51.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.append(false);
        int int55 = strBuilder51.capacity();
        java.util.Collection collection56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder51.appendWithSeparators(collection56, "");
        boolean boolean59 = strBuilder30.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.replaceAll("\000\000\000\000\000\000\000\000\0000", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 32 + "'", int55 == 32);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strBuilder62);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        java.lang.Object obj28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.insert((int) (short) 0, obj28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray57 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder44.insert(0, charArray57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder37.append(charArray57);
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.replaceFirst(strMatcher60, "hi!");
        char[] charArray63 = strBuilder59.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder35.append(charArray63, (int) (byte) 0, 0);
        char[] charArray67 = strBuilder5.getChars(charArray63);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder5.replaceFirst("\n", "#################1true0");
        int int72 = strBuilder70.lastIndexOf('1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        int int9 = strBuilder8.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendWithSeparators(collection12, "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.append(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.setNewLineText("           ");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append(false);
        int int26 = strBuilder22.lastIndexOf("-1.0hi!#####10###");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append(2);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder26.replaceAll("", "");
        int int36 = strBuilder26.length();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder26.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder17.append(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("##");
        boolean boolean42 = strBuilder17.equals((java.lang.Object) "##");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 10 + "'", int36 == 10);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder30.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst(strMatcher32);
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strBuilder31.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.deleteFirst(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) strMatcher35, (int) (short) 0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder39.appendNewLine();
        int int43 = strBuilder39.indexOf('a', (int) (byte) 0);
        java.lang.Class<?> wildcardClass44 = strBuilder39.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray45 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder32.insert(0, charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer52 = strBuilder48.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder32.append(stringBuffer52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder17.append(stringBuffer52);
        int int57 = strBuilder17.lastIndexOf('4', (int) (byte) -1);
        java.io.Writer writer58 = strBuilder17.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.appendWithSeparators(collection61, "");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder60.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.appendNewLine();
        java.util.Collection collection69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder65.appendWithSeparators(collection69, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder71.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher73 = null;
        int int75 = strBuilder72.indexOf(strMatcher73, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder17.append(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder76.reverse();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.insert((int) (byte) 100, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(stringBuffer52);
        org.junit.Assert.assertEquals(stringBuffer52.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(writer58);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        java.lang.String str5 = strBuilder4.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder9.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader31 = strBuilder9.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int36 = strBuilder34.lastIndexOf('4');
        char[] charArray37 = strBuilder34.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder9.insert((int) (short) 10, charArray37);
        int int41 = strBuilder38.lastIndexOf("", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendWithSeparators(collection44, "");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder46.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder38.appendFixedWidthPadRight((java.lang.Object) strBuilder46, 10, '1');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder56, (int) '-', '4');
        int int62 = strBuilder4.lastIndexOf("           ", 12);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int66 = strBuilder64.lastIndexOf('4');
        char[] charArray67 = strBuilder64.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder4.append(charArray67);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 35 + "'", int41 == 35);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 2 + "'", int62 == 2);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[]");
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder10.appendPadding(0, 'a');
        java.lang.Object obj29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert((int) (short) 0, obj29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append('a');
        char char42 = strBuilder40.charAt((int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.insert(17, '\n');
        java.lang.String str46 = strBuilder45.toString();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '#' + "'", char42 == '#');
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "##########4444444\n4444444444##4##########10a" + "'", str46, "##########4444444\n4444444444##4##########10a");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder4.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.setNullText("-#######10");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.append(21);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder4.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder4.deleteAll(strMatcher27);
        java.util.Collection collection29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder4.appendWithSeparators(collection29, "4 ########10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.insert(0, true);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.appendFixedWidthPadLeft((int) (short) 100, 20, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.delete((int) (short) 0, 0);
        int int38 = strBuilder37.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendWithSeparators(collection41, "");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder37.append(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceAll("##", "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder49.ensureCapacity(112);
        boolean boolean55 = strBuilder24.equals(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        boolean boolean13 = strBuilder12.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.insert(0, (float) (short) -1);
        java.io.Writer writer17 = strBuilder12.asWriter();
        java.io.Reader reader18 = strBuilder12.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(writer17);
        org.junit.Assert.assertNotNull(reader18);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadLeft(12, (int) (byte) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst("##4##########101                            ", "##4######9.0####10");
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.replaceAll(strMatcher14, "##########true");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.deleteAll(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.ensureCapacity((int) (short) 1);
        java.lang.String str34 = strBuilder20.midString(1, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = strBuilder20.substring((int) 't', 124);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\000\000\000\000\000\000\000\000\000\000" + "'", str34, "\000\000\000\000\000\000\000\000\000\000");
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.setLength(0);
        int int18 = strBuilder9.indexOf("####10#");
        java.lang.String str21 = strBuilder9.midString((int) '-', 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2538");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int32 = strBuilder3.lastIndexOf(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder3.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder3.setLength((int) (short) 0);
        int int37 = strBuilder3.capacity();
        int int39 = strBuilder3.indexOf("#######101                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 129 + "'", int37 == 129);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        int int8 = strBuilder4.size();
        boolean boolean10 = strBuilder4.endsWith("");
        boolean boolean12 = strBuilder4.endsWith("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append('a');
        boolean boolean16 = strBuilder4.startsWith("4##########10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder10.append(strBuilder22, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.deleteFirst("");
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.deleteAll(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        java.lang.String str35 = strBuilder34.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder39.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder34.reverse();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = null;
        int int60 = strBuilder34.lastIndexOf(strMatcher58, 11);
        char[] charArray61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder34.append(charArray61, 4, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder27.appendFixedWidthPadRight((java.lang.Object) strBuilder34, 7, '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendPadding((int) (short) 10, '#');
        int int21 = strBuilder16.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strBuilder26.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder16.appendWithSeparators((java.util.Iterator) strTokenizer27, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray54 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder41.insert(0, charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder34.append(charArray54);
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceFirst(strMatcher57, "hi!");
        char[] charArray60 = strBuilder56.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder32.append(charArray60, (int) (byte) 1, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder14.append(charArray60, 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder14.replaceFirst('-', '1');
        int int71 = strBuilder14.indexOf("4 ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.replaceAll("\n", "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder28.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder28.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection53 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendWithSeparators(collection53, "");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder49.insert(0, (java.lang.Object) strBuilder58);
        int int60 = strBuilder59.size();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder59.replaceAll('a', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder59.deleteAll(strMatcher66);
        java.lang.StringBuffer stringBuffer68 = strBuilder67.toStringBuffer();
        java.lang.StringBuffer stringBuffer69 = strBuilder67.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder24.append(stringBuffer69, 42, 19);
        org.apache.commons.lang.text.StrMatcher strMatcher73 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder72.replace(strMatcher73, "\n##########0", 4, (int) 'a', 111);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 112 + "'", int60 == 112);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(stringBuffer68);
        org.junit.Assert.assertEquals(stringBuffer68.toString(), "##4##########101                                                                                                #");
        org.junit.Assert.assertNotNull(stringBuffer69);
        org.junit.Assert.assertEquals(stringBuffer69.toString(), "##4##########101                                                                                                #");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder78);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll(strMatcher30, "4 ########10");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray35 = strBuilder32.toCharArray((int) '1', 22);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        int int27 = strBuilder22.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder22.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceAll('4', ' ');
        boolean boolean36 = strBuilder34.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray53 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder40.insert(0, charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder40.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder40.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean63 = strBuilder40.endsWith("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder40.replaceAll("########10", "########10");
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        boolean boolean68 = strBuilder40.contains(strMatcher67);
        char[] charArray69 = strBuilder40.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder34.append(charArray69);
        char[] charArray71 = strBuilder20.getChars(charArray69);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder20.insert(140, (float) 140);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 140");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "########10###101                                                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "########10###101                                                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[#, #, #, #, #, #, #, #, 1, 0, #, #, #, 1, 0, 1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "########10###101                                                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "########10###101                                                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, #, #, #, #, #, #, 1, 0, #, #, #, 1, 0, 1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder4.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        int int29 = strBuilder26.indexOf("hi!", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.append((long) 20);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str26 = strBuilder24.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.replaceAll(strMatcher27, "##4##########10#");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.append("a#########01##########4##", 106, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4##########101                                                                                                " + "'", str26, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray21 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.insert(0, charArray21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder1.append(charArray21);
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst(strMatcher24, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendFixedWidthPadRight(0, (int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append((float) (short) 10);
        java.lang.StringBuffer stringBuffer33 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.append((float) 107);
        int int38 = strBuilder30.lastIndexOf("##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1                                                                             ", 11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "##4##0################################################################################################10.0");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int11 = strBuilder8.indexOf(strMatcher9, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.ensureCapacity(22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.delete(16, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        boolean boolean27 = strBuilder25.startsWith("hi!");
        boolean boolean29 = strBuilder25.contains("hi!");
        boolean boolean30 = strBuilder20.equals(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray47 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder34.insert(0, charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder34.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding((int) (short) 10, '#');
        boolean boolean58 = strBuilder56.startsWith("hi!");
        boolean boolean60 = strBuilder56.contains("hi!");
        boolean boolean61 = strBuilder51.equals(strBuilder56);
        java.lang.StringBuffer stringBuffer62 = strBuilder56.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder20.append(stringBuffer62, 2, 1);
        java.util.Collection collection66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.appendWithSeparators(collection66, "##4##########10########## ");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.insert(0, "##4##########101                                                                                     4             ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.trim();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean24 = strBuilder21.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.appendFixedWidthPadLeft(10, 0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        boolean boolean39 = strBuilder33.contains(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder43.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.appendPadding((int) (short) 10, '#');
        int int68 = strBuilder63.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strBuilder73.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder63.appendWithSeparators((java.util.Iterator) strTokenizer74, "hi!");
        char[] charArray80 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder63.append(charArray80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder60.insert((int) (byte) 0, charArray80);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder33.append((java.lang.Object) charArray80);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder31.append(charArray80);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder18.insert(44, charArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 44");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll('-', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        java.lang.String str26 = strBuilder21.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray43 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert(0, charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder30.appendPadding(0, 'a');
        java.lang.Object obj49 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.insert((int) (short) 0, obj49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) strBuilder50, (int) ' ', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder50.reverse();
        org.apache.commons.lang.text.StrMatcher strMatcher58 = null;
        int int60 = strBuilder57.indexOf(strMatcher58, 10);
        java.lang.String str62 = strBuilder57.rightString((int) (short) 100);
        boolean boolean63 = strBuilder19.equals(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder19.replaceFirst("######################0", "true########10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "01##########4##" + "'", str62, "01##########4##");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.minimizeCapacity();
        java.lang.String str30 = strBuilder20.midString(106, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder24.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder24.replaceFirst("4##########10", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder49.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder49.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder39.append(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean63 = strBuilder60.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean68 = strBuilder65.equalsIgnoreCase(strBuilder67);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder67.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray80 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder67.insert(0, charArray80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder60.append(charArray80);
        org.apache.commons.lang.text.StrMatcher strMatcher83 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder82.replaceFirst(strMatcher83, "hi!");
        char[] charArray86 = strBuilder82.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder39.insert((int) '-', charArray86, (int) (short) 0, 44);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid length: 44");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #, 4, #, #]");
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        java.lang.String str12 = strBuilder10.leftString(12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        boolean boolean22 = strBuilder20.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.replaceAll(strMatcher23, "hi!");
        int int27 = strBuilder20.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder20.replaceFirst('4', '#');
        boolean boolean31 = strBuilder10.equals((java.lang.Object) strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.append("##4##########10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n\n" + "'", str12, "\n\n");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray47 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder34.insert(0, charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder27.append(charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) strBuilder27, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray70 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder57.insert(0, charArray70);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder57.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher75 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.replaceFirst(strMatcher75, "");
        char[] charArray78 = strBuilder74.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder25.insert((int) (byte) 10, charArray78);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "##4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "##4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder79);
    }

    @Test
    public void test2557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2557");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setLength(16);
        int int33 = strBuilder32.size();
        int int36 = strBuilder32.lastIndexOf('t', 22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 16 + "'", int33 == 16);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("##########true");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder17.asTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strBuilder17.substring(45);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray51 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.insert(0, charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder31.append(charArray51);
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst(strMatcher54, "hi!");
        char[] charArray57 = strBuilder53.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder29.append(charArray57, (int) (byte) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder60.appendNull();
        java.lang.String str64 = strBuilder61.midString(140, 55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder10.appendPadding(0, 'a');
        java.lang.Object obj29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert((int) (short) 0, obj29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder30.indexOf(strMatcher37);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.deleteAll(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.appendFixedWidthPadLeft(0, (int) ' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst("          ");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder46.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        int int7 = strBuilder5.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer13 = strBuilder9.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append(stringBuffer13);
        int int16 = strBuilder5.lastIndexOf(" #");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.replaceAll('a', '4');
        int int17 = strBuilder14.indexOf('#', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.insert(0, true);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding((int) (short) 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder14.append(strBuilder42);
        boolean boolean44 = strBuilder43.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        java.lang.Object obj28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.insert((int) (short) 0, obj28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteAll(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder5.append((java.lang.Object) strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray61 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder48.insert(0, charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder41.append(charArray61);
        org.apache.commons.lang.text.StrMatcher strMatcher64 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceFirst(strMatcher64, "hi!");
        char[] charArray67 = strBuilder63.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder39.append(charArray67);
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strBuilder39.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder39.clear();
        java.lang.String str71 = strBuilder39.getNewLineText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNull(str71);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        int int13 = strBuilder9.capacity();
        java.util.Collection collection14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.appendWithSeparators(collection14, "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.append((int) (short) 1);
        java.lang.String str21 = strBuilder20.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.setNewLineText("##aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder39.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.append(false);
        int int43 = strBuilder39.capacity();
        java.util.Collection collection44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder39.appendWithSeparators(collection44, "");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder39.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder39.append((int) (short) 1);
        java.lang.String str51 = strBuilder50.getNullText();
        java.lang.StringBuffer stringBuffer52 = strBuilder50.toStringBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder29.append(stringBuffer52, 157, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 32 + "'", int43 == 32);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(stringBuffer52);
        org.junit.Assert.assertEquals(stringBuffer52.toString(), "1");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder10.appendPadding(0, 'a');
        java.lang.Object obj29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert((int) (short) 0, obj29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append('a');
        char char42 = strBuilder40.charAt((int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.insert(17, '\n');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.insert((int) '1', (float) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + char42 + "' != '" + '#' + "'", char42 == '#');
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strBuilder10.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendWithSeparators(collection20, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.deleteAll('4');
        char[] charArray25 = strBuilder19.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding((int) (short) 10, '#');
        java.lang.String str32 = strBuilder27.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder36.appendPadding(0, 'a');
        java.lang.Object obj55 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.insert((int) (short) 0, obj55);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) strBuilder56, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher63 = null;
        int int64 = strBuilder56.indexOf(strMatcher63);
        int int67 = strBuilder56.indexOf("hi!", (int) (short) -1);
        boolean boolean68 = strBuilder19.equals(strBuilder56);
        char[] charArray69 = strBuilder56.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder15.insert(35, charArray69, (int) 'u', 44);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "##4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "##4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteAll("-1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.replaceFirst(strMatcher21, "#################1true0");
        int int26 = strBuilder18.lastIndexOf("4", (int) '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder18.replaceAll(strMatcher27, "\n\nfalse");
        java.lang.StringBuffer stringBuffer30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append(stringBuffer30);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.insert(0, true);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.replaceFirst("#", "########10");
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strBuilder27.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.insert(13, false);
        boolean boolean33 = strBuilder31.endsWith("14.0");
        boolean boolean35 = strBuilder31.endsWith("                              0-1.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        java.lang.String str10 = strBuilder9.getNewLineText();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.setCharAt((int) (byte) 10, 'e');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        char[] charArray7 = strBuilder1.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.String str14 = strBuilder9.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder18.appendPadding(0, 'a');
        java.lang.Object obj37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.insert((int) (short) 0, obj37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder38, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int46 = strBuilder38.indexOf(strMatcher45);
        int int49 = strBuilder38.indexOf("hi!", (int) (short) -1);
        boolean boolean50 = strBuilder1.equals(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder1.setLength(111);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder1.deleteCharAt(12);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.insert(0, true);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll("", "true4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.append(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.append((double) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setNullText("01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.insert(2, 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append('4');
        int int20 = strBuilder18.lastIndexOf('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 11 + "'", int20 == 11);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteCharAt((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteAll("-1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.replaceFirst(strMatcher21, "#################1true0");
        int int26 = strBuilder18.lastIndexOf("4", (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder18.append(20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("##4##########10false");
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll(strMatcher30, "4 ########10");
        java.io.Writer writer33 = strBuilder25.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder25.appendFixedWidthPadRight(0, (int) '4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder25.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder25.insert(35, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder25.appendFixedWidthPadLeft((int) ' ', 106, 't');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.insert(9, true);
        java.lang.Object obj14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.insert(10, obj14);
        int int18 = strBuilder15.indexOf('-', (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder15.appendFixedWidthPadRight(106, 0, '1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteCharAt(125);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 125");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        boolean boolean7 = strBuilder3.endsWith("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.append(false);
        int int21 = strBuilder17.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder17, 42, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder3.append(false);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        int int28 = strBuilder26.lastIndexOf(strMatcher27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.appendFixedWidthPadRight(130, 7, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder29.append(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder3.insert((int) (short) 10, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean57 = strBuilder54.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder56.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray69 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder56.insert(0, charArray69);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder56.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher74 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceFirst(strMatcher74, "");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.append("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder76.insert((int) (short) 10, (java.lang.Object) "4");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder83.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder83.append((double) (short) -1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strBuilder88.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder76.appendWithSeparators((java.util.Iterator) strTokenizer89, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder3.append(strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder92.insert((int) (byte) 0, true);
        java.io.Reader reader96 = strBuilder92.asReader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(reader96);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        char[] charArray18 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.append(charArray18);
        int int22 = strBuilder1.indexOf("           ", (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder1.replaceFirst('-', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.deleteAll(' ');
        boolean boolean35 = strBuilder1.equals((java.lang.Object) ' ');
        java.io.Writer writer36 = strBuilder1.asWriter();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(writer36);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray45 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder32.insert(0, charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer52 = strBuilder48.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder32.append(stringBuffer52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder17.append(stringBuffer52);
        int int57 = strBuilder17.lastIndexOf('4', (int) (byte) -1);
        int int59 = strBuilder17.lastIndexOf("01                                                                                       ");
        char[] charArray62 = null;
        // The following exception was thrown during execution in test generation
        try {
            strBuilder17.getChars(16, 17, charArray62, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(stringBuffer52);
        org.junit.Assert.assertEquals(stringBuffer52.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNullText("10");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.replaceAll("35", "##########0.0");
        int int17 = strBuilder15.indexOf('-');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray39 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder26.insert(0, charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder19.append(charArray39);
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceFirst(strMatcher42, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder41.appendFixedWidthPadRight(0, (int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.append((float) (short) 10);
        java.lang.StringBuffer stringBuffer51 = strBuilder48.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder15.append(stringBuffer51);
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceAll(strMatcher53, "##4##########101                                                                                     4             ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "##4##0################################################################################################10.0");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        char[] charArray7 = strBuilder1.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.String str14 = strBuilder9.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder18.appendPadding(0, 'a');
        java.lang.Object obj37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.insert((int) (short) 0, obj37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder38, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int46 = strBuilder38.indexOf(strMatcher45);
        int int49 = strBuilder38.indexOf("hi!", (int) (short) -1);
        boolean boolean50 = strBuilder1.equals(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.append('#');
        boolean boolean54 = strBuilder38.startsWith("-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder38.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        int int36 = strBuilder31.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) strBuilder40, (int) (short) 1, 'a');
        java.lang.String str44 = strBuilder40.getNewLineText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNull(str44);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.insert(0, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteAll(' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.insert(16, (float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder17.minimizeCapacity();
        int int34 = strBuilder17.lastIndexOf("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 14 + "'", int34 == 14);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.util.Iterator iterator25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendWithSeparators(iterator25, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.appendFixedWidthPadLeft(124, 102, '\n');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.replaceFirst(strMatcher27, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendNewLine();
        int int32 = strBuilder23.indexOf("-1.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        char[] charArray7 = strBuilder1.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.String str14 = strBuilder9.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder18.appendPadding(0, 'a');
        java.lang.Object obj37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.insert((int) (short) 0, obj37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder38, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int46 = strBuilder38.indexOf(strMatcher45);
        int int49 = strBuilder38.indexOf("hi!", (int) (short) -1);
        boolean boolean50 = strBuilder1.equals(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.append('#');
        boolean boolean54 = strBuilder38.startsWith("-1.0");
        boolean boolean56 = strBuilder38.endsWith("-");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        boolean boolean7 = strBuilder5.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceAll(strMatcher8, "hi!");
        int int12 = strBuilder5.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder5.replaceFirst("4 ########10", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder5.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder5.replaceAll('e', ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.appendPadding((int) (short) 10, '#');
        int int7 = strBuilder2.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder2.setNullText("");
        java.lang.String str11 = strBuilder9.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray28 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder15.insert(0, charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder15.appendPadding(0, 'a');
        java.lang.Object obj34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.insert((int) (short) 0, obj34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder9.append((java.lang.Object) strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.setNewLineText("");
        int int43 = strBuilder40.indexOf("##########true", (int) (byte) 10);
        boolean boolean44 = strBuilder0.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.appendFixedWidthPadRight((java.lang.Object) 'a', 5, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder53.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder65.insert(0, true);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendPadding((int) (short) 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder71.replaceFirst("#", "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder71.appendNull();
        org.apache.commons.lang.text.StrTokenizer strTokenizer79 = strBuilder71.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder49.appendWithSeparators((java.util.Iterator) strTokenizer79, "##########");
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strTokenizer79);
        org.junit.Assert.assertNotNull(strBuilder81);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        boolean boolean18 = strBuilder16.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.insert(0, (long) '#');
        java.util.Collection collection22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.appendWithSeparators(collection22, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder16.appendFixedWidthPadLeft(4, 0, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder28.appendNull();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.insert(157, 't');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 157");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean26 = strBuilder3.endsWith("########10");
        java.lang.StringBuffer stringBuffer27 = strBuilder3.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.deleteCharAt(11);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.insert((int) '-', (float) 45);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray45 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder32.insert(0, charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder32.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst(strMatcher50, "");
        boolean boolean53 = strBuilder21.equals((java.lang.Object) strBuilder49);
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.deleteFirst(strMatcher54);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder49.append("##########true4", 10, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder61.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder63.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder63.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean81 = strBuilder78.equalsIgnoreCase(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder80.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder80.replaceAll("", "");
        boolean boolean90 = strBuilder76.equalsIgnoreCase(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder76.append((int) '4');
        boolean boolean93 = strBuilder59.equals(strBuilder76);
        // The following exception was thrown during execution in test generation
        try {
            char char95 = strBuilder59.charAt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.replaceAll(strMatcher29, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder17.append(false);
        java.lang.String str34 = strBuilder17.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder17.insert(101, " #");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 101");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "##4##########10false" + "'", str34, "##4##########10false");
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(118);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding(9, 'u');
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        int int9 = strBuilder8.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendWithSeparators(collection12, "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.append(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll("##", "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.ensureCapacity(112);
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceAll(strMatcher26, "4##########101                                                                                                ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.insert(15, "\n\nfalse");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 15");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendPadding((int) (short) 10, '#');
        int int21 = strBuilder16.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strBuilder26.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder16.appendWithSeparators((java.util.Iterator) strTokenizer27, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray54 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder41.insert(0, charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder34.append(charArray54);
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceFirst(strMatcher57, "hi!");
        char[] charArray60 = strBuilder56.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder32.append(charArray60, (int) (byte) 1, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder14.append(charArray60, 0, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        int int68 = strBuilder66.lastIndexOf(strMatcher67);
        java.lang.String str70 = strBuilder66.leftString((int) '4');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "####################" + "'", str70, "####################");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst('1');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.reverse();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.replaceAll(strMatcher29, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        int int33 = strBuilder17.indexOf(strMatcher32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder17.append('4');
        boolean boolean36 = strBuilder17.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder17.append((long) 'e');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.replaceAll("", "");
        boolean boolean30 = strBuilder16.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.replaceAll(strMatcher31, "hi!");
        char char35 = strBuilder33.charAt(4);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.deleteAll(strMatcher40);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilder37.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer42, "####10#");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendPadding((int) ' ', '#');
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceAll(strMatcher48, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrMatcher strMatcher51 = null;
        int int52 = strBuilder50.indexOf(strMatcher51);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + char35 + "' != '" + '#' + "'", char35 == '#');
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        int int6 = strBuilder4.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert(9, true);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder4.append((java.lang.Object) strBuilder19);
        int int23 = strBuilder19.lastIndexOf('a', 4);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray40 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder27.insert(0, charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.append('4');
        boolean boolean51 = strBuilder45.contains("");
        boolean boolean52 = strBuilder41.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.ensureCapacity((int) (byte) 0);
        boolean boolean55 = strBuilder19.equals((java.lang.Object) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder19.deleteCharAt(13);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder61.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder61.replaceAll("", "");
        int int73 = strBuilder61.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder61.clear();
        boolean boolean76 = strBuilder74.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder74.insert(0, (long) '#');
        java.util.Collection collection80 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder74.appendWithSeparators(collection80, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder74.appendFixedWidthPadLeft(4, 0, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder57.appendFixedWidthPadRight((java.lang.Object) strBuilder86, 22, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder86.deleteCharAt(0);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append((int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        int int5 = strBuilder3.indexOf(strMatcher4);
        boolean boolean7 = strBuilder3.startsWith("\000\000\000\000\000\000\000\000\000\000\000\000\000\0001");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendPadding(101, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.insert(3, ' ');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.deleteAll(strMatcher29);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.replace(47, (int) '1', "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.appendWithSeparators(collection10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst('#', 'a');
        char[] charArray17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder13.append(charArray17, (int) ' ', (int) '4');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.deleteFirst(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder32.appendNewLine();
        java.lang.String str35 = strBuilder33.leftString(12);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder13.append(strBuilder33, 13, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\n\n" + "'", str35, "\n\n");
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int10 = strBuilder5.lastIndexOf(strMatcher9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int23 = strBuilder3.lastIndexOf(strMatcher21, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int36 = strBuilder27.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder27.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder27.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder41, (int) (byte) 1, '4');
        boolean boolean46 = strBuilder44.endsWith("01##########4##");
        int int49 = strBuilder44.indexOf(' ', 106);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder44.append('-');
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        int int54 = strBuilder44.indexOf(strMatcher52, (int) '-');
        boolean boolean55 = strBuilder44.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        java.lang.String str26 = strBuilder25.getNullText();
        java.lang.String str27 = strBuilder25.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.replaceFirst("#true410.0\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", "#97.0#4##########10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2610");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder29.append(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder3.insert((int) (short) 10, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.insert(4, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder52.deleteAll('#');
        int int59 = strBuilder52.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.appendPadding((int) (short) 10, '#');
        int int66 = strBuilder61.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder61.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder70.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean76 = strBuilder70.endsWith("");
        java.lang.String str78 = strBuilder70.leftString(14);
        java.util.Collection collection79 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder70.appendWithSeparators(collection79, "4 ########10");
        boolean boolean82 = strBuilder52.equals(strBuilder81);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "##########true" + "'", str78, "##########true");
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.io.Reader reader31 = strBuilder30.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.minimizeCapacity();
        java.io.Writer writer33 = strBuilder32.asWriter();
        java.lang.String str35 = strBuilder32.rightString(5);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.append((float) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder32.replaceAll(strMatcher38, "#true410.0\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "aaaaa" + "'", str35, "aaaaa");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.delete(0, 36);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray21 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.insert(0, charArray21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder1.append(charArray21);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder1.insert((int) (byte) 0, "-1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.replaceAll(strMatcher27, "########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.deleteAll(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.ensureCapacity((int) (short) 1);
        java.lang.String str33 = strBuilder31.leftString((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendPadding((int) (short) 10, '#');
        int int41 = strBuilder36.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder45.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder47.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        int int58 = strBuilder56.lastIndexOf(strMatcher57);
        java.lang.String str60 = strBuilder56.leftString((int) (short) 100);
        java.lang.String str63 = strBuilder56.midString((int) ' ', 4);
        boolean boolean64 = strBuilder43.equalsIgnoreCase(strBuilder56);
        boolean boolean66 = strBuilder56.startsWith("##4##########10#");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder56.deleteAll('-');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder31.insert(2, (java.lang.Object) '-');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\000" + "'", str33, "\000");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "########10" + "'", str60, "########10");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder69);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        java.lang.Object obj18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.append(obj18);
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.deleteAll(strMatcher20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.setNullText("##4##########100");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer13 = strBuilder10.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.insert(0, (long) 7);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.append((long) 56);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder10.appendPadding(0, 'a');
        java.lang.Object obj29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert((int) (short) 0, obj29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, (int) ' ', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray54 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder41.insert(0, charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer61 = strBuilder57.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder41.append(stringBuffer61);
        boolean boolean64 = strBuilder41.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean70 = strBuilder67.equalsIgnoreCase(strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean75 = strBuilder72.equalsIgnoreCase(strBuilder74);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder74.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray87 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder74.insert(0, charArray87);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder67.append(charArray87);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder41.insert((int) (short) 10, charArray87);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder37.append(charArray87);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder37.replaceFirst("true########10          ", "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder37.setLength((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder99 = strBuilder96.insert((int) 'a', false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(stringBuffer61);
        org.junit.Assert.assertEquals(stringBuffer61.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.deleteFirst("4##########101                                                                                                ");
        boolean boolean33 = strBuilder17.equals(strBuilder32);
        java.lang.StringBuffer stringBuffer34 = strBuilder17.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder17.trim();
        java.lang.String str38 = strBuilder35.midString((int) (short) 10, (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 10);
        java.lang.String str4 = strBuilder1.midString(142, 16);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.appendWithSeparators(collection10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray39 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder26.insert(0, charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder26.appendPadding(0, 'a');
        java.lang.Object obj45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.insert((int) (short) 0, obj45);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteAll(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder22.append((java.lang.Object) strBuilder51);
        int int55 = strBuilder22.length();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder22.deleteAll(strMatcher56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder22.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst('4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) strBuilder58, 14, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.delete(1, 11);
        org.apache.commons.lang.text.StrMatcher strMatcher68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder64.deleteFirst(strMatcher68);
        boolean boolean71 = strBuilder69.endsWith("                 ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 4 + "'", int55 == 4);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll(strMatcher30, "4 ########10");
        java.io.Writer writer33 = strBuilder25.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder25.appendFixedWidthPadRight(0, (int) '4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder25.deleteFirst(' ');
        java.lang.String str40 = strBuilder25.getNullText();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        int int43 = strBuilder25.indexOf(strMatcher41, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        int int13 = strBuilder11.size();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.insert((int) (short) 1, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder15, (int) ' ', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder1.insert(9, 1.0d);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setNewLineText("########10#######################3225");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray39 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder26.insert(0, charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder26.appendPadding(0, 'a');
        java.lang.Object obj45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.insert((int) (short) 0, obj45);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceFirst('4', '4');
        java.lang.StringBuffer stringBuffer50 = strBuilder46.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder22.append(stringBuffer50);
        java.lang.String str53 = strBuilder51.rightString((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(stringBuffer50);
        org.junit.Assert.assertEquals(stringBuffer50.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "false##4##########10" + "'", str53, "false##4##########10");
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append(true);
        boolean boolean5 = strBuilder3.contains('a');
        boolean boolean7 = strBuilder3.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.setLength(3);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setNewLineText("true########1false0#######10          ");
        boolean boolean13 = strBuilder11.startsWith("4444444444444##4##########10");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        java.lang.Object obj28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.insert((int) (short) 0, obj28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteAll(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder5.append((java.lang.Object) strBuilder34);
        int int38 = strBuilder5.length();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder5.deleteAll("10");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder5.append((double) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder5.replaceFirst("##", "####10#");
        boolean boolean47 = strBuilder45.endsWith("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder24.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.replaceFirst('4', '#');
        boolean boolean52 = strBuilder36.equals((java.lang.Object) strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean57 = strBuilder54.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder54.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean63 = strBuilder60.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray75 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder62.insert(0, charArray75);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder62.appendPadding(0, 'a');
        java.lang.Object obj81 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.insert((int) (short) 0, obj81);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder82.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher88 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.deleteAll(strMatcher88);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder58.append((java.lang.Object) strBuilder87);
        boolean boolean92 = strBuilder90.endsWith("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder90.clear();
        boolean boolean94 = strBuilder36.equals((java.lang.Object) strBuilder93);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteAll(strMatcher29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.append('4');
        boolean boolean42 = strBuilder36.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder36.replaceFirst("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder32.appendFixedWidthPadRight((java.lang.Object) strBuilder36, 13, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int62 = strBuilder59.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder59.replaceFirst("", "##");
        java.util.Collection collection66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.appendWithSeparators(collection66, "\n");
        java.lang.Object[] objArray69 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendWithSeparators(objArray69, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder36.appendWithSeparators(objArray69, "#####10#");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[]");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        java.lang.String str12 = strBuilder10.leftString(12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceFirst("4-1.0", "##4#########");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.append('4');
        boolean boolean46 = strBuilder40.contains("");
        boolean boolean47 = strBuilder36.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder36.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder36.append((long) 5);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.insert(4, (long) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder17.insert((int) (short) 1, (java.lang.Object) 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n\n" + "'", str12, "\n\n");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int3 = strBuilder1.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.replaceAll("", "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadLeft(23, 14, 't');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (short) 10, '#');
        java.lang.String str19 = strBuilder14.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.appendFixedWidthPadRight((int) (byte) -1, 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder12.append(strBuilder23, (int) (short) 0, (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceAll(strMatcher15, "01##########4##");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteAll(strMatcher18);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendWithSeparators(collection22, "");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.insert(0, true);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder19.append(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll('-', '#');
        int int39 = strBuilder33.indexOf('a', 20);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.deleteAll(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.ensureCapacity((int) (short) 1);
        java.lang.String str33 = strBuilder31.substring((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.appendFixedWidthPadRight((int) (byte) -1, 107, 'e');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder31.setNewLineText("##########true41.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\000\000\000\000\000\000\000\000\000\000\000\000\000\0001" + "'", str33, "\000\000\000\000\000\000\000\000\000\000\000\000\000\0001");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.replaceAll("", "");
        boolean boolean30 = strBuilder16.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.replaceAll(strMatcher31, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder20.insert(2, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.insert((int) '1', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceAll("4 ########10", "#true410.0\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.insert(2, (double) '4');
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        boolean boolean47 = strBuilder39.contains(strMatcher46);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll("4##########101                                                                                                ", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append("");
        java.lang.String str36 = strBuilder32.leftString(5);
        boolean boolean38 = strBuilder32.contains("##4##########10#");
        boolean boolean39 = strBuilder32.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "     " + "'", str36, "     ");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        java.lang.String str23 = strBuilder18.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray40 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder27.insert(0, charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder27.appendPadding(0, 'a');
        java.lang.Object obj46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.insert((int) (short) 0, obj46);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) strBuilder47, (int) ' ', '4');
        boolean boolean54 = strBuilder14.equals(strBuilder18);
        // The following exception was thrown during execution in test generation
        try {
            char char56 = strBuilder14.charAt(55);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 55");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int23 = strBuilder3.lastIndexOf(strMatcher21, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int36 = strBuilder27.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder27.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder27.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder41, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.replaceFirst('a', 'a');
        int int49 = strBuilder44.indexOf("\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder44.append(2);
        int int52 = strBuilder51.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 17 + "'", int52 == 17);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean26 = strBuilder3.endsWith("########10");
        java.lang.StringBuffer stringBuffer27 = strBuilder3.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.deleteCharAt(11);
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceFirst(strMatcher30, "##########true41.0");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst("\n\nfalse");
        boolean boolean36 = strBuilder34.contains('1');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.append((double) 102);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray21 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.insert(0, charArray21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder1.append(charArray21);
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst(strMatcher24, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendFixedWidthPadRight(0, (int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append((float) (short) 10);
        java.lang.StringBuffer stringBuffer33 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.append((float) 107);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.appendFixedWidthPadRight(21, 140, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceFirst("tr2ue2.0", "########1true0                                100");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(stringBuffer33);
        org.junit.Assert.assertEquals(stringBuffer33.toString(), "##4##0################################################################################################10.0");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.replaceFirst(strMatcher27, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder23.append("##", 0, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.insert(5, (double) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst('-');
        java.lang.String str40 = strBuilder36.substring(14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder36.append("    false11111", 36, 36);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "####10#" + "'", str40, "####10#");
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append(true);
        boolean boolean23 = strBuilder21.contains('a');
        boolean boolean24 = strBuilder15.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder15.replace(strMatcher25, "100", 0, 56, (int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder15.deleteAll(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceAll("#true410.0\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", "########102");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder10.appendPadding(0, 'a');
        java.lang.Object obj29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert((int) (short) 0, obj29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder30.indexOf(strMatcher37);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.deleteAll(strMatcher39);
        int int42 = strBuilder30.lastIndexOf("##");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder30.insert(9, (double) 9);
        org.apache.commons.lang.text.StrTokenizer strTokenizer46 = strBuilder30.asTokenizer();
        int int48 = strBuilder30.indexOf('t');
        int int51 = strBuilder30.indexOf('u', 39);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strTokenizer46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4-1.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer2 = strBuilder1.asTokenizer();
        org.junit.Assert.assertNotNull(strTokenizer2);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        int int7 = strBuilder5.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.setLength((int) (byte) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        int int12 = strBuilder5.indexOf(strMatcher10, 35);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append(true);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str26 = strBuilder24.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.replaceFirst(strMatcher27, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder34.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.appendPadding((int) (short) 10, '#');
        int int59 = strBuilder54.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strBuilder64.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder54.appendWithSeparators((java.util.Iterator) strTokenizer65, "hi!");
        char[] charArray71 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder54.append(charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder51.insert((int) (byte) 0, charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder24.insert((int) (short) 100, charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder74.minimizeCapacity();
        int int78 = strBuilder75.indexOf('1', 0);
        int int81 = strBuilder75.lastIndexOf("##########10.0", (int) 'u');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4##########101                                                                                                " + "'", str26, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 13 + "'", int78 == 13);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        int int6 = strBuilder4.size();
        boolean boolean8 = strBuilder4.startsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.trim();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        java.lang.Object obj13 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadRight(obj13, (int) ' ', 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        boolean boolean27 = strBuilder25.startsWith("hi!");
        boolean boolean29 = strBuilder25.contains("hi!");
        boolean boolean30 = strBuilder20.equals(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.delete((int) (short) 0, 0);
        int int40 = strBuilder39.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendWithSeparators(collection43, "");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder39.append(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder25.append((java.lang.Object) strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.setNewLineText("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.insert(0, (double) '1');
        char[] charArray58 = strBuilder54.toCharArray();
        int int59 = strBuilder54.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "49.0\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "49.0\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[4, 9, ., 0, \n]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 5 + "'", int59 == 5);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        java.lang.Object obj28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.insert((int) (short) 0, obj28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteAll(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder5.append((java.lang.Object) strBuilder34);
        int int38 = strBuilder5.length();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder5.deleteAll(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        int int44 = strBuilder5.indexOf(strMatcher42, 26);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.delete((int) (short) 0, 0);
        int int54 = strBuilder53.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.appendWithSeparators(collection57, "");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder53.append(strBuilder64);
        java.lang.String str66 = strBuilder64.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder64.replaceFirst("-1.0", "#########");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder5.append((java.lang.Object) "#########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 32 + "'", int54 == 32);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNull(str66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append(true);
        int int17 = strBuilder4.indexOf('a', 16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder4.deleteCharAt(12);
        boolean boolean21 = strBuilder4.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strBuilder4.equals(strBuilder22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.replaceAll(strMatcher15, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst('#', '-');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding((int) (short) 10, '#');
        java.lang.String str16 = strBuilder15.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder8.appendFixedWidthPadRight((java.lang.Object) '4', 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder8.deleteFirst('\n');
        // The following exception was thrown during execution in test generation
        try {
            char char44 = strBuilder42.charAt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder23.trim();
        boolean boolean26 = strBuilder23.contains("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendFixedWidthPadRight(11, 35, '1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder16.minimizeCapacity();
        java.io.Writer writer18 = strBuilder16.asWriter();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(writer18);
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.appendPadding((int) (short) 10, '#');
        int int7 = strBuilder2.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder2.setNullText("");
        java.lang.String str11 = strBuilder9.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray28 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder15.insert(0, charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder15.appendPadding(0, 'a');
        java.lang.Object obj34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.insert((int) (short) 0, obj34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder9.append((java.lang.Object) strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.setNewLineText("");
        int int43 = strBuilder40.indexOf("##########true", (int) (byte) 10);
        boolean boolean44 = strBuilder0.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.appendPadding((int) (short) 10, '#');
        java.lang.String str51 = strBuilder46.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray68 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder55.insert(0, charArray68);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder55.appendPadding(0, 'a');
        java.lang.Object obj74 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.insert((int) (short) 0, obj74);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) strBuilder75, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher82 = null;
        int int83 = strBuilder75.indexOf(strMatcher82);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder0.appendFixedWidthPadLeft((java.lang.Object) strMatcher82, (-1), 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher87 = null;
        int int89 = strBuilder0.lastIndexOf(strMatcher87, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder0.setLength(35);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder0.delete((int) (byte) 10, 39);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder94);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        int int23 = strBuilder21.lastIndexOf(strMatcher22);
        boolean boolean24 = strBuilder8.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder8.append('#');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        boolean boolean28 = strBuilder26.contains(strMatcher27);
        java.lang.String str29 = strBuilder26.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.append((double) 25);
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        int int34 = strBuilder26.indexOf(strMatcher32, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder26.appendFixedWidthPadLeft(25, 17, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder26.clear();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        char[] charArray7 = strBuilder1.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.String str14 = strBuilder9.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder18.appendPadding(0, 'a');
        java.lang.Object obj37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.insert((int) (short) 0, obj37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder38, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int46 = strBuilder38.indexOf(strMatcher45);
        int int49 = strBuilder38.indexOf("hi!", (int) (short) -1);
        boolean boolean50 = strBuilder1.equals(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder52.replaceFirst("##4##########10\000", "#1");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        boolean boolean4 = strBuilder2.endsWith("01##########4##");
        // The following exception was thrown during execution in test generation
        try {
            char char6 = strBuilder2.charAt((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("##########10");
        boolean boolean3 = strBuilder1.endsWith("########102");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.insert(0, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder23.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder28.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.setNewLineText("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst(strMatcher43, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst("4##########101                                                                                                ");
        boolean boolean58 = strBuilder42.equals(strBuilder57);
        java.lang.StringBuffer stringBuffer59 = strBuilder42.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder24.append((java.lang.Object) strBuilder60);
        java.lang.String str62 = strBuilder60.getNullText();
        org.apache.commons.lang.text.StrMatcher strMatcher63 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder60.deleteAll(strMatcher63);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(stringBuffer59);
        org.junit.Assert.assertEquals(stringBuffer59.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        int int35 = strBuilder34.size();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.replaceAll('a', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.deleteAll(strMatcher41);
        java.lang.StringBuffer stringBuffer43 = strBuilder42.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder45.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray60 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder47.insert(0, charArray60);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean66 = strBuilder63.equalsIgnoreCase(strBuilder65);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder65.append('4');
        boolean boolean71 = strBuilder65.contains("");
        boolean boolean72 = strBuilder61.equalsIgnoreCase(strBuilder65);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder61.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder42.append((java.lang.Object) strBuilder61);
        boolean boolean76 = strBuilder74.endsWith("                                                                             ");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder74.replaceFirst("##########", "0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 112 + "'", int35 == 112);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "##4##########101                                                                                                #");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strBuilder79);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteAll("      ");
        java.io.Reader reader21 = strBuilder20.asReader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(reader21);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.append(0L);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.append('4');
        boolean boolean44 = strBuilder38.contains("");
        boolean boolean45 = strBuilder34.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder34.replaceAll(strMatcher46, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder34.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) strBuilder50, 0, '1');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.insert((int) (byte) 1, (long) 11);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("                               #");
        boolean boolean27 = strBuilder3.equals(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        int int35 = strBuilder34.size();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.replaceAll('a', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.deleteAll(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder34.insert((int) (short) 10, (double) 4);
        java.lang.String str48 = strBuilder34.getNullText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 112 + "'", int35 == 112);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNull(str48);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        int int35 = strBuilder34.size();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.replaceAll('a', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.deleteAll(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder34.insert((int) (short) 10, (double) 4);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.deleteAll("");
        java.lang.StringBuffer stringBuffer59 = strBuilder53.toStringBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder47.append(stringBuffer59, 125, 129);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 112 + "'", int35 == 112);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(stringBuffer59);
        org.junit.Assert.assertEquals(stringBuffer59.toString(), "");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean26 = strBuilder3.endsWith("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.replaceAll("########10", "########10");
        java.io.Reader reader30 = strBuilder3.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.deleteAll('a');
        int int33 = strBuilder3.size();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray50 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder37.insert(0, charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder37.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder37.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader59 = strBuilder37.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int64 = strBuilder62.lastIndexOf('4');
        char[] charArray65 = strBuilder62.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder37.insert((int) (short) 10, charArray65);
        int int69 = strBuilder66.lastIndexOf("", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection72 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendWithSeparators(collection72, "");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder74.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder74.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder66.appendFixedWidthPadRight((java.lang.Object) strBuilder74, 10, '1');
        java.lang.StringBuffer stringBuffer85 = strBuilder66.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder3.append(stringBuffer85);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 112 + "'", int33 == 112);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(reader59);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[]");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 35 + "'", int69 == 35);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(stringBuffer85);
        org.junit.Assert.assertEquals(stringBuffer85.toString(), "##4##########101                                                                                                false11111");
        org.junit.Assert.assertNotNull(strBuilder86);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder10.append(strBuilder22, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.deleteFirst("");
        int int30 = strBuilder27.indexOf("##4##########101                                                                                                #", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        java.io.Reader reader11 = strBuilder3.asReader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(reader11);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        java.lang.String str17 = strBuilder15.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replace(1, (int) (short) 1, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll("##4#########", "4##########101                                                                                                ");
        java.lang.StringBuffer stringBuffer27 = strBuilder23.toStringBuffer();
        java.lang.String str29 = strBuilder23.leftString((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "####10" + "'", str17, "####10");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "#4##########101                                                                                                #######100");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#4########" + "'", str29, "#4########");
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        int int27 = strBuilder23.length();
        int int28 = strBuilder23.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 15 + "'", int27 == 15);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 15 + "'", int28 == 15);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.lang.String str4 = strBuilder1.substring(0, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("-1.0", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append('-');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append((double) 35);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strBuilder24, 19, 't');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        int int34 = strBuilder29.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append('4');
        boolean boolean40 = strBuilder36.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.append((float) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray64 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder51.insert(0, charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder44.append(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder44.insert((int) (byte) 0, "-1.0");
        java.lang.Object obj70 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder44.appendFixedWidthPadRight(obj70, 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder44.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder77.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder77.deleteAll(strMatcher80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strBuilder77.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder44.appendWithSeparators((java.util.Iterator) strTokenizer82, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder44.append((double) 42);
        java.lang.StringBuffer stringBuffer87 = strBuilder44.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder42.append(stringBuffer87, (int) (short) 10, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder7.append(stringBuffer87);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(stringBuffer87);
        org.junit.Assert.assertEquals(stringBuffer87.toString(), "-1.0##4##false42.0");
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.ensureCapacity(2);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst(strMatcher26);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder25.append(strBuilder37, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder40.reverse();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer42, "\n\nfalse");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder3.insert(10, "\000\000\000\000\000\000\000\000\000\000\000\000\000\0001");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder47.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.deleteAll("########10#######################3225");
        java.lang.String str51 = strBuilder47.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "########10\000\000\000\000\000\000\000\000\000\000\000\000\000\0001" + "'", str51, "########10\000\000\000\000\000\000\000\000\000\000\000\000\000\0001");
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.ensureCapacity((int) (byte) 0);
        java.util.Collection collection31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendWithSeparators(collection31, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst("hi!", "#");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.appendWithSeparators(collection39, "");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendNewLine();
        java.util.Collection collection47 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendWithSeparators(collection47, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder43.replaceFirst(strMatcher50, "4");
        boolean boolean53 = strBuilder33.equals((java.lang.Object) "4");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strBuilder33.asTokenizer();
        java.lang.String str55 = strBuilder33.getNewLineText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNull(str55);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.lang.String str4 = strBuilder1.substring(0, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("-1.0", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append('-');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append((double) 35);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strBuilder24, 19, 't');
        boolean boolean29 = strBuilder27.contains("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        int int23 = strBuilder21.lastIndexOf(strMatcher22);
        java.lang.String str25 = strBuilder21.leftString((int) (short) 100);
        java.lang.String str28 = strBuilder21.midString((int) ' ', 4);
        boolean boolean29 = strBuilder8.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder8.replace(strMatcher30, "01##########4##", 11, (int) '-', (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder8.insert(4, (long) 5);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append((long) (byte) 10);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "########10" + "'", str25, "########10");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.setNullText("");
        java.lang.String str10 = strBuilder8.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray27 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.insert(0, charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder14.appendPadding(0, 'a');
        java.lang.Object obj33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.insert((int) (short) 0, obj33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder8.append((java.lang.Object) strBuilder34);
        boolean boolean39 = strBuilder8.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder8.insert(10, 't');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteAll('-');
        int int46 = strBuilder44.indexOf("tr2ue2.0");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.replaceAll(strMatcher29, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        int int33 = strBuilder17.indexOf(strMatcher32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder17.append('4');
        boolean boolean36 = strBuilder17.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder41.appendFixedWidthPadRight((int) (byte) 10, 25, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder17.appendFixedWidthPadRight((java.lang.Object) strBuilder45, 1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.insert(111, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 111");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int23 = strBuilder3.lastIndexOf(strMatcher21, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int36 = strBuilder27.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder27.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder27.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder41, (int) (byte) 1, '4');
        boolean boolean46 = strBuilder44.endsWith("01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append("######################0");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.insert(6, "##4##0#############################");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        int int8 = strBuilder4.size();
        boolean boolean10 = strBuilder4.endsWith("");
        boolean boolean12 = strBuilder4.endsWith("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder4.appendFixedWidthPadLeft((int) (short) 10, (int) '1', 'a');
        java.lang.String str19 = strBuilder4.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        int int26 = strBuilder21.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean36 = strBuilder30.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.insert(0, 0.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder30.setCharAt(2, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        boolean boolean50 = strBuilder48.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher51 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder48.replaceAll(strMatcher51, "hi!");
        int int55 = strBuilder48.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder48.replaceFirst("4 ########10", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder48.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder48.append((double) 12);
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strBuilder61.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder42.appendWithSeparators((java.util.Iterator) strTokenizer62, " #");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder4.appendWithSeparators((java.util.Iterator) strTokenizer62, "#################### 4 4");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.append((double) 56);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder68.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder69);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str26 = strBuilder24.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.replaceFirst(strMatcher27, "hi!");
        java.lang.String str31 = strBuilder24.rightString(11);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder24.replace(19, 112, "#################1true0");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteAll('e');
        java.lang.String str38 = strBuilder37.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4##########101                                                                                                " + "'", str26, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "           " + "'", str31, "           ");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "##4##########101   #################1tru0" + "'", str38, "##4##########101   #################1tru0");
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append('a');
        int int20 = strBuilder18.lastIndexOf("#97.0#4##########10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst('a');
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll(strMatcher16, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendFixedWidthPadLeft((int) 'e', 16, 'e');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.setCharAt(25, 'u');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        java.lang.Object obj28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.insert((int) (short) 0, obj28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteAll(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder5.append((java.lang.Object) strBuilder34);
        int int38 = strBuilder5.length();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder5.deleteAll(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceAll(' ', '1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 4 + "'", int38 == 4);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.setLength(32);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.append(0.0f);
        int int22 = strBuilder14.size();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        boolean boolean24 = strBuilder14.contains(strMatcher23);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35 + "'", int22 == 35);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadLeft(12, (int) (byte) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding((int) (short) 10, '#');
        java.lang.String str32 = strBuilder27.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder36.appendPadding(0, 'a');
        java.lang.Object obj55 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.insert((int) (short) 0, obj55);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) strBuilder56, (int) ' ', '4');
        int int64 = strBuilder56.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder56.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean70 = strBuilder67.equalsIgnoreCase(strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder69.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder69.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int78 = strBuilder75.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder75.replaceFirst("", "##");
        java.util.Collection collection82 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder81.appendWithSeparators(collection82, "\n");
        java.lang.Object[] objArray85 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder84.appendWithSeparators(objArray85, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder65.appendWithSeparators(objArray85, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder20.appendWithSeparators(objArray85, "a###################");
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder1.appendWithSeparators(objArray85, "##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder93.append((long) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder98 = strBuilder95.replaceAll('a', 'u');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2 + "'", int64 == 2);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray85), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray85), "[]");
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(strBuilder98);
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray51 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.insert(0, charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder31.append(charArray51);
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst(strMatcher54, "hi!");
        char[] charArray57 = strBuilder53.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder29.append(charArray57, (int) (byte) 0, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.deleteFirst(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.setCharAt((int) 'a', '-');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.insert(125, (long) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 125");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.ensureCapacity((int) (byte) 0);
        java.util.Collection collection31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendWithSeparators(collection31, "\n");
        java.lang.String str34 = strBuilder21.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder21.setLength(2);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder36.clear();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        int int40 = strBuilder37.lastIndexOf(strMatcher38, 44);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.setNewLineText("\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder24.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength((int) '#');
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int41 = strBuilder38.lastIndexOf(strMatcher39, 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str26 = strBuilder24.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.replaceAll(strMatcher27, "##4##########10#");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.insert((int) '#', '#');
        char[] charArray33 = strBuilder24.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder24.replaceAll('#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.minimizeCapacity();
        boolean boolean39 = strBuilder37.startsWith("                                                                             ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.append(" #", 112, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "4##########101                                                                                                " + "'", str26, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##########101                   #                                                                             ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##########101                   #                                                                             ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, 1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , #,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append(2);
        java.io.Reader reader23 = strBuilder17.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder17.append((long) 11);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder25.appendFixedWidthPadRight((java.lang.Object) strBuilder35, (int) (short) 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.deleteAll('\n');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
    }
}

