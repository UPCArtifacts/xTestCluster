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
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.appendWithSeparators(collection10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.replaceAll("           ", "a###################");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder22.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder22.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader44 = strBuilder22.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int49 = strBuilder47.lastIndexOf('4');
        char[] charArray50 = strBuilder47.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder22.insert((int) (short) 10, charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder22.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) strBuilder52, 11, ' ');
        java.io.Writer writer56 = strBuilder18.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder18.deleteAll('#');
        boolean boolean60 = strBuilder58.contains('1');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(reader44);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[]");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(writer56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendFixedWidthPadLeft(10, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.insert(1, (float) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray25 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder12.insert(0, charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder12.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        int int32 = strBuilder12.lastIndexOf(strMatcher30, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int45 = strBuilder36.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder36.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder12.appendFixedWidthPadRight((java.lang.Object) strBuilder50, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst('a', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder53.appendFixedWidthPadRight(150, (int) (short) 100, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder8.append(strBuilder53, (int) (byte) 0, 14);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.delete(0, 4);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendFixedWidthPadRight(15, 15, '-');
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
        java.lang.String str72 = strBuilder40.toString();
        int int74 = strBuilder40.lastIndexOf("           ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder18.append(strBuilder40, (-1), 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
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
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "####################" + "'", str72, "####################");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
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
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int23 = strBuilder20.indexOf(strMatcher21, 19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteAll(strMatcher8);
        int int10 = strBuilder9.capacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        java.io.Writer writer10 = strBuilder3.asWriter();
        // The following exception was thrown during execution in test generation
        try {
            char char12 = strBuilder3.charAt(118);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 118");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(writer10);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder6.replaceFirst(' ', 'a');
        boolean boolean13 = strBuilder6.endsWith("\n##########0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder6.append("true", (int) 'a', 25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        boolean boolean16 = strBuilder12.startsWith("                                       ");
        java.lang.StringBuffer stringBuffer17 = strBuilder12.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('a', ' ');
        java.lang.String str35 = strBuilder33.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.trim();
        java.lang.String str37 = strBuilder36.toString();
        char[] charArray38 = strBuilder36.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder12.append(charArray38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder41.minimizeCapacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(stringBuffer17);
        org.junit.Assert.assertEquals(stringBuffer17.toString(), "########10");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "####10" + "'", str35, "####10");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "########10" + "'", str37, "########10");
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int3 = strBuilder1.lastIndexOf('4');
        int int5 = strBuilder1.lastIndexOf("##4##");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
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
        int int32 = strBuilder21.indexOf("##");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder21.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder21.replaceFirst(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.appendFixedWidthPadLeft(22, 2, '4');
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder29.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder29.append((double) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder39.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray57 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder44.insert(0, charArray57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer64 = strBuilder60.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder44.append(stringBuffer64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean70 = strBuilder67.equalsIgnoreCase(strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder67.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder67.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder67.append((double) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder77.minimizeCapacity();
        java.lang.StringBuffer stringBuffer79 = strBuilder77.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder44.append(stringBuffer79, 15, 35);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder40.append(stringBuffer79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder27.append(stringBuffer79, 159, 45);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(stringBuffer64);
        org.junit.Assert.assertEquals(stringBuffer64.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(stringBuffer79);
        org.junit.Assert.assertEquals(stringBuffer79.toString(), "4##########101                                                                                                1.0");
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray32 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder19.insert(0, charArray32);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder19.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst(strMatcher37, "");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.deleteAll(strMatcher44);
        int int48 = strBuilder45.lastIndexOf('#', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder50.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder50.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder50.append((double) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder60.minimizeCapacity();
        java.lang.StringBuffer stringBuffer62 = strBuilder60.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder45.append(strBuilder60);
        boolean boolean64 = strBuilder11.equals(strBuilder60);
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder11.deleteAll(strMatcher65);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.insert(29, (float) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 29");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "4##########101                                                                                                1.0");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int19 = strBuilder10.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder10.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray38 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder25.insert(0, charArray38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer63 = strBuilder59.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder43.append(stringBuffer63);
        boolean boolean66 = strBuilder43.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder43.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.Object[] objArray71 = new java.lang.Object[] { strBuilder25, strBuilder43 };
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder21.appendWithSeparators(objArray71, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder73.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int78 = strBuilder76.lastIndexOf('4');
        char[] charArray79 = strBuilder76.toCharArray();
        char[] charArray80 = strBuilder74.getChars(charArray79);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder3.insert((int) (short) -1, charArray79, 8, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(stringBuffer63);
        org.junit.Assert.assertEquals(stringBuffer63.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(objArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray71), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray71), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[]");
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "########10##4##########104##########101                                                                                                ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "########10##4##########104##########101                                                                                                ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[#, #, #, #, #, #, #, #, 1, 0, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, 1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, #, #, #, #, #, #, #, #, #, #, 1, 0, 0, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a]");
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer27 = strBuilder26.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder1.append(stringBuffer27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.setNewLineText("##4##");
        java.io.Writer writer31 = strBuilder28.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.ensureCapacity(0);
        org.junit.Assert.assertNotNull(strBuilder4);
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
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertNotNull(strBuilder33);
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
        boolean boolean64 = strBuilder62.endsWith("10########100\n4 ########100");
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
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
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
        boolean boolean18 = strBuilder16.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.insert(0, (long) '#');
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.replaceAll(strMatcher22, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding((int) (short) 10, '#');
        int int31 = strBuilder26.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder26.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append('4');
        boolean boolean37 = strBuilder33.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder33.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder16.append((java.lang.Object) strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        char[] charArray18 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.append(charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean24 = strBuilder21.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray36 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder23.insert(0, charArray36);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder23.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst(strMatcher41, "");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.appendPadding((int) (short) 10, '#');
        int int56 = strBuilder51.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder51.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) strBuilder60, (int) (short) 1, 'a');
        char[] charArray64 = strBuilder63.toCharArray();
        char[] charArray65 = strBuilder19.getChars(charArray64);
        java.io.Reader reader66 = strBuilder19.asReader();
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "##4##########101true4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "##4##########101true4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, 1, t, r, u, e, 4]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "#################### 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "#################### 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[#, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #,  , 4,  ]");
        org.junit.Assert.assertNotNull(reader66);
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        int int56 = strBuilder18.indexOf("#########");
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
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
        java.io.Reader reader9 = strBuilder5.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.reverse();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteAll(strMatcher11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(reader9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendWithSeparators(collection46, "");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.replaceAll('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.append('4');
        boolean boolean61 = strBuilder55.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder55.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder65.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) strBuilder65, (int) (short) 100, ' ');
        char[] charArray73 = strBuilder51.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder30.insert((int) (short) 10, charArray73, 5, 35);
        boolean boolean78 = strBuilder76.contains('4');
        int int80 = strBuilder76.indexOf("##4##");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder76.deleteCharAt(144);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 144");
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
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 11 + "'", int42 == 11);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "                                                                                       4\n##########0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "                                                                                       4\n##########0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , 4, \n, #, #, #, #, #, #, #, #, #, #, 0]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
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
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append(2);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        int int33 = strBuilder28.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder28.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        boolean boolean43 = strBuilder41.contains(strMatcher42);
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder41.deleteFirst(strMatcher44);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.appendPadding((int) (short) 10, '#');
        java.lang.String str53 = strBuilder48.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray70 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder57.insert(0, charArray70);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder57.appendPadding(0, 'a');
        java.lang.Object obj76 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.insert((int) (short) 0, obj76);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder77.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) strBuilder77, (int) ' ', '4');
        char[] charArray84 = strBuilder48.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder41.insert(11, charArray84, 5, 10);
        boolean boolean88 = strBuilder26.equals((java.lang.Object) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder26.setLength(27);
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
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
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
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "##########44444444444444444##4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "##########44444444444444444##4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[#, #, #, #, #, #, #, #, #, #, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strBuilder90);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.appendFixedWidthPadLeft(144, (int) (byte) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendWithSeparators(collection27, "");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.trim();
        int int33 = strBuilder26.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder23.insert(1, (java.lang.Object) strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder36.append(charArray56);
        char[] charArray59 = strBuilder26.getChars(charArray56);
        int int61 = strBuilder26.lastIndexOf("     ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 32 + "'", int33 == 32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, 4, #, #]");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.append((double) 1L);
        boolean boolean16 = strBuilder10.contains('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(4);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.insert(101, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 101");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) strBuilder19, 20, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder3.appendFixedWidthPadLeft(150, 26, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.replaceFirst(strMatcher27, "##4##########11");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        boolean boolean27 = strBuilder26.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.append(39);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.append("                                       ");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.insert((int) (byte) 10, "#####");
        java.lang.String str35 = strBuilder34.getNewLineText();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        int int38 = strBuilder34.lastIndexOf(strMatcher36, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.append((long) 32);
        boolean boolean53 = strBuilder49.contains('4');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder34.insert(22, (java.lang.Object) strBuilder49);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder49.insert(15, (float) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 15");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray71 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder58.insert(0, charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean77 = strBuilder74.equalsIgnoreCase(strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.append('4');
        boolean boolean82 = strBuilder76.contains("");
        boolean boolean83 = strBuilder72.equalsIgnoreCase(strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder48.append(strBuilder76);
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strBuilder84.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder22.appendWithSeparators((java.util.Iterator) strTokenizer85, "# 4 ");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.append((double) 14);
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
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str26 = strBuilder24.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.replaceFirst(strMatcher27, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.insert((int) (byte) 10, false);
        int int37 = strBuilder32.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.deleteAll("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append((int) (byte) 10);
        char[] charArray49 = strBuilder46.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder32.insert(1, charArray49);
        java.io.Writer writer51 = strBuilder50.asWriter();
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 118 + "'", int37 == 118);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(writer51);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll('4', '4');
        int int8 = strBuilder7.size();
        int int11 = strBuilder7.indexOf('a', 35);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding((int) (short) 10, '#');
        int int18 = strBuilder13.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder13.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.replaceAll('4', ' ');
        boolean boolean26 = strBuilder7.equals((java.lang.Object) '4');
        int int28 = strBuilder7.lastIndexOf('-');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder7.deleteAll('a');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        java.lang.String str13 = strBuilder12.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\n\nfalse" + "'", str13, "\n\nfalse");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.replaceFirst("", "");
        boolean boolean32 = strBuilder17.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.replaceAll("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "           ");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray53 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder40.insert(0, charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.append('4');
        boolean boolean64 = strBuilder58.contains("");
        boolean boolean65 = strBuilder54.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder54.replaceAll(strMatcher66, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder54.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.deleteFirst('#');
        java.lang.String str73 = strBuilder72.getNewLineText();
        boolean boolean74 = strBuilder36.equals((java.lang.Object) strBuilder72);
        org.apache.commons.lang.text.StrMatcher strMatcher75 = null;
        int int77 = strBuilder72.lastIndexOf(strMatcher75, 38);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder72.appendFixedWidthPadLeft((int) (byte) 1, 138, '4');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(strBuilder81);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        int int27 = strBuilder24.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.append(2);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append(true);
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.deleteAll(strMatcher32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray50 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder37.insert(0, charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.append('4');
        boolean boolean61 = strBuilder55.contains("");
        boolean boolean62 = strBuilder51.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder51.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strBuilder51.asTokenizer();
        char[] charArray67 = strBuilder51.toCharArray((int) (byte) 1, 9);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strBuilder51.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer68, "                                       ");
        boolean boolean71 = strBuilder6.equals((java.lang.Object) strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder33.setLength((int) (byte) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher74 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder33.replace(strMatcher74, "0", 22, 27, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "#4######");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "#4######");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, 4, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
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
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder30.replace(1, 2, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder30.replaceFirst('4', '#');
        char[] charArray46 = strBuilder30.toCharArray();
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#hi!###########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#hi!###########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, h, i, !, #, #, #, #, #, #, #, #, #, #, #, 1, 0]");
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        java.lang.String str17 = strBuilder16.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.deleteFirst("a###################");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.insert(0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray40 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder27.insert(0, charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder27.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder27.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection52 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.appendWithSeparators(collection52, "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder48.insert(0, (java.lang.Object) strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder48.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        int int62 = strBuilder60.lastIndexOf(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder23.append((java.lang.Object) strBuilder60);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.deleteFirst('#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader25 = strBuilder3.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        int int28 = strBuilder27.capacity();
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
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 144 + "'", int28 == 144);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("01########");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray18 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder5.insert(0, charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder5.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.replaceFirst(strMatcher23, "");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder22.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendPadding((int) (short) 10, '#');
        int int38 = strBuilder33.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder33.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) strBuilder42, (int) (short) 1, 'a');
        int int46 = strBuilder29.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder29.deleteAll('a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder1.append(strBuilder29, 16, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 32 + "'", int46 == 32);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2537");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        boolean boolean28 = strBuilder26.startsWith("hi!");
        boolean boolean30 = strBuilder26.contains("hi!");
        java.lang.String str32 = strBuilder26.leftString(2);
        java.io.Writer writer33 = strBuilder26.asWriter();
        int int34 = strBuilder26.length();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder21.append((java.lang.Object) int34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder21.setNullText("##########10##########");
        // The following exception was thrown during execution in test generation
        try {
            char char39 = strBuilder37.charAt((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##" + "'", str32, "##");
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.setLength(26);
        char[] charArray39 = strBuilder32.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder32.insert((int) 'a', "#########101                                                                                     4                ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "##########4 ########10\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "##########4 ########10\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #, #, #, #, #, #, #, #, #, 4,  , #, #, #, #, #, #, #, #, 1, 0, \000, \000, \000, \000]");
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append((float) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.replaceAll(strMatcher7, "");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding(7, ' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        int int29 = strBuilder24.lastIndexOf(strMatcher27, (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append("#########");
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.appendFixedWidthPadLeft(32, 25, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder18.replaceAll("4", "01##########4##");
        int int29 = strBuilder28.size();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray32 = strBuilder28.toCharArray((int) (byte) 100, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 35 + "'", int29 == 35);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
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
        char[] charArray27 = strBuilder23.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.replaceFirst("", "##4##########10#");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.reverse();
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
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        java.lang.String str39 = strBuilder8.leftString(9);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder8.append(100L);
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "#########" + "'", str39, "#########");
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        java.lang.String str4 = strBuilder2.rightString((int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int17 = strBuilder8.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder8.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean24 = strBuilder21.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray36 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder23.insert(0, charArray36);
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
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder41.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.Object[] objArray69 = new java.lang.Object[] { strBuilder23, strBuilder41 };
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder19.appendWithSeparators(objArray69, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder2.appendWithSeparators(objArray69, "35");
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#, #, 4, #, #]");
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
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray69), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray69), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.setLength(24);
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.indexOf(strMatcher23);
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.insert(0, (long) (short) 1);
        int int21 = strBuilder3.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder3.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setNewLineText("10");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.insert(144, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 144");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
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
        int int28 = strBuilder24.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.replace(159, 33, "4");
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
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 112 + "'", int28 == 112);
    }

    @Test
    public void test2548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2548");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceAll('#', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        int int23 = strBuilder15.lastIndexOf(strMatcher22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder15.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(true);
        boolean boolean31 = strBuilder29.contains('a');
        boolean boolean33 = strBuilder29.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder29.appendFixedWidthPadLeft(14, (int) (short) 1, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder29.deleteAll(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) strBuilder39, 14, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendPadding((int) (short) 10, '#');
        java.lang.String str49 = strBuilder44.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray66 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder53.insert(0, charArray66);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder53.appendPadding(0, 'a');
        java.lang.Object obj72 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.insert((int) (short) 0, obj72);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder44.appendFixedWidthPadLeft((java.lang.Object) strBuilder73, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        int int81 = strBuilder73.indexOf(strMatcher80);
        org.apache.commons.lang.text.StrMatcher strMatcher82 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder73.deleteAll(strMatcher82);
        int int85 = strBuilder73.lastIndexOf("##");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder15.append(strBuilder73, 103, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 11 + "'", int85 == 11);
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append((long) (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder39.append(100.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder33.append((java.lang.Object) strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray65 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder52.insert(0, charArray65);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder52.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder52.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean75 = strBuilder52.endsWith("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder52.replaceAll("########10", "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder52.setCharAt((int) ' ', 'a');
        boolean boolean82 = strBuilder33.equals((java.lang.Object) strBuilder81);
        java.lang.String str84 = strBuilder81.leftString((int) (byte) -1);
        int int87 = strBuilder81.lastIndexOf("\n\nfalse", 3);
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.appendFixedWidthPadRight(100, (-1), '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder8.appendFixedWidthPadRight((int) (byte) 1, 118, '4');
        boolean boolean26 = strBuilder24.contains("           ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "####10");
        java.lang.StringBuffer stringBuffer31 = strBuilder27.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.setNullText("10.0########10 ");
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "eurt##################");
        org.junit.Assert.assertNotNull(strBuilder33);
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
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder(150);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendWithSeparators(collection17, "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strBuilder26.asTokenizer();
        int int28 = strBuilder26.size();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.deleteFirst(strMatcher29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.insert((int) (short) 1, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, (int) ' ', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append((long) 5);
        boolean boolean39 = strBuilder14.equalsIgnoreCase(strBuilder38);
        boolean boolean40 = strBuilder8.equals((java.lang.Object) strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        int int27 = strBuilder24.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.append(2);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append(true);
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.deleteAll(strMatcher32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray50 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder37.insert(0, charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.append('4');
        boolean boolean61 = strBuilder55.contains("");
        boolean boolean62 = strBuilder51.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder51.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strBuilder51.asTokenizer();
        char[] charArray67 = strBuilder51.toCharArray((int) (byte) 1, 9);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strBuilder51.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer68, "                                       ");
        boolean boolean71 = strBuilder6.equals((java.lang.Object) strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder33.setLength(42);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.replaceFirst("##4##100.0", "");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "#4######");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "#4######");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, 4, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding((int) (short) 10, '#');
        int int44 = strBuilder39.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder39.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilder46.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder37.appendWithSeparators((java.util.Iterator) strTokenizer47, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.appendPadding((int) (short) 10, '#');
        int int56 = strBuilder51.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder51.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append('4');
        boolean boolean62 = strBuilder58.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder66.minimizeCapacity();
        boolean boolean68 = strBuilder37.equals(strBuilder67);
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
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
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder10.append(strBuilder22, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.append(false);
        java.lang.String str30 = strBuilder25.leftString(42);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder25.replaceAll("#########true##################### 4 ", "35");
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\n\nfalse" + "'", str30, "\n\nfalse");
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
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str26 = strBuilder24.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.replaceFirst(strMatcher27, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.insert((int) (byte) 10, false);
        int int37 = strBuilder32.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.deleteAll("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append((int) (byte) 10);
        char[] charArray49 = strBuilder46.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder32.insert(1, charArray49);
        boolean boolean52 = strBuilder50.endsWith("##########-1##################################################################################################");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean57 = strBuilder54.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder54.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder54.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder54.insert(5, (long) (byte) 1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strBuilder54.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder50.appendWithSeparators((java.util.Iterator) strTokenizer66, "#########101                                                                                     4                ");
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 118 + "'", int37 == 118);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.reverse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.replaceAll(strMatcher4, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.replaceFirst("##########10", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("01########");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("aaaaaaaaaaaaaaaaa", "0");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.delete(0, (int) '#');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        boolean boolean16 = strBuilder12.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.insert((int) (byte) 10, (long) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteAll('#');
        char[] charArray22 = strBuilder21.toCharArray();
        java.lang.String str24 = strBuilder21.leftString(9);
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.replaceAll(strMatcher25, "\n\nfalse");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray22);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray22), "1032");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray22), "1032");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray22), "[1, 0, 3, 2]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1032" + "'", str24, "1032");
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
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
        int int55 = strBuilder21.indexOf("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder21.appendFixedWidthPadRight((int) (short) 1, 10, ' ');
        java.io.Reader reader60 = strBuilder21.asReader();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder21.replaceAll(strMatcher61, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder21.appendFixedWidthPadRight(15, (int) (short) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.deleteCharAt(49);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(reader60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean7 = strBuilder4.equalsIgnoreCase(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray19 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder6.insert(0, charArray19);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder6.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst(strMatcher24, "");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append(true);
        char[] charArray35 = strBuilder32.toCharArray(0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder1.append(charArray35);
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder1.indexOf(strMatcher37);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder1.deleteAll(strMatcher39);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        java.io.Reader reader27 = strBuilder26.asReader();
        boolean boolean29 = strBuilder26.startsWith("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.insert(150, 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 150");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
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
        int int33 = strBuilder3.indexOf("hi!", (-1));
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder3.deleteAll(strMatcher34);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder3.appendFixedWidthPadRight((int) '-', 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder43.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder43.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean66 = strBuilder43.endsWith("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder43.replaceAll("########10", "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder43.setCharAt((int) ' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder43.clear();
        boolean boolean74 = strBuilder39.equals((java.lang.Object) strBuilder73);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.replaceFirst('4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder14.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append((float) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding((int) (short) 10, '#');
        int int29 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strBuilder34.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.appendWithSeparators((java.util.Iterator) strTokenizer35, "hi!");
        boolean boolean38 = strBuilder20.equals(strBuilder37);
        boolean boolean39 = strBuilder14.equals((java.lang.Object) strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.deleteFirst("\n");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        boolean boolean17 = strBuilder15.contains(strMatcher16);
        int int20 = strBuilder15.lastIndexOf('a', 159);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strBuilder25.asTokenizer();
        int int27 = strBuilder25.size();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.deleteFirst(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert((int) (short) 1, (int) (short) 10);
        boolean boolean34 = strBuilder29.startsWith("\n");
        int int36 = strBuilder29.indexOf("4\n");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append((java.lang.Object) "4\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 10 + "'", int27 == 10);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.setLength(24);
        java.lang.Class<?> wildcardClass23 = strBuilder22.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.lang.String str4 = strBuilder1.substring(0, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("-1.0", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.trim();
        java.lang.String str9 = strBuilder7.getNullText();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(str9);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.String str32 = strBuilder3.rightString(32);
        boolean boolean34 = strBuilder3.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder3.trim();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder3.deleteFirst(strMatcher36);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder3.append(112);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder3.appendFixedWidthPadRight(24, 104, '1');
        int int46 = strBuilder43.indexOf('a', 5);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 28 + "'", int46 == 28);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder5.appendFixedWidthPadLeft((int) 'a', 0, '#');
        java.lang.String str46 = strBuilder5.leftString(28);
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
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-1.0" + "'", str46, "-1.0");
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
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
        java.lang.Object obj34 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.appendFixedWidthPadRight(obj34, 13, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.replaceFirst("##########true", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder14.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding((int) (short) 10, '#');
        int int22 = strBuilder17.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strBuilder24.asTokenizer();
        java.lang.String str28 = strBuilder24.midString((int) (byte) 0, 24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strBuilder24.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer29, "     ");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder15.reverse();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "##########" + "'", str28, "##########");
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader25 = strBuilder3.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append('4');
        java.lang.String str31 = strBuilder29.rightString(125);
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
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4" + "'", str31, "                                                                                            aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa4");
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
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
        java.io.Writer writer31 = strBuilder16.asWriter();
        int int33 = strBuilder16.lastIndexOf('-');
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        int int36 = strBuilder16.indexOf(strMatcher34, 42);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray53 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder40.insert(0, charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder40.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder40.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection65 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.appendWithSeparators(collection65, "");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder61.insert(0, (java.lang.Object) strBuilder70);
        int int72 = strBuilder71.size();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.append('#');
        boolean boolean75 = strBuilder16.equals(strBuilder74);
        boolean boolean77 = strBuilder16.startsWith("           ");
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
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 112 + "'", int72 == 112);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.replaceFirst('4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder36.append(charArray56);
        char[] charArray59 = strBuilder32.getChars(charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder14.append(charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder60.insert((int) (short) 1, 23);
        boolean boolean67 = strBuilder65.endsWith("");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        int int41 = strBuilder39.lastIndexOf(strMatcher40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.deleteAll('-');
        boolean boolean44 = strBuilder3.equals((java.lang.Object) strBuilder43);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder15.appendFixedWidthPadLeft((int) ' ', 0, '#');
        boolean boolean45 = strBuilder43.contains('#');
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
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        java.io.Reader reader12 = strBuilder9.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.setNewLineText("##4##########10#");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll('-', '#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        int int27 = strBuilder24.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.append(2);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append(true);
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.deleteAll(strMatcher32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray50 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder37.insert(0, charArray50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.append('4');
        boolean boolean61 = strBuilder55.contains("");
        boolean boolean62 = strBuilder51.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder51.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strBuilder51.asTokenizer();
        char[] charArray67 = strBuilder51.toCharArray((int) (byte) 1, 9);
        org.apache.commons.lang.text.StrTokenizer strTokenizer68 = strBuilder51.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer68, "                                       ");
        boolean boolean71 = strBuilder6.equals((java.lang.Object) strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder33.setLength(42);
        java.lang.String str76 = strBuilder73.midString(4, (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder73.append(false);
        int int81 = strBuilder73.indexOf('#', (int) ' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "#4######");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "#4######");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, 4, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strTokenizer68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "#########102true##4##########10\000\000\000\000" + "'", str76, "#########102true##4##########10\000\000\000\000");
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 32 + "'", int81 == 32);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(118, 0, '0');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.appendFixedWidthPadRight((int) '#', (int) (byte) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.setNewLineText("10##########4 ########10\n4 ########100");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendWithSeparators(collection32, "");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendNewLine();
        java.util.Collection collection40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendWithSeparators(collection40, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder42.minimizeCapacity();
        boolean boolean44 = strBuilder25.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int47 = strBuilder25.lastIndexOf(strMatcher45, (int) (short) -1);
        boolean boolean48 = strBuilder25.isEmpty();
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray18 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder5.insert(0, charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder5.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.replaceFirst(strMatcher23, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder26.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder27, 118, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder27.append(' ');
        // The following exception was thrown during execution in test generation
        try {
            char char34 = strBuilder32.charAt(19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 19");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.replaceFirst("########10", "a#########");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder3.append(' ');
        int int33 = strBuilder31.lastIndexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendNull();
        int int35 = strBuilder34.length();
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
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 25 + "'", int33 == 25);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 26 + "'", int35 == 26);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((double) 101);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceFirst(strMatcher15, "##4##0################################################################################################");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append(10.0d);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (short) 10, '#');
        java.lang.String str19 = strBuilder14.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean24 = strBuilder21.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray36 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder23.insert(0, charArray36);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder23.appendPadding(0, 'a');
        java.lang.Object obj42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.insert((int) (short) 0, obj42);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) strBuilder43, (int) ' ', '4');
        int int51 = strBuilder43.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder43.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean57 = strBuilder54.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder56.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int65 = strBuilder62.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.replaceFirst("", "##");
        java.util.Collection collection69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendWithSeparators(collection69, "\n");
        java.lang.Object[] objArray72 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendWithSeparators(objArray72, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder52.appendWithSeparators(objArray72, "##");
        java.lang.StringBuffer stringBuffer77 = strBuilder52.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder12.append(stringBuffer77);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder12.setNullText("########10\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder12.append((double) 27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2 + "'", int51 == 2);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray72), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray72), "[]");
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(stringBuffer77);
        org.junit.Assert.assertEquals(stringBuffer77.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder82);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.lang.String str4 = strBuilder1.substring(0, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("-1.0", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (short) 10, '#');
        int int15 = strBuilder10.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append('4');
        boolean boolean21 = strBuilder17.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.ensureCapacity(45);
        java.lang.String str32 = strBuilder26.leftString((int) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder8.append(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst('#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##########true410.0 " + "'", str32, "##########true410.0 ");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
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
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        int int43 = strBuilder30.indexOf(strMatcher42);
        java.io.Writer writer44 = strBuilder30.asWriter();
        int int47 = strBuilder30.lastIndexOf("#########101                                                                                     4                ", (int) (short) 1);
        java.io.Writer writer48 = strBuilder30.asWriter();
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(writer44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(writer48);
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
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceAll('#', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        int int23 = strBuilder15.lastIndexOf(strMatcher22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder15.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(true);
        boolean boolean31 = strBuilder29.contains('a');
        boolean boolean33 = strBuilder29.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder29.appendFixedWidthPadLeft(14, (int) (short) 1, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder29.deleteAll(strMatcher38);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) strBuilder39, 14, '4');
        java.lang.String str43 = strBuilder42.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "4444444410444444444true4" + "'", str43, "4444444410444444444true4");
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.replaceAll("", "");
        boolean boolean30 = strBuilder16.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder16.insert(0, (float) 107);
        java.lang.String str34 = strBuilder16.getNewLineText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = strBuilder16.substring(25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        char[] charArray18 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.append(charArray18);
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        int int21 = strBuilder19.indexOf(strMatcher20);
        int int23 = strBuilder19.lastIndexOf('#');
        char[] charArray26 = strBuilder19.toCharArray((int) (short) 1, 23);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "################### 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "################### 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #,  , 4,  ]");
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.appendFixedWidthPadLeft(2, 107, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder30.append(false);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        java.lang.String str17 = strBuilder15.rightString((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.clear();
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
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray64 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder51.insert(0, charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder51.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.replaceFirst(strMatcher69, "");
        boolean boolean72 = strBuilder40.equals((java.lang.Object) strBuilder68);
        int int74 = strBuilder40.indexOf("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder40.appendNull();
        boolean boolean76 = strBuilder18.equalsIgnoreCase(strBuilder75);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder18.insert(23, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strBuilder18);
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
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
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
        int int55 = strBuilder21.indexOf("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder21.appendNull();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.insert(2, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder56);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        int int28 = strBuilder26.lastIndexOf('#');
        int int30 = strBuilder26.lastIndexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.deleteFirst("-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.append((double) 150);
        int int37 = strBuilder34.lastIndexOf("hi!4#######", (int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.String str31 = strBuilder3.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.append('4');
        boolean boolean41 = strBuilder35.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer50 = strBuilder49.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer50, "########10##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceAll(strMatcher53, "##");
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
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strTokenizer50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
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
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder8.replaceAll(strMatcher38, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.replace((int) (short) 0, 2, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteCharAt(0);
        boolean boolean47 = strBuilder44.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder44.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder44.replaceFirst('-', 'a');
        int int55 = strBuilder52.indexOf('4', 8);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.insert(7, 104);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray24 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.insert(0, charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder11.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder11.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str34 = strBuilder32.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.replaceFirst(strMatcher35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder54.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.appendPadding((int) (short) 10, '#');
        int int67 = strBuilder62.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strBuilder72.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder62.appendWithSeparators((java.util.Iterator) strTokenizer73, "hi!");
        char[] charArray79 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder62.append(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder59.insert((int) (byte) 0, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder32.insert((int) (short) 100, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder1.append((java.lang.Object) strBuilder82);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder82.append((long) 107);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder82.append((double) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder87.replaceAll("##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "##########10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4##########101                                                                                                " + "'", str34, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder90);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        java.util.Collection collection38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendWithSeparators(collection38, "41         ");
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
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        java.lang.String str32 = strBuilder3.rightString(32);
        boolean boolean34 = strBuilder3.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder3.deleteAll("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceAll("aaaaaaaaaaaaaaaaa", "01########");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.replace(12, 0, "-1.0");
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
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
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
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        boolean boolean31 = strBuilder3.contains(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strBuilder33.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer38, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str43 = strBuilder3.midString(0, 11);
        boolean boolean45 = strBuilder3.endsWith("            -----------------------------hi!");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "##4########" + "'", str43, "##4########");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        int int6 = strBuilder4.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.insert(9, (-1));
        java.lang.String str10 = strBuilder9.getNullText();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.deleteAll(strMatcher11);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder8.replaceAll(strMatcher38, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.replace((int) (short) 0, 2, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteCharAt(0);
        boolean boolean47 = strBuilder44.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder44.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.replaceFirst("10########100\n4 ########100", "\n\nfalse");
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray27 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.insert(0, charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder14.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceFirst(strMatcher32, "");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder31.deleteAll(strMatcher39);
        boolean boolean41 = strBuilder40.isEmpty();
        boolean boolean42 = strBuilder4.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder46.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder46.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder61.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder63.replaceAll("", "");
        boolean boolean73 = strBuilder59.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrMatcher strMatcher74 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder63.replaceAll(strMatcher74, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.appendFixedWidthPadLeft(12, (int) 'a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder80.insert((int) (byte) 1, 0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder4.append(strBuilder80, 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder86.append((-1.0d));
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder86.insert(103, (long) 42);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 103");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
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
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append(false);
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
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer27 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        int int29 = strBuilder23.lastIndexOf(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean31 = strBuilder23.equals(strBuilder30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strTokenizer27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        int int14 = strBuilder11.lastIndexOf(' ', 20);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder11.replace(8, 112, "01########");
        int int20 = strBuilder11.size();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 18 + "'", int20 == 18);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        java.lang.String str40 = strBuilder37.midString(26, (int) '#');
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder43.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder43.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.util.Iterator iterator65 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.appendWithSeparators(iterator65, "hi!");
        boolean boolean68 = strBuilder37.equals(strBuilder67);
        java.util.Collection collection69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder67.appendWithSeparators(collection69, "######10");
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
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strBuilder71);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        boolean boolean16 = strBuilder14.contains(strMatcher15);
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteFirst(strMatcher17);
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
        char[] charArray57 = strBuilder21.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder14.insert(11, charArray57, 5, 10);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean65 = strBuilder62.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder64.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int73 = strBuilder64.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder64.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder64.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder78.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.replaceAll("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) "", 0, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder85.trim();
        int int87 = strBuilder86.size();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
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
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "##########44444444444444444##4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "##########44444444444444444##4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, #, #, #, #, #, #, #, #, #, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 25 + "'", int87 == 25);
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        int int32 = strBuilder29.lastIndexOf(strMatcher30, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.append((double) 1L);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.deleteFirst(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append(' ');
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        boolean boolean18 = strBuilder16.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.insert(0, (long) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.appendFixedWidthPadLeft(4, (int) (byte) 100, '4');
        int int29 = strBuilder23.indexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.replaceAll('4', '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setNewLineText("-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.deleteAll("\n\n");
        boolean boolean18 = strBuilder11.contains("");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        java.lang.String str17 = strBuilder15.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.trim();
        int int20 = strBuilder15.indexOf("                                                                                           0");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder15.append((long) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "####10" + "'", str17, "####10");
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
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
        java.lang.String str23 = strBuilder8.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding((int) (short) 10, '#');
        int int31 = strBuilder26.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder26.setNullText("");
        java.lang.String str35 = strBuilder33.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray52 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder39.insert(0, charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder39.appendPadding(0, 'a');
        java.lang.Object obj58 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.insert((int) (short) 0, obj58);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder33.append((java.lang.Object) strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder59.setNewLineText("");
        int int67 = strBuilder64.indexOf("##########true", (int) (byte) 10);
        boolean boolean68 = strBuilder24.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean74 = strBuilder71.equalsIgnoreCase(strBuilder73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder75.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder79.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher81 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.deleteFirst(strMatcher81);
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = strBuilder80.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder24.append(strBuilder80);
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strBuilder84.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer85, "------------");
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
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\n" + "'", str23, "\n");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strBuilder87);
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
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        int int28 = strBuilder26.lastIndexOf('#');
        int int30 = strBuilder26.lastIndexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.deleteFirst("-1.0");
        java.lang.String str34 = strBuilder32.rightString(20);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        boolean boolean36 = strBuilder32.contains(strMatcher35);
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.deleteAll(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.appendFixedWidthPadLeft(159, 26, 'a');
        int int44 = strBuilder42.lastIndexOf('4');
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "##4##########10" + "'", str34, "##4##########10");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
    }

    @Test
    public void test2615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2615");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 10);
        int int2 = strBuilder1.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.append("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendWithSeparators(collection8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendNewLine();
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendWithSeparators(collection16, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder18.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.replaceAll("           ", "a###################");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder28.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder28.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader50 = strBuilder28.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int55 = strBuilder53.lastIndexOf('4');
        char[] charArray56 = strBuilder53.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder28.insert((int) (short) 10, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder28.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) strBuilder58, 11, ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder1.insert(18, (java.lang.Object) strBuilder58);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 18");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
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
        org.junit.Assert.assertNotNull(reader50);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendNull();
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
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        int int44 = strBuilder41.lastIndexOf(strMatcher42, (int) (byte) 1);
        boolean boolean45 = strBuilder5.equals((java.lang.Object) int44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder5.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.ensureCapacity(38);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
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
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder15.appendFixedWidthPadLeft((int) ' ', 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append((float) 118);
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
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.append((double) (short) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        int int9 = strBuilder1.indexOf(strMatcher7, 10);
        int int11 = strBuilder1.indexOf('-');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        boolean boolean2 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendPadding((int) (short) 10, '#');
        int int10 = strBuilder5.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.setNullText("");
        java.lang.String str14 = strBuilder12.substring((int) (short) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder12.append((java.lang.Object) strBuilder38);
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder12.replaceAll(strMatcher42, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.replace((int) (short) 0, 2, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteCharAt(0);
        boolean boolean51 = strBuilder48.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder48.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadRight(20, 1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder1.insert(150, (java.lang.Object) 20);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 150");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.replaceFirst(strMatcher24, "1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.setLength(18);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray45 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder32.insert(0, charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder32.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder32.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean55 = strBuilder32.endsWith("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder32.replaceAll("########10", "########10");
        org.apache.commons.lang.text.StrMatcher strMatcher59 = null;
        boolean boolean60 = strBuilder32.contains(strMatcher59);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean65 = strBuilder62.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder62.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strBuilder62.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder32.appendWithSeparators((java.util.Iterator) strTokenizer67, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.insert(35, "                                                                                                   0");
        java.lang.StringBuffer stringBuffer73 = strBuilder72.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder28.append(stringBuffer73, 39, 118);
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(stringBuffer73);
        org.junit.Assert.assertEquals(stringBuffer73.toString(), "##4##########101                                                                                                                      0                                                                             ");
        org.junit.Assert.assertNotNull(strBuilder76);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.trim();
        int int8 = strBuilder1.capacity();
        boolean boolean10 = strBuilder1.startsWith("           ");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.setCharAt(49, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 32 + "'", int8 == 32);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder11.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setNewLineText("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst(strMatcher26, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("4##########101                                                                                                ");
        boolean boolean41 = strBuilder25.equals(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder7.append(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.insert(19, (long) 16);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.appendPadding(144, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder40.replaceAll('a', '#');
        int int54 = strBuilder51.indexOf(' ', 26);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder51.append("##4##########10150.0", 10, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int22 = strBuilder17.indexOf(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder28.appendPadding(0, 'a');
        java.lang.Object obj47 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.insert((int) (short) 0, obj47);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder61.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray76 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder63.insert(0, charArray76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder56.append(charArray76);
        org.apache.commons.lang.text.StrMatcher strMatcher79 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.replaceFirst(strMatcher79, "hi!");
        char[] charArray82 = strBuilder78.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder54.append(charArray82, (int) (byte) 0, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher86 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder85.deleteFirst(strMatcher86);
        char[] charArray90 = strBuilder85.toCharArray(27, 29);
        char[] charArray91 = strBuilder24.getChars(charArray90);
        org.apache.commons.lang.text.StrMatcher strMatcher92 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder24.deleteAll(strMatcher92);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray90), "  ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray90), "  ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray90), "[ ,  ]");
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "##4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "##4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
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
        int int28 = strBuilder23.lastIndexOf("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.deleteFirst("##########0.0##4##");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append(true);
        boolean boolean5 = strBuilder3.contains('a');
        boolean boolean7 = strBuilder3.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("hi!");
        boolean boolean10 = strBuilder3.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding((int) (short) 10, '#');
        java.lang.String str17 = strBuilder12.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray34 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder21.insert(0, charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder21.appendPadding(0, 'a');
        java.lang.Object obj40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.insert((int) (short) 0, obj40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) strBuilder41, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        int int49 = strBuilder41.indexOf(strMatcher48);
        int int52 = strBuilder41.indexOf("hi!", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder41.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strBuilder41.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer56, "##4##########101true");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.appendNewLine();
        int int28 = strBuilder25.lastIndexOf('a', 118);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.append(' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.appendFixedWidthPadLeft(21, (int) (byte) 10, '0');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.replaceAll(strMatcher15, "########10");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        int int19 = strBuilder3.lastIndexOf(strMatcher18);
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        int int22 = strBuilder3.lastIndexOf(strMatcher20, 28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((long) 32);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendWithSeparators(collection12, "aaaaaaaaaaaaaaaaa");
        int int16 = strBuilder14.lastIndexOf("#########101                                                                                     4                ");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.replaceFirst(strMatcher17, "####################");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((-1));
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
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
        org.apache.commons.lang.text.StrMatcher strMatcher87 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder3.deleteAll(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder3.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder3.setNewLineText("##########\n");
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
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.replace(strMatcher13, "###10#######################32\000\000\000\000\000\000\000\000\000\000\000", 2, 3, 8);
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        int int20 = strBuilder9.indexOf(strMatcher19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2633");
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
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.replaceFirst(' ', '#');
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int47 = strBuilder30.lastIndexOf(strMatcher45, 118);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder30.replaceAll('-', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.append(false);
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
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append((float) 11);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray27 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.insert(0, charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder14.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        int int34 = strBuilder14.lastIndexOf(strMatcher32, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int47 = strBuilder38.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder38.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder14.appendFixedWidthPadRight((java.lang.Object) strBuilder52, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder52.deleteFirst(strMatcher56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceFirst("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", "01##########4##");
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strBuilder57.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer61, "");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        int int28 = strBuilder23.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer34 = strBuilder33.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer34, "hi!");
        char[] charArray40 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder23.append(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder20.insert((int) (byte) 0, charArray40);
        java.lang.String str44 = strBuilder20.rightString(12);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder20.appendPadding((int) 'a', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        int int50 = strBuilder47.indexOf(strMatcher48, 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strTokenizer34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "4 ########10" + "'", str44, "4 ########10");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendFixedWidthPadLeft((int) '#', 10, ' ');
        int int33 = strBuilder20.indexOf('#');
        boolean boolean35 = strBuilder20.startsWith("##########10");
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        boolean boolean37 = strBuilder20.contains(strMatcher36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder20.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder20.replaceFirst(strMatcher39, "----------");
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        int int23 = strBuilder18.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.setNullText("");
        java.lang.String str27 = strBuilder25.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray44 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder31.insert(0, charArray44);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder31.appendPadding(0, 'a');
        java.lang.Object obj50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.insert((int) (short) 0, obj50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder25.append((java.lang.Object) strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder51.setNewLineText("");
        int int59 = strBuilder56.indexOf("##########true", (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder16.append(strBuilder56);
        boolean boolean62 = strBuilder60.startsWith("----------");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
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
        int int32 = strBuilder29.lastIndexOf(strMatcher30, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.append((double) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.deleteFirst('-');
        java.io.Writer writer37 = strBuilder36.asWriter();
        java.lang.String str38 = strBuilder36.getNewLineText();
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(writer37);
        org.junit.Assert.assertNull(str38);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        boolean boolean16 = strBuilder12.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.insert((int) (byte) 10, (long) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteAll('4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.insert(100, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
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
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder1.appendFixedWidthPadRight(15, 15, 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.setCharAt(39, '-');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 39");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append(2);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding(1, 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteCharAt(26);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 26");
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.replaceFirst("########10", "a#########");
        java.lang.String str30 = strBuilder29.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.appendFixedWidthPadLeft(20, 112, '4');
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
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        java.util.Collection collection69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder39.appendWithSeparators(collection69, "a#########");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.append((long) 107);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.ensureCapacity(32);
        org.apache.commons.lang.text.StrMatcher strMatcher76 = null;
        int int78 = strBuilder75.lastIndexOf(strMatcher76, 44);
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
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.reverse();
        java.lang.StringBuffer stringBuffer9 = strBuilder5.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(stringBuffer9);
        org.junit.Assert.assertEquals(stringBuffer9.toString(), "01");
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
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
        boolean boolean30 = strBuilder28.startsWith("#########101                                                                                     4                ");
        char char32 = strBuilder28.charAt((int) (byte) 0);
        java.io.Writer writer33 = strBuilder28.asWriter();
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '-' + "'", char32 == '-');
        org.junit.Assert.assertNotNull(writer33);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        boolean boolean16 = strBuilder12.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.insert((int) (byte) 10, (long) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.appendFixedWidthPadLeft(150, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.delete(27, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.setCharAt((int) ' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder3.clear();
        java.lang.String str35 = strBuilder33.rightString((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.replaceFirst(strMatcher28, "##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str32 = strBuilder24.leftString(118);
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##4##########101                                                                                                " + "'", str32, "##4##########101                                                                                                ");
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.append((float) (byte) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteAll(strMatcher8);
        int int12 = strBuilder4.lastIndexOf(' ', 44);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        boolean boolean28 = strBuilder26.startsWith("hi!");
        boolean boolean30 = strBuilder26.contains("hi!");
        java.lang.String str32 = strBuilder26.leftString(2);
        java.io.Writer writer33 = strBuilder26.asWriter();
        int int34 = strBuilder26.length();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder21.append((java.lang.Object) int34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder21.setNullText("##########10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.ensureCapacity((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##" + "'", str32, "##");
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
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
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        java.util.Collection collection22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendWithSeparators(collection22, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.appendFixedWidthPadLeft(11, 1, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.deleteFirst('4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder3.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray21 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.insert(0, charArray21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder8.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst(strMatcher26, "");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append(true);
        char[] charArray37 = strBuilder34.toCharArray(0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder3.append(charArray37);
        char[] charArray39 = strBuilder1.getChars(charArray37);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[]");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "#########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "#########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #, #, #, #, #, #, #, #]");
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
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
        boolean boolean28 = strBuilder3.startsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.appendFixedWidthPadLeft((int) (short) 0, 11, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder36.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer54 = strBuilder53.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.setLength(39);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder3.append(strBuilder53, 2, (int) (short) 0);
        int int61 = strBuilder3.indexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder3.append((long) 9);
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(stringBuffer54);
        org.junit.Assert.assertEquals(stringBuffer54.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
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
        int int32 = strBuilder29.lastIndexOf('#', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder34.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.append((double) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder44.minimizeCapacity();
        java.lang.StringBuffer stringBuffer46 = strBuilder44.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder29.append(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder44.append((double) (byte) -1);
        char char51 = strBuilder44.charAt((int) '4');
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        int int53 = strBuilder44.lastIndexOf(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder44.delete(5, 15);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "4##########101                                                                                                1.0");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + ' ' + "'", char51 == ' ');
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strBuilder56);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int23 = strBuilder14.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder14.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray42 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder29.insert(0, charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder45.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray60 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder47.insert(0, charArray60);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer67 = strBuilder63.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder47.append(stringBuffer67);
        boolean boolean70 = strBuilder47.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder47.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.Object[] objArray75 = new java.lang.Object[] { strBuilder29, strBuilder47 };
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder25.appendWithSeparators(objArray75, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder10.appendWithSeparators(objArray75, "a###################");
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        int int82 = strBuilder10.indexOf(strMatcher80, 14);
        org.apache.commons.lang.text.StrMatcher strMatcher83 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder10.replaceFirst(strMatcher83, "10.0########10 ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(stringBuffer67);
        org.junit.Assert.assertEquals(stringBuffer67.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(strBuilder85);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding(28, '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.append("hi!");
        java.lang.String str33 = strBuilder25.leftString(9);
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "         " + "'", str33, "         ");
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
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("a###################");
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.append(stringBuffer18, 19, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.trim();
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilder17.asTokenizer();
        java.lang.String str24 = strBuilder17.getNullText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
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
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder30.replace(5, 11, "aaaaaaaaaaaaaaaaa");
        java.io.Writer writer43 = strBuilder30.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder30.setCharAt(9, '#');
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(writer43);
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(14);
    }

    @Test
    public void test2661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2661");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder16.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.ensureCapacity(45);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append(17);
        char[] charArray24 = strBuilder23.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.insert((int) (byte) 10, (java.lang.Object) 0.0f);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##########true410.0 17");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##########true410.0 17");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, #, #, #, #, #, #, #, #, t, r, u, e, 4, 1, 0, ., 0,  , 1, 7]");
        org.junit.Assert.assertNotNull(strBuilder27);
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
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll("4##########101                                                                                                ", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append("");
        java.lang.String str35 = strBuilder32.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteCharAt(0);
        int int40 = strBuilder37.indexOf('4', (int) (byte) 0);
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
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
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
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        int int12 = strBuilder9.lastIndexOf(strMatcher10, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.deleteAll('4');
        int int17 = strBuilder14.lastIndexOf("####10", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder21.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.replaceFirst("", "");
        boolean boolean32 = strBuilder17.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.replaceAll("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "           ");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray53 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder40.insert(0, charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.append('4');
        boolean boolean64 = strBuilder58.contains("");
        boolean boolean65 = strBuilder54.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder54.replaceAll(strMatcher66, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder54.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.deleteFirst('#');
        java.lang.String str73 = strBuilder72.getNewLineText();
        boolean boolean74 = strBuilder36.equals((java.lang.Object) strBuilder72);
        org.apache.commons.lang.text.StrMatcher strMatcher75 = null;
        int int77 = strBuilder72.lastIndexOf(strMatcher75, 38);
        java.lang.String str78 = strBuilder72.toString();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "#4##########10false" + "'", str78, "#4##########10false");
    }

    @Test
    public void test2665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2665");
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
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceFirst(strMatcher16, "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.delete(8, 42);
        java.io.Writer writer22 = strBuilder15.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder15.replaceAll("# 4 ", "4\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(writer22);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder25.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder25.appendFixedWidthPadLeft((int) 'a', 125, '#');
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.append("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray48 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder35.insert(0, charArray48);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder53.append('4');
        boolean boolean59 = strBuilder53.contains("");
        boolean boolean60 = strBuilder49.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder25.append(strBuilder53);
        boolean boolean63 = strBuilder53.endsWith("1.0");
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2668");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        int int6 = strBuilder1.indexOf(strMatcher4, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append((int) '-');
        java.io.Reader reader9 = strBuilder1.asReader();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(reader9);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.deleteCharAt(1);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.appendNewLine();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder5.setNullText("a###################");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.replace(103, 32, "                  ");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll(strMatcher30, "4 ########10");
        java.lang.String str33 = strBuilder32.toString();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                                                                   0" + "'", str33, "                                                                                                   0");
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.String str32 = strBuilder3.rightString(32);
        boolean boolean34 = strBuilder3.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder3.deleteAll("#########");
        int int38 = strBuilder3.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder3.appendPadding(16, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder3.setCharAt(28, '0');
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteAll(strMatcher8);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll("a###################");
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.appendWithSeparators(collection12, "##########0.0##4##");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder11.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setNewLineText("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst(strMatcher26, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.deleteFirst("4##########101                                                                                                ");
        boolean boolean41 = strBuilder25.equals(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder7.append(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder40.insert(19, (long) 16);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.appendPadding(144, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder40.replaceAll('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder40.deleteFirst("\n##########0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.append((java.lang.Object) (short) 10);
        java.lang.String str42 = strBuilder30.getNullText();
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.deleteAll(strMatcher43);
        int int45 = strBuilder30.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder30.delete(12, (int) ' ');
        int int50 = strBuilder48.indexOf("\ntrue");
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
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 32 + "'", int45 == 32);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        boolean boolean26 = strBuilder22.startsWith("                                       ");
        java.lang.StringBuffer stringBuffer27 = strBuilder22.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder31.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('a', ' ');
        java.lang.String str45 = strBuilder43.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.trim();
        java.lang.String str47 = strBuilder46.toString();
        char[] charArray48 = strBuilder46.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder22.append(charArray48);
        boolean boolean50 = strBuilder4.equals(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder4.setNewLineText("------------");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.insert(14, '0');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 14");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "########10");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "####10" + "'", str45, "####10");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "########10" + "'", str47, "########10");
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder23.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder28.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceFirst(strMatcher46, "");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder45.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append(true);
        char[] charArray57 = strBuilder54.toCharArray(0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder23.append(charArray57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder21.append(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder23.delete(0, 150);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str65 = strBuilder62.substring(3, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
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
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[]");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray26 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder13.insert(0, charArray26);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder13.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder13.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str36 = strBuilder34.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.replaceFirst(strMatcher37, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder44.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.appendPadding((int) (short) 10, '#');
        int int69 = strBuilder64.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strBuilder74.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder64.appendWithSeparators((java.util.Iterator) strTokenizer75, "hi!");
        char[] charArray81 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder64.append(charArray81);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder61.insert((int) (byte) 0, charArray81);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder34.insert((int) (short) 100, charArray81);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder4.insert(3, charArray81);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder4.appendFixedWidthPadLeft(5, 1, '-');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "4##########101                                                                                                " + "'", str36, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder89);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 0);
        int int3 = strBuilder1.indexOf("\ntrue");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder5.equalsIgnoreCase(strBuilder7);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray20 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder7.insert(0, charArray20);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.append('4');
        boolean boolean31 = strBuilder25.contains("");
        boolean boolean32 = strBuilder21.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder36.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst(strMatcher54, "");
        boolean boolean57 = strBuilder25.equals((java.lang.Object) strBuilder53);
        int int59 = strBuilder25.indexOf("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder25.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder25.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.setNullText("01########");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder61, 25, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder61.setNullText("\n");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
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
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
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
        int int28 = strBuilder26.lastIndexOf('#');
        int int30 = strBuilder26.lastIndexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.deleteFirst("-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder26.appendFixedWidthPadRight(118, 26, ' ');
        java.lang.StringBuffer stringBuffer37 = strBuilder26.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder26.insert(0, (long) 107);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "##4##########10118                       ");
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder16.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.insert(9, '-');
        int int21 = strBuilder16.length();
        int int23 = strBuilder16.lastIndexOf("###true4##4##0######################################");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.util.Collection collection9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.appendWithSeparators(collection9, "##########10");
        boolean boolean12 = strBuilder4.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceAll(strMatcher6, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        int int25 = strBuilder13.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder13.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder13.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteAll("-1.0");
        char[] charArray31 = strBuilder30.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder1.insert(10, charArray31);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "false");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "false");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[f, a, l, s, e]");
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        int int28 = strBuilder3.indexOf(strMatcher27);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test2685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2685");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding((int) (short) 10, '#');
        int int44 = strBuilder39.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder39.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilder46.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder37.appendWithSeparators((java.util.Iterator) strTokenizer47, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.deleteFirst('4');
        int int52 = strBuilder49.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder49.replace(150, 10, "#");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 14 + "'", int52 == 14);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
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
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        boolean boolean47 = strBuilder30.contains(strMatcher46);
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append(4);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.insert(0, true);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray24 = strBuilder15.toCharArray(18, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2689");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.append((double) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder11.minimizeCapacity();
        java.lang.StringBuffer stringBuffer13 = strBuilder11.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.replaceAll(strMatcher14, "##4########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "4##########101                                                                                                1.0");
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray24 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.insert(0, charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder11.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder11.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str34 = strBuilder32.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.replaceFirst(strMatcher35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder54.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.appendPadding((int) (short) 10, '#');
        int int67 = strBuilder62.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strBuilder72.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder62.appendWithSeparators((java.util.Iterator) strTokenizer73, "hi!");
        char[] charArray79 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder62.append(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder59.insert((int) (byte) 0, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder32.insert((int) (short) 100, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder1.append((java.lang.Object) strBuilder82);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder82.appendFixedWidthPadLeft((int) (short) 100, 35, ' ');
        java.lang.String str88 = strBuilder87.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder87.setCharAt((int) '-', 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4##########101                                                                                                " + "'", str34, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test2691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2691");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.appendFixedWidthPadLeft(32, 25, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert(19, "01##########4##");
        java.lang.String str31 = strBuilder30.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strBuilder36.asTokenizer();
        int int38 = strBuilder36.size();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteFirst(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray57 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder44.insert(0, charArray57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean63 = strBuilder60.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder62.append('4');
        boolean boolean68 = strBuilder62.contains("");
        boolean boolean69 = strBuilder58.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrMatcher strMatcher70 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder62.deleteAll(strMatcher70);
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strBuilder62.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder40.appendWithSeparators((java.util.Iterator) strTokenizer72, "###10#######################32\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder30.append(strBuilder40);
        char[] charArray77 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder30.insert(16, charArray77);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "#######10##########01##########4###############32" + "'", str31, "#######10##########01##########4###############32");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 10 + "'", int38 == 10);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.replaceFirst('4', '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strBuilder9.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append((float) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder22.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        java.lang.String str29 = strBuilder28.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder28.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder51.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) strBuilder52, (int) '#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder22.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder59, 8, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.deleteCharAt(19);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder64.reverse();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
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
        java.lang.String str17 = strBuilder16.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int30 = strBuilder21.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean55 = strBuilder52.equalsIgnoreCase(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder54.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray67 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder54.insert(0, charArray67);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer74 = strBuilder70.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder54.append(stringBuffer74);
        boolean boolean77 = strBuilder54.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder54.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.Object[] objArray82 = new java.lang.Object[] { strBuilder36, strBuilder54 };
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder32.appendWithSeparators(objArray82, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder16.appendWithSeparators(objArray82, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder16.insert((int) (byte) 10, (double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder16.deleteFirst('#');
        int int92 = strBuilder91.capacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(stringBuffer74);
        org.junit.Assert.assertEquals(stringBuffer74.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 159 + "'", int92 == 159);
    }

    @Test
    public void test2694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2694");
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
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.append('4');
        boolean boolean30 = strBuilder24.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.appendNewLine();
        char[] charArray32 = new char[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append(charArray32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder43.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteFirst(strMatcher45);
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilder44.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder33.appendWithSeparators((java.util.Iterator) strTokenizer47, "01##########4####4##");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer47, "a#########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(charArray32);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray32), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray32), "[]");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
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
        boolean boolean30 = strBuilder28.startsWith("#########101                                                                                     4                ");
        int int32 = strBuilder28.indexOf("##4##########101                                                                                                ");
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(' ');
        int int7 = strBuilder6.length();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder6.appendFixedWidthPadRight(107, (int) 'a', ' ');
        java.lang.String str13 = strBuilder11.rightString(44);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                                            " + "'", str13, "                                            ");
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.append((java.lang.Object) "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append((double) 100);
        int int21 = strBuilder19.lastIndexOf('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2698");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendPadding((int) (short) 10, '#');
        int int16 = strBuilder11.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder11.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll('4', ' ');
        boolean boolean25 = strBuilder23.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.append((java.lang.Object) boolean25);
        java.lang.String str27 = strBuilder26.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.append((long) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strBuilder29.substring(125);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendPadding((int) (short) 10, '#');
        int int16 = strBuilder11.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder11.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll('4', ' ');
        boolean boolean25 = strBuilder23.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.append((java.lang.Object) boolean25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder9.insert(133, (float) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 133");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.setLength(24);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding(103, '-');
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
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        java.util.Collection collection22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendWithSeparators(collection22, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.appendFixedWidthPadLeft(11, 1, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.appendFixedWidthPadLeft(42, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder36.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst(strMatcher54, "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder56.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder57.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean63 = strBuilder60.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder62.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder62.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean80 = strBuilder77.equalsIgnoreCase(strBuilder79);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder79.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder79.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder79.replaceAll("", "");
        boolean boolean89 = strBuilder75.equalsIgnoreCase(strBuilder79);
        org.apache.commons.lang.text.StrMatcher strMatcher90 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder79.replaceAll(strMatcher90, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder92.insert((int) (short) 0, (long) 20);
        char[] charArray96 = strBuilder92.toCharArray();
        char[] charArray97 = strBuilder58.getChars(charArray96);
        char[] charArray98 = strBuilder32.getChars(charArray97);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertNotNull(charArray96);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray96), "########1010");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray96), "########1010");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray96), "[#, #, #, #, #, #, #, #, 1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(charArray97);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray97), "########1010");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray97), "########1010");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray97), "[#, #, #, #, #, #, #, #, 1, 0, 1, 0]");
        org.junit.Assert.assertNotNull(charArray98);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray98), "########1010");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray98), "########1010");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray98), "[#, #, #, #, #, #, #, #, 1, 0, 1, 0]");
    }

    @Test
    public void test2702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2702");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.reverse();
        int int28 = strBuilder26.lastIndexOf("##4##########101#97.0#4##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.replaceFirst("h", "#########");
        java.lang.String str33 = strBuilder26.leftString((int) '#');
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "01##########4##" + "'", str33, "01##########4##");
    }

    @Test
    public void test2703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2703");
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder21.deleteAll("##########10");
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
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
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
        int int55 = strBuilder52.lastIndexOf(' ', (int) '4');
        int int57 = strBuilder52.lastIndexOf("###10#######################32\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder52.replaceAll('4', 'a');
        java.util.Collection collection61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder52.appendWithSeparators(collection61, "4##########101                                                                                                ");
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.reverse();
        java.lang.StringBuffer stringBuffer11 = strBuilder10.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(stringBuffer11);
        org.junit.Assert.assertEquals(stringBuffer11.toString(), "01########");
    }

    @Test
    public void test2706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2706");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) strBuilder19, 20, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder3.appendFixedWidthPadLeft(150, 26, '4');
        boolean boolean27 = strBuilder26.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        char[] charArray11 = new char[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.append(charArray11);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int15 = strBuilder12.lastIndexOf(strMatcher13, 24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2708");
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
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        boolean boolean31 = strBuilder3.contains(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer38 = strBuilder33.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer38, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str41 = strBuilder3.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder3.appendFixedWidthPadRight(22, 23, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.deleteFirst("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        boolean boolean49 = strBuilder45.contains(strMatcher48);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder45.append("#4##########101                                                                                                ", (-1), 44);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strTokenizer38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "##4##########101                                                                                                " + "'", str41, "##4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.setNewLineText("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst(strMatcher36, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst("4##########101                                                                                                ");
        boolean boolean51 = strBuilder35.equals(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder17.append(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder17.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.insert(17, (float) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder9.append(strBuilder54);
        int int60 = strBuilder9.indexOf("true");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceAll(strMatcher15, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.appendNull();
        boolean boolean20 = strBuilder18.contains('-');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        java.io.Writer writer5 = strBuilder1.asWriter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(writer5);
    }

    @Test
    public void test2712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2712");
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
        int int31 = strBuilder28.indexOf("##", 107);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int44 = strBuilder41.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.replaceFirst("", "##");
        java.util.Collection collection48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendWithSeparators(collection48, "\n");
        java.lang.Object[] objArray51 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendWithSeparators(objArray51, "01##########4##");
        java.util.Collection collection54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendWithSeparators(collection54, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.appendFixedWidthPadLeft(11, 1, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder56.appendFixedWidthPadLeft(42, (int) (byte) -1, '#');
        boolean boolean65 = strBuilder28.equals(strBuilder64);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
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
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.append('0');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray52 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder39.insert(0, charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder57.append('4');
        boolean boolean63 = strBuilder57.contains("");
        boolean boolean64 = strBuilder53.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder57.ensureCapacity((int) (byte) 0);
        java.util.Collection collection67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder57.appendWithSeparators(collection67, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean74 = strBuilder71.equalsIgnoreCase(strBuilder73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder73.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int82 = strBuilder79.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder79.replaceFirst("", "##");
        java.util.Collection collection86 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder85.appendWithSeparators(collection86, "\n");
        java.lang.Object[] objArray89 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder88.appendWithSeparators(objArray89, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder57.appendWithSeparators(objArray89, "#");
        org.apache.commons.lang.text.StrTokenizer strTokenizer94 = strBuilder57.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder31.appendWithSeparators((java.util.Iterator) strTokenizer94, "                                                                                     101##########4##");
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 0 + "'", int82 == 0);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray89), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray89), "[]");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strTokenizer94);
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test2714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2714");
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
        java.lang.String str32 = strBuilder3.rightString(32);
        boolean boolean34 = strBuilder3.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteCharAt(12);
        boolean boolean39 = strBuilder37.contains('-');
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        int int11 = strBuilder5.lastIndexOf("4 ########10", 1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.replaceFirst("\n", "");
        java.lang.String str16 = strBuilder14.leftString(118);
        int int19 = strBuilder14.indexOf('#', (int) '0');
        int int22 = strBuilder14.indexOf("##4##########10##########", 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "10" + "'", str16, "10");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        boolean boolean17 = strBuilder15.contains("1032");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.insert(9, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
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
        int int54 = strBuilder52.lastIndexOf("           ");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        int int62 = strBuilder57.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder57.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder66.clear();
        java.lang.String str73 = strBuilder66.rightString(12);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder66.deleteFirst("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) strBuilder75, 45, ' ');
        java.io.Writer writer79 = strBuilder55.asWriter();
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(writer79);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        int int7 = strBuilder1.length();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.replaceAll(strMatcher8, "4\n");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.append(true);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.deleteAll(strMatcher13);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray22 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder9.insert(0, charArray22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer27 = strBuilder26.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder1.append(stringBuffer27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append("           ");
        char char32 = strBuilder30.charAt(0);
        org.junit.Assert.assertNotNull(strBuilder4);
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
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + char32 + "' != '" + '#' + "'", char32 == '#');
    }

    @Test
    public void test2720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2720");
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
        java.lang.String str32 = strBuilder3.rightString(32);
        boolean boolean34 = strBuilder3.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder3.trim();
        java.lang.String str37 = strBuilder3.rightString((-1));
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str32, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int3 = strBuilder1.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.replaceAll("", "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(0L);
        int int11 = strBuilder8.indexOf('-', 18);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder13.append(charArray33);
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst(strMatcher36, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.appendFixedWidthPadRight(0, (int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append((float) (short) 10);
        java.lang.StringBuffer stringBuffer45 = strBuilder42.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder8.append(stringBuffer45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(stringBuffer45);
        org.junit.Assert.assertEquals(stringBuffer45.toString(), "##4##0################################################################################################10.0");
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
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
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append(0);
        int int36 = strBuilder33.lastIndexOf('#', (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceFirst('a', ' ');
        java.lang.String str54 = strBuilder52.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder55.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) strBuilder55, (int) 'a', ' ');
        char[] charArray60 = strBuilder33.toCharArray();
        int int63 = strBuilder33.lastIndexOf('0', 17);
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strBuilder33.asTokenizer();
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 12 + "'", int36 == 12);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "####10" + "'", str54, "####10");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##4##########100                                                                                                 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##4##########100                                                                                                 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, 0,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 15 + "'", int63 == 15);
        org.junit.Assert.assertNotNull(strTokenizer64);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll("\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2724");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst("\n\n", "                                       ");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.insert(0, (long) '#');
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
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.appendFixedWidthPadLeft(32, 25, '#');
        java.lang.String str27 = strBuilder18.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray46 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder33.insert(0, charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder33.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder33.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean56 = strBuilder33.endsWith("########10");
        boolean boolean58 = strBuilder33.startsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder33.appendFixedWidthPadLeft((int) (short) 0, 11, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection65 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.appendWithSeparators(collection65, "");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder64.deleteAll('4');
        char[] charArray70 = strBuilder64.toCharArray();
        char[] charArray71 = strBuilder33.getChars(charArray70);
        // The following exception was thrown during execution in test generation
        try {
            strBuilder18.getChars(159, 0, charArray71, 107);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[]");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "##4##########101                                                                                                ##########0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "##4##########101                                                                                                ##########0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, 1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , #, #, #, #, #, #, #, #, #, #, 0]");
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendFixedWidthPadLeft((int) '#', 10, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        int int34 = strBuilder31.indexOf(strMatcher32, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendWithSeparators(collection37, "");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.insert(0, true);
        java.lang.StringBuffer stringBuffer47 = strBuilder46.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder31.append(stringBuffer47);
        java.io.Reader reader49 = strBuilder31.asReader();
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "true4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(reader49);
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
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
        boolean boolean47 = strBuilder45.endsWith("#");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendNewLine();
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
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) 14, (int) (short) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendWithSeparators(collection15, "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 100, 14, '-');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.insert(28, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 28");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2729");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.replaceFirst(strMatcher28, "##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean67 = strBuilder64.equalsIgnoreCase(strBuilder66);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean72 = strBuilder69.equalsIgnoreCase(strBuilder71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder71.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray84 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder71.insert(0, charArray84);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder64.append(charArray84);
        org.apache.commons.lang.text.StrMatcher strMatcher87 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder86.replaceFirst(strMatcher87, "hi!");
        char[] charArray90 = strBuilder86.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder62.append(charArray90, (int) (byte) 0, 0);
        // The following exception was thrown during execution in test generation
        try {
            strBuilder30.getChars(25, 26, charArray90, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
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
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray90), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray90), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray90), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
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
        java.lang.String str24 = strBuilder3.getNullText();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        boolean boolean26 = strBuilder3.contains(strMatcher25);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.insert(150, (float) 100L);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 150");
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
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        int int12 = strBuilder9.lastIndexOf(strMatcher10, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst(strMatcher13, "#######10##########01##########4###############32");
        java.lang.String str17 = strBuilder15.rightString(17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "########10" + "'", str17, "########10");
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader25 = strBuilder3.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append('4');
        char char31 = strBuilder27.charAt(15);
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
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + char31 + "' != '" + '1' + "'", char31 == '1');
    }

    @Test
    public void test2733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2733");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray61 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder48.insert(0, charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder48.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        int int68 = strBuilder48.lastIndexOf(strMatcher66, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean73 = strBuilder70.equalsIgnoreCase(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder72.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int81 = strBuilder72.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder72.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder72.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder48.appendFixedWidthPadRight((java.lang.Object) strBuilder86, (int) (byte) 1, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher90 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder86.deleteFirst(strMatcher90);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder91.replaceFirst("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", "01##########4##");
        org.apache.commons.lang.text.StrTokenizer strTokenizer95 = strBuilder91.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder41.appendWithSeparators((java.util.Iterator) strTokenizer95, "                                                                                    0");
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 0 + "'", int81 == 0);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strTokenizer95);
        org.junit.Assert.assertNotNull(strBuilder97);
    }

    @Test
    public void test2734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2734");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        java.io.Reader reader13 = strBuilder12.asReader();
        int int14 = strBuilder12.size();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.reverse();
        char[] charArray18 = strBuilder15.toCharArray(5, 35);
        java.lang.String str19 = strBuilder15.getNullText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "#####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "#####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #, #, #, #]");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2735");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder49.replace(118, 118, "35");
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
    }

    @Test
    public void test2736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2736");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder17.appendPadding((int) (byte) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.appendNewLine();
        java.io.Reader reader35 = strBuilder17.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder17.insert(7, (long) 101);
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2737");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setLength(107);
        java.io.Writer writer6 = strBuilder3.asWriter();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(writer6);
    }

    @Test
    public void test2738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2738");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        java.io.Reader reader13 = strBuilder12.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendPadding((int) (short) 10, '#');
        int int20 = strBuilder15.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strBuilder25.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer26, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray53 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder40.insert(0, charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder33.append(charArray53);
        org.apache.commons.lang.text.StrMatcher strMatcher56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.replaceFirst(strMatcher56, "hi!");
        char[] charArray59 = strBuilder55.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder31.append(charArray59, (int) (byte) 1, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder12.appendFixedWidthPadRight((java.lang.Object) 0, (int) (byte) 1, ' ');
        int int68 = strBuilder12.lastIndexOf('a', 9);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder12.insert(8, (int) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.deleteAll('4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = strBuilder71.substring((int) (byte) -1, (int) '-');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2739");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        java.lang.String str13 = strBuilder8.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray30 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(0, charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.appendPadding(0, 'a');
        java.lang.Object obj36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.insert((int) (short) 0, obj36);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        int int45 = strBuilder37.indexOf(strMatcher44);
        int int48 = strBuilder37.indexOf("hi!", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder6.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, (int) '#', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        int int53 = strBuilder37.indexOf(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder37.ensureCapacity(44);
        int int58 = strBuilder55.indexOf("                                       ", 101);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
    }

    @Test
    public void test2740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2740");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("#");
        boolean boolean15 = strBuilder3.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.deleteFirst('-');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2741");
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
        boolean boolean27 = strBuilder26.isEmpty();
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.appendWithSeparators(collection28, "10");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int43 = strBuilder40.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.replaceFirst("", "##");
        java.util.Collection collection47 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.appendWithSeparators(collection47, "\n");
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendWithSeparators(objArray50, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder49.appendFixedWidthPadLeft(32, 25, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.setLength((int) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.append((long) 10);
        char[] charArray65 = strBuilder64.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder30.append(charArray65, 15, 32);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder30.clear();
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
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 0 + "'", int43 == 0);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "#######10#######################32\000\000\000\000\000\000\000\000\000\000\00010");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "#######10#######################32\000\000\000\000\000\000\000\000\000\000\00010");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[#, #, #, #, #, #, #, 1, 0, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, 3, 2, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder69);
    }

    @Test
    public void test2742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2742");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendNull();
        boolean boolean30 = strBuilder23.equals(strBuilder29);
        int int31 = strBuilder29.size();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.clear();
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2743");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.append('a');
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        int int30 = strBuilder23.lastIndexOf(strMatcher29);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder23.replaceAll(strMatcher31, "-1.0");
        int int36 = strBuilder33.lastIndexOf("######44444444444444444##4##########10", 15);
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.replaceFirst(strMatcher37, "4\n");
        org.apache.commons.lang.text.StrTokenizer strTokenizer40 = strBuilder39.asTokenizer();
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strTokenizer40);
    }

    @Test
    public void test2744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2744");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.insert(0, true);
        char[] charArray24 = strBuilder15.toCharArray(5, (int) 'a');
        java.lang.Class<?> wildcardClass25 = strBuilder15.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "#######10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "#######10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test2745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2745");
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
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder0.deleteAll(strMatcher87);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder0.append("##########4 ########10", 44, 144);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
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
        org.junit.Assert.assertNotNull(strBuilder88);
    }

    @Test
    public void test2746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2746");
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
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.insert((int) (byte) 1, (double) 'a');
        int int35 = strBuilder34.length();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendWithSeparators(collection38, "");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendNewLine();
        java.util.Collection collection46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendWithSeparators(collection46, "hi!");
        boolean boolean49 = strBuilder34.equalsIgnoreCase(strBuilder42);
        char[] charArray50 = strBuilder42.toCharArray();
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 19 + "'", int35 == 19);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[\n]");
    }

    @Test
    public void test2747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2747");
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
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder8.replaceAll(strMatcher38, "4##########101                                                                                                ");
        int int43 = strBuilder40.lastIndexOf(' ', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.replaceFirst('#', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean51 = strBuilder48.equalsIgnoreCase(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder50.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray63 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder50.insert(0, charArray63);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer70 = strBuilder66.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder50.append(stringBuffer70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder40.append(stringBuffer70);
        org.apache.commons.lang.text.StrMatcher strMatcher73 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder40.deleteFirst(strMatcher73);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.appendPadding(103, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher78 = null;
        boolean boolean79 = strBuilder77.contains(strMatcher78);
        boolean boolean81 = strBuilder77.startsWith("01##########4####4##");
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(stringBuffer70);
        org.junit.Assert.assertEquals(stringBuffer70.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2748");
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
        java.util.Collection collection69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder39.appendWithSeparators(collection69, "a#########");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.append((long) 107);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.ensureCapacity(32);
        org.apache.commons.lang.text.StrMatcher strMatcher76 = null;
        int int77 = strBuilder75.indexOf(strMatcher76);
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
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
    }

    @Test
    public void test2749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2749");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        java.lang.String str13 = strBuilder8.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray30 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(0, charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.appendPadding(0, 'a');
        java.lang.Object obj36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.insert((int) (short) 0, obj36);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        int int45 = strBuilder37.indexOf(strMatcher44);
        int int48 = strBuilder37.indexOf("hi!", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder6.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, (int) '#', '-');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder37.deleteCharAt(2);
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder37.replaceFirst(strMatcher54, "4\n");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
    }

    @Test
    public void test2750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2750");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append(true);
        boolean boolean5 = strBuilder3.contains('a');
        boolean boolean7 = strBuilder3.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray29 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.insert(0, charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder9.append(charArray29);
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.replaceFirst(strMatcher32, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.appendFixedWidthPadRight(0, (int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append((float) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) strBuilder40, 4, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.insert(8, (double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.reverse();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.append("\n\nfalse", 24, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2751");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.insert((int) (byte) 10, false);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2752");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray24 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.insert(0, charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder11.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder11.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str34 = strBuilder32.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.replaceFirst(strMatcher35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder54.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.appendPadding((int) (short) 10, '#');
        int int67 = strBuilder62.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer73 = strBuilder72.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder62.appendWithSeparators((java.util.Iterator) strTokenizer73, "hi!");
        char[] charArray79 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder62.append(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder59.insert((int) (byte) 0, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder32.insert((int) (short) 100, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder1.append((java.lang.Object) strBuilder82);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder82.appendFixedWidthPadLeft((int) (short) 100, 35, ' ');
        java.lang.String str88 = strBuilder87.getNewLineText();
        org.apache.commons.lang.text.StrMatcher strMatcher89 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder87.deleteAll(strMatcher89);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder87.replace(3, 39, "           ");
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder87.append(125);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "4##########101                                                                                                " + "'", str34, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strTokenizer73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test2753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2753");
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
        java.lang.String str68 = strBuilder65.substring(13, 19);
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
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "10#" + "'", str68, "10#");
    }

    @Test
    public void test2754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2754");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.insert((int) (short) 0, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2755");
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
        int int28 = strBuilder26.lastIndexOf('#');
        int int30 = strBuilder26.lastIndexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.deleteFirst("-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.append((double) 150);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder26.setNewLineText("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst("##4##########10#", "#########101                                                                                     4                ");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteAll(strMatcher40);
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2756");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        java.lang.String str17 = strBuilder15.substring(4);
        int int18 = strBuilder15.size();
        int int19 = strBuilder15.length();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendWithSeparators(collection22, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.deleteAll('4');
        int int29 = strBuilder26.indexOf(' ', (-1));
        int int32 = strBuilder26.indexOf(' ', (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.replaceAll("", "");
        int int48 = strBuilder36.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder36.clear();
        boolean boolean51 = strBuilder49.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder49.insert(0, (long) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.appendFixedWidthPadLeft(4, (int) (byte) 100, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        int int63 = strBuilder60.lastIndexOf(strMatcher61, 21);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder60.append((long) 16);
        boolean boolean66 = strBuilder26.equals(strBuilder60);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder15.append((java.lang.Object) strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "####10" + "'", str17, "####10");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2757");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteAll(strMatcher30);
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
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2758");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.appendFixedWidthPadLeft(32, 25, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder18.replaceAll("4", "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder18.replaceAll('0', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder18.delete(0, (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2759");
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
        java.util.Collection collection32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendWithSeparators(collection32, "");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendNewLine();
        java.util.Collection collection40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendWithSeparators(collection40, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder42.minimizeCapacity();
        boolean boolean44 = strBuilder25.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder48.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.setNewLineText("##########true");
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strBuilder62.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder42.appendWithSeparators((java.util.Iterator) strTokenizer63, "4 ########10");
        boolean boolean67 = strBuilder65.endsWith("\ntrue");
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
    }

    @Test
    public void test2760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2760");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("10########100\n4 ########100");
    }

    @Test
    public void test2761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2761");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.setLength(1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray46 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder33.insert(0, charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder33.appendPadding(0, 'a');
        java.lang.Object obj52 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.insert((int) (short) 0, obj52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder29.append(strBuilder56);
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
    }

    @Test
    public void test2762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2762");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.replace(strMatcher17, "4 ########10", (int) '0', (int) (byte) 10, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2763");
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
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder75.appendFixedWidthPadLeft(23, 35, '-');
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
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder81);
    }

    @Test
    public void test2764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2764");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        java.io.Reader reader13 = strBuilder12.asReader();
        int int14 = strBuilder12.size();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.reverse();
        boolean boolean17 = strBuilder15.contains('1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(reader13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2765");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.append(true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.setCharAt((int) (short) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2766");
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
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder8.replaceAll(strMatcher38, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.replace((int) (short) 0, 2, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteCharAt(0);
        java.lang.String str48 = strBuilder46.rightString(1);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.insert(8, false);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray68 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder55.insert(0, charArray68);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean74 = strBuilder71.equalsIgnoreCase(strBuilder73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder73.append('4');
        boolean boolean79 = strBuilder73.contains("");
        boolean boolean80 = strBuilder69.equalsIgnoreCase(strBuilder73);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder69.minimizeCapacity();
        java.lang.StringBuffer stringBuffer82 = strBuilder81.toStringBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder46.append(stringBuffer82, (int) '#', 22);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "#" + "'", str48, "#");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(stringBuffer82);
        org.junit.Assert.assertEquals(stringBuffer82.toString(), "##4##########10");
    }

    @Test
    public void test2767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2767");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        java.lang.String str13 = strBuilder8.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray30 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(0, charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.appendPadding(0, 'a');
        java.lang.Object obj36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.insert((int) (short) 0, obj36);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        int int45 = strBuilder37.indexOf(strMatcher44);
        int int48 = strBuilder37.indexOf("hi!", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder6.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, (int) '#', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        int int53 = strBuilder37.indexOf(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder37.ensureCapacity(44);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst("#########102true##4##########10\000\000\000\000");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = strBuilder55.substring(39, 25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
    }
}

