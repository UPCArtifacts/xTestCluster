import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder21.appendFixedWidthPadRight(12, (int) (byte) -1, ' ');
        int int59 = strBuilder21.lastIndexOf('1');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder21.deleteFirst('a');
        int int64 = strBuilder61.lastIndexOf("########10##4##########104######", 3);
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder21.appendFixedWidthPadRight(12, (int) (byte) -1, ' ');
        int int59 = strBuilder21.lastIndexOf('1');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder21.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.append((double) 192);
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append("####10");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.append("ue ");
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        int int24 = strBuilder1.length();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding((int) (short) 10, '#');
        int int31 = strBuilder26.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder26.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        boolean boolean41 = strBuilder39.contains(strMatcher40);
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder39.deleteFirst(strMatcher42);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder39.replaceAll(' ', '1');
        java.io.Reader reader47 = strBuilder46.asReader();
        int int49 = strBuilder46.lastIndexOf('t');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder1.append(strBuilder46);
        java.lang.String str51 = strBuilder46.toString();
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
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(reader47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 10 + "'", int49 == 10);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "##########true4" + "'", str51, "##########true4");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.appendFixedWidthPadLeft(12, (int) 'a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder39.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.deleteAll("0");
        java.io.Writer writer43 = strBuilder39.asWriter();
        java.lang.String str45 = strBuilder39.leftString(192);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray62 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder49.insert(0, charArray62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder49.appendPadding(0, 'a');
        java.lang.Object obj68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.insert((int) (short) 0, obj68);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder69.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder71.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder71.replaceAll("4##########101                                                                                                ", "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder78.deleteAll('#');
        char[] charArray81 = strBuilder78.toCharArray();
        char[] charArray82 = strBuilder39.getChars(charArray81);
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(writer43);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "########14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444412hi!" + "'", str45, "########14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444412hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(charArray81);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray81), "                                                                                                   0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray81), "                                                                                                   0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray81), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , 0]");
        org.junit.Assert.assertNotNull(charArray82);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray82), "########14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444412hi!");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray82), "########14444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444412hi!");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray82), "[#, #, #, #, #, #, #, #, 1, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1, 2, h, i, !]");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder4.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append(32);
        int int22 = strBuilder19.indexOf(' ', (-1));
        java.lang.String str25 = strBuilder19.midString(14, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.deleteFirst('1');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "2" + "'", str25, "2");
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.insert(0, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray26 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder13.insert(0, charArray26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder6.append(charArray26);
        int int29 = strBuilder28.length();
        java.lang.StringBuffer stringBuffer30 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadRight((int) 'a', (int) (byte) 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        boolean boolean36 = strBuilder28.contains(strMatcher35);
        boolean boolean37 = strBuilder4.equals((java.lang.Object) strMatcher35);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 5 + "'", int29 == 5);
        org.junit.Assert.assertNotNull(stringBuffer30);
        org.junit.Assert.assertEquals(stringBuffer30.toString(), "##4##");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.insert(0, (float) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder28.append("##########true4", (int) (short) 1, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder28.delete(3, 113);
        java.lang.String str39 = strBuilder28.getNullText();
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
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
        java.lang.String str58 = strBuilder17.getNullText();
        int int60 = strBuilder17.lastIndexOf("####aaaaaaaaa");
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
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.appendFixedWidthPadRight(100, (int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        boolean boolean27 = strBuilder20.contains(strMatcher26);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        int int40 = strBuilder35.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) strBuilder50, (int) (short) 1, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strBuilder53.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer54, "");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder20.ensureCapacity(9);
        java.lang.String str59 = strBuilder20.toString();
        int int61 = strBuilder20.lastIndexOf("######");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "########10100#######0" + "'", str59, "########10100#######0");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 14 + "'", int61 == 14);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        char[] charArray18 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.append(charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteCharAt(0);
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteAll(strMatcher22);
        int int26 = strBuilder23.lastIndexOf("##4######9#########################", 16);
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
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder21.appendFixedWidthPadRight(12, (int) (byte) -1, ' ');
        int int59 = strBuilder21.lastIndexOf('1');
        java.lang.String str61 = strBuilder21.rightString(9);
        java.lang.String str63 = strBuilder21.leftString((-1));
        java.lang.String str65 = strBuilder21.leftString(2);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.appendPadding((int) (short) 10, '#');
        int int72 = strBuilder67.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder67.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder76.replaceAll('4', ' ');
        boolean boolean81 = strBuilder79.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder84.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder84.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder79.insert((int) (short) 0, (java.lang.Object) strBuilder88);
        org.apache.commons.lang.text.StrMatcher strMatcher90 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder88.replaceFirst(strMatcher90, "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder88.append(5);
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder21.append((java.lang.Object) strBuilder88);
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4" + "'", str61, "4");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "4" + "'", str65, "4");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder95);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst("4 ########10", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.deleteFirst("#");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append((-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        java.lang.String str9 = strBuilder8.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.append((long) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.insert(270, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 270");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean16 = strBuilder10.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer40 = strBuilder36.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder20.append(stringBuffer40);
        boolean boolean43 = strBuilder20.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray66 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder53.insert(0, charArray66);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder46.append(charArray66);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder20.insert((int) (short) 10, charArray66);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder10.append(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.append(true);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        char[] charArray13 = strBuilder3.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder19.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteAll("##########true");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder15.append(strBuilder31, 19, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        int int18 = strBuilder16.indexOf("#");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append((float) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.append("4");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.append("01##########4##                                                                                                   4");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.delete(14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("####10");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceAll('4', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.append((long) 32);
        java.lang.StringBuffer stringBuffer7 = strBuilder4.toStringBuffer();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(stringBuffer7);
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "####1032");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder4.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.insert((int) (byte) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.appendFixedWidthPadLeft((int) (short) -1, 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.reverse();
        char[] charArray26 = strBuilder25.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.insert(14, true);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert(13, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.deleteAll('t');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder38.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder55.replaceAll("", "");
        boolean boolean65 = strBuilder51.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder51.deleteAll("##4##########10##########");
        boolean boolean69 = strBuilder51.startsWith("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder51.insert(9, 0.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.replaceFirst('#', ' ');
        boolean boolean76 = strBuilder29.equalsIgnoreCase(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "1-        001###########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "1-        001###########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[1, -,  ,  ,  ,  ,  ,  ,  ,  , 0, 0, 1, #, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.insert((int) (short) 1, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder23.insert((int) (short) 0, (float) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder23.deleteAll("##");
        java.util.Collection collection38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendWithSeparators(collection38, "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendPadding((int) (short) 10, '#');
        int int47 = strBuilder42.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder42.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.append((float) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder42.clear();
        java.lang.StringBuffer stringBuffer53 = strBuilder52.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder40.append(stringBuffer53);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder40.insert(111, '4');
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
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(stringBuffer53);
        org.junit.Assert.assertEquals(stringBuffer53.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
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
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendPadding((int) (short) 10, '#');
        int int73 = strBuilder68.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder66.append(strBuilder68);
        boolean boolean76 = strBuilder74.contains("");
        java.lang.String str77 = strBuilder74.toString();
        int int80 = strBuilder74.lastIndexOf("0", 20);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder74.setNullText("#");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.append(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "########10##4##########104##########101                                                                                                ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########" + "'", str77, "########10##4##########104##########101                                                                                                ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 9 + "'", int80 == 9);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder41.replaceAll("", "");
        boolean boolean51 = strBuilder37.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder41.replaceAll(strMatcher52, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder3.append(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder59.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray72 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder59.insert(0, charArray72);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder59.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.appendPadding((int) (short) 10, '#');
        boolean boolean83 = strBuilder81.startsWith("hi!");
        boolean boolean85 = strBuilder81.contains("hi!");
        boolean boolean86 = strBuilder76.equals(strBuilder81);
        java.lang.StringBuffer stringBuffer87 = strBuilder81.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder3.append(stringBuffer87);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder88.deleteFirst("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder90.append(strBuilder91);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder92.appendNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(stringBuffer87);
        org.junit.Assert.assertEquals(stringBuffer87.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder4.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append(32);
        java.io.Reader reader20 = strBuilder17.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append((double) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.deleteAll('1');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding((int) (short) 10, '#');
        java.lang.String str30 = strBuilder29.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append((java.lang.Object) strBuilder29);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = strBuilder24.substring((int) 'a', 25);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder2.insert(0, '4');
        java.lang.String str7 = strBuilder2.leftString(18);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder2.append((long) 22);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4" + "'", str7, "4");
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.replace((int) 'a', (int) (short) 100, "##4##########10##########");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        int int69 = strBuilder14.lastIndexOf(strMatcher67, 12);
        java.lang.String str70 = strBuilder14.getNewLineText();
        int int73 = strBuilder14.lastIndexOf("####10", 15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
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
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 4 + "'", int73 == 4);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        int int12 = strBuilder7.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder7.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) strBuilder22, (int) (short) 1, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer26 = strBuilder25.asTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.setCharAt((int) ' ', 't');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strTokenizer26);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
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
        java.lang.String str33 = strBuilder16.midString(0, 9);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.appendPadding((int) (short) 10, '#');
        java.lang.String str46 = strBuilder41.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) strBuilder41, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder38.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.insert((int) (byte) 1, '#');
        java.io.Reader reader55 = strBuilder54.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) reader55, (int) (short) -1, '1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.insert(270, (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 270");
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
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "########1" + "'", str33, "########1");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(reader55);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder21.appendFixedWidthPadRight(12, (int) (byte) -1, ' ');
        int int59 = strBuilder21.lastIndexOf('1');
        java.lang.String str61 = strBuilder21.rightString(9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder21.insert(133, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 133");
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4" + "'", str61, "4");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.appendFixedWidthPadLeft(12, (int) 'a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder33.appendFixedWidthPadRight((-1), (int) (short) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.setNullText("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append((long) 12);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.setCharAt(21, 't');
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder3.replaceAll(strMatcher21, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder23.reverse();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteAll(strMatcher25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteCharAt(7);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append((double) (-1.0f));
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder3.append(true);
        java.io.Reader reader27 = strBuilder26.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        int int34 = strBuilder29.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append('4');
        java.lang.StringBuffer stringBuffer39 = strBuilder36.toStringBuffer();
        char[] charArray40 = strBuilder36.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder26.append(charArray40);
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(reader27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "##########true4");
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "##########true4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "##########true4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[#, #, #, #, #, #, #, #, #, #, t, r, u, e, 4]");
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int3 = strBuilder1.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.insert(0, "#########");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceAll("##4##########10444444444444##4##########1049.010.0", "############4##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.appendFixedWidthPadLeft(21, 0, '1');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.append((java.lang.Object) ' ');
        java.lang.String str24 = strBuilder1.rightString((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder1.ensureCapacity(26);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceAll("##", "#");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray27 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.insert(0, charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder14.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        int int39 = strBuilder31.lastIndexOf(strMatcher38);
        int int42 = strBuilder31.lastIndexOf('#', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder1.append((java.lang.Object) int42);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append(true);
        java.lang.StringBuffer stringBuffer46 = strBuilder43.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher47 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.deleteFirst(strMatcher47);
        org.apache.commons.lang.text.StrMatcher strMatcher49 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.replaceAll(strMatcher49, "##4#########100.0#101true");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.appendFixedWidthPadLeft(22, 22, '#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "#####-1true");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        int int3 = strBuilder1.indexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append((-1.0d));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        java.lang.String str27 = strBuilder24.getNewLineText();
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
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        int int12 = strBuilder1.indexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.append("4 ########10");
        java.lang.String str15 = strBuilder1.getNullText();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
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
        int int31 = strBuilder24.indexOf("4##########101                                                                                                ");
        boolean boolean33 = strBuilder24.contains("########true4-a.0");
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
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst('a', '4');
        int int10 = strBuilder9.size();
        int int12 = strBuilder9.indexOf("\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.deleteFirst('#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
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
        int int58 = strBuilder17.size();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder17.trim();
        java.lang.String str61 = strBuilder17.leftString(12);
        int int63 = strBuilder17.indexOf('4');
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
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 25 + "'", int58 == 25);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "##4#########" + "'", str61, "##4#########");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 2 + "'", int63 == 2);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert(12, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.append((float) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder29.insert((int) (byte) 0, '1');
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int40 = strBuilder38.lastIndexOf(strMatcher39);
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.replaceAll(' ', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll(' ', '4');
        boolean boolean26 = strBuilder24.endsWith("####1025.0false");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.ensureCapacity((int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst("#4##########10false#", "#########");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.delete(21, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        java.lang.StringBuffer stringBuffer6 = strBuilder1.toStringBuffer();
        int int9 = strBuilder1.lastIndexOf("###9.0######10", 111);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(stringBuffer6);
        org.junit.Assert.assertEquals(stringBuffer6.toString(), "##########");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
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
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.insert(2, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.insert(9, (float) 9);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder37.minimizeCapacity();
        java.lang.StringBuffer stringBuffer39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append(stringBuffer39);
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst(strMatcher2, "#true410.0");
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        int int32 = strBuilder24.lastIndexOf('4', (int) (short) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.deleteFirst(strMatcher33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray51 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.insert(0, charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder38.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder38.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str61 = strBuilder59.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder59.replaceFirst(strMatcher62, "hi!");
        boolean boolean66 = strBuilder59.startsWith("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder59.insert((int) (short) 1, '4');
        boolean boolean70 = strBuilder24.equals((java.lang.Object) strBuilder59);
        java.lang.String str71 = strBuilder59.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder59.append((float) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4##########101                                                                                                " + "'", str61, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "#4#4##########101                                                                                                " + "'", str71, "#4#4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.replaceFirst("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.appendFixedWidthPadRight(12, (int) ' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder22.appendPadding(0, 'a');
        java.lang.Object obj41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.insert((int) (short) 0, obj41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.replaceFirst(strMatcher46, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.insert((int) (short) 1, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder42.insert((int) (short) 0, (float) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder42.deleteAll("##");
        java.lang.StringBuffer stringBuffer57 = strBuilder56.toStringBuffer();
        java.lang.String str59 = strBuilder56.leftString((int) 'a');
        java.lang.String str62 = strBuilder56.midString(4, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher63 = null;
        int int65 = strBuilder56.lastIndexOf(strMatcher63, 18);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder17.insert(35, (java.lang.Object) strBuilder56);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 35");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(stringBuffer57);
        org.junit.Assert.assertEquals(stringBuffer57.toString(), "-1.0#100#410");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "-1.0#100#410" + "'", str59, "-1.0#100#410");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.appendFixedWidthPadLeft(3, 9, ' ');
        boolean boolean48 = strBuilder46.startsWith("4");
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
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.replaceFirst("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.appendFixedWidthPadRight(12, (int) ' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.setLength((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.setNullText("##4#########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int3 = strBuilder1.lastIndexOf('4');
        int int4 = strBuilder1.length();
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
        java.util.Iterator iterator72 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendWithSeparators(iterator72, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder71.appendPadding((-1), 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder1.append((java.lang.Object) strBuilder77);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder78);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        java.lang.String str12 = strBuilder10.rightString((int) (short) -1);
        int int14 = strBuilder10.lastIndexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceFirst("hi!", "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceAll("hi!", "##########true");
        char[] charArray21 = strBuilder20.toCharArray();
        int int24 = strBuilder20.lastIndexOf("true410.0", 14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(charArray21);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray21), "4\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray21), "4\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray21), "[4, \n]");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) 18, (int) 'a', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder20.appendNull();
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
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
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
        int int27 = strBuilder3.length();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.replaceFirst('1', '#');
        int int32 = strBuilder3.indexOf('1');
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 25 + "'", int27 == 25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        java.lang.String str10 = strBuilder5.getNullText();
        char[] charArray11 = strBuilder5.toCharArray();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[\n]");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
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
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder20.replaceFirst('1', 'a');
        int int70 = strBuilder20.lastIndexOf("                16       ");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder20.deleteFirst("4\n1");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder72.minimizeCapacity();
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
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.minimizeCapacity();
        java.io.Reader reader12 = strBuilder11.asReader();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(reader12);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
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
        int int34 = strBuilder31.lastIndexOf(' ', (int) '4');
        char[] charArray40 = new char[] { 'a', 'a', '1', '1' };
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder31.insert((int) (short) 1, charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.replaceAll("", "");
        char[] charArray55 = strBuilder45.toCharArray();
        char[] charArray56 = strBuilder31.getChars(charArray55);
        int int57 = strBuilder31.capacity();
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), "aa11");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), "aa11");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[a, a, 1, 1]");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(charArray55);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray55), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray55), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray55), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "#aa11#4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "#aa11#4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, a, a, 1, 1, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 32 + "'", int57 == 32);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder4.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder4.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.insert(0, (long) 18);
        char[] charArray24 = strBuilder18.toCharArray((int) (short) 10, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder18.appendFixedWidthPadRight(2, (int) '1', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder18.setCharAt((int) (short) 0, '1');
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.replace(strMatcher32, "##4##########a0###########", 192, 0, 133);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##100");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 1, 0, 0]");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.ensureCapacity((int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        int int27 = strBuilder22.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strBuilder32.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder22.appendWithSeparators((java.util.Iterator) strTokenizer33, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer33, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder20.appendFixedWidthPadLeft(0, (int) (short) 10, 'a');
        char[] charArray42 = null;
        char[] charArray43 = strBuilder41.getChars(charArray42);
        boolean boolean44 = strBuilder17.equalsIgnoreCase(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "aaaaaaaaa0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "aaaaaaaaa0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[a, a, a, a, a, a, a, a, a, 0]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.insert(11, (long) 37);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("####10");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceAll('4', '1');
        java.lang.String str5 = strBuilder1.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendWithSeparators(collection8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding((int) (short) 10, '#');
        int int17 = strBuilder12.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.append((double) 2);
        boolean boolean22 = strBuilder10.equals(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.setNullText("#");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) "#", (int) (byte) 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder1.setLength(15);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceAll('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setNullText("##################################################################################");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append("####10", 10, 20);
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        char[] charArray18 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.append(charArray18);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        int int28 = strBuilder23.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        boolean boolean38 = strBuilder36.contains(strMatcher37);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.deleteFirst(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.append(25);
        java.lang.StringBuffer stringBuffer43 = strBuilder36.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder19.append(stringBuffer43, 6, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher47 = null;
        int int49 = strBuilder46.lastIndexOf(strMatcher47, 0);
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
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "##########true425");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.appendFixedWidthPadLeft(12, (int) 'a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder33.appendFixedWidthPadRight((-1), (int) (short) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder45.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray60 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder47.insert(0, charArray60);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder47.appendPadding(0, 'a');
        java.lang.Object obj66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.insert((int) (short) 0, obj66);
        org.apache.commons.lang.text.StrMatcher strMatcher68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.deleteFirst(strMatcher68);
        java.lang.String str71 = strBuilder69.leftString(32);
        boolean boolean72 = strBuilder33.equals((java.lang.Object) strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder33.trim();
        int int74 = strBuilder73.length();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
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
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "##4##########10" + "'", str71, "##4##########10");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 107 + "'", int74 == 107);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int40 = strBuilder30.indexOf(strMatcher39);
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        int int42 = strBuilder30.lastIndexOf(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer48 = strBuilder44.toStringBuffer();
        java.lang.Class<?> wildcardClass49 = stringBuffer48.getClass();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) wildcardClass49, 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strBuilder57.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.appendPadding((int) (short) 10, '#');
        java.lang.String str65 = strBuilder60.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) strBuilder60, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder57.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.append(32);
        int int75 = strBuilder72.indexOf(' ', (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder77.appendPadding((int) (short) 10, '#');
        int int82 = strBuilder77.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder77.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder84.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder86.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher91 = null;
        boolean boolean92 = strBuilder90.contains(strMatcher91);
        org.apache.commons.lang.text.StrMatcher strMatcher93 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder90.deleteFirst(strMatcher93);
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder90.deleteAll("");
        char[] charArray97 = strBuilder90.toCharArray();
        char[] charArray98 = strBuilder72.getChars(charArray97);
        org.apache.commons.lang.text.StrBuilder strBuilder99 = strBuilder30.append(charArray97);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "##########");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + (-1) + "'", int75 == (-1));
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder96);
        org.junit.Assert.assertNotNull(charArray97);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray97), "##########10032");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray97), "##########10032");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray97), "[#, #, #, #, #, #, #, #, #, #, 1, 0, 0, 3, 2]");
        org.junit.Assert.assertNotNull(charArray98);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray98), "##########10032");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray98), "##########10032");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray98), "[#, #, #, #, #, #, #, #, #, #, 1, 0, 0, 3, 2]");
        org.junit.Assert.assertNotNull(strBuilder99);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
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
        boolean boolean31 = strBuilder24.startsWith("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert((int) (short) 1, '4');
        java.lang.String str37 = strBuilder24.midString(10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder24.insert(2, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendPadding((int) (short) 10, '#');
        int int47 = strBuilder42.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder42.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.append('4');
        boolean boolean53 = strBuilder49.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.insert(2, (double) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.append((float) 1);
        java.io.Reader reader61 = strBuilder55.asReader();
        int int62 = strBuilder55.size();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder40.append((java.lang.Object) int62);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(reader61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 25 + "'", int62 == 25);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        char char41 = strBuilder30.charAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert((int) (short) 0, (double) (-1.0f));
        char char46 = strBuilder30.charAt((int) (short) 1);
        int int49 = strBuilder30.indexOf("##########true", 16);
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        int int51 = strBuilder30.lastIndexOf(strMatcher50);
        boolean boolean53 = strBuilder30.contains("###");
        int int55 = strBuilder30.lastIndexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder30.replaceAll("                16       ", "####################");
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
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '#' + "'", char41 == '#');
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '1' + "'", char46 == '1');
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 16 + "'", int55 == 16);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.append(25);
        java.lang.String str22 = strBuilder14.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        boolean boolean30 = strBuilder28.startsWith("hi!");
        boolean boolean32 = strBuilder28.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray49 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder36.insert(0, charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder28.append(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.ensureCapacity((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder14.insert((int) (byte) 10, (java.lang.Object) strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.setCharAt(10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder55.append((double) 3);
        boolean boolean61 = strBuilder60.isEmpty();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strBuilder60.asTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder60.insert((int) (byte) -1, (float) 161);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strTokenizer62);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        java.lang.String str9 = strBuilder7.rightString(10);
        int int10 = strBuilder7.size();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.setNewLineText("########10##4##########104##########101                                                                                                ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder4.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append(32);
        java.io.Reader reader20 = strBuilder17.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append((double) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.deleteAll('1');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding((int) (short) 10, '#');
        java.lang.String str30 = strBuilder29.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append((java.lang.Object) strBuilder29);
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.replace(strMatcher32, "########104444", 9, 100, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder37.reverse();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean16 = strBuilder10.contains("");
        int int18 = strBuilder10.indexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder10.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll("##4##########10", "########10100#######");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.insert((int) '1', "########10#");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 49");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
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
        int int46 = strBuilder38.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder38.append((java.lang.Object) (short) 10);
        boolean boolean50 = strBuilder7.equals((java.lang.Object) strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean55 = strBuilder52.equalsIgnoreCase(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder54.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray67 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder54.insert(0, charArray67);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean73 = strBuilder70.equalsIgnoreCase(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder72.append('4');
        boolean boolean78 = strBuilder72.contains("");
        boolean boolean79 = strBuilder68.equalsIgnoreCase(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder72.ensureCapacity((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder72.setNewLineText("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder72.setNullText("-1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder7.append(strBuilder85, 12, 18);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
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
        int int32 = strBuilder24.lastIndexOf('4', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder24.append((float) 10);
        int int36 = strBuilder24.length();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder24.replaceAll("-1", "100");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        int int32 = strBuilder24.lastIndexOf('4', (int) (short) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.deleteFirst(strMatcher33);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray51 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.insert(0, charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder38.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder38.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        java.lang.String str61 = strBuilder59.substring(2);
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder59.replaceFirst(strMatcher62, "hi!");
        boolean boolean66 = strBuilder59.startsWith("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder59.insert((int) (short) 1, '4');
        boolean boolean70 = strBuilder24.equals((java.lang.Object) strBuilder59);
        char[] charArray74 = new char[] { 't', '4', '1' };
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder59.append(charArray74);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder75.replace((int) (byte) 0, 19, "##4##########1011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111118");
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
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "4##########101                                                                                                " + "'", str61, "4##########101                                                                                                ");
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "t41");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "t41");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[t, 4, 1]");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder79);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        int int21 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder3.append(0.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteCharAt(15);
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.replace(strMatcher26, "", 0, 18, (int) (short) -1);
        int int32 = strBuilder23.length();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder23.replace(161, 0, "#4#4##########101                                                                                                ");
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 17 + "'", int32 == 17);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        java.lang.String str39 = strBuilder30.substring(9, 32);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.append(true);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilder41.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder43.appendFixedWidthPadLeft(16, (int) (byte) 1, ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = strBuilder50.substring(11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "####10" + "'", str39, "####10");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
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
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendPadding((int) (short) 10, '#');
        int int73 = strBuilder68.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder66.append(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder66.appendFixedWidthPadLeft(0, 2, '#');
        int int81 = strBuilder78.indexOf("", 16);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder78.insert(35, (int) '4');
        int int87 = strBuilder78.indexOf('4', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 16 + "'", int81 == 16);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 12 + "'", int87 == 12);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        boolean boolean23 = strBuilder20.endsWith("##4#########");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray26 = strBuilder20.toCharArray(110, 110);
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
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "##4##########10");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        char[] charArray13 = strBuilder3.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.append((float) 25);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding((int) (short) 10, '#');
        int int22 = strBuilder17.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strBuilder27.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer28, "hi!");
        char[] charArray34 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder17.append(charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder41.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean61 = strBuilder58.equalsIgnoreCase(strBuilder60);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder62.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder66.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.deleteFirst(strMatcher68);
        java.lang.Object[] objArray70 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder67.appendWithSeparators(objArray70, "####10");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder56.appendWithSeparators(objArray70, "####10");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder37.appendWithSeparators(objArray70, "##########true2.0");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder15.appendWithSeparators(objArray70, "##########true");
        java.lang.StringBuffer stringBuffer79 = strBuilder15.toStringBuffer();
        int int80 = strBuilder15.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(stringBuffer79);
        org.junit.Assert.assertEquals(stringBuffer79.toString(), "########1025.0");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 14 + "'", int80 == 14);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        char char41 = strBuilder30.charAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert((int) (short) 0, (double) (-1.0f));
        char char46 = strBuilder30.charAt((int) (short) 1);
        int int49 = strBuilder30.indexOf("##########true", 16);
        char[] charArray50 = strBuilder30.toCharArray();
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
        org.junit.Assert.assertTrue("'" + char41 + "' != '" + '#' + "'", char41 == '#');
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + char46 + "' != '" + '1' + "'", char46 == '1');
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "-1.0##4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "-1.0##4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[-, 1, ., 0, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("4##########101                                                                                                ");
        java.lang.String str21 = strBuilder20.toString();
        java.lang.String str22 = strBuilder20.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding((int) (short) 10, '#');
        int int29 = strBuilder24.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer35 = strBuilder34.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.appendWithSeparators((java.util.Iterator) strTokenizer35, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder20.appendWithSeparators((java.util.Iterator) strTokenizer35, "#4##########10false#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = strBuilder20.substring((int) '4', (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "##########true4" + "'", str21, "##########true4");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strTokenizer35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.replaceFirst('a', '4');
        int int10 = strBuilder9.size();
        int int12 = strBuilder9.indexOf("\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.append((float) 0L);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder9.appendPadding((int) ' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.minimizeCapacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (byte) 10, '#');
        java.lang.String str16 = strBuilder10.substring((int) (short) 10, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.setCharAt(5, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.insert(6, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "##" + "'", str16, "##");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.setNullText("");
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteAll(strMatcher9);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.setNewLineText("##########true4");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder17.deleteCharAt((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder17.append(false);
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) 14, (int) (short) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append('4');
        boolean boolean20 = strBuilder14.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.appendNewLine();
        java.lang.String str23 = strBuilder21.rightString((int) (short) -1);
        int int25 = strBuilder21.lastIndexOf('#');
        int int27 = strBuilder21.indexOf(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.replaceAll(strMatcher28, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.append((long) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteAll("###");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.replaceAll(strMatcher35, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) "4##########101                                                                                                ", (int) (short) 10, ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder10.insert(113, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 113");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder16.deleteAll("##4##########10##########");
        java.io.Writer writer33 = strBuilder16.asWriter();
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(writer33);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean16 = strBuilder10.contains("");
        int int18 = strBuilder10.indexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder10.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder21.reverse();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
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
        int int34 = strBuilder31.lastIndexOf(' ', (int) '4');
        java.lang.String str35 = strBuilder31.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.setCharAt((int) (byte) 0, '1');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.delete(4, 16);
        int int44 = strBuilder36.lastIndexOf("#4##");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "##4##########10" + "'", str35, "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder35.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder35.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder52.replaceAll("", "");
        boolean boolean62 = strBuilder48.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder48.setNewLineText("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder31.appendFixedWidthPadLeft((java.lang.Object) strBuilder48, (int) ' ', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder48.append((int) (short) 0);
        int int71 = strBuilder48.indexOf('4');
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        java.lang.String str16 = strBuilder12.leftString((int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.appendPadding((int) (short) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.ensureCapacity(6);
        java.io.Reader reader22 = strBuilder12.asReader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "########10" + "'", str16, "########10");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(reader22);
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder4.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append("##4##########10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.setNewLineText("4 ########10");
        java.lang.String str17 = strBuilder16.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.deleteAll("##########-1.0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder6.append(strBuilder16, 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.append((double) (byte) 1);
        boolean boolean10 = strBuilder6.endsWith("##4##########10########10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder21.appendFixedWidthPadRight(12, (int) (byte) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceFirst("#", "#");
        java.util.Collection collection61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.appendWithSeparators(collection61, "4");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.replaceAll('4', '4');
        java.util.Collection collection67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.appendWithSeparators(collection67, "0");
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
        int int35 = strBuilder32.indexOf('4', (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.insert(37, "                16       ");
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        java.lang.String str12 = strBuilder10.rightString((int) (short) -1);
        int int14 = strBuilder10.lastIndexOf('#');
        int int16 = strBuilder10.indexOf(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.replaceAll(strMatcher17, "hi!");
        int int22 = strBuilder19.lastIndexOf("#", (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder19.append("18#", (int) (short) -1, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder20.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding((int) (short) 10, '#');
        boolean boolean44 = strBuilder42.startsWith("hi!");
        boolean boolean46 = strBuilder42.contains("hi!");
        boolean boolean47 = strBuilder37.equals(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray64 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder51.insert(0, charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder51.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.appendPadding((int) (short) 10, '#');
        boolean boolean75 = strBuilder73.startsWith("hi!");
        boolean boolean77 = strBuilder73.contains("hi!");
        boolean boolean78 = strBuilder68.equals(strBuilder73);
        java.lang.StringBuffer stringBuffer79 = strBuilder73.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder37.append(stringBuffer79, 2, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder3.append(stringBuffer79, 0, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder3.deleteAll("#4##########10false#");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
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
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(stringBuffer79);
        org.junit.Assert.assertEquals(stringBuffer79.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
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
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst(strMatcher24);
        java.lang.String str26 = strBuilder23.getNullText();
        java.lang.String str29 = strBuilder23.midString(192, 192);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert(12, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.ensureCapacity(7);
        int int37 = strBuilder34.lastIndexOf("########10", 24);
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 4 + "'", int37 == 4);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append((long) (byte) 1);
        java.io.Reader reader20 = strBuilder19.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.append('4');
        boolean boolean30 = strBuilder24.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.append(true);
        boolean boolean41 = strBuilder19.equals((java.lang.Object) true);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder19.minimizeCapacity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.append("\n", 21, (int) (short) 0);
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
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        int int21 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder3.append(0.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteCharAt(15);
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.replace(strMatcher26, "", 0, 18, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.append(strBuilder33, (int) (short) 0, (int) (byte) 1);
        int int38 = strBuilder36.lastIndexOf('t');
        java.lang.StringBuffer stringBuffer39 = strBuilder36.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "##4##########10.0#");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder20.appendFixedWidthPadRight((java.lang.Object) 1.0f, (int) (byte) -1, '#');
        int int38 = strBuilder37.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.setCharAt(7, 't');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.append((float) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder47.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray71 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder58.insert(0, charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder58.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher76 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.replaceFirst(strMatcher76, "");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder75.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher83 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder75.deleteFirst(strMatcher83);
        java.lang.StringBuffer stringBuffer85 = strBuilder75.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder54.append(stringBuffer85, 9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder41.append(stringBuffer85, 8, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(stringBuffer85);
        org.junit.Assert.assertEquals(stringBuffer85.toString(), "##4##########101");
        org.junit.Assert.assertNotNull(strBuilder88);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst('a');
        java.lang.StringBuffer stringBuffer16 = strBuilder15.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.insert(0, 0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder19.appendNewLine();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(stringBuffer16);
        org.junit.Assert.assertEquals(stringBuffer16.toString(), "4\n##########");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.append((float) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray29 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.insert(0, charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder16.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceFirst(strMatcher34, "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder33.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.deleteFirst(strMatcher41);
        java.lang.StringBuffer stringBuffer43 = strBuilder33.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder12.append(stringBuffer43, 9, 0);
        org.apache.commons.lang.text.StrMatcher strMatcher47 = null;
        int int49 = strBuilder46.lastIndexOf(strMatcher47, 32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = strBuilder46.substring((int) 'a', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "##4##########101");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder16.deleteAll("##4##########10##########");
        int int33 = strBuilder16.length();
        boolean boolean35 = strBuilder16.contains("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder16.setLength((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder41.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder41.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder58.replaceAll("", "");
        boolean boolean68 = strBuilder54.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder58.replaceAll(strMatcher69, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder71.appendFixedWidthPadLeft(12, (int) 'a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder71.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder71.appendFixedWidthPadRight((-1), (int) (short) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder83.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer87 = strBuilder86.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder86.append((float) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder81.appendFixedWidthPadRight((java.lang.Object) strBuilder89, 14, '4');
        char[] charArray93 = strBuilder89.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder37.append(charArray93);
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strTokenizer87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray93), "##########10.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray93), "##########10.0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray93), "[#, #, #, #, #, #, #, #, #, #, 1, 0, ., 0]");
        org.junit.Assert.assertNotNull(strBuilder94);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder4.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.insert((int) (byte) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.appendFixedWidthPadLeft((int) (short) -1, 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.reverse();
        char[] charArray26 = strBuilder25.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.insert(14, true);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.delete(112, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "1-        001###########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "1-        001###########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[1, -,  ,  ,  ,  ,  ,  ,  ,  , 0, 0, 1, #, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendPadding((int) (short) 10, '#');
        int int37 = strBuilder32.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder32.append((float) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder32.clear();
        java.io.Reader reader43 = strBuilder32.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder26.append((java.lang.Object) reader43);
        int int47 = strBuilder26.indexOf("", 32);
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(reader43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 32 + "'", int47 == 32);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder9.lastIndexOf('#', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder9.appendFixedWidthPadLeft((int) ' ', 21, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.appendFixedWidthPadLeft((int) '#', (-1), ' ');
        java.lang.String str17 = strBuilder16.getNewLineText();
        java.io.Writer writer18 = strBuilder16.asWriter();
        char[] charArray19 = strBuilder16.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.setNewLineText("##########true2.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strBuilder21.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.replaceFirst('a', '4');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(writer18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "##########true4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "##########true4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[#, #, #, #, #, #, #, #, #, #, t, r, u, e, 4]");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strBuilder28.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer29, "###");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder23.replaceAll("#########", "###");
        int int37 = strBuilder34.lastIndexOf("##########-1.0", 17);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.appendFixedWidthPadRight(9, (int) '4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append(false);
        int int44 = strBuilder41.capacity();
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 66 + "'", int44 == 66);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strBuilder28.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer29, "###");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder23.replaceAll("#########", "###");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder23.append("####10");
        int int37 = strBuilder36.size();
        java.lang.StringBuffer stringBuffer38 = strBuilder36.toStringBuffer();
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "##4##########10");
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean15 = strBuilder14.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int40 = strBuilder30.indexOf(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append(1.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        int int46 = strBuilder43.indexOf(strMatcher44, 11);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray25 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder12.insert(0, charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder4.append(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.deleteCharAt((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        int int36 = strBuilder31.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean46 = strBuilder40.endsWith("");
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
        int int85 = strBuilder77.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder77.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.deleteFirst("                                                                                      ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.StringBuffer stringBuffer90 = strBuilder89.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder40.append(stringBuffer90);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder26.append(stringBuffer90);
        java.lang.String str95 = strBuilder26.midString((int) 'a', 66);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
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
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 2 + "'", int85 == 2);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(stringBuffer90);
        org.junit.Assert.assertEquals(stringBuffer90.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int3 = strBuilder1.lastIndexOf('4');
        int int4 = strBuilder1.size();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray23 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder10.insert(0, charArray23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.append('4');
        boolean boolean34 = strBuilder28.contains("");
        boolean boolean35 = strBuilder24.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder24.replaceAll(strMatcher36, "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int40 = strBuilder24.indexOf(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder44.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder44.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder61.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder61.replaceAll("", "");
        boolean boolean71 = strBuilder57.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder57.setNewLineText("");
        java.lang.Object[] objArray74 = new java.lang.Object[] { "" };
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder24.appendWithSeparators(objArray74, "#");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder6.appendWithSeparators(objArray74, "");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder1.appendWithSeparators(objArray74, "##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.deleteFirst("########10");
        java.io.Reader reader83 = strBuilder80.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder80.setNullText("#4##########10false#");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(reader83);
        org.junit.Assert.assertNotNull(strBuilder85);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("####10");
        java.lang.String str3 = strBuilder1.rightString((int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####10" + "'", str3, "####10");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder4.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.appendPadding((int) '4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.trim();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder10.replace(strMatcher13, "4", (int) (short) 0, 3, 18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst('t');
        boolean boolean22 = strBuilder18.startsWith("##4######9#########################");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.append("               ");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.append('a');
        int int23 = strBuilder12.lastIndexOf("########1");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder12.appendFixedWidthPadLeft((int) (short) 10, 133, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
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
        int int46 = strBuilder38.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder38.append((java.lang.Object) (short) 10);
        boolean boolean50 = strBuilder7.equals((java.lang.Object) strBuilder49);
        java.lang.String str51 = strBuilder7.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder7.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "10" + "'", str51, "10");
        org.junit.Assert.assertNotNull(strBuilder52);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.deleteFirst('a');
        int int43 = strBuilder40.indexOf(' ', 2);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        java.lang.String str12 = strBuilder10.rightString((int) (short) -1);
        int int14 = strBuilder10.lastIndexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceFirst("hi!", "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.append((float) 15);
        int int22 = strBuilder19.lastIndexOf('4', 112);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.insert(2, (double) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.append((float) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.insert(5, (double) 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilder19.asTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.append("########105", 115, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append((long) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.append(' ');
        java.lang.String str22 = strBuilder17.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder17.replaceAll("########10", "##########true2.0");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft((int) ' ', (int) (byte) 1, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.deleteFirst(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder25.replace(0, 192, "########10");
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
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
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder49.replace(strMatcher54, "", (int) (short) 0, (int) (short) 0, (int) (byte) 0);
        int int61 = strBuilder59.lastIndexOf('#');
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder59.replaceAll(strMatcher62, "##4##########101true");
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
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 12 + "'", int61 == 12);
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.ensureCapacity(2);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.insert(24, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 24");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        int int27 = strBuilder23.capacity();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 32 + "'", int27 == 32);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.appendPadding((int) (short) 10, '#');
        java.lang.String str12 = strBuilder7.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder4.appendFixedWidthPadLeft((java.lang.Object) strBuilder7, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder4.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append(32);
        java.io.Reader reader20 = strBuilder17.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.append((double) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.deleteAll('1');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding((int) (short) 10, '#');
        java.lang.String str30 = strBuilder29.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append((java.lang.Object) strBuilder29);
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.replace(strMatcher32, "########104444", 9, 100, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteCharAt(26);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 26");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(reader20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("##");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.appendPadding((int) (short) 10, '#');
        java.lang.String str43 = strBuilder38.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder45.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray60 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder47.insert(0, charArray60);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder47.appendPadding(0, 'a');
        java.lang.Object obj66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.insert((int) (short) 0, obj66);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) strBuilder67, (int) ' ', '4');
        int int75 = strBuilder67.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder67.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder67.append((java.lang.Object) (short) 10);
        boolean boolean79 = strBuilder36.equals((java.lang.Object) strBuilder78);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder28.append((java.lang.Object) strBuilder78);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder78.append((double) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder78.insert(18, false);
        boolean boolean86 = strBuilder3.equalsIgnoreCase(strBuilder85);
        org.apache.commons.lang.text.StrMatcher strMatcher87 = null;
        int int89 = strBuilder85.indexOf(strMatcher87, 3);
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
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2 + "'", int75 == 2);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.appendFixedWidthPadLeft(12, (int) 'a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder33.appendFixedWidthPadRight((-1), (int) (short) -1, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append((long) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.setCharAt((int) ' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.appendPadding(101, 't');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder43.insert(100, "########10100#######0");
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.appendFixedWidthPadLeft(100, 100, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer25 = strBuilder21.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray42 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder29.insert(0, charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder29.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer47 = strBuilder46.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder21.append(stringBuffer47);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder12.append(stringBuffer47, 0, 12);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strBuilder56.asTokenizer();
        int int58 = strBuilder56.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher59 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.deleteFirst(strMatcher59);
        java.lang.StringBuffer stringBuffer61 = strBuilder60.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder12.append(stringBuffer61);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder62.appendFixedWidthPadLeft((java.lang.Object) "1111111118", 13, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.deleteAll('1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "##########");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 32 + "'", int58 == 32);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(stringBuffer61);
        org.junit.Assert.assertEquals(stringBuffer61.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.insert(2, (float) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding((int) (short) 10, '#');
        int int18 = strBuilder13.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.appendFixedWidthPadRight((java.lang.Object) 14, (int) (short) -1, 'a');
        java.io.Reader reader23 = strBuilder13.asReader();
        int int24 = strBuilder13.size();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder9.append(strBuilder13);
        boolean boolean27 = strBuilder9.endsWith("###10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(reader23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int22 = strBuilder13.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder13.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder13.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder5.append(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        int int21 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder3.append(0.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteCharAt(15);
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder23.replace(strMatcher26, "", 0, 18, (int) (short) -1);
        int int32 = strBuilder23.length();
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        int int35 = strBuilder23.lastIndexOf(strMatcher33, 133);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 17 + "'", int32 == 17);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder35.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder35.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder52.replaceAll("", "");
        boolean boolean62 = strBuilder48.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder48.setNewLineText("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder31.appendFixedWidthPadLeft((java.lang.Object) strBuilder48, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder48.deleteFirst(strMatcher68);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.appendPadding(35, 'a');
        int int74 = strBuilder69.indexOf("###10#");
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.appendFixedWidthPadLeft((int) (short) -1, (int) (short) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.append((float) 161);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append((int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.replaceAll(strMatcher34, "\000\000\000\000\000\000\000\000\000\000");
        boolean boolean38 = strBuilder31.contains('t');
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
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.appendPadding(20, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceAll('t', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.deleteAll('a');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append("####10");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.deleteAll("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceFirst('#', '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteCharAt(19);
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
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendNull();
        java.io.Writer writer23 = strBuilder18.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        int int30 = strBuilder25.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append('4');
        boolean boolean36 = strBuilder32.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.append(10.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.insert(2, (double) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.deleteAll("4##########101                                                                                                ");
        char[] charArray46 = strBuilder43.toCharArray((int) (byte) 1, (int) (short) 10);
        char[] charArray47 = strBuilder18.getChars(charArray46);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder3.insert((int) (byte) 100, (java.lang.Object) strBuilder18);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "#0.0#####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "#0.0#####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, 0, ., 0, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[#, #, #, #, #, #, #, #, #, #]");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        java.lang.String str12 = strBuilder10.rightString((int) (short) -1);
        int int14 = strBuilder10.lastIndexOf('#');
        int int16 = strBuilder10.indexOf(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.replaceAll(strMatcher17, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder10.append((long) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteAll("###");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder23.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder29.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.appendFixedWidthPadRight(100, (int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.appendNull();
        int int52 = strBuilder46.length();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder46.appendNull();
        char[] charArray56 = strBuilder53.toCharArray(0, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder24.insert(0, charArray56, 0, 17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 20 + "'", int52 == 20);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "########10100#######");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "########10100#######");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, #, #, #, #, #, #, 1, 0, 1, 0, 0, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        boolean boolean16 = strBuilder10.endsWith("");
        java.lang.String str18 = strBuilder10.leftString(14);
        boolean boolean20 = strBuilder10.endsWith("########1");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder10.insert(14, '4');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "##########true" + "'", str18, "##########true");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.reverse();
        int int11 = strBuilder7.lastIndexOf("##4##########10##########", 0);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder7.appendFixedWidthPadRight((int) (byte) -1, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder7.deleteFirst(strMatcher16);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
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
        boolean boolean39 = strBuilder8.contains(strMatcher38);
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
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceAll("##", "#");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray27 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.insert(0, charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder14.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        int int39 = strBuilder31.lastIndexOf(strMatcher38);
        int int42 = strBuilder31.lastIndexOf('#', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder1.append((java.lang.Object) int42);
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder1.deleteFirst(strMatcher44);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.ensureCapacity(0);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder45.insert(0, (java.lang.Object) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setNullText("##########true425");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.insert(136, 115);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 136");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.setCharAt((int) (byte) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder5.append(32);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst(' ', 't');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strBuilder21.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding((int) (short) 10, '#');
        java.lang.String str29 = strBuilder24.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) strBuilder24, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder21.append((long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.insert((int) (byte) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.appendFixedWidthPadLeft((int) (short) -1, 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.reverse();
        char[] charArray43 = strBuilder42.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.insert(14, true);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.appendPadding(222, 'a');
        boolean boolean50 = strBuilder16.equals(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteAll(strMatcher52);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "1-        001###########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "1-        001###########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[1, -,  ,  ,  ,  ,  ,  ,  ,  , 0, 0, 1, #, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        org.apache.commons.lang.text.StrMatcher strMatcher94 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder93.replaceFirst(strMatcher94, "hi!");
        int int97 = strBuilder96.length();
        org.apache.commons.lang.text.StrBuilder strBuilder98 = strBuilder96.minimizeCapacity();
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
        org.junit.Assert.assertNotNull(strBuilder96);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 10 + "'", int97 == 10);
        org.junit.Assert.assertNotNull(strBuilder98);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int40 = strBuilder30.indexOf(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder30.setLength((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.deleteAll('1');
        java.lang.String str45 = strBuilder44.getNewLineText();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.setLength((int) (short) 10);
        boolean boolean16 = strBuilder5.startsWith("1111111118");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder5.insert((int) (byte) 0, (long) 113);
        int int20 = strBuilder19.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.append("01##########4##                                                                                                   4", 6, 22);
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteAll(strMatcher25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.setNewLineText("##4##########10##########");
        int int29 = strBuilder28.size();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.insert((int) (short) 1, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder23.insert((int) (short) 0, (float) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder35.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.appendFixedWidthPadRight(112, 20, '#');
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.deleteAll('a');
        boolean boolean18 = strBuilder16.contains("##########true425");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.append("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        int int36 = strBuilder31.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.appendNewLine();
        char[] charArray49 = strBuilder48.toCharArray();
        char[] charArray50 = strBuilder31.getChars(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder28.insert((int) 'a', charArray50);
        int int54 = strBuilder28.indexOf('1', 21);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder28.append("####aaaaaaaaa", 1, 10);
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\n]");
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 133 + "'", int54 == 133);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
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
        int int46 = strBuilder38.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder38.append((java.lang.Object) (short) 10);
        boolean boolean50 = strBuilder7.equals((java.lang.Object) strBuilder49);
        org.apache.commons.lang.text.StrMatcher strMatcher51 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.deleteFirst(strMatcher51);
        int int54 = strBuilder49.lastIndexOf('#');
        int int57 = strBuilder49.indexOf("#######10", (int) '1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
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
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 12 + "'", int54 == 12);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(107);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        int int11 = strBuilder10.size();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder30.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder40.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding((int) (short) 10, '#');
        int int48 = strBuilder43.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder43.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder43.append((float) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder43.deleteAll('#');
        boolean boolean55 = strBuilder40.equals((java.lang.Object) strBuilder54);
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder4.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.appendPadding((int) '4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.append((long) '#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceFirst('1', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.appendPadding((int) (short) 10, '#');
        int int51 = strBuilder46.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder46.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        boolean boolean61 = strBuilder59.contains(strMatcher60);
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.deleteFirst(strMatcher62);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.deleteFirst("4##########101                                                                                                ");
        java.lang.String str66 = strBuilder65.toString();
        java.lang.String str67 = strBuilder65.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.appendPadding((int) (short) 10, '#');
        int int74 = strBuilder69.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder76.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strBuilder79.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder69.appendWithSeparators((java.util.Iterator) strTokenizer80, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder65.appendWithSeparators((java.util.Iterator) strTokenizer80, "#4##########10false#");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder44.appendWithSeparators((java.util.Iterator) strTokenizer80, "############4##########10");
        org.apache.commons.lang.text.StrMatcher strMatcher87 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder44.deleteAll(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder88.setLength(4);
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
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "##########true4" + "'", str66, "##########true4");
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
    }
}

