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
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.appendWithSeparators(collection10, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceAll("", "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        boolean boolean23 = strBuilder21.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.replaceAll(strMatcher24, "hi!");
        int int28 = strBuilder21.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.replaceFirst("4 ########10", "4 ########10");
        boolean boolean33 = strBuilder21.startsWith("\n");
        char[] charArray34 = strBuilder21.toCharArray();
        char[] charArray35 = strBuilder12.getChars(charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding((int) (short) 10, '#');
        int int44 = strBuilder39.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder39.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        int int53 = strBuilder48.indexOf(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder48.deleteFirst("-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder59.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray72 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder59.insert(0, charArray72);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) charArray72, (int) '#', '#');
        // The following exception was thrown during execution in test generation
        try {
            strBuilder12.getChars(97, 100, charArray72, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[]");
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[\n]");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setNewLineText("                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.append((long) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        int int7 = strBuilder5.lastIndexOf(' ');
        boolean boolean9 = strBuilder5.contains("##########44444444444444444##4##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.setLength(13);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        int int33 = strBuilder28.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder28.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.trim();
        java.io.Writer writer39 = strBuilder38.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        boolean boolean41 = strBuilder38.contains(strMatcher40);
        boolean boolean42 = strBuilder26.equals(strBuilder38);
        java.lang.String str43 = strBuilder26.getNewLineText();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = strBuilder26.substring(133);
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(writer39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteFirst("##########true");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.insert(8, '0');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 8");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.appendNewLine();
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strBuilder1.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.clear();
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder17.indexOf('a', (int) (byte) 1);
        int int22 = strBuilder17.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding((int) (short) 10, '#');
        java.lang.String str29 = strBuilder24.leftString(0);
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
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) strBuilder53, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        int int62 = strBuilder53.indexOf(strMatcher60, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder17.append(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder17.ensureCapacity(100);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.replaceFirst("", "########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
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
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder57.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder30.append(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.append((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.ensureCapacity(30);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder65.append((long) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder69.append((long) 6);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder71);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.deleteAll(strMatcher3);
        int int7 = strBuilder1.indexOf('4', (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.deleteAll("1########");
        int int12 = strBuilder9.lastIndexOf("##########44444444444444444##4##########10", 28);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.replaceFirst(' ', ' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendWithSeparators(objArray18, "                                                                                                   0");
        java.lang.StringBuffer stringBuffer21 = strBuilder20.toStringBuffer();
        int int23 = strBuilder20.indexOf("c7");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.append((double) 22);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(stringBuffer21);
        org.junit.Assert.assertEquals(stringBuffer21.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.append((float) (byte) 10);
        int int10 = strBuilder4.lastIndexOf("-1.0", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.deleteFirst("##4##########");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder16.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.replaceFirst("", "hi!");
        boolean boolean37 = strBuilder25.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.append("\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.append('4');
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder43.replaceFirst(strMatcher48, "4 ########10");
        java.lang.StringBuffer stringBuffer51 = strBuilder50.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder39.append(stringBuffer51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder12.append(stringBuffer51);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "4");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        int int11 = strBuilder8.indexOf('#', 12);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteFirst("##");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.append('a');
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        boolean boolean19 = strBuilder17.contains(strMatcher18);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        char[] charArray7 = strBuilder1.toCharArray();
        int int10 = strBuilder1.lastIndexOf("-1.0", (int) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.deleteFirst(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((long) 17);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("########10##4##########104##########101                                                             ");
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) strBuilder51, (int) (short) -1, '0');
        java.lang.String str59 = strBuilder16.leftString((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder16.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.replaceFirst(strMatcher61, "0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder66 = null; // flaky: strBuilder14.appendFixedWidthPadRight((java.lang.Object) strBuilder63, (int) (short) 1, '#');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "########10" + "'", str59, "########10");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.append((float) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.ensureCapacity((int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append(0L);
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder9.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.deleteFirst('0');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strTokenizer12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
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
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.appendWithSeparators(objArray45, "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder51.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.deleteFirst(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder47.append((java.lang.Object) strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean68 = strBuilder65.equalsIgnoreCase(strBuilder67);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder67.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray80 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder67.insert(0, charArray80);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder67.appendPadding(0, 'a');
        java.lang.Object obj86 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder84.insert((int) (short) 0, obj86);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder89.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher94 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder89.replaceAll(strMatcher94, "4 ########10");
        boolean boolean97 = strBuilder63.equals((java.lang.Object) strBuilder89);
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
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(charArray80);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray80), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray80), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray80), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strBuilder96);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteFirst("##########true");
        java.lang.String str7 = strBuilder6.toString();
        int int9 = strBuilder6.indexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.replaceAll('a', '0');
        java.lang.String str13 = strBuilder6.getNullText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        int int17 = strBuilder10.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.append("35############################");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append((float) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendWithSeparators(collection29, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendNewLine();
        java.util.Collection collection37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.appendWithSeparators(collection37, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceAll("", "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        boolean boolean50 = strBuilder48.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher51 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder48.replaceAll(strMatcher51, "hi!");
        int int55 = strBuilder48.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder48.replaceFirst("4 ########10", "4 ########10");
        boolean boolean60 = strBuilder48.startsWith("\n");
        char[] charArray61 = strBuilder48.toCharArray();
        char[] charArray62 = strBuilder39.getChars(charArray61);
        boolean boolean63 = strBuilder24.equalsIgnoreCase(strBuilder39);
        boolean boolean64 = strBuilder10.equals(strBuilder39);
        int int66 = strBuilder10.lastIndexOf("##");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[]");
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[\n]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 28 + "'", int66 == 28);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.append((float) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((java.lang.Object) 14);
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.appendWithSeparators(collection10, "##########true4");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteAll("#############");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int16 = strBuilder14.indexOf(strMatcher15);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.replaceAll("##4#########10", "4");
        java.lang.String str24 = strBuilder18.midString(12, 25);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "ue4" + "'", str24, "ue4");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.replace(strMatcher15, "##", (int) (byte) 0, 32, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.deleteFirst('#');
        int int24 = strBuilder22.lastIndexOf("35############################");
        int int27 = strBuilder22.lastIndexOf("17", (int) '#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder20.replaceAll(strMatcher28, "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.append("#######10");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.ensureCapacity(100);
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
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
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder23.trim();
        int int26 = strBuilder23.indexOf("");
        boolean boolean28 = strBuilder23.startsWith("1###########100");
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
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append((long) 22);
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        int int11 = strBuilder5.lastIndexOf("4 ########10", 1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.insert((int) (byte) 1, (int) (short) 1);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int17 = strBuilder5.lastIndexOf(strMatcher15, 14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        int int8 = strBuilder4.size();
        boolean boolean10 = strBuilder4.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.replaceAll('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendFixedWidthPadLeft(2, 1, ' ');
        java.lang.String str19 = strBuilder17.leftString(8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = strBuilder17.substring(9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "2" + "'", str19, "2");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.setNewLineText("");
        java.lang.String str41 = strBuilder34.leftString(32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.insert(17, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 17");
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendPadding((int) (short) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.minimizeCapacity();
        char[] charArray48 = strBuilder47.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder47.append("                                                                                         0", (int) (byte) 10, 15);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray55 = strBuilder47.toCharArray(13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, #, #, #, #, #, #, #, #, #, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a]");
        org.junit.Assert.assertNotNull(strBuilder52);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        int int36 = strBuilder24.indexOf("                                                                                                   0");
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder24.lastIndexOf(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder24.insert((int) (byte) 100, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append((float) 20);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.insert(20, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher47 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.deleteFirst(strMatcher47);
        int int50 = strBuilder46.indexOf("##4##########1010");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        int int36 = strBuilder24.indexOf("                                                                                                   0");
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder24.lastIndexOf(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder24.insert((int) (byte) 100, (int) (short) 0);
        int int43 = strBuilder41.lastIndexOf("##4#########4#####10##########");
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append((float) 11);
        org.apache.commons.lang.text.StrTokenizer strTokenizer11 = strBuilder8.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.appendNewLine();
        java.lang.String str17 = strBuilder13.substring(36, (int) '0');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strTokenizer11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "444444444444" + "'", str17, "444444444444");
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
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder24.insert(0, (java.lang.Object) strBuilder33);
        int int36 = strBuilder24.indexOf("                                                                                                   0");
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder24.lastIndexOf(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder24.insert((int) (byte) 100, (int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.append((float) 20);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.insert(20, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.ensureCapacity(100);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.append((long) (byte) 1);
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
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = strBuilder23.substring(36, 30);
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
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll(strMatcher2);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) "#", (int) (short) 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.setLength(9);
        java.lang.Class<?> wildcardClass10 = strBuilder7.getClass();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.append((float) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.appendNull();
        int int15 = strBuilder13.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendWithSeparators(collection18, "");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendNewLine();
        java.util.Collection collection26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendWithSeparators(collection26, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceAll("", "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        boolean boolean39 = strBuilder37.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.replaceAll(strMatcher40, "hi!");
        int int44 = strBuilder37.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder37.replaceFirst("4 ########10", "4 ########10");
        boolean boolean49 = strBuilder37.startsWith("\n");
        char[] charArray50 = strBuilder37.toCharArray();
        char[] charArray51 = strBuilder28.getChars(charArray50);
        char[] charArray52 = strBuilder13.getChars(charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder7.append(charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceAll(' ', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.replaceAll(strMatcher57, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean65 = strBuilder62.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.append((int) (byte) 10);
        char[] charArray69 = strBuilder66.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder53.insert((int) (byte) 0, charArray69);
        java.lang.String str72 = strBuilder70.rightString(5);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[]");
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[\n]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "10.0\n" + "'", str72, "10.0\n");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.insert(12, (long) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.replace(8, 9, "t              rue410.0");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.trim();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray62 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder49.insert(0, charArray62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder49.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.replaceFirst(strMatcher67, "");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder66.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.insert(0, (long) 16);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder45.append(strBuilder75);
        java.io.Reader reader80 = strBuilder45.asReader();
        java.io.Writer writer81 = strBuilder45.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher82 = null;
        int int84 = strBuilder45.indexOf(strMatcher82, 0);
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
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(reader80);
        org.junit.Assert.assertNotNull(writer81);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + (-1) + "'", int84 == (-1));
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll("##########true4", "                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.ensureCapacity(16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        int int23 = strBuilder18.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.append((double) 2);
        java.lang.String str28 = strBuilder27.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        int int35 = strBuilder30.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.setNullText("");
        java.lang.String str39 = strBuilder37.substring((int) (short) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder37.append((java.lang.Object) strBuilder63);
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder37.replaceAll(strMatcher67, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder69.replace((int) (short) 0, 2, "hi!");
        java.lang.Object[] objArray74 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder69.appendWithSeparators(objArray74, "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean81 = strBuilder78.equalsIgnoreCase(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder80.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder80.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher90 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder89.deleteFirst(strMatcher90);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder76.append((java.lang.Object) strMatcher90);
        boolean boolean94 = strBuilder92.contains("4 ########10");
        char[] charArray95 = strBuilder92.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder27.append(charArray95);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder13.insert(97, charArray95);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "##########true2.0" + "'", str28, "##########true2.0");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
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
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray74), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray74), "[]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(charArray95);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray95), "hi!########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray95), "hi!########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray95), "[h, i, !, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder30.append(true);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        int int22 = strBuilder15.indexOf('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder14.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.append((double) 52);
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
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer23 = strBuilder19.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.append(stringBuffer23);
        boolean boolean26 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int32 = strBuilder3.lastIndexOf(strMatcher31);
        java.util.Collection collection33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder3.appendWithSeparators(collection33, "");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.append('4');
        boolean boolean46 = strBuilder40.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder50.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder50.appendFixedWidthPadRight((int) '#', 30, '#');
        int int62 = strBuilder59.lastIndexOf("\n", 14);
        boolean boolean64 = strBuilder59.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder59.deleteFirst('0');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder35.insert(25, (java.lang.Object) '0');
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 13 + "'", int62 == 13);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder67);
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder16.reverse();
        java.lang.String str34 = strBuilder32.substring(1);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.replaceFirst("########10########10", "");
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "1########" + "'", str34, "1########");
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        int int11 = strBuilder8.indexOf(' ', (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.setLength(52);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) ' ', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        boolean boolean6 = strBuilder1.contains(strMatcher5);
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        int int8 = strBuilder1.lastIndexOf(strMatcher7);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst(strMatcher8, "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll("##4#########10", "\n\nfalse-1                                                                                                  112.0##########");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst("\n\nfalse-1                                                                                                  112.0##########", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendPadding(11, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        int int22 = strBuilder13.lastIndexOf(strMatcher20, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder13.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append("##4##########");
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder25.replace(strMatcher28, "", (int) (byte) 0, 97, 5);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) 5, (int) (short) -1, '\n');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("t              rue410.0");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int14 = strBuilder5.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder5.deleteAll("");
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
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray51 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder38.insert(0, charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer58 = strBuilder54.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder38.append(stringBuffer58);
        boolean boolean61 = strBuilder38.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder38.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        java.lang.Object[] objArray66 = new java.lang.Object[] { strBuilder20, strBuilder38 };
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder16.appendWithSeparators(objArray66, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder1.appendWithSeparators(objArray66, "354444444440");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
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
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(stringBuffer58);
        org.junit.Assert.assertEquals(stringBuffer58.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[##4##########10, ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("########10##4##########104##########101                                                             ");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.appendPadding((int) (short) 10, '#');
        int int8 = strBuilder3.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.setNullText("");
        java.lang.String str12 = strBuilder10.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray29 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.insert(0, charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder16.appendPadding(0, 'a');
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.insert((int) (short) 0, obj35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder10.append((java.lang.Object) strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder36, (int) (short) -1, '0');
        java.lang.String str44 = strBuilder1.leftString((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder1.replaceAll('4', '#');
        java.io.Writer writer49 = strBuilder48.asWriter();
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "########10" + "'", str44, "########10");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(writer49);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert(10, "##########true4");
        boolean boolean42 = strBuilder40.startsWith("                                                                                                   0");
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        int int45 = strBuilder40.lastIndexOf(strMatcher43, 8);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.append(24);
        int int49 = strBuilder47.indexOf("10##4##########10##########");
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.insert((int) (short) 10, 0.0d);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.appendPadding((int) (short) 10, '#');
        int int46 = strBuilder41.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder41.setNullText("");
        java.lang.String str50 = strBuilder48.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean55 = strBuilder52.equalsIgnoreCase(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder54.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray67 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder54.insert(0, charArray67);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder54.appendPadding(0, 'a');
        java.lang.Object obj73 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.insert((int) (short) 0, obj73);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder48.append((java.lang.Object) strBuilder74);
        org.apache.commons.lang.text.StrMatcher strMatcher78 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder48.replaceAll(strMatcher78, "4##########101                                                                                                ");
        int int83 = strBuilder80.lastIndexOf(' ', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder80.replaceFirst('#', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder36.appendFixedWidthPadRight((java.lang.Object) 'a', 16, '4');
        java.io.Reader reader90 = strBuilder36.asReader();
        java.io.Writer writer91 = strBuilder36.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher92 = null;
        int int93 = strBuilder36.lastIndexOf(strMatcher92);
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(reader90);
        org.junit.Assert.assertNotNull(writer91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert(10, "##########true4");
        boolean boolean42 = strBuilder40.startsWith("                                                                                                   0");
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        int int45 = strBuilder40.lastIndexOf(strMatcher43, 8);
        int int48 = strBuilder40.indexOf("hi!", (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray65 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder52.insert(0, charArray65);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder52.appendPadding(0, 'a');
        java.lang.Object obj71 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.insert((int) (short) 0, obj71);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder74.appendFixedWidthPadLeft(0, (int) (short) 100, ' ');
        java.lang.String str79 = strBuilder78.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder78.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder40.append((java.lang.Object) strBuilder80);
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNull(str79);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.replace(strMatcher15, "##", (int) (byte) 0, 32, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder8.setNewLineText("##########true4");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append((int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.appendPadding(11, 'a');
        boolean boolean32 = strBuilder25.contains('#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.append('4');
        boolean boolean42 = strBuilder36.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder36.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder46.appendNewLine();
        char[] charArray52 = strBuilder46.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder25.append(charArray52);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "4\n##########0\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "4\n##########0\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[4, \n, #, #, #, #, #, #, #, #, #, #, 0, \n]");
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        int int35 = strBuilder30.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.setNullText("");
        java.lang.String str39 = strBuilder37.substring((int) (short) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder37.append((java.lang.Object) strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.append('a');
        java.util.Collection collection71 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder68.appendWithSeparators(collection71, "##########true4");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder24.insert(44, (java.lang.Object) strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder24.appendPadding(25, '4');
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
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
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.deleteFirst(strMatcher31);
        java.lang.StringBuffer stringBuffer33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.append(stringBuffer33);
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
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
        int int23 = strBuilder3.lastIndexOf(strMatcher21, (-1));
        boolean boolean25 = strBuilder3.endsWith("");
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder3.replaceFirst(strMatcher26, "4");
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
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        int int17 = strBuilder3.lastIndexOf("", (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding((int) (short) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        java.lang.String str27 = strBuilder26.getNewLineText();
        java.io.Writer writer28 = strBuilder26.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.insert((int) (short) 0, (java.lang.Object) writer28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder20.append((float) (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(writer28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
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
        java.util.Collection collection35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendWithSeparators(collection35, "");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder41.replaceAll("", "");
        int int52 = strBuilder50.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder37.appendFixedWidthPadLeft((java.lang.Object) strBuilder50, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.append((java.lang.Object) (byte) -1);
        boolean boolean58 = strBuilder56.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.insert(0, 0.0d);
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        boolean boolean63 = strBuilder56.contains(strMatcher62);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.appendPadding((int) (short) 10, '#');
        int int70 = strBuilder65.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder65.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean77 = strBuilder74.equalsIgnoreCase(strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder76.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder76.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher86 = null;
        int int87 = strBuilder85.lastIndexOf(strMatcher86);
        boolean boolean88 = strBuilder72.equalsIgnoreCase(strBuilder85);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder85.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder89.setLength(12);
        java.io.Reader reader92 = strBuilder89.asReader();
        org.apache.commons.lang.text.StrTokenizer strTokenizer93 = strBuilder89.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder56.appendWithSeparators((java.util.Iterator) strTokenizer93, "4 ########10");
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + (-1) + "'", int70 == (-1));
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(reader92);
        org.junit.Assert.assertNotNull(strTokenizer93);
        org.junit.Assert.assertNotNull(strBuilder95);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int15 = strBuilder3.lastIndexOf(' ', (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder16.trim();
        java.util.Collection collection18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder16.appendWithSeparators(collection18, "###4##");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append((double) 4);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        java.io.Writer writer30 = strBuilder25.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendPadding((int) (short) 10, '#');
        int int38 = strBuilder33.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder33.setNullText("");
        java.lang.String str42 = strBuilder40.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray59 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder46.insert(0, charArray59);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder46.appendPadding(0, 'a');
        java.lang.Object obj65 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.insert((int) (short) 0, obj65);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder40.append((java.lang.Object) strBuilder66);
        org.apache.commons.lang.text.StrMatcher strMatcher70 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder40.replaceAll(strMatcher70, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder72.replace((int) (short) 0, 2, "hi!");
        java.lang.Object[] objArray77 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder72.appendWithSeparators(objArray77, "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder72.appendFixedWidthPadLeft(11, (int) (byte) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder25.insert(15, (java.lang.Object) ' ');
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
        org.junit.Assert.assertNotNull(writer30);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(objArray77);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray77), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray77), "[]");
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.replace(strMatcher15, "##", (int) (byte) 0, 32, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.deleteFirst('#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder8.setNewLineText("##########true4");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append((int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadRight(1, 0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder31.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.append(277);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.append((double) 32);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder37.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append((int) (short) 1);
        int int57 = strBuilder54.lastIndexOf(' ', (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean67 = strBuilder64.equalsIgnoreCase(strBuilder66);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder66.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray79 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder66.insert(0, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder59.append(charArray79);
        org.apache.commons.lang.text.StrMatcher strMatcher82 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder81.replaceFirst(strMatcher82, "hi!");
        char[] charArray85 = strBuilder81.toCharArray();
        char[] charArray86 = strBuilder54.getChars(charArray85);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder3.insert((int) (byte) -1, charArray85);
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
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "########101");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "########101");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #, #, #, #, #, #, #, 1, 0, 1]");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append(false);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = strBuilder11.toCharArray(20, 112);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
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
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceAll("##4#######", "1########");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.minimizeCapacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(2);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.appendPadding((int) (short) 10, '#');
        int int8 = strBuilder3.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.trim();
        java.io.Writer writer14 = strBuilder13.asWriter();
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendWithSeparators(collection15, "########10");
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder13.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer18, "                                                                                         0");
        java.lang.Object obj21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.append(obj21);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(writer14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
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
        java.lang.String str39 = strBuilder30.getNewLineText();
        char[] charArray42 = strBuilder30.toCharArray(13, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder30.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder30.insert(4, (double) (-1));
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
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder29.insert(20, (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder29.deleteFirst('0');
        int int68 = strBuilder65.indexOf("##4##########1010", (int) '#');
        char[] charArray69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder65.append(charArray69);
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
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertNotNull(strBuilder70);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst('a');
        java.lang.String str13 = strBuilder11.leftString(11);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray30 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(0, charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder17.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.replaceFirst(' ', 'a');
        boolean boolean41 = strBuilder11.equalsIgnoreCase(strBuilder40);
        java.lang.String str44 = strBuilder11.midString(63, (int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "########10" + "'", str13, "########10");
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
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        java.lang.StringBuffer stringBuffer5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.append(stringBuffer5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder6.trim();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder5.appendFixedWidthPadRight(112, 0, ' ');
        boolean boolean17 = strBuilder16.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.append("########44444444444444444##4##########10", 32, (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
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
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.appendNull();
        int int65 = strBuilder63.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder17.appendFixedWidthPadRight((java.lang.Object) ' ', 8, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        int int71 = strBuilder68.lastIndexOf(strMatcher69, 2);
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
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray48 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder35.insert(0, charArray48);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer55 = strBuilder51.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder35.append(stringBuffer55);
        java.lang.StringBuffer stringBuffer57 = strBuilder56.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder20.append(stringBuffer57);
        int int59 = strBuilder58.length();
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
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(stringBuffer57);
        org.junit.Assert.assertEquals(stringBuffer57.toString(), "##4##########10##########");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 51 + "'", int59 == 51);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteFirst("##########true");
        java.io.Writer writer7 = strBuilder6.asWriter();
        int int9 = strBuilder6.lastIndexOf('0');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(writer7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        boolean boolean14 = strBuilder9.contains('a');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder18.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst(strMatcher36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.insert((int) (byte) 10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder9.append(strBuilder42);
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.replaceFirst(strMatcher44, "###101");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean51 = strBuilder48.equalsIgnoreCase(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder50.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        int int58 = strBuilder56.indexOf(strMatcher57);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder46.appendFixedWidthPadRight((java.lang.Object) strBuilder56, (int) (byte) -1, '0');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int19 = strBuilder3.indexOf('4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append((float) 11);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append((-1.0d));
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNewLineText("");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) -1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendNull();
        boolean boolean30 = strBuilder23.equals(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.deleteAll('4');
        boolean boolean34 = strBuilder29.contains('a');
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder29.replaceAll(strMatcher35, "########10########10");
        int int39 = strBuilder29.indexOf("###101");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        int int41 = strBuilder29.lastIndexOf(strMatcher40);
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        int int44 = strBuilder29.lastIndexOf(strMatcher42, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder29.reverse();
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert(10, "##########true4");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.appendPadding((int) '4', 'a');
        int int45 = strBuilder43.indexOf("##4#####1.0#####10");
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
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.append('4');
        boolean boolean17 = strBuilder11.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder11.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder11.replaceFirst("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder11.deleteAll("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.append((double) (-1));
        char[] charArray26 = strBuilder11.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder4.appendFixedWidthPadRight((java.lang.Object) strBuilder11, (int) (short) 100, 'a');
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean65 = strBuilder62.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder64.append('4');
        boolean boolean70 = strBuilder64.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder64.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder71.setNewLineText("4 ########10");
        char[] charArray79 = strBuilder76.toCharArray((int) (short) 1, 44);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder60.append(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder29.append(charArray79, (int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "4\n-1.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "4\n-1.0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[4, \n, -, 1, ., 0]");
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
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "\n##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "\n##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[\n, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
        // The following exception was thrown during execution in test generation
        try {
            char char44 = strBuilder20.charAt(14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 14");
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
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.append((float) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((java.lang.Object) 14);
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.appendWithSeparators(collection10, "##########true4");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteAll("#############");
        boolean boolean16 = strBuilder12.endsWith("##4#######16###104\n");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.appendPadding(5, '4');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.insert(0, (double) 51);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
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
        int int40 = strBuilder36.lastIndexOf("\n");
        java.lang.String str41 = strBuilder36.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder36.insert(36, (double) 1);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "##########44444444444444444##4##########10" + "'", str41, "##########44444444444444444##4##########10");
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
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
        java.lang.String str30 = strBuilder29.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.append('a');
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
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        int int16 = strBuilder12.indexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder12.delete(0, 12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.insert(52, (long) 44);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.setNewLineText("########10########10");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.deleteAll("\n");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.append((java.lang.Object) "\n");
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        int int42 = strBuilder35.lastIndexOf(strMatcher41);
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendPadding(11, '\n');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder29.clear();
        java.util.Collection collection31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.appendWithSeparators(collection31, "##4#####1.0#####10");
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        int int6 = strBuilder4.indexOf("##4##########10");
        int int9 = strBuilder4.indexOf("########10##4##########104##########101                                                             ", 15);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
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
        java.lang.String str69 = strBuilder14.midString(0, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder14.insert(16, (long) 12);
        java.util.Collection collection73 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.appendWithSeparators(collection73, "###############");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder72.append(false);
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "########10##4##########104##########101                                                             " + "'", str69, "########10##4##########104##########101                                                             ");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
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
        int int39 = strBuilder36.indexOf("########10", 1);
        int int42 = strBuilder36.indexOf("                                                                                                   0", (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.insert((int) (short) 100, 27);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
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
        boolean boolean42 = strBuilder40.endsWith("##4##########");
        java.lang.String str44 = strBuilder40.leftString(44);
        java.io.Writer writer45 = strBuilder40.asWriter();
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
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "##########" + "'", str44, "##########");
        org.junit.Assert.assertNotNull(writer45);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        int int8 = strBuilder4.size();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.append((long) 44);
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.reverse();
        int int14 = strBuilder10.indexOf('#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.replaceFirst(' ', ' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendWithSeparators(objArray18, "                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.ensureCapacity((int) ' ');
        int int25 = strBuilder20.indexOf("10", (int) '0');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder20.replaceAll("\n##4##########1", "##########10.00");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        int int6 = strBuilder4.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        int int13 = strBuilder8.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.append(true);
        boolean boolean16 = strBuilder4.equals(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder4.append(0);
        boolean boolean20 = strBuilder18.startsWith("##########true4");
        int int22 = strBuilder18.lastIndexOf("");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (short) 10, '#');
        int int19 = strBuilder14.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strBuilder24.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder14.appendWithSeparators((java.util.Iterator) strTokenizer25, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer25, "hi!");
        int int32 = strBuilder29.indexOf('1', 110);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray58 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder45.insert(0, charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer65 = strBuilder61.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder45.append(stringBuffer65);
        boolean boolean68 = strBuilder45.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder45.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher73 = null;
        int int74 = strBuilder45.lastIndexOf(strMatcher73);
        java.util.Collection collection75 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder45.appendWithSeparators(collection75, "");
        boolean boolean79 = strBuilder45.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) strBuilder45, 20, ' ');
        int int85 = strBuilder30.indexOf('0', 100);
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
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(stringBuffer65);
        org.junit.Assert.assertEquals(stringBuffer65.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.append((float) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.ensureCapacity((int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.insert(5, (int) '0');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendWithSeparators(collection15, "");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendNewLine();
        java.util.Collection collection23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.appendWithSeparators(collection23, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray42 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder29.insert(0, charArray42);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder29.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder25.append(strBuilder46, (int) (short) 0, 14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder7.append(strBuilder49, 12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
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
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.replaceFirst(' ', '#');
        int int11 = strBuilder1.lastIndexOf("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendWithSeparators(collection14, "");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder16.deleteFirst(' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer22 = strBuilder16.asTokenizer();
        java.lang.Object obj23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.append(obj23);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder24, 63, '0');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strTokenizer22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
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
        java.lang.String str19 = strBuilder17.leftString(0);
        boolean boolean20 = strBuilder17.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteAll(strMatcher8);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.insert((-1), 112);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.appendFixedWidthPadRight((int) (byte) -1, (int) (byte) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((float) 112);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer24 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.append(stringBuffer24);
        java.lang.String str27 = strBuilder25.leftString(13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n\nfalse-1    " + "'", str27, "\n\nfalse-1    ");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        int int11 = strBuilder9.indexOf("4 ########10");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.replaceAll(strMatcher12, "########10##4##########104##########101                                                             ");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.append(true);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
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
        java.lang.Object obj22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert((int) (short) 0, obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.replaceFirst(strMatcher27, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendWithSeparators(collection32, "");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder38.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder29.appendFixedWidthPadRight((java.lang.Object) strBuilder38, 14, 'a');
        java.lang.String str44 = strBuilder29.getNullText();
        java.lang.String str45 = strBuilder29.getNewLineText();
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        int int8 = strBuilder4.size();
        boolean boolean10 = strBuilder4.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.replaceAll('#', ' ');
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
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.insert((int) (byte) 10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.deleteAll(' ');
        boolean boolean49 = strBuilder38.equals((java.lang.Object) strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder4.appendFixedWidthPadRight((java.lang.Object) strBuilder38, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append("##4##########10false11");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
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
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        int int11 = strBuilder8.indexOf('#', 12);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteFirst("##");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.append("\n\n", 0, 17);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        int int11 = strBuilder5.lastIndexOf("4 ########10", 1);
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
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.deleteAll(strMatcher41);
        org.apache.commons.lang.text.StrTokenizer strTokenizer43 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder5.appendWithSeparators((java.util.Iterator) strTokenizer43, "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (short) 10, '#');
        java.lang.String str51 = strBuilder50.getNewLineText();
        boolean boolean53 = strBuilder50.startsWith("c7");
        boolean boolean54 = strBuilder5.equals((java.lang.Object) boolean53);
        java.lang.StringBuffer stringBuffer55 = strBuilder5.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strTokenizer43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "10-1.0");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.appendFixedWidthPadRight((int) (byte) -1, (int) (byte) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding((int) (short) 10, '#');
        boolean boolean23 = strBuilder21.startsWith("hi!");
        boolean boolean25 = strBuilder21.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder21.appendPadding(1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder12.append(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.replaceFirst(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.append((double) ' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("##4##########");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.append('4');
        boolean boolean11 = strBuilder5.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.setNewLineText("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceAll("                                                                                                   0", "                                                                                                   0");
        int int22 = strBuilder20.lastIndexOf("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.append(259);
        java.io.Writer writer25 = strBuilder24.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder1.append((java.lang.Object) writer25);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(writer25);
        org.junit.Assert.assertNotNull(strBuilder26);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.setNewLineText("");
        int int42 = strBuilder39.indexOf("##########true", (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) strBuilder44, 2, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder39.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray66 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder53.insert(0, charArray66);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder53.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher71 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.replaceFirst(strMatcher71, "");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder73.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder74.insert((int) (byte) 10, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher78 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder74.deleteAll(strMatcher78);
        boolean boolean80 = strBuilder39.equalsIgnoreCase(strBuilder74);
        boolean boolean82 = strBuilder74.startsWith("##########true4##########10.0");
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
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
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
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
        java.lang.String str19 = strBuilder17.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        int int26 = strBuilder21.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strBuilder31.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer32, "hi!");
        char[] charArray38 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder21.append(charArray38);
        int int40 = strBuilder39.capacity();
        boolean boolean41 = strBuilder17.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder17.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray59 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder46.insert(0, charArray59);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder46.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder46.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        boolean boolean68 = strBuilder17.equalsIgnoreCase(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.deleteAll(strMatcher28);
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        boolean boolean31 = strBuilder20.contains(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.append((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder20.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder20.replaceAll(strMatcher37, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.delete((int) (byte) 0, 27);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        char[] charArray18 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.append(charArray18);
        int int20 = strBuilder19.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.deleteFirst(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.insert(13, (double) 100L);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.insert((int) (short) 1, '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer29 = strBuilder22.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder39.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.deleteFirst(strMatcher41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder48.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder40.append(strBuilder52, (int) (short) 0, 0);
        int int58 = strBuilder52.lastIndexOf('a', 44);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder22.append((java.lang.Object) 'a');
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strTokenizer29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.replaceFirst(' ', ' ');
        java.lang.Object[] objArray18 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendWithSeparators(objArray18, "                                                                                                   0");
        int int22 = strBuilder20.indexOf(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int25 = strBuilder20.lastIndexOf(strMatcher23, 20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        int int6 = strBuilder1.lastIndexOf(strMatcher4, (int) '4');
        java.lang.String str7 = strBuilder1.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.replaceAll(strMatcher8, "########10");
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
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder41.reverse();
        boolean boolean49 = strBuilder41.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder41.insert(12, (long) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceAll('\n', '\n');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder10.append(strBuilder52, (int) (short) 0, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strBuilder10);
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
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        java.lang.StringBuffer stringBuffer13 = strBuilder12.toStringBuffer();
        java.lang.StringBuffer stringBuffer14 = strBuilder12.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "########10");
        org.junit.Assert.assertNotNull(stringBuffer14);
        org.junit.Assert.assertEquals(stringBuffer14.toString(), "########10");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
        java.lang.StringBuffer stringBuffer31 = strBuilder26.toStringBuffer();
        java.lang.String str32 = strBuilder26.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.ensureCapacity(11);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int37 = strBuilder34.indexOf(strMatcher35, (int) (byte) -1);
        boolean boolean38 = strBuilder34.isEmpty();
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
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "##4##########10");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##4##########10" + "'", str32, "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
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
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.append("                                                                                                   0", 14, 10);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst('4');
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        int int6 = strBuilder4.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.appendNull();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertNotNull(strBuilder7);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.replaceFirst(' ', '#');
        int int11 = strBuilder1.lastIndexOf("4##########101                                                                                                ");
        int int12 = strBuilder1.capacity();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.append('4');
        boolean boolean33 = strBuilder27.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.appendNewLine();
        java.lang.String str37 = strBuilder27.substring((int) (byte) 1, 2);
        boolean boolean38 = strBuilder20.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder20.deleteAll(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('4', ' ');
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n" + "'", str37, "\n");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.replaceAll(strMatcher6, "                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll('4');
        java.io.Reader reader11 = strBuilder5.asReader();
        boolean boolean13 = strBuilder5.startsWith("17");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        boolean boolean6 = strBuilder4.startsWith("hi!");
        boolean boolean8 = strBuilder4.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.appendPadding(1, 'a');
        int int13 = strBuilder4.length();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder4.replaceFirst(strMatcher14, "\n\nfalse##4#######4###10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder8.deleteFirst(strMatcher43);
        java.lang.Class<?> wildcardClass45 = strBuilder44.getClass();
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
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.clear();
        int int30 = strBuilder20.lastIndexOf(' ', (int) (byte) 0);
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
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder39.append(10.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher74 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder39.deleteFirst(strMatcher74);
        java.lang.String str76 = strBuilder39.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder39.deleteFirst("10");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder78.deleteAll("104\n");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder20.append(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder81.setNullText("i!########");
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
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
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
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        int int54 = strBuilder3.lastIndexOf(strMatcher53);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.append((double) '\n');
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
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(strBuilder56);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("\n");
        int int2 = strBuilder1.size();
        java.io.Reader reader3 = strBuilder1.asReader();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(reader3);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.deleteFirst('4');
        int int12 = strBuilder9.lastIndexOf('\n', (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
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
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.appendWithSeparators(objArray45, "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder51.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.deleteFirst(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder47.append((java.lang.Object) strMatcher61);
        boolean boolean65 = strBuilder63.contains("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.appendPadding((int) (short) 10, '#');
        int int72 = strBuilder67.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder67.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder67.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder67.replaceFirst("##########true", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder63.append((java.lang.Object) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder83.append("########10########10", 51, (int) (byte) 0);
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
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        int int7 = strBuilder1.lastIndexOf(' ', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.deleteFirst(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder1.replace(strMatcher10, "##4#######false###10##4##########10", 1, 32, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        int int8 = strBuilder4.size();
        boolean boolean10 = strBuilder4.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder4.replaceAll('#', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        int int16 = strBuilder13.lastIndexOf(strMatcher14, (int) '1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.insert(52, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
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
        int int15 = strBuilder12.indexOf('a', (int) (byte) 10);
        int int16 = strBuilder12.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        java.lang.String str12 = strBuilder10.leftString(12);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.appendPadding(110, '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n\n" + "'", str12, "\n\n");
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendPadding((int) (short) 10, '#');
        java.lang.String str16 = strBuilder11.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder20.appendPadding(0, 'a');
        java.lang.Object obj39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert((int) (short) 0, obj39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) strBuilder40, (int) ' ', '4');
        int int48 = strBuilder40.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.appendNull();
        char char51 = strBuilder40.charAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder55.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder67.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder40.append(strBuilder72);
        boolean boolean74 = strBuilder9.equals((java.lang.Object) strBuilder72);
        int int76 = strBuilder9.indexOf("###101");
        org.apache.commons.lang.text.StrMatcher strMatcher77 = null;
        int int79 = strBuilder9.indexOf(strMatcher77, 97);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '#' + "'", char51 == '#');
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + (-1) + "'", int76 == (-1));
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        int int37 = strBuilder34.lastIndexOf('a', (int) ' ');
        java.lang.StringBuffer stringBuffer38 = strBuilder34.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int41 = strBuilder34.indexOf(strMatcher39, 260);
        java.lang.StringBuffer stringBuffer42 = strBuilder34.toStringBuffer();
        java.lang.StringBuffer stringBuffer43 = strBuilder34.toStringBuffer();
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
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "#97.0#4##########10");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(stringBuffer42);
        org.junit.Assert.assertEquals(stringBuffer42.toString(), "#97.0#4##########10");
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "#97.0#4##########10");
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setNewLineText("                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.minimizeCapacity();
        java.lang.StringBuffer stringBuffer24 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        int int27 = strBuilder20.lastIndexOf(strMatcher25, (int) (short) 1);
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        int int29 = strBuilder20.lastIndexOf(strMatcher28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendPadding((int) (short) 10, '#');
        int int18 = strBuilder13.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder13.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher27 = null;
        boolean boolean28 = strBuilder26.contains(strMatcher27);
        java.lang.StringBuffer stringBuffer29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder26.append(stringBuffer29);
        java.io.Reader reader31 = strBuilder26.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder9.appendFixedWidthPadRight((java.lang.Object) strBuilder26, (int) (short) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        boolean boolean45 = strBuilder9.equals(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder9.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.append('0');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder49.appendFixedWidthPadRight(11, (int) (byte) 0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.deleteFirst("########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder17.setLength(12);
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
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
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
        java.io.Reader reader14 = strBuilder10.asReader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strTokenizer13);
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
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
        java.lang.StringBuffer stringBuffer55 = strBuilder17.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher56 = null;
        int int57 = strBuilder17.lastIndexOf(strMatcher56);
        boolean boolean59 = strBuilder17.contains('0');
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
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "##4##########10##########");
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        int int2 = strBuilder0.indexOf('0');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.insert(12, (long) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst(strMatcher16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.replaceFirst('0', '1');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        int int13 = strBuilder3.length();
        int int16 = strBuilder3.lastIndexOf('#', 0);
        int int17 = strBuilder3.capacity();
        java.lang.String str18 = strBuilder3.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendWithSeparators(collection22, "");
        int int27 = strBuilder21.lastIndexOf(' ', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        java.lang.String str34 = strBuilder29.leftString(0);
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
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) strBuilder58, (int) ' ', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        int int66 = strBuilder58.indexOf(strMatcher65);
        java.lang.String str67 = strBuilder58.getNewLineText();
        char[] charArray70 = strBuilder58.toCharArray(13, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder21.append(charArray70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder3.insert(6, charArray70);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "########10" + "'", str18, "########10");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
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
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[1, 0]");
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.append('4');
        boolean boolean33 = strBuilder27.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.appendNewLine();
        java.lang.String str37 = strBuilder27.substring((int) (byte) 1, 2);
        boolean boolean38 = strBuilder20.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder20.deleteAll(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder20.appendPadding(52, 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder20.setCharAt((int) 'a', 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 97");
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
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\n" + "'", str37, "\n");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray58 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder45.insert(0, charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer65 = strBuilder61.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder45.append(stringBuffer65);
        boolean boolean68 = strBuilder45.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder45.appendFixedWidthPadRight(100, (int) (short) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher73 = null;
        int int74 = strBuilder45.lastIndexOf(strMatcher73);
        java.util.Collection collection75 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder45.appendWithSeparators(collection75, "");
        boolean boolean79 = strBuilder45.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) strBuilder45, 20, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder30.replaceAll("##4########", "4##########101                                                                                                ");
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
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(stringBuffer65);
        org.junit.Assert.assertEquals(stringBuffer65.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + (-1) + "'", int74 == (-1));
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str6 = strBuilder1.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.insert((int) (short) 10, (long) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.replaceFirst('1', '1');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.setLength(12);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.insert(11, (long) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.replace((int) (short) 10, 277, "0##4##########104##########101                                                                                                ##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) 14, (int) (short) -1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.append('4');
        char[] charArray13 = strBuilder1.toCharArray();
        java.lang.String str14 = strBuilder1.getNewLineText();
        int int15 = strBuilder1.length();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##########4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##########4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #, #, #, #, #, #, #, #, #, 4]");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.clear();
        java.lang.String str3 = strBuilder2.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder2.replaceAll("##########-1.0", "4 ########10");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder37.deleteCharAt((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder48 = null; // flaky: strBuilder2.appendFixedWidthPadRight((java.lang.Object) strBuilder37, (int) '\n', 'a');
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertNull(str3);
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
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.insert((int) (byte) 10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.deleteAll(' ');
        boolean boolean35 = strBuilder24.equals((java.lang.Object) strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.append("##");
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray62 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder49.insert(0, charArray62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder49.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.replaceFirst(strMatcher67, "");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder66.appendFixedWidthPadRight((int) (short) 100, 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.insert(0, (long) 16);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder45.append(strBuilder75);
        int int81 = strBuilder79.indexOf('a');
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
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder17.setCharAt(14, '4');
        boolean boolean59 = strBuilder57.startsWith("1########");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.appendPadding((int) (short) 10, '#');
        int int66 = strBuilder61.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer72 = strBuilder71.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder61.appendWithSeparators((java.util.Iterator) strTokenizer72, "hi!");
        char[] charArray78 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder61.append(charArray78);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder57.append(charArray78, 6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: -1");
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
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strTokenizer72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), " 4 ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), " 4 ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[ , 4,  ]");
        org.junit.Assert.assertNotNull(strBuilder79);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        boolean boolean16 = strBuilder14.contains(strMatcher15);
        java.lang.StringBuffer stringBuffer17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.append(stringBuffer17);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder28.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.deleteFirst(strMatcher30);
        boolean boolean32 = strBuilder14.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder14.setLength(15);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder14.appendFixedWidthPadLeft((int) 'a', 2, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int40 = strBuilder14.indexOf(strMatcher39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder14.insert(0, "##########true ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        int int11 = strBuilder9.indexOf("4 ########10");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.replaceAll(strMatcher12, "########10##4##########104##########101                                                             ");
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strBuilder9.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.deleteFirst(strMatcher17);
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteAll(strMatcher19);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
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
        java.lang.StringBuffer stringBuffer55 = strBuilder17.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder17.insert(0, (long) (short) 10);
        boolean boolean60 = strBuilder17.contains("###101");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder17.append("########", 112, (int) ' ');
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
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "##4##########10##########");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) -1);
        java.io.Writer writer2 = strBuilder1.asWriter();
        int int5 = strBuilder1.indexOf("\n\n", (int) '\n');
        org.junit.Assert.assertNotNull(writer2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder33.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean51 = strBuilder48.equalsIgnoreCase(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder50.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder50.replaceAll("", "");
        boolean boolean60 = strBuilder46.equalsIgnoreCase(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder50.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.appendPadding((int) (short) 10, '#');
        int int69 = strBuilder64.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strBuilder74.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder64.appendWithSeparators((java.util.Iterator) strTokenizer75, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder62.appendWithSeparators((java.util.Iterator) strTokenizer75, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer75, "##########true");
        int int82 = strBuilder81.size();
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
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 15 + "'", int82 == 15);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.setNullText("");
        java.lang.String str10 = strBuilder8.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder34.replaceAll("", "");
        boolean boolean44 = strBuilder30.equalsIgnoreCase(strBuilder34);
        java.io.Writer writer45 = strBuilder30.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder30.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.replaceAll("\n\n", "");
        boolean boolean50 = strBuilder8.equals((java.lang.Object) "\n\n");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(writer45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll(strMatcher2);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) "#", (int) (short) 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((long) (byte) 100);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        int int24 = strBuilder19.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder19.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.append('4');
        boolean boolean30 = strBuilder26.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.append(10.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder26.replace(strMatcher33, "##", (int) (byte) 0, 32, (int) (short) -1);
        boolean boolean39 = strBuilder13.equals(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder13.setLength(11);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst('#', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.setLength(110);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendWithSeparators(collection31, "");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append((float) 11);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst("4 ########10", "\n");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder26.append(strBuilder40);
        int int46 = strBuilder40.lastIndexOf("##4#########10");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.append("##4#######16###104\n");
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
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
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        int int34 = strBuilder29.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder29.setNullText("");
        java.lang.String str38 = strBuilder36.substring((int) (short) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder36.append((java.lang.Object) strBuilder62);
        java.io.Reader reader66 = strBuilder36.asReader();
        char[] charArray67 = strBuilder36.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder23.append(charArray67, 0, 10);
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
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
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(reader66);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll(strMatcher22, "                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder10.append(strBuilder24);
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
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder46.replaceAll(strMatcher57, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder46.appendFixedWidthPadRight((java.lang.Object) 1.0f, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) strBuilder63, 30, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder10.deleteFirst("");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
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
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendNull();
        int int7 = strBuilder5.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendWithSeparators(collection10, "");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendNewLine();
        java.util.Collection collection18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendWithSeparators(collection18, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceAll("", "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        boolean boolean31 = strBuilder29.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.replaceAll(strMatcher32, "hi!");
        int int36 = strBuilder29.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder29.replaceFirst("4 ########10", "4 ########10");
        boolean boolean41 = strBuilder29.startsWith("\n");
        char[] charArray42 = strBuilder29.toCharArray();
        char[] charArray43 = strBuilder20.getChars(charArray42);
        char[] charArray44 = strBuilder5.getChars(charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int57 = strBuilder48.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder48.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder48.replaceFirst(' ', ' ');
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder48.appendWithSeparators(objArray63, "                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder5.appendWithSeparators(objArray63, "4\n");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder5.replaceFirst("aaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[]");
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[\n]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
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
        java.lang.Object[] objArray45 = new java.lang.Object[] {};
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.appendWithSeparators(objArray45, "\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder40.replaceFirst("                                                                                                   0", "");
        int int53 = strBuilder50.indexOf('0', 32);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder50.insert((int) '0', false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
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
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray45), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray45), "[]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        boolean boolean14 = strBuilder8.endsWith("");
        boolean boolean16 = strBuilder8.endsWith("###101");
        java.io.Writer writer17 = strBuilder8.asWriter();
        boolean boolean19 = strBuilder8.endsWith("##4#########10");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder8.append(true);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(writer17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        int int53 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder3.deleteFirst('#');
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 30 + "'", int53 == 30);
        org.junit.Assert.assertNotNull(strBuilder55);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        java.lang.StringBuffer stringBuffer31 = strBuilder26.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder26.replaceAll(' ', 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = strBuilder34.substring(15, 10);
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray26 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder13.insert(0, charArray26);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder13.appendPadding(0, 'a');
        java.lang.Object obj32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.insert((int) (short) 0, obj32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.setLength((int) (short) 0);
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
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) strBuilder37, (int) (short) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder6.append(strBuilder35, 0, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder35.deleteFirst("aaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder35.deleteCharAt(17);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
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
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        int int11 = strBuilder9.indexOf("4 ########10");
        java.lang.String str12 = strBuilder9.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.replaceFirst('0', ' ');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.insert(1, "\n\nfalse##4#######4###10");
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
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
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
        java.lang.String str25 = strBuilder24.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append((java.lang.Object) strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.replaceAll('\n', '4');
        java.lang.String str36 = strBuilder34.rightString(101);
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.ensureCapacity((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.append((double) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst(strMatcher8, "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.append((float) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.setCharAt((int) '4', '0');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 52");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteFirst(' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer10 = strBuilder4.asTokenizer();
        java.lang.Object obj11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append(obj11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray30 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(0, charArray30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.append('4');
        boolean boolean41 = strBuilder35.contains("");
        boolean boolean42 = strBuilder31.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder31.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.insert((int) (byte) 1, (double) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int61 = strBuilder52.indexOf("", (int) (byte) -1);
        char[] charArray62 = null;
        char[] charArray63 = strBuilder52.getChars(charArray62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder48.append(charArray63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder13.append(charArray63);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.setNullText("\nfalse");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.append(260);
        java.io.Writer writer70 = strBuilder69.asWriter();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strTokenizer10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray30);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray30), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray30), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(writer70);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.replaceAll('0', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append("hi!");
        int int16 = strBuilder11.indexOf(' ', 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.append((double) ' ');
        int int30 = strBuilder23.lastIndexOf(' ', 44);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray37 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder24.insert(0, charArray37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer44 = strBuilder40.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder24.append(stringBuffer44);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder18.append(stringBuffer44, 8, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder48.minimizeCapacity();
        java.util.Collection collection50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.appendWithSeparators(collection50, "\n\n");
        java.lang.String str55 = strBuilder52.midString(277, 63);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("##4##########10false11");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder5.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder22.replaceAll("", "");
        boolean boolean32 = strBuilder18.equalsIgnoreCase(strBuilder22);
        java.io.Writer writer33 = strBuilder18.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder18.reverse();
        java.lang.StringBuffer stringBuffer35 = strBuilder34.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) stringBuffer35, 277, '4');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(stringBuffer35);
        org.junit.Assert.assertEquals(stringBuffer35.toString(), "01########");
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteAll("");
        int int13 = strBuilder10.lastIndexOf('1', 1);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.replaceAll("\n\n", "#######10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
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
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendPadding((int) (short) 100, 'a');
        boolean boolean48 = strBuilder40.startsWith("\n\n");
        int int51 = strBuilder40.indexOf("104\n", 100);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder40.deleteFirst(strMatcher52);
        int int54 = strBuilder53.size();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray71 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder58.insert(0, charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder58.appendPadding(0, 'a');
        int int76 = strBuilder58.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder58.insert((int) (short) 10, false);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = new org.apache.commons.lang.text.StrBuilder((int) ' ');
        int int83 = strBuilder81.lastIndexOf('4');
        char[] charArray84 = strBuilder81.toCharArray();
        char[] charArray85 = strBuilder58.getChars(charArray84);
        char[] charArray86 = strBuilder53.getChars(charArray85);
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
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 110 + "'", int54 == 110);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 32 + "'", int76 == 32);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[]");
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "##4#######false###10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "##4#######false###10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[#, #, 4, #, #, #, #, #, #, #, f, a, l, s, e, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "##########aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #, #, #, #, #, #, #, #, #, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a, a]");
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
        int int40 = strBuilder37.indexOf('4', (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.setNullText("                                                                                                   0");
        boolean boolean44 = strBuilder37.endsWith("##########true4");
        char[] charArray45 = strBuilder37.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (short) 10, '#');
        int int52 = strBuilder47.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder47.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        int int61 = strBuilder56.indexOf(strMatcher60);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder56.deleteFirst("-1.0");
        boolean boolean64 = strBuilder37.equals(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder37.appendFixedWidthPadRight(112, 259, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder68.replace(strMatcher69, "t              rue410.0", 12, 12, 16);
        int int76 = strBuilder74.lastIndexOf('#');
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "01##########4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "01##########4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[0, 1, #, #, #, #, #, #, #, #, #, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 14 + "'", int76 == 14);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
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
        int int27 = strBuilder22.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder22.setNullText("");
        java.lang.String str31 = strBuilder29.substring((int) (short) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder29.append((java.lang.Object) strBuilder55);
        org.apache.commons.lang.text.StrMatcher strMatcher59 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder29.replaceAll(strMatcher59, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.replace((int) (short) 0, 2, "hi!");
        boolean boolean66 = strBuilder3.equalsIgnoreCase(strBuilder65);
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.deleteFirst(strMatcher67);
        int int69 = strBuilder65.size();
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
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
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
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 11 + "'", int69 == 11);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("########10##4##########104##########101                                                             ");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.appendPadding((int) (short) 10, '#');
        int int8 = strBuilder3.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.setNullText("");
        java.lang.String str12 = strBuilder10.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray29 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.insert(0, charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder16.appendPadding(0, 'a');
        java.lang.Object obj35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.insert((int) (short) 0, obj35);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder10.append((java.lang.Object) strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder1.appendFixedWidthPadLeft((java.lang.Object) strBuilder36, (int) (short) -1, '0');
        java.lang.String str44 = strBuilder1.leftString((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        int int54 = strBuilder49.lastIndexOf(strMatcher52, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder49.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.append("###101");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder60.trim();
        org.apache.commons.lang.text.StrTokenizer strTokenizer62 = strBuilder60.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder47.appendWithSeparators((java.util.Iterator) strTokenizer62, "##########44444444444444444##4##########10");
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "########10" + "'", str44, "########10");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strTokenizer62);
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.replaceFirst(strMatcher8, "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll("##4#########10", "\n\nfalse-1                                                                                                  112.0##########");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.replaceFirst("\n\nfalse-1                                                                                                  112.0##########", "hi!");
        org.apache.commons.lang.text.StrTokenizer strTokenizer17 = strBuilder13.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder13.appendFixedWidthPadRight((int) (byte) 1, 22, '\n');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strTokenizer17);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
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
        int int35 = strBuilder33.indexOf('a');
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.deleteFirst(strMatcher36);
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        int int39 = strBuilder33.indexOf(strMatcher38);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.insert((int) (byte) 0, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder61.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray76 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder63.insert(0, charArray76);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder63.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer81 = strBuilder80.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder59.append(stringBuffer81);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder59.appendFixedWidthPadLeft(9, 11, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher87 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder59.deleteFirst(strMatcher87);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder59.append((long) (short) 0);
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
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(stringBuffer81);
        org.junit.Assert.assertEquals(stringBuffer81.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean24 = strBuilder21.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.append('4');
        boolean boolean29 = strBuilder23.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.appendFixedWidthPadRight((int) '#', 30, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray59 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder46.insert(0, charArray59);
        char[] charArray61 = strBuilder33.getChars(charArray59);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder13.insert((int) (byte) 1, charArray61, 13, 9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[4, \n, #, #, #, #, #, #, #, #, #, #, 0, \n, 3, 5, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.appendFixedWidthPadRight((int) (byte) -1, (int) (byte) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((float) 112);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer24 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder18.append(stringBuffer24);
        java.lang.String str27 = strBuilder18.substring((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray44 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder31.insert(0, charArray44);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer51 = strBuilder47.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder31.append(stringBuffer51);
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        int int55 = strBuilder31.lastIndexOf(strMatcher53, (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder31.deleteCharAt(17);
        boolean boolean58 = strBuilder18.equals(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "\n\nfalse-1                                                                                                  112.0##########" + "'", str27, "\n\nfalse-1                                                                                                  112.0##########");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(stringBuffer51);
        org.junit.Assert.assertEquals(stringBuffer51.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) '1');
        int int2 = strBuilder1.length();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.deleteAll(strMatcher10);
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteFirst(strMatcher12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder15.minimizeCapacity();
        int int19 = strBuilder16.indexOf('a', (int) (short) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        int int22 = strBuilder16.indexOf(strMatcher20, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.deleteCharAt(11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 11");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
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
        int int39 = strBuilder36.indexOf("########10", 1);
        java.lang.String str41 = strBuilder36.substring(2);
        java.io.Writer writer42 = strBuilder36.asWriter();
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
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 32 + "'", int39 == 32);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "########44444444444444444##4##########10" + "'", str41, "########44444444444444444##4##########10");
        org.junit.Assert.assertNotNull(writer42);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        int int15 = strBuilder10.indexOf(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.deleteFirst("-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.setNewLineText("#############");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
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
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder25.append((java.lang.Object) strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder25.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder65.clear();
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strBuilder66.asTokenizer();
        int int69 = strBuilder66.indexOf("#10.0\n-1.0");
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
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        int int21 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.insert((int) (short) 10, false);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder28.appendPadding(0, 'a');
        java.lang.StringBuffer stringBuffer46 = strBuilder45.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder24.append(stringBuffer46);
        org.apache.commons.lang.text.StrTokenizer strTokenizer48 = strBuilder24.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder24.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding((int) (short) 10, '#');
        boolean boolean58 = strBuilder56.startsWith("hi!");
        boolean boolean60 = strBuilder56.contains("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder56.appendPadding(1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean69 = strBuilder66.equalsIgnoreCase(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder68.append('4');
        int int75 = strBuilder68.lastIndexOf("", (int) (short) 100);
        boolean boolean77 = strBuilder68.contains("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444440");
        java.lang.StringBuffer stringBuffer78 = strBuilder68.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder56.append(stringBuffer78);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder49.append(stringBuffer78, 4, 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
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
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "##4##########10");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strTokenizer48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(stringBuffer78);
        org.junit.Assert.assertEquals(stringBuffer78.toString(), "4");
        org.junit.Assert.assertNotNull(strBuilder79);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
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
        int int56 = strBuilder21.indexOf("0", 25);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder21.append((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder21.replaceAll("##4#######16###104\n", "0.014eurt#########");
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        int int1 = strBuilder0.size();
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder5.equalsIgnoreCase(strBuilder7);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.append('4');
        boolean boolean13 = strBuilder7.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder7.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.appendFixedWidthPadRight((int) '#', 30, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray43 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert(0, charArray43);
        char[] charArray45 = strBuilder17.getChars(charArray43);
        // The following exception was thrown during execution in test generation
        try {
            strBuilder0.getChars(9, 16, charArray43, 260);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 16");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[4, \n, #, #, #, #, #, #, #, #, #, #, 0, \n, 3, 5, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #]");
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.append('4');
        boolean boolean40 = strBuilder34.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder34.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder41.setNewLineText("4 ########10");
        char[] charArray49 = strBuilder46.toCharArray((int) (short) 1, 44);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder30.append(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.appendNull();
        int int58 = strBuilder56.lastIndexOf(' ');
        int int61 = strBuilder56.indexOf(' ', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder56.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder50.appendFixedWidthPadRight((java.lang.Object) '4', (int) (byte) 100, 'a');
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
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(charArray49);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray49), "\n##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray49), "\n##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray49), "[\n, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + (-1) + "'", int58 == (-1));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.appendFixedWidthPadRight((int) (byte) -1, (int) (byte) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((float) 112);
        java.lang.String str21 = strBuilder16.midString((int) (short) 0, 16);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\n\nfalse-1       " + "'", str21, "\n\nfalse-1       ");
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.reverse();
        boolean boolean12 = strBuilder11.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((double) 1.0f);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.appendNewLine();
        java.lang.String str28 = strBuilder26.leftString(12);
        boolean boolean29 = strBuilder26.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.appendNull();
        int int37 = strBuilder35.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendWithSeparators(collection40, "");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder39.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendNewLine();
        java.util.Collection collection48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder44.appendWithSeparators(collection48, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceAll("", "-1.0");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        boolean boolean61 = strBuilder59.endsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder59.replaceAll(strMatcher62, "hi!");
        int int66 = strBuilder59.lastIndexOf("4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder59.replaceFirst("4 ########10", "4 ########10");
        boolean boolean71 = strBuilder59.startsWith("\n");
        char[] charArray72 = strBuilder59.toCharArray();
        char[] charArray73 = strBuilder50.getChars(charArray72);
        char[] charArray74 = strBuilder35.getChars(charArray73);
        char[] charArray75 = strBuilder26.getChars(charArray73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder14.insert(133, charArray75);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 133");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "\n\n" + "'", str28, "\n\n");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[]");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[\n]");
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "\n\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "\n\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[\n, \n]");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        int int15 = strBuilder10.indexOf(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.deleteFirst("-1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder10.replace(strMatcher18, "##4#########4#####10##########", 13, 30, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append("########101.0");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.appendPadding((int) (byte) 1, 'a');
        int int35 = strBuilder23.lastIndexOf("\n\nfalse##4#######4###10", 11);
        int int38 = strBuilder23.indexOf('a', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder23.ensureCapacity(3);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 15 + "'", int38 == 15);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.setNewLineText("");
        java.lang.String str41 = strBuilder34.leftString(32);
        java.lang.String str42 = strBuilder34.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder34.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.appendFixedWidthPadRight(27, 22, '4');
        int int50 = strBuilder43.indexOf('\n', 15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder43.insert(101, (float) 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 101");
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append((double) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder1.replaceFirst("##########true", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.trim();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
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
        int int40 = strBuilder37.indexOf('4', (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.appendPadding(20, ' ');
        java.lang.StringBuffer stringBuffer44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.append(stringBuffer44, (int) 'a', 32);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.append((double) 63);
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
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
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean65 = strBuilder62.equalsIgnoreCase(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder64.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray77 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder64.insert(0, charArray77);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder80.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer84 = strBuilder80.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder64.append(stringBuffer84);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder49.append(stringBuffer84);
        java.lang.StringBuffer stringBuffer87 = strBuilder49.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher88 = null;
        int int89 = strBuilder49.lastIndexOf(strMatcher88);
        boolean boolean90 = strBuilder29.equals((java.lang.Object) int89);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder29.setLength((int) (byte) 1);
        org.apache.commons.lang.text.StrMatcher strMatcher93 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder98 = strBuilder92.replace(strMatcher93, "\n", 36, 277, (int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strBuilder26);
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
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(stringBuffer84);
        org.junit.Assert.assertEquals(stringBuffer84.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(stringBuffer87);
        org.junit.Assert.assertEquals(stringBuffer87.toString(), "##4##########10##########");
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + (-1) + "'", int89 == (-1));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(strBuilder92);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(24);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        int int17 = strBuilder10.lastIndexOf("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        int int24 = strBuilder19.lastIndexOf(strMatcher22, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder19.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append("###101");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll("##########-1.0", "");
        boolean boolean34 = strBuilder10.equals(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int49 = strBuilder40.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder40.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder40.replaceFirst(' ', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder40.replaceAll('#', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder40.replaceAll('4', '\n');
        char[] charArray61 = strBuilder40.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            strBuilder10.getChars((int) (short) -1, 15, charArray61, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "        10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "        10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[ ,  ,  ,  ,  ,  ,  ,  , 1, 0]");
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        int int7 = strBuilder4.indexOf(strMatcher5, (int) (byte) -1);
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.deleteAll(strMatcher8);
        java.lang.String str10 = strBuilder4.getNullText();
        boolean boolean11 = strBuilder4.isEmpty();
        java.lang.String str14 = strBuilder4.midString(277, 11);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append("##########true4");
        int int8 = strBuilder3.indexOf("###101", 2);
        boolean boolean10 = strBuilder3.endsWith("4\n");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        char[] charArray8 = strBuilder5.toCharArray();
        int int11 = strBuilder5.lastIndexOf("4 ########10", 1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.insert((int) (byte) 1, (int) (short) 1);
        java.lang.String str17 = strBuilder14.midString(112, 0);
        java.io.Reader reader18 = strBuilder14.asReader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(reader18);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder25.append((java.lang.Object) strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder25.replaceAll(' ', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder65.clear();
        org.apache.commons.lang.text.StrTokenizer strTokenizer67 = strBuilder66.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean72 = strBuilder69.equalsIgnoreCase(strBuilder71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder73.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder73.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher78 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder73.replaceAll(strMatcher78, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder66.appendFixedWidthPadLeft((java.lang.Object) "hi!", (int) ' ', '4');
        java.lang.String str85 = strBuilder66.leftString(0);
        org.apache.commons.lang.text.StrMatcher strMatcher86 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder66.deleteFirst(strMatcher86);
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
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strTokenizer67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(strBuilder87);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        boolean boolean12 = strBuilder8.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append(10.0f);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int17 = strBuilder14.indexOf(strMatcher15, (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.setNullText("##########true4##########10.0");
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strBuilder19.asTokenizer();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
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
        java.lang.String str25 = strBuilder24.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append((java.lang.Object) strBuilder30);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.insert(133, 0.0d);
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
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        int int9 = strBuilder6.indexOf(' ', (-1));
        int int12 = strBuilder6.indexOf(' ', (int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder6.appendFixedWidthPadRight(12, 112, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder6.replaceAll('0', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append('#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder25.appendNewLine();
        boolean boolean28 = strBuilder25.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.appendFixedWidthPadLeft((int) '#', 2, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder15.append(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.append((long) (-1));
        java.lang.String str36 = strBuilder33.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "########10\n\n35-1" + "'", str36, "########10\n\n35-1");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
        int int33 = strBuilder24.indexOf("", (int) (byte) -1);
        char[] charArray34 = null;
        char[] charArray35 = strBuilder24.getChars(charArray34);
        boolean boolean36 = strBuilder20.equals((java.lang.Object) charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.append('4');
        boolean boolean46 = strBuilder40.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder40.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder50.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder50.appendFixedWidthPadRight((int) '#', 30, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder61.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray76 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder63.insert(0, charArray76);
        char[] charArray78 = strBuilder50.getChars(charArray76);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder20.append(charArray78);
        char char81 = strBuilder20.charAt((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(charArray76);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray76), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray76), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray76), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[4, \n, #, #, #, #, #, #, #, #, #, #, 0, \n, 3, 5, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + char81 + "' != '" + '#' + "'", char81 == '#');
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder30.append('#');
        int int45 = strBuilder43.lastIndexOf(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.deleteAll("\n\nfalse-1                                                                                                  112.0##########");
        char char49 = strBuilder43.charAt(8);
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
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + char49 + "' != '" + '#' + "'", char49 == '#');
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) '0');
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder5.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder22.replaceAll("", "");
        boolean boolean32 = strBuilder18.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder22.replaceAll(strMatcher33, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder22.appendFixedWidthPadRight((java.lang.Object) 1.0f, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.append((int) (byte) 10);
        char[] charArray48 = strBuilder45.toCharArray();
        int int51 = strBuilder45.lastIndexOf("4 ########10", 1);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder45.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher53 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.deleteAll(strMatcher53);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.appendWithSeparators(collection57, "");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder56.appendFixedWidthPadLeft(0, (int) (short) 100, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strBuilder68.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder63.appendWithSeparators((java.util.Iterator) strTokenizer69, "########10##4##########104##########101                                                             ");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder54.appendWithSeparators((java.util.Iterator) strTokenizer69, "##4########");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder39.appendWithSeparators((java.util.Iterator) strTokenizer69, "##4########");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder1.append((java.lang.Object) strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder39.reverse();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[1, 0]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        int int40 = strBuilder37.indexOf('4', (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.deleteAll("###############");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder42.appendNull();
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
        java.lang.String str25 = strBuilder24.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendWithSeparators(collection28, "");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder24.append((java.lang.Object) strBuilder30);
        java.lang.Object obj32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.append(obj32);
        boolean boolean35 = strBuilder30.contains("1########");
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strBuilder30.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceAll(strMatcher38, "#10.0\n-1.0");
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
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("024\n\n\n\n\n\n\n\n\n");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("");
        int int17 = strBuilder3.lastIndexOf("", (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding((int) (short) 1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        java.lang.String str27 = strBuilder26.getNewLineText();
        java.io.Writer writer28 = strBuilder26.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.insert((int) (short) 0, (java.lang.Object) writer28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.setLength(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(writer28);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder21.appendPadding(63, ' ');
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
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteFirst(' ');
        java.io.Writer writer29 = strBuilder28.asWriter();
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
        org.junit.Assert.assertNotNull(writer29);
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.lastIndexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer12 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder1.appendWithSeparators((java.util.Iterator) strTokenizer12, "hi!");
        char[] charArray18 = new char[] { ' ', '4', ' ' };
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder1.append(charArray18);
        int int20 = strBuilder19.capacity();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.deleteFirst(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.insert(13, (double) 100L);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.insert((int) (short) 1, '4');
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst(strMatcher29, "4 ########10");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.appendNewLine();
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
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.append('4');
        boolean boolean21 = strBuilder15.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder15.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.appendNewLine();
        boolean boolean31 = strBuilder11.equals(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder45.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder57.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder30.append(strBuilder62);
        org.apache.commons.lang.text.StrMatcher strMatcher64 = null;
        int int66 = strBuilder63.indexOf(strMatcher64, 8);
        int int67 = strBuilder63.size();
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 25 + "'", int67 == 25);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("");
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        int int6 = strBuilder1.lastIndexOf(strMatcher4, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder1.replaceAll('a', '4');
        boolean boolean11 = strBuilder1.contains("1########");
        java.lang.StringBuffer stringBuffer12 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (short) 10, '#');
        int int19 = strBuilder14.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder14.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        boolean boolean29 = strBuilder27.contains(strMatcher28);
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.deleteFirst(strMatcher30);
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
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean67 = strBuilder64.equalsIgnoreCase(strBuilder66);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder66.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray79 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder66.insert(0, charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder59.append(charArray79);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) strBuilder59, (int) (short) 100, ' ');
        char[] charArray87 = strBuilder57.toCharArray(0, 14);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder27.append(charArray87);
        char[] charArray89 = strBuilder1.getChars(charArray87);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
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
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(charArray79);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray79), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray79), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray79), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "              ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "              ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "              ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "              ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[ ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst(strMatcher13);
        org.apache.commons.lang.text.StrTokenizer strTokenizer15 = strBuilder12.asTokenizer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strTokenizer15);
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        int int53 = strBuilder3.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.replaceAll("##########true4", "hi!");
        int int59 = strBuilder56.lastIndexOf("4 ########10", 9);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.delete((int) (short) 1, 13);
        int int66 = strBuilder64.indexOf("######");
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
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 30 + "'", int53 == 30);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 0 + "'", int66 == 0);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.appendFixedWidthPadRight((int) (byte) -1, (int) (byte) 100, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray34 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder21.insert(0, charArray34);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder21.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        boolean boolean45 = strBuilder43.startsWith("hi!");
        boolean boolean47 = strBuilder43.contains("hi!");
        boolean boolean48 = strBuilder38.equals(strBuilder43);
        int int50 = strBuilder43.lastIndexOf("\n\n");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder16.insert(12, (java.lang.Object) int50);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.deleteAll(strMatcher52);
        java.lang.String str55 = strBuilder53.substring((int) (short) 10);
        boolean boolean56 = strBuilder53.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(charArray34);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray34), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray34), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray34), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "  -1                                                                                               " + "'", str55, "  -1                                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder20.clear();
        int int30 = strBuilder20.lastIndexOf(' ', (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder20.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.setLength(0);
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
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + (-1) + "'", int30 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder28.minimizeCapacity();
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
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.insert(0, (double) (-1L));
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.deleteAll(strMatcher62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder32.append((java.lang.Object) strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder26.append(strBuilder64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder26.append((double) (byte) 0);
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
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
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendWithSeparators(collection12, "");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.deleteFirst(' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strBuilder14.asTokenizer();
        java.lang.Object obj21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder14.append(obj21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder22.appendNull();
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder41.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.insert((int) (byte) 1, (double) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean63 = strBuilder60.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int71 = strBuilder62.indexOf("", (int) (byte) -1);
        char[] charArray72 = null;
        char[] charArray73 = strBuilder62.getChars(charArray72);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder58.append(charArray73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder23.append(charArray73);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder3.append(charArray73);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.insert(2, false);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder81.deleteFirst('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
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
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 0 + "'", int71 == 0);
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[#, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder6.appendNewLine();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder6.insert(22, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 22");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst("########10");
        java.lang.String str22 = strBuilder18.leftString(100);
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.deleteAll(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray43 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert(0, charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder30.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceFirst(strMatcher48, "");
        org.apache.commons.lang.text.StrMatcher strMatcher51 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder47.replaceAll(strMatcher51, "4##########101                                                                                                ");
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strBuilder53.asTokenizer();
        boolean boolean55 = strBuilder26.equals((java.lang.Object) strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "##########true4" + "'", str22, "##########true4");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
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
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
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
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendWithSeparators(collection32, "");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder31.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder38.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder29.appendFixedWidthPadRight((java.lang.Object) strBuilder38, 14, 'a');
        int int44 = strBuilder43.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.appendPadding((int) (short) 10, '4');
        java.lang.String str49 = strBuilder43.rightString(0);
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
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 32 + "'", int44 == 32);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
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
        java.lang.StringBuffer stringBuffer31 = strBuilder26.toStringBuffer();
        java.lang.String str32 = strBuilder26.toString();
        java.io.Writer writer33 = strBuilder26.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder26.appendFixedWidthPadRight((int) '#', 9, ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder26.insert(28, 100.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 28");
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
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 14 + "'", int30 == 14);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "##4##########10");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "##4##########10" + "'", str32, "##4##########10");
        org.junit.Assert.assertNotNull(writer33);
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder10.insert(110, '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 110");
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
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
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
        int int33 = strBuilder30.lastIndexOf("##4##########10", (int) (byte) 10);
        java.lang.StringBuffer stringBuffer34 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int37 = strBuilder30.lastIndexOf(strMatcher35, 259);
        java.lang.String str38 = strBuilder30.getNewLineText();
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
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "##4##########10##########100aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendFixedWidthPadLeft(10, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.clear();
        int int17 = strBuilder10.lastIndexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.append("35############################");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding(3, '\n');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        int int11 = strBuilder8.indexOf('#', 12);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteFirst("##");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder8.replaceAll('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder8.setNullText("\n\n");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.setNewLineText("");
        int int42 = strBuilder39.indexOf("##########true", (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) strBuilder44, 2, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.append('4');
        boolean boolean57 = strBuilder51.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder51.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.appendPadding((int) (byte) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.appendFixedWidthPadLeft((int) (byte) 100, 1, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder61.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder61.appendFixedWidthPadRight((int) '#', 30, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean75 = strBuilder72.equalsIgnoreCase(strBuilder74);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder74.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray87 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder74.insert(0, charArray87);
        char[] charArray89 = strBuilder61.getChars(charArray87);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder47.append(charArray87);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder47.ensureCapacity(17);
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "4\n##########0\n35############################");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[4, \n, #, #, #, #, #, #, #, #, #, #, 0, \n, 3, 5, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder92);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (byte) 0, "2                                                                                                   ");
        org.junit.Assert.assertNotNull(strBuilder4);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        int int16 = strBuilder12.indexOf(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        int int18 = strBuilder12.indexOf(strMatcher17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder12.insert(44, (float) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 44");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        int int6 = strBuilder1.indexOf("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        int int15 = strBuilder10.indexOf(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.deleteFirst("-1.0");
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder10.replace(strMatcher18, "##4#########4#####10##########", 13, 30, (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder10.append(14);
        int int26 = strBuilder25.length();
        java.io.Reader reader27 = strBuilder25.asReader();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 17 + "'", int26 == 17);
        org.junit.Assert.assertNotNull(reader27);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.insert(10, (double) 12);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.replaceFirst("4\n##########0", "");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder6.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendPadding((int) (short) 10, '#');
        java.lang.String str16 = strBuilder11.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder20.appendPadding(0, 'a');
        java.lang.Object obj39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert((int) (short) 0, obj39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) strBuilder40, (int) ' ', '4');
        int int48 = strBuilder40.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.appendNull();
        char char51 = strBuilder40.charAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder55.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder67.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder40.append(strBuilder72);
        boolean boolean74 = strBuilder9.equals((java.lang.Object) strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder9.appendNewLine();
        java.lang.String str77 = strBuilder75.leftString((int) (short) 100);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + char51 + "' != '" + '#' + "'", char51 == '#');
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "\n" + "'", str77, "\n");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.deleteFirst("##########true");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.setNewLineText("                                                                                                   0");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.minimizeCapacity();
        boolean boolean25 = strBuilder23.contains("");
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteAll(strMatcher26);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.setNewLineText("\n\nfalse-1                                                                                                  112.0##########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.setNewLineText("-1.0");
        boolean boolean13 = strBuilder11.endsWith("\n");
        java.lang.String str15 = strBuilder11.leftString(25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "########10" + "'", str15, "########10");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.appendFixedWidthPadRight((int) (byte) 1, (int) 'a', ' ');
        char char26 = strBuilder24.charAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.deleteCharAt((int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.append(true);
        java.lang.String str31 = strBuilder24.getNullText();
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
        org.junit.Assert.assertTrue("'" + char26 + "' != '" + '#' + "'", char26 == '#');
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(10);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("");
        boolean boolean5 = strBuilder3.contains("\n\n");
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(32);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll("\n");
        org.apache.commons.lang.text.StrTokenizer strTokenizer4 = strBuilder3.asTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.insert(2, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 2");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strTokenizer4);
    }
}
