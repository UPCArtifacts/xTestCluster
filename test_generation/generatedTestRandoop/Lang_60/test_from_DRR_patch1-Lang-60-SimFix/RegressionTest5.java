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
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.ensureCapacity(25);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.ensureCapacity((int) (short) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceFirst(strMatcher17, "01                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.trim();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceAll(strMatcher14, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((double) (-1.0f));
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        int int20 = strBuilder18.lastIndexOf(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.deleteFirst(strMatcher14);
        int int16 = strBuilder15.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
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
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        boolean boolean17 = strBuilder15.endsWith("#########");
        int int20 = strBuilder15.lastIndexOf("\n", (int) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.replaceAll("", "");
        int int36 = strBuilder24.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder24.insert(0, (long) (short) 1);
        int int42 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder15.append((java.lang.Object) strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(' ');
        java.lang.String str7 = strBuilder1.getNewLineText();
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.insert((int) (byte) 10, false);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.ensureCapacity(101);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendPadding((int) 'a', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) 'a', 1, 't');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNull(str7);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        java.lang.String str9 = strBuilder1.getNewLineText();
        char[] charArray10 = strBuilder1.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0]");
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        boolean boolean13 = strBuilder11.startsWith("####10");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        int int23 = strBuilder18.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder27.clear();
        java.lang.String str34 = strBuilder27.rightString(12);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray51 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.insert(0, charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder38.appendPadding(0, 'a');
        java.lang.Object obj57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.insert((int) (short) 0, obj57);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.replaceFirst(strMatcher62, "########10");
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.deleteFirst(strMatcher65);
        boolean boolean67 = strBuilder27.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrMatcher strMatcher68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder27.replaceFirst(strMatcher68, "4");
        int int73 = strBuilder70.lastIndexOf('1', 5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder11.append(strBuilder70, (int) ' ', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
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
        boolean boolean74 = strBuilder72.startsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder72.ensureCapacity(0);
        int int77 = strBuilder72.size();
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 20 + "'", int77 == 20);
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) strBuilder23, 25, '-');
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.insert((int) (short) 1, obj35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.replaceAll("4##########101                                                                                                ", "\n##########0");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append((float) 35);
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray54 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder41.insert(0, charArray54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.append('4');
        boolean boolean65 = strBuilder59.contains("");
        boolean boolean66 = strBuilder55.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean71 = strBuilder68.equalsIgnoreCase(strBuilder70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder70.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray83 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder70.insert(0, charArray83);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder86.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer90 = strBuilder86.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder70.append(stringBuffer90);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder55.append(stringBuffer90);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder34.append(stringBuffer90);
        boolean boolean95 = strBuilder34.startsWith("-1.0##4##");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(stringBuffer90);
        org.junit.Assert.assertEquals(stringBuffer90.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadRight((int) (short) 0, (int) (short) 0, 'a');
        boolean boolean18 = strBuilder10.contains("##4#########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength((int) '4');
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst(strMatcher19, "##########-1.0true");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendNewLine();
        java.lang.String str27 = strBuilder24.midString((int) 'a', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder23.replaceFirst('-', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder36.appendNewLine();
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
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        int int13 = strBuilder9.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.replaceAll("true########10          ", "");
        int int18 = strBuilder16.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.append('t');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
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
        boolean boolean74 = strBuilder72.startsWith("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder72.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder72.replaceAll("##10", "4");
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
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        int int11 = strBuilder9.lastIndexOf('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
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
        int int42 = strBuilder8.lastIndexOf("-1.04");
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
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
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.deleteFirst(strMatcher28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append('4');
        boolean boolean39 = strBuilder33.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder33.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (byte) 10, '#');
        int int44 = strBuilder40.size();
        boolean boolean45 = strBuilder29.equals((java.lang.Object) strBuilder40);
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
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 12 + "'", int44 == 12);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
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
        int int31 = strBuilder20.length();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.setLength(100);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.delete((int) (short) 0, 125);
        java.lang.Class<?> wildcardClass37 = strBuilder36.getClass();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder3.append(' ');
        java.lang.String str27 = strBuilder3.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        int int34 = strBuilder29.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        int int51 = strBuilder49.lastIndexOf(strMatcher50);
        boolean boolean52 = strBuilder36.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder36.append('#');
        char[] charArray55 = strBuilder36.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.append(charArray55);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder58.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder58.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder65.minimizeCapacity();
        boolean boolean67 = strBuilder56.equalsIgnoreCase(strBuilder65);
        int int69 = strBuilder56.lastIndexOf('-');
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "##4##########10########## " + "'", str27, "##4##########10########## ");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "##########true#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "##########true#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#, #, #, #, #, #, #, #, #, #, t, r, u, e, #]");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
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
        int int39 = strBuilder8.lastIndexOf("           ");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder8.insert((int) (byte) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder8.setLength((int) (byte) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int46 = strBuilder8.indexOf(strMatcher45);
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(' ');
        java.lang.String str7 = strBuilder1.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.setNewLineText("1                                                                                                #######100");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.append(112);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendWithSeparators(collection33, "");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteAll('4');
        boolean boolean38 = strBuilder23.equals((java.lang.Object) strBuilder32);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder32.replaceAll(strMatcher39, "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder41.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.deleteFirst("######1032 4 ");
        java.util.Collection collection45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendWithSeparators(collection45, "e4");
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder13.replaceAll(strMatcher18, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int33 = strBuilder30.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.replaceFirst("", "##");
        java.util.Collection collection37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendWithSeparators(collection37, "\n");
        java.lang.Object[] objArray40 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendWithSeparators(objArray40, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder39.append("######101     ", 4, 0);
        boolean boolean48 = strBuilder13.equals(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray40), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray40), "[]");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
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
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceAll('#', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder15.replaceAll(strMatcher22, "\n\nfalse");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder15.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.replaceAll(strMatcher29, "hi!");
        java.util.Collection collection32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendWithSeparators(collection32, "#97.0#4##########10");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int37 = strBuilder34.lastIndexOf(strMatcher35, 8);
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
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll('4', '4');
        int int8 = strBuilder7.size();
        char[] charArray9 = null;
        char[] charArray10 = strBuilder7.getChars(charArray9);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[]");
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
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
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder44.replace(strMatcher50, "##4#########4#####10##########", 0, 47, (int) (short) 10);
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
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.append(15);
        boolean boolean9 = strBuilder7.startsWith("4");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.appendFixedWidthPadRight((int) (short) 10, 13, 'a');
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
        int int42 = strBuilder40.lastIndexOf('#');
        int int44 = strBuilder40.lastIndexOf("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.replaceFirst(' ', 't');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder40.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder7.appendFixedWidthPadRight((java.lang.Object) strBuilder51, (int) (byte) 100, 'a');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 12 + "'", int42 == 12);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 14 + "'", int44 == 14);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2530");
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
        int int22 = strBuilder17.indexOf("\n\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
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
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder66.replace(strMatcher67, "01##########4##", 175, 118, (int) '-');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        java.lang.Object obj27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder1.appendFixedWidthPadRight(obj27, 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append((long) (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray55 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder42.insert(0, charArray55);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder42.appendPadding(0, 'a');
        java.lang.Object obj61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.insert((int) (short) 0, obj61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder62.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.deleteAll(strMatcher68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder38.append((java.lang.Object) strBuilder67);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.appendPadding((int) (short) 10, '#');
        int int77 = strBuilder72.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder72.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strBuilder79.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder70.appendWithSeparators((java.util.Iterator) strTokenizer80, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder32.appendWithSeparators((java.util.Iterator) strTokenizer80, "");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder32.minimizeCapacity();
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray88 = strBuilder85.toCharArray(20, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
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
        int int42 = strBuilder40.lastIndexOf("#true#");
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteFirst(strMatcher43);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
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
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.append(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(26);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst("##########", "fals");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.appendPadding(25, '-');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
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
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder(32);
        int int30 = strBuilder27.lastIndexOf('a', 2);
        boolean boolean31 = strBuilder23.equals((java.lang.Object) 2);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        int int13 = strBuilder9.capacity();
        java.util.Collection collection14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.appendWithSeparators(collection14, "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        int int20 = strBuilder18.indexOf(strMatcher19);
        boolean boolean21 = strBuilder9.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.append((float) 18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
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
        int int43 = strBuilder40.indexOf("####10", (int) (short) -1);
        int int44 = strBuilder40.size();
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.deleteAll(strMatcher45);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 113 + "'", int44 == 113);
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.replaceAll("##########-1.0true", "##10.026aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.Object obj57 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder51.insert(19, obj57);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 19");
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
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.insert((int) (byte) 10, (float) '1');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder19.appendFixedWidthPadLeft(42, 138, '-');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
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
        int int35 = strBuilder30.lastIndexOf('-', 25);
        java.io.Writer writer36 = strBuilder30.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        boolean boolean38 = strBuilder30.contains(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        int int42 = strBuilder41.length();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.append(strBuilder41, (int) (byte) 10, 9);
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
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(writer36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.replaceFirst("", "");
        java.io.Reader reader14 = strBuilder3.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setNullText("");
        java.lang.String str37 = strBuilder32.midString(0, 35);
        char[] charArray40 = strBuilder32.toCharArray(1, 25);
        char[] charArray41 = strBuilder3.getChars(charArray40);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "########10" + "'", str37, "########10");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "4\n#####10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "4\n#####10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[4, \n, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "4\n#####10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "4\n#####10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[4, \n, #, #, #, #, #, 1, 0]");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.insert(12, (long) 2);
        int int16 = strBuilder13.lastIndexOf("hi!", 118);
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strBuilder13.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer17);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.setNewLineText("####10");
        java.lang.String str33 = strBuilder31.substring((int) '-');
        int int34 = strBuilder31.length();
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                      0" + "'", str33, "                                                      0");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder8.replaceFirst("##########10", "####10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append((int) ' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder22.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder22.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str45 = strBuilder43.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.replaceFirst(strMatcher46, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.insert((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.insert((int) (byte) 10, false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder78.appendFixedWidthPadRight(0, (int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder85.append((float) (short) 10);
        java.lang.StringBuffer stringBuffer88 = strBuilder85.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder54.append(stringBuffer88, 10, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder18.append(stringBuffer88);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder92.trim();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(strBuilder16);
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4##########101                                                                                                " + "'", str45, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
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
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(stringBuffer88);
        org.junit.Assert.assertEquals(stringBuffer88.toString(), "##4##0################################################################################################10.0");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.appendNewLine();
        java.io.Writer writer9 = strBuilder8.asWriter();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(writer9);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.io.Reader reader25 = strBuilder3.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int30 = strBuilder28.lastIndexOf('4');
        char[] charArray31 = strBuilder28.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.insert((int) (short) 10, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendWithSeparators(collection36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder33.append(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.replaceAll("##########true", "a#########14.0");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str46 = strBuilder40.substring(43);
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
        org.junit.Assert.assertNotNull(reader25);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.deleteFirst('-');
        java.lang.Object[] objArray40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendWithSeparators(objArray40, "e4");
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder39.deleteFirst(strMatcher43);
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder39.deleteFirst(strMatcher45);
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
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
        java.lang.Object[] objArray50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder37.appendWithSeparators(objArray50, "4");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder37.setNewLineText("#4##########10#");
        org.apache.commons.lang.text.StrMatcher strMatcher55 = null;
        int int57 = strBuilder37.indexOf(strMatcher55, (int) '4');
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
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
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
        int int33 = strBuilder23.indexOf("########### ####", 124);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append((float) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        int int13 = strBuilder8.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strBuilder18.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer19, "hi!");
        boolean boolean22 = strBuilder4.equals(strBuilder21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder4.replace(125, 32, "##########true2.0");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteAll("-1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteAll(strMatcher21);
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.replaceAll(strMatcher23, "##10");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteAll(strMatcher29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2554");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll(strMatcher4);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceFirst("##4######", "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceAll("########10", "true########10          ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray29 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.insert(0, charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer36 = strBuilder32.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder16.append(stringBuffer36);
        boolean boolean39 = strBuilder16.contains("");
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
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder16.insert((int) (short) 10, charArray62);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.insert(4, "##########true");
        int int70 = strBuilder65.indexOf('#');
        char[] charArray71 = strBuilder65.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder12.append(charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder12.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(stringBuffer36);
        org.junit.Assert.assertEquals(stringBuffer36.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
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
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "##4###########true########4#####10##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "##4###########true########4#####10##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, #, t, r, u, e, #, #, #, #, #, #, #, #, 4, #, #, #, #, #, 1, 0, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.insert(5, true);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        int int40 = strBuilder35.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder35.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder35.replaceFirst("##########true", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder35.replaceAll("           ", "01                                                                                       ");
        java.lang.StringBuffer stringBuffer51 = strBuilder50.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder29.append(stringBuffer51);
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "hi!2.0");
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.append('4');
        boolean boolean17 = strBuilder11.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder11.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strBuilder21, (int) (short) 100, ' ');
        java.lang.String str30 = strBuilder7.leftString(175);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "                                                                                       4\n##########0" + "'", str30, "                                                                                       4\n##########0");
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
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder21.replaceAll(strMatcher60, "##10");
        boolean boolean64 = strBuilder62.startsWith("##4###");
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strBuilder62.asTokenizer();
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
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strTokenizer65);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
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
        int int41 = strBuilder30.indexOf("hi!", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.appendPadding((int) (short) 10, '#');
        java.util.Collection collection45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendWithSeparators(collection45, "4##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.delete((int) (short) 0, 0);
        int int58 = strBuilder53.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder44.appendFixedWidthPadRight((java.lang.Object) strBuilder53, 4, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean66 = strBuilder63.equalsIgnoreCase(strBuilder65);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.append((int) (byte) 10);
        char[] charArray70 = strBuilder67.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder44.append(charArray70);
        org.apache.commons.lang.text.StrMatcher strMatcher72 = null;
        int int74 = strBuilder44.lastIndexOf(strMatcher72, 20);
        java.lang.String str75 = strBuilder44.getNewLineText();
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNull(str75);
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder17.append((long) 5);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder17.delete((int) (short) 0, 125);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding(101, '1');
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        boolean boolean40 = strBuilder38.contains(strMatcher39);
        java.lang.Object obj42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.insert(6, obj42);
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strBuilder43);
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
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder28.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (short) 10, '#');
        boolean boolean52 = strBuilder50.startsWith("hi!");
        boolean boolean54 = strBuilder50.contains("hi!");
        boolean boolean55 = strBuilder45.equals(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.delete((int) (short) 0, 0);
        int int65 = strBuilder64.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.appendWithSeparators(collection68, "");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder67.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder64.append(strBuilder75);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder50.append((java.lang.Object) strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder50.appendNull();
        boolean boolean79 = strBuilder78.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder78.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder23.append(strBuilder80);
        int int82 = strBuilder81.length();
        int int85 = strBuilder81.indexOf('\n', 115);
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
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 32 + "'", int65 == 32);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 24 + "'", int82 == 24);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
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
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder25.replaceFirst(strMatcher53, "#######");
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
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        boolean boolean60 = strBuilder30.isEmpty();
        int int61 = strBuilder30.length();
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 20 + "'", int61 == 20);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.replaceFirst(strMatcher27, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.delete(6, (int) '-');
        java.lang.String str35 = strBuilder30.rightString(107);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int39 = strBuilder30.indexOf(strMatcher37, 42);
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "##4###" + "'", str35, "##4###");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2564");
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder43.appendPadding(0, 'a');
        java.lang.Object obj62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.insert((int) (short) 0, obj62);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder63.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.deleteAll(strMatcher69);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder39.append((java.lang.Object) strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.appendPadding((int) (short) 10, '#');
        int int78 = strBuilder73.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder73.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strBuilder80.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder71.appendWithSeparators((java.util.Iterator) strTokenizer81, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder33.appendFixedWidthPadRight((java.lang.Object) strBuilder71, 15, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder33.append((float) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder88.append((float) 42);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
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
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.replaceAll("##########-1.0true", "##10.026aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.StringBuffer stringBuffer56 = strBuilder51.toStringBuffer();
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
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(stringBuffer56);
        org.junit.Assert.assertEquals(stringBuffer56.toString(), "\n");
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(32);
        int int4 = strBuilder1.lastIndexOf('a', 2);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendPadding((int) (short) 10, '#');
        int int11 = strBuilder6.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder6.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append('4');
        boolean boolean17 = strBuilder13.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        java.io.Writer writer22 = strBuilder21.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder21, (int) '4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append("1                                                                                                #######100");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.replaceAll('a', '#');
        java.lang.StringBuffer stringBuffer31 = strBuilder25.toStringBuffer();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(writer22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "                                     ##########true41                                                                                                #######100");
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder1.replaceAll("##", "");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder1.deleteFirst(' ');
        java.lang.StringBuffer stringBuffer32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append(stringBuffer32);
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.setCharAt(0, '#');
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
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        boolean boolean7 = strBuilder5.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceAll(strMatcher8, "hi!");
        int int13 = strBuilder10.indexOf(' ', 142);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
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
        int int49 = strBuilder44.indexOf("##############################", 12);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.appendFixedWidthPadRight((int) '4', 15, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append((double) 25);
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
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray42 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder29.insert(0, charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer49 = strBuilder45.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder29.append(stringBuffer49);
        boolean boolean52 = strBuilder29.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder29.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        int int58 = strBuilder29.lastIndexOf(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder25.append(strBuilder29);
        char char61 = strBuilder29.charAt(118);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + char61 + "' != '" + 'a' + "'", char61 == 'a');
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.appendFixedWidthPadRight(118, 0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append((double) 5);
        int int11 = strBuilder8.indexOf("01##########4##", 2);
        int int13 = strBuilder8.indexOf("########10");
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
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
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append(11);
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
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray25 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder12.insert(0, charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder12.appendPadding(0, 'a');
        java.lang.Object obj31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert((int) (short) 0, obj31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.append('a');
        char[] charArray38 = strBuilder37.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder4.append(charArray38, 118, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 7");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), "##4##########10a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), "##4##########10a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[#, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0, a]");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str26 = strBuilder24.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.replaceFirst(strMatcher27, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append('#');
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
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendWithSeparators(collection13, "");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst('a');
        boolean boolean18 = strBuilder8.equals((java.lang.Object) strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceAll('t', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setLength(127);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int14 = strBuilder12.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.append('4');
        boolean boolean24 = strBuilder18.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder18.replaceFirst("", "");
        java.io.Reader reader29 = strBuilder18.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder18.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) strBuilder18, 24, '4');
        int int34 = strBuilder33.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int37 = strBuilder33.lastIndexOf(strMatcher35, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.append('1');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding((int) (short) 10, '#');
        int int48 = strBuilder43.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder43.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean55 = strBuilder52.equalsIgnoreCase(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder54.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder54.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher64 = null;
        int int65 = strBuilder63.lastIndexOf(strMatcher64);
        boolean boolean66 = strBuilder50.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder50.append('#');
        char[] charArray69 = strBuilder50.toCharArray();
        char[] charArray70 = strBuilder39.getChars(charArray69);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(reader29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 34 + "'", int34 == 34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "##########true#");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "##########true#");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[#, #, #, #, #, #, #, #, #, #, t, r, u, e, #]");
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "########104444444444444444444444\n41true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "########104444444444444444444444\n41true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[#, #, #, #, #, #, #, #, 1, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, \n, 4, 1, t, r, u, e]");
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("####10##########");
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
        int int57 = strBuilder55.indexOf("                                                               ");
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
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.replace(10, (int) ' ', "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.insert(2, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.setNewLineText("##");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert(129, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 129");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder3.append((float) 101);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder34.appendNewLine();
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
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.reverse();
        java.io.Writer writer10 = strBuilder6.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder6.appendPadding((int) (short) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append((double) 25);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(writer10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        java.lang.String str17 = strBuilder16.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.deleteFirst("a###################");
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        int int21 = strBuilder16.lastIndexOf(strMatcher20);
        java.io.Writer writer22 = strBuilder16.asWriter();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(writer22);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
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
        boolean boolean26 = strBuilder24.endsWith("##4##########10#");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.minimizeCapacity();
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        int int48 = strBuilder30.lastIndexOf(strMatcher46, 10);
        boolean boolean50 = strBuilder30.startsWith("                                                                                       4\n##########0");
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
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.insert(9, true);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.insert(11, ' ');
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder36.appendFixedWidthPadLeft((int) '#', 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder36.appendFixedWidthPadLeft(13, (int) (short) 1, '-');
        boolean boolean52 = strBuilder12.equals((java.lang.Object) '-');
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        int int54 = strBuilder12.lastIndexOf(strMatcher53);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder12.deleteCharAt(142);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 142");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
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
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.setNullText("           ");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll(" 4 ", "##########0.0");
        boolean boolean35 = strBuilder33.endsWith("#");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray52 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder39.insert(0, charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder39.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder39.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection64 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.appendWithSeparators(collection64, "");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder60.insert(0, (java.lang.Object) strBuilder69);
        int int71 = strBuilder70.size();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.append((double) (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder70.setLength(10);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder33.appendFixedWidthPadRight((java.lang.Object) strBuilder70, (int) ' ', 't');
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 112 + "'", int71 == 112);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
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
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        boolean boolean18 = strBuilder16.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.insert(0, (long) '#');
        java.util.Collection collection22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.appendWithSeparators(collection22, "\n");
        java.lang.String str25 = strBuilder16.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder16.deleteFirst("                                                                 ########1032 ##########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder30.append((int) (short) 100);
        int int49 = strBuilder46.indexOf('1', 1);
        java.lang.String str52 = strBuilder46.midString((int) (byte) 1, 15);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder46.trim();
        boolean boolean55 = strBuilder53.contains("####10");
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
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 13 + "'", int49 == 13);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "#4##########10#" + "'", str52, "#4##########10#");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteAll(strMatcher4);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.ensureCapacity(14);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('4', '-');
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll(strMatcher11, "4\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.clear();
        int int16 = strBuilder15.size();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendPadding((int) (short) 1, 'a');
        boolean boolean23 = strBuilder15.startsWith("##########439.09.0true4");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("########10");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.replaceAll(strMatcher17, "##########10");
        java.io.Reader reader20 = strBuilder19.asReader();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(reader20);
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.setLength((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.deleteAll("");
        java.lang.StringBuffer stringBuffer28 = strBuilder22.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder8.append(stringBuffer28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.ensureCapacity((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendWithSeparators(collection34, "");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.deleteAll('4');
        int int41 = strBuilder38.indexOf(' ', (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding((int) (short) 10, '#');
        int int48 = strBuilder43.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strBuilder53.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder43.appendWithSeparators((java.util.Iterator) strTokenizer54, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder61.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean69 = strBuilder66.equalsIgnoreCase(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder68.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray81 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder68.insert(0, charArray81);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder61.append(charArray81);
        org.apache.commons.lang.text.StrMatcher strMatcher84 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder83.replaceFirst(strMatcher84, "hi!");
        char[] charArray87 = strBuilder83.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder59.append(charArray87, (int) (byte) 1, 0);
        char[] charArray91 = strBuilder38.getChars(charArray87);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder29.append(charArray91);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder92.setLength(16);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder94);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll(' ', 'a');
        int int27 = strBuilder26.size();
        char[] charArray28 = strBuilder26.toCharArray();
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[\n]");
    }

    @Test
    public void test2595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2595");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst('a', '4');
        int int12 = strBuilder9.indexOf('#', (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.deleteAll('#');
        boolean boolean16 = strBuilder14.contains("");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.replace(strMatcher17, "##4###", 138, 124, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.replaceFirst('-', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder31.reverse();
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
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        int int7 = strBuilder5.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceFirst(' ', '1');
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.replaceFirst(strMatcher38, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.append("##", 0, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.insert(5, (double) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.deleteFirst('-');
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder47.replaceFirst(strMatcher50, "##4##########10########## ");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder10.append(strBuilder52);
        java.lang.String str56 = strBuilder52.substring(0, 9);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "##4##100." + "'", str56, "##4##100.");
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.insert(9, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst(strMatcher17);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder6.append((double) 19);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder6.setCharAt(1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder6.insert(4, 100.0f);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("true########10          ");
        int int4 = strBuilder1.lastIndexOf('a', 2);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.replace((int) (short) 10, 15, "##4##########101                                                                                                -1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding((int) (short) 10, '#');
        int int17 = strBuilder12.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append('4');
        boolean boolean23 = strBuilder19.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder27.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        int int31 = strBuilder28.lastIndexOf(strMatcher29, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder10.append(strBuilder28);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder10.deleteAll(strMatcher33);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
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
        int int39 = strBuilder8.lastIndexOf("           ");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder8.insert((int) (byte) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder8.setLength((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteCharAt((int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder1.replaceAll("##", "");
        int int31 = strBuilder29.indexOf("#");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.replaceAll('1', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder29.replaceAll(strMatcher35, "\n");
        int int38 = strBuilder37.capacity();
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert(11, (int) (byte) -1);
        int int19 = strBuilder17.indexOf("4");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        int int26 = strBuilder21.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strBuilder31.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer32, "hi!");
        char[] charArray38 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder21.append(charArray38);
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.deleteFirst(strMatcher40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.deleteAll(strMatcher46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strBuilder43.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder41.appendWithSeparators((java.util.Iterator) strTokenizer48, "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer48, "####-1.0true");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 16 + "'", int19 == 16);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray38);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray38), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray38), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray38), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        java.lang.String str10 = strBuilder4.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append((long) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteFirst("########10");
        int int17 = strBuilder14.capacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "##" + "'", str10, "##");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        boolean boolean7 = strBuilder5.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceAll(strMatcher8, "hi!");
        java.lang.String str11 = strBuilder5.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.appendPadding((int) (short) 0, '1');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder5.appendNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2606");
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
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll(strMatcher34, "##########0.0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.insert(17, (long) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 17");
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
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        java.lang.Object obj27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder1.appendFixedWidthPadRight(obj27, 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder1.append(false);
        java.lang.String str35 = strBuilder32.midString(12, (int) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray52 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder39.insert(0, charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder39.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceFirst(strMatcher57, "");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder59.trim();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        int int63 = strBuilder60.indexOf(strMatcher61, 5);
        java.util.Collection collection64 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder60.appendWithSeparators(collection64, "01                                                                                       ");
        java.lang.StringBuffer stringBuffer67 = strBuilder66.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder32.append((java.lang.Object) strBuilder66);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean73 = strBuilder70.equalsIgnoreCase(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean79 = strBuilder76.equalsIgnoreCase(strBuilder78);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strBuilder76.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder74.appendWithSeparators((java.util.Iterator) strTokenizer81, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder32.appendWithSeparators((java.util.Iterator) strTokenizer81, "");
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "se" + "'", str35, "se");
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
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(stringBuffer67);
        org.junit.Assert.assertEquals(stringBuffer67.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setNewLineText("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder18.insert(8, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        java.lang.String str17 = strBuilder15.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replace(1, (int) (short) 1, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.append(0);
        java.lang.String str25 = strBuilder15.rightString(107);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder15.insert(6, "##4##########10#");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.replace(34, 35, "");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "####10" + "'", str17, "####10");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1                                                                                                #######100" + "'", str25, "1                                                                                                #######100");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
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
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        java.lang.String str17 = strBuilder15.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replace(1, (int) (short) 1, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder15.appendPadding(19, '-');
        char[] charArray27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder15.append(charArray27, (int) (byte) 0, 16);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int32 = strBuilder15.lastIndexOf(strMatcher31);
        int int35 = strBuilder15.lastIndexOf("##4##0################################################################################################10.0107.0", 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "####10" + "'", str17, "####10");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        boolean boolean28 = strBuilder26.contains("##4#########4#####10##########");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
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
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.setNullText("4\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        boolean boolean10 = strBuilder5.contains("####10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
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
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append((java.lang.Object) "     ");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.setLength((int) (byte) 10);
        java.lang.String str26 = strBuilder21.toString();
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
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "########10" + "'", str26, "########10");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendFixedWidthPadLeft((int) '#', 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.appendFixedWidthPadRight((int) (short) 0, 6, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.replace(strMatcher36, "              ", (int) '\n', 10, (int) '4');
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("true########10          ");
        int int4 = strBuilder1.lastIndexOf('a', 2);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.append((float) 39);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.replaceAll('1', 'a');
        java.lang.String str10 = strBuilder1.getNullText();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        java.util.Collection collection46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendWithSeparators(collection46, "");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.insert(7, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.append((float) 34);
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
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadLeft(101, 16, '-');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.setNewLineText("##4##########10########## ");
        int int15 = strBuilder12.size();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.replaceAll("", "true########10          ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertNotNull(strBuilder18);
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteAll(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceAll(strMatcher40, "##4##0################################################################################################10.0107.0");
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.insert((int) (byte) 10, (float) '1');
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding((int) (short) 10, '#');
        int int32 = strBuilder27.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.replaceAll(strMatcher41, "01##########4##");
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteAll(strMatcher44);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.insert((int) (byte) 10, (float) '1');
        org.apache.commons.lang.text.StrMatcher strMatcher49 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst(strMatcher49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder22.insert(0, (java.lang.Object) strMatcher49);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test2621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2621");
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
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder15.appendPadding(19, '-');
        boolean boolean27 = strBuilder26.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.insert(26, 21);
        int int33 = strBuilder26.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 175);
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder26.deleteAll(strMatcher34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "####10" + "'", str17, "####10");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
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
        int int41 = strBuilder30.indexOf("hi!", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteAll('4');
        int int49 = strBuilder44.indexOf("#97.0#4##########10", 6);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder44.insert(6, (double) 100);
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
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.delete((int) (short) 0, 0);
        int int12 = strBuilder7.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder7.append('1');
        boolean boolean15 = strBuilder1.equals((java.lang.Object) '1');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2624");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append('t');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2625");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.setLength((int) '4');
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst(strMatcher19, "##########-1.0true");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.append(15);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.setLength((int) (short) 10);
        boolean boolean32 = strBuilder18.equals((java.lang.Object) strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder18.append((double) 112);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.deleteAll(strMatcher21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.replace(107, (int) '4', "##");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
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
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.insert(9, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray30 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(0, charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceFirst(strMatcher35, "");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder45.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray60 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder47.insert(0, charArray60);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder47.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        int int67 = strBuilder47.lastIndexOf(strMatcher65, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean72 = strBuilder69.equalsIgnoreCase(strBuilder71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder71.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int80 = strBuilder71.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder71.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder71.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder47.appendFixedWidthPadRight((java.lang.Object) strBuilder85, (int) (byte) 1, '4');
        boolean boolean90 = strBuilder88.endsWith("01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder43.append(strBuilder88);
        java.lang.String str92 = strBuilder91.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder10.append(strBuilder91);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder97 = null; // flaky: strBuilder93.appendFixedWidthPadRight(42, (int) (short) 1, '-');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
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
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 0 + "'", int80 == 0);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNull(str92);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder30.append((int) (short) 100);
        boolean boolean48 = strBuilder46.endsWith("########### ########10");
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder(9);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.append(strBuilder7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = strBuilder8.substring((int) (short) 10, 21);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteFirst("##4#########");
        boolean boolean26 = strBuilder24.endsWith("e4");
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder24.replace(strMatcher27, "##########true", 1, 26, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder32.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.append((long) 24);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteCharAt((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
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
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendWithSeparators(collection13, "");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst('a');
        boolean boolean18 = strBuilder8.equals((java.lang.Object) strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder15.setLength((int) '4');
        int int25 = strBuilder22.indexOf("#", 25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder29.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder29.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder46.replaceAll("", "");
        boolean boolean56 = strBuilder42.equalsIgnoreCase(strBuilder46);
        java.io.Writer writer57 = strBuilder42.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.appendNull();
        int int65 = strBuilder63.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer71 = strBuilder67.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder63.append(stringBuffer71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder42.append(stringBuffer71);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder22.append(stringBuffer71, 0, 2);
        int int79 = strBuilder76.indexOf("", (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder76.appendFixedWidthPadRight(9, 43, '1');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(writer57);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(stringBuffer71);
        org.junit.Assert.assertEquals(stringBuffer71.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 10 + "'", int79 == 10);
        org.junit.Assert.assertNotNull(strBuilder83);
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder43.appendPadding(0, 'a');
        java.lang.Object obj62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.insert((int) (short) 0, obj62);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder63.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.deleteAll(strMatcher69);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder39.append((java.lang.Object) strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.appendPadding((int) (short) 10, '#');
        int int78 = strBuilder73.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder73.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer81 = strBuilder80.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder71.appendWithSeparators((java.util.Iterator) strTokenizer81, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder33.appendFixedWidthPadRight((java.lang.Object) strBuilder71, 15, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder33.append((float) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder88.append('a');
        java.lang.String str93 = strBuilder90.substring(7, 105);
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
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
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
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strTokenizer81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "######10-1.0###########45.0a" + "'", str93, "######10-1.0###########45.0a");
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
        boolean boolean41 = strBuilder25.contains('a');
        int int44 = strBuilder25.lastIndexOf('#', (int) 'a');
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int10 = strBuilder5.indexOf(strMatcher9);
        java.lang.String str13 = strBuilder5.midString(13, 10);
        java.lang.String str14 = strBuilder5.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder5.appendPadding(11, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder5.replaceAll("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "########10");
        int int21 = strBuilder5.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "10" + "'", str14, "10");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 13 + "'", int21 == 13);
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
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder21.deleteAll("           ");
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
        org.junit.Assert.assertNotNull(strBuilder61);
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst('\n');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
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
        int int39 = strBuilder8.lastIndexOf("           ");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder8.insert((int) (byte) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder8.setNullText("4");
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int46 = strBuilder44.lastIndexOf(strMatcher45);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.setNewLineText("#4##########10#");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteAll(strMatcher8);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteAll("a###################");
        int int13 = strBuilder9.lastIndexOf("##4##########10");
        // The following exception was thrown during execution in test generation
        try {
            char char15 = strBuilder9.charAt((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
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
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendFixedWidthPadLeft((int) '#', 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.appendFixedWidthPadRight((int) (short) 0, 6, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.replace(16, 21, "##10");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder35.replace(strMatcher40, "##4###", 0, (int) 't', 5);
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder45);
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        int int62 = strBuilder57.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder57.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.append('4');
        boolean boolean68 = strBuilder64.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder64.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        java.lang.String str73 = strBuilder72.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.deleteFirst("a###################");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder72.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder3.append(strBuilder78);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.deleteFirst('-');
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
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.replaceFirst(strMatcher27, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder23.append("##", 0, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder23.replaceFirst('-', '1');
        java.io.Writer writer37 = strBuilder23.asWriter();
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
        org.junit.Assert.assertNotNull(writer37);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.insert(9, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder();
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
        boolean boolean60 = strBuilder16.equalsIgnoreCase(strBuilder56);
        int int61 = strBuilder56.size();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder15.append((java.lang.Object) int61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (byte) 0, (double) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("#######10");
        boolean boolean69 = strBuilder67.endsWith("##4#########");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder62.append((java.lang.Object) "##4#########");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
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
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
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
        int int31 = strBuilder20.length();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.setLength(100);
        int int34 = strBuilder20.length();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        boolean boolean36 = strBuilder20.contains(strMatcher35);
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 10 + "'", int31 == 10);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
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
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray46 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder33.insert(0, charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder33.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher51 = null;
        int int53 = strBuilder33.lastIndexOf(strMatcher51, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int66 = strBuilder57.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder57.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder57.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder33.appendFixedWidthPadRight((java.lang.Object) strBuilder71, (int) (byte) 1, '4');
        boolean boolean76 = strBuilder74.endsWith("01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder29.append(strBuilder74);
        java.lang.String str78 = strBuilder77.getNewLineText();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder77.deleteCharAt(43);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 43");
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNull(str78);
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
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        int int12 = strBuilder9.lastIndexOf(strMatcher10, 0);
        boolean boolean14 = strBuilder9.contains(' ');
        java.lang.String str15 = strBuilder9.getNewLineText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        boolean boolean7 = strBuilder5.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceAll(strMatcher8, "hi!");
        int int12 = strBuilder5.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder5.replaceFirst("4 ########10", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.insert(0, (int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst(strMatcher19, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.delete((int) (short) 0, 0);
        int int32 = strBuilder30.indexOf("");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.deleteAll(strMatcher33);
        int int37 = strBuilder30.indexOf("-1.0", 13);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.setNewLineText("##4##########101true");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) strBuilder30, 7, '1');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.deleteFirst("4 ########10");
        int int46 = strBuilder30.lastIndexOf('a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.replaceFirst('4', '4');
        java.lang.String str34 = strBuilder31.substring(0, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder31.lastIndexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.setNewLineText("");
        int int39 = strBuilder31.capacity();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        int int6 = strBuilder4.size();
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst(strMatcher7);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.insert((int) (short) 1, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.replaceFirst('a', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.insert(5, (float) (short) -1);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
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
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder21.replaceFirst('4', 'a');
        java.lang.Object obj64 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder21.appendFixedWidthPadRight(obj64, 24, '-');
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
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(reader60);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int3 = strBuilder1.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.replaceAll("", "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder10.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder10.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendWithSeparators(collection35, "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder31.insert(0, (java.lang.Object) strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder31.ensureCapacity((int) (short) 0);
        char[] charArray46 = strBuilder31.toCharArray(15, 118);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder6.append(charArray46);
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder6.replaceFirst(strMatcher48, "     ");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder50.appendNull();
        int int52 = strBuilder50.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "1                                                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "1                                                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 97 + "'", int52 == 97);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceAll('4', '4');
        boolean boolean9 = strBuilder1.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendWithSeparators(collection13, "");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append((double) 19);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder17.setCharAt(1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray48 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder35.insert(0, charArray48);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder35.appendPadding(0, 'a');
        java.lang.Object obj54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.insert((int) (short) 0, obj54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.deleteAll(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder31.append((java.lang.Object) strBuilder60);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.append("hi!");
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
        org.apache.commons.lang.text.StrMatcher strMatcher90 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder89.replaceFirst(strMatcher90, "hi!");
        char[] charArray93 = strBuilder89.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder65.append(charArray93);
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder17.append(charArray93);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder1.insert(19, charArray93);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 19");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
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
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray93), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray93), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray93), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder95);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        boolean boolean26 = strBuilder24.endsWith("##4##########10#");
        int int29 = strBuilder24.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 101);
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
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2653");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.append(15);
        boolean boolean9 = strBuilder7.startsWith("4");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.appendFixedWidthPadRight((int) (short) 10, 13, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        int int35 = strBuilder32.indexOf('a', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.append(2);
        java.io.Reader reader38 = strBuilder32.asReader();
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder32.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder7.insert(20, (java.lang.Object) strTokenizer39);
        int int43 = strBuilder40.indexOf("#######10#######################32100", 20);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(reader38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
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
        int int36 = strBuilder17.lastIndexOf("#");
        boolean boolean38 = strBuilder17.equals((java.lang.Object) "##############################");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder17.appendFixedWidthPadLeft(47, (-1), '-');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder46.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.setNewLineText("##########true");
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strBuilder60.asTokenizer();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strBuilder60.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer62, "");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.insert(125, 0);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 15 + "'", int36 == 15);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) -1, ' ');
        boolean boolean24 = strBuilder20.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.replaceAll("#########true4125#################################################", "              ");
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
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.lang.String str4 = strBuilder1.substring(0, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("-1.0", "4 ########10");
        boolean boolean8 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder19.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadRight((int) (short) 0, (int) (short) 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder20.setLength((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int32 = strBuilder30.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.replaceAll("", "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray52 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder39.insert(0, charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder39.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder39.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection64 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.appendWithSeparators(collection64, "");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder60.insert(0, (java.lang.Object) strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder60.ensureCapacity((int) (short) 0);
        char[] charArray75 = strBuilder60.toCharArray(15, 118);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder35.append(charArray75);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder76.appendPadding(9, ' ');
        char[] charArray80 = strBuilder79.toCharArray();
        char[] charArray81 = strBuilder20.getChars(charArray80);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder1.insert(17, charArray80);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 17");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "1                                                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "1                                                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "\n\n\000\000\000\000\000\000\000\000                                                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "\n\n\000\000\000\000\000\000\000\000                                                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[\n, \n, \000, \000, \000, \000, \000, \000, \000, \000,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "\n\n\000\000\000\000\000\000\000\000                                                                                                ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "\n\n\000\000\000\000\000\000\000\000                                                                                                ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[\n, \n, \000, \000, \000, \000, \000, \000, \000, \000,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
    }

    @Test
    public void test2657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2657");
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
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int52 = strBuilder49.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.replaceFirst("", "##");
        java.util.Collection collection56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.appendWithSeparators(collection56, "\n");
        java.lang.Object[] objArray59 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.appendWithSeparators(objArray59, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder39.appendWithSeparators(objArray59, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder39.replaceFirst("##4######", "hi!");
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
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[]");
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        boolean boolean27 = strBuilder25.startsWith("hi!");
        boolean boolean29 = strBuilder25.contains("hi!");
        boolean boolean30 = strBuilder20.equals(strBuilder25);
        java.lang.StringBuffer stringBuffer31 = strBuilder25.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.replaceAll(" 4 ", "fals");
        // The following exception was thrown during execution in test generation
        try {
            char char36 = strBuilder25.charAt(42);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 42");
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
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendFixedWidthPadLeft(10, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        int int12 = strBuilder7.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder17.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder7.appendWithSeparators((java.util.Iterator) strTokenizer18, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll("##########true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray45 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder32.insert(0, charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder25.append(charArray45);
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst(strMatcher48, "hi!");
        char[] charArray51 = strBuilder47.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder23.append(charArray51, (int) (byte) 1, 0);
        java.lang.StringBuffer stringBuffer55 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder5.append(stringBuffer55);
        java.lang.String str57 = strBuilder56.toString();
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "####################");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "4 ########10####################" + "'", str57, "4 ########10####################");
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
        java.lang.String str34 = strBuilder31.substring(0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendPadding((int) (short) 10, '#');
        java.lang.String str41 = strBuilder36.leftString(0);
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
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) strBuilder65, (int) ' ', '4');
        int int73 = strBuilder65.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder65.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder65.deleteAll("#");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder31.append(strBuilder78);
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder31.replace(strMatcher80, "##4##########10#", 42, 17, 22);
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
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
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 2 + "'", int73 == 2);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("##########true");
        char[] charArray18 = strBuilder17.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        java.lang.String str27 = strBuilder26.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder31.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.setNewLineText("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) "##########true", 12, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder26.reverse();
        java.util.Collection collection50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendWithSeparators(collection50, "####10");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendPadding(58, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder57.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean67 = strBuilder64.equalsIgnoreCase(strBuilder66);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder66.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray79 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder66.insert(0, charArray79);
        char[] charArray81 = strBuilder57.getChars(charArray79);
        char[] charArray82 = strBuilder55.getChars(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder17.append(charArray82);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder17.insert(0, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "##########-1.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "##########-1.0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[#, #, #, #, #, #, #, #, #, #, -, 1, ., 0]");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "eurt##################4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "eurt##################4444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[e, u, r, t, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4]");
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder86);
    }

    @Test
    public void test2662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2662");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(118);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setLength(106);
        char[] charArray4 = strBuilder3.toCharArray();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[\000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000]");
    }

    @Test
    public void test2663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2663");
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
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendPadding(101, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        int int23 = strBuilder18.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder27.clear();
        java.lang.String str34 = strBuilder27.rightString(12);
        boolean boolean35 = strBuilder16.equals((java.lang.Object) 12);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder16.setCharAt((int) 'a', '1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.replaceFirst("##########true", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int29 = strBuilder26.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder26.setNullText("####10");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder13.append((java.lang.Object) strBuilder26);
        int int35 = strBuilder26.lastIndexOf('l', 20);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder3.trim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder3.deleteCharAt(216);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 216");
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
        org.junit.Assert.assertNotNull(strBuilder87);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strBuilder2.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.insert(1, (long) 24);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        int int13 = strBuilder8.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append('4');
        boolean boolean19 = strBuilder15.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        java.lang.String str30 = strBuilder25.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray47 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder34.insert(0, charArray47);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder34.appendPadding(0, 'a');
        java.lang.Object obj53 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.insert((int) (short) 0, obj53);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) strBuilder54, (int) ' ', '4');
        boolean boolean61 = strBuilder21.equals(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean66 = strBuilder63.equalsIgnoreCase(strBuilder65);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder65.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray78 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder65.insert(0, charArray78);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder65.appendPadding(0, 'a');
        java.lang.Object obj84 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder82.insert((int) (short) 0, obj84);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder85.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder85.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher91 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder90.deleteAll(strMatcher91);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder92.append(false);
        boolean boolean95 = strBuilder25.equalsIgnoreCase(strBuilder92);
        java.lang.StringBuffer stringBuffer96 = strBuilder92.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder2.append(stringBuffer96);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertNotNull(stringBuffer96);
        org.junit.Assert.assertEquals(stringBuffer96.toString(), "-1.0false");
        org.junit.Assert.assertNotNull(strBuilder97);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNewLineText("##########true");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendPadding((int) (short) 10, '#');
        int int39 = strBuilder34.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilder41.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder32.append(strBuilder41);
        java.lang.String str48 = strBuilder47.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("#97.0#4##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.append((java.lang.Object) strBuilder50);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder20.append(strBuilder50, 34, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strBuilder51);
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
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.replaceAll("#4##########10#", "01##########4####4");
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
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
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
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst("", "##");
        java.util.Collection collection16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendWithSeparators(collection16, "\n");
        java.lang.Object[] objArray19 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(objArray19, "01##########4##");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.appendFixedWidthPadLeft(32, 25, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.appendPadding((-1), 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.append((long) (byte) 100);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst(strMatcher33);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.delete((int) (short) 100, (int) 'a');
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        boolean boolean4 = strBuilder2.endsWith("01##########4##");
        int int5 = strBuilder2.size();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder2.insert(138, (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 138");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
    }

    @Test
    public void test2671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2671");
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
        java.lang.Object obj27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder1.appendFixedWidthPadRight(obj27, 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder1.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.deleteAll(strMatcher37);
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder34.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer39, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.setNullText("##10");
        boolean boolean44 = strBuilder43.isEmpty();
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
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder21.replaceFirst('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.appendPadding(4, 't');
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.replaceAll(strMatcher67, "##10");
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
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int30 = strBuilder28.lastIndexOf('4');
        char[] charArray31 = strBuilder28.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.insert((int) (short) 10, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendWithSeparators(collection36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder33.append(strBuilder40);
        java.io.Writer writer42 = strBuilder40.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.deleteAll('1');
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(writer42);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.insert(0, (float) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder37.appendNewLine();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2675");
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
        int int35 = strBuilder30.lastIndexOf('-', 25);
        java.io.Writer writer36 = strBuilder30.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        boolean boolean38 = strBuilder30.contains(strMatcher37);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.deleteAll(strMatcher39);
        int int42 = strBuilder30.indexOf("");
        java.util.Collection collection43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder30.appendWithSeparators(collection43, "se");
        java.lang.String str46 = strBuilder45.toString();
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(writer36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "-1.0false" + "'", str46, "-1.0false");
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(0);
        int int3 = strBuilder1.lastIndexOf("##4##0################################################################################################10.0107.0");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
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
        char char40 = strBuilder5.charAt((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder5.ensureCapacity((int) (byte) 1);
        int int45 = strBuilder42.lastIndexOf(' ', 4);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.appendNewLine();
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
        org.junit.Assert.assertTrue("'" + char40 + "' != '" + '-' + "'", char40 == '-');
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.lang.String str4 = strBuilder1.substring(0, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("-1.0", "4 ########10");
        int int10 = strBuilder1.lastIndexOf('-', 21);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.insert(175, (long) 17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 175");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder27.appendNull();
        int int31 = strBuilder28.indexOf('#', (int) '#');
        boolean boolean33 = strBuilder28.contains("               ");
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.setNewLineText("####10");
        java.lang.String str33 = strBuilder31.substring((int) '-');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendNewLine();
        boolean boolean36 = strBuilder34.contains("1");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "                                                      0" + "'", str33, "                                                      0");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.append((double) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        int int9 = strBuilder1.length();
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.insert(7, ' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 18 + "'", int9 == 18);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrTokenizer strTokenizer3 = strBuilder2.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.insert(1, (long) 24);
        char[] charArray9 = strBuilder6.toCharArray((int) (short) 10, 21);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strTokenizer3);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "##10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "##10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[#, #, 1, 0]");
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.setNullText("");
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strBuilder8.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.append(true);
        java.lang.StringBuffer stringBuffer14 = strBuilder13.toStringBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.append("##4##########101                                                                                                -1.0", 112, (int) '\n');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(stringBuffer14);
        org.junit.Assert.assertEquals(stringBuffer14.toString(), "##########true");
    }

    @Test
    public void test2684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2684");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteAll('#');
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.replaceFirst('4', '4');
        java.lang.String str34 = strBuilder31.substring(0, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder31.lastIndexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.setNewLineText("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder31.append('t');
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
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
        int int38 = strBuilder30.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.insert((int) (byte) 0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder30.append((double) 't');
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
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2687");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder22.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder22.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str45 = strBuilder43.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.replaceFirst(strMatcher46, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.insert((int) (byte) 1, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.insert((int) (byte) 10, false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder78.appendFixedWidthPadRight(0, (int) 'a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder85.append((float) (short) 10);
        java.lang.StringBuffer stringBuffer88 = strBuilder85.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder54.append(stringBuffer88, 10, (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder18.append(stringBuffer88);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder18.deleteFirst("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder94.append("-1.0false");
        int int97 = strBuilder94.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertNotNull(strBuilder16);
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "4##########101                                                                                                " + "'", str45, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
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
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(stringBuffer88);
        org.junit.Assert.assertEquals(stringBuffer88.toString(), "##4##0################################################################################################10.0");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 105 + "'", int97 == 105);
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
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.appendNull();
        int int34 = strBuilder32.lastIndexOf(' ');
        int int35 = strBuilder32.length();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder26.appendFixedWidthPadRight((java.lang.Object) int35, (int) (short) 1, '1');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray55 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder42.insert(0, charArray55);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder42.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.replaceFirst(strMatcher60, "");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder59.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder59.appendFixedWidthPadLeft((int) '#', 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder38.appendFixedWidthPadRight((java.lang.Object) 10, (int) (byte) 0, 't');
        int int75 = strBuilder73.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder73.append(10.0d);
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 10 + "'", int35 == 10);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(strBuilder77);
    }
}
