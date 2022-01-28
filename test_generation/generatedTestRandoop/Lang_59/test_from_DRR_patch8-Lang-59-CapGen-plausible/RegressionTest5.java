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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strBuilder35.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer36, "##########");
        java.lang.String str40 = strBuilder38.substring((int) (short) 1);
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.deleteFirst(strMatcher41);
        int int43 = strBuilder38.length();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder45.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer57 = strBuilder53.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.append(stringBuffer57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder38.append(stringBuffer57);
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1##########" + "'", str40, "1##########");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 12 + "'", int43 == 12);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(stringBuffer57);
        org.junit.Assert.assertEquals(stringBuffer57.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.deleteFirst("\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding(0, '#');
        int int14 = strBuilder9.lastIndexOf("##########hi!##########-1StrTokenizer[not tokenized yet]true0.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.replaceFirst(' ', 'a');
        int int11 = strBuilder8.lastIndexOf("hi!", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer27 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(stringBuffer27, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder8.append(stringBuffer27, (int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll(strMatcher34, "1                      ");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.setNullText("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.appendFixedWidthPadLeft(17, 20, '0');
        boolean boolean43 = strBuilder42.isEmpty();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test2504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2504");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        java.util.Collection collection9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendWithSeparators(collection9, "");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll(strMatcher12, "##########");
        java.lang.String str15 = strBuilder11.getNewLineText();
        java.lang.String str16 = strBuilder11.getNewLineText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder3.equals(strBuilder7);
        int int9 = strBuilder3.size();
        int int10 = strBuilder3.size();
        int int12 = strBuilder3.lastIndexOf("##4##");
        java.util.Collection collection13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.appendWithSeparators(collection13, "-140");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strBuilder35.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer36, "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder21.deleteFirst('#');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.setCharAt(12, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 12");
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        java.lang.String str8 = strBuilder7.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.ensureCapacity(25);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder7.append((java.lang.Object) strBuilder14);
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        int int19 = strBuilder7.indexOf(strMatcher18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        int int8 = strBuilder7.length();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.append((int) (byte) 10);
        java.lang.String str11 = strBuilder10.toString();
        java.lang.String str14 = strBuilder10.midString(9, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = strBuilder10.substring((int) '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "410" + "'", str11, "410");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder49.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strBuilder65.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder38.appendWithSeparators((java.util.Iterator) strTokenizer66, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder68, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean76 = strBuilder73.equalsIgnoreCase(strBuilder75);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder73.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.replaceFirst(strMatcher80, "");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder79.setNullText("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder9.append(strBuilder79);
        org.apache.commons.lang.text.StrMatcher strMatcher86 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder79.replaceAll(strMatcher86, "1                      ");
        boolean boolean90 = strBuilder88.startsWith("        0");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append(true);
        java.lang.String str30 = strBuilder27.midString((-1), (int) '#');
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.replaceFirst(strMatcher31, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteAll(' ');
        java.lang.StringBuffer stringBuffer36 = strBuilder33.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "########10-1true" + "'", str30, "########10-1true");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(stringBuffer36);
        org.junit.Assert.assertEquals(stringBuffer36.toString(), "########10-1true");
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.replaceFirst(' ', 'a');
        int int11 = strBuilder8.lastIndexOf("hi!", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer27 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(stringBuffer27, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder8.append(stringBuffer27, (int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll(strMatcher34, "1                      ");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.setNullText("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.appendFixedWidthPadLeft(17, 20, '0');
        java.lang.StringBuffer stringBuffer43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.append(stringBuffer43);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        boolean boolean10 = strBuilder8.endsWith("0111");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2513");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.appendFixedWidthPadLeft(13, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder9.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.insert((int) (byte) 10, (long) 11);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append((double) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray45 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder32.insert(0, charArray45);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strBuilder52.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder46.insert(0, (java.lang.Object) strBuilder56);
        java.lang.StringBuffer stringBuffer58 = strBuilder46.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder27.insert(12, (java.lang.Object) strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(stringBuffer58);
        org.junit.Assert.assertEquals(stringBuffer58.toString(), "############4##########10");
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteFirst("41");
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst(strMatcher7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strBuilder8.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.insert((int) (short) 0, "########10");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.deleteCharAt(18);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 18");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        boolean boolean15 = strBuilder9.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.clear();
        java.lang.String str33 = strBuilder25.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder25.deleteFirst("41");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder9.append(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder25.deleteAll("4!#######100");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder25.append(false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
    }

    @Test
    public void test2516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2516");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst(strMatcher12, "########10-1");
        boolean boolean16 = strBuilder11.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder11.append(true);
        int int21 = strBuilder19.lastIndexOf('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray24 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.insert(0, charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strBuilder31.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder25.insert(0, (java.lang.Object) strBuilder35);
        boolean boolean37 = strBuilder1.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder25.deleteFirst('#');
        int int40 = strBuilder39.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.append('0');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder39.deleteAll("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.apache.commons.lang.text.StrMatcher strMatcher45 = null;
        int int46 = strBuilder39.indexOf(strMatcher45);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder39.deleteCharAt((int) '0');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 32 + "'", int40 == 32);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("zed yet]true");
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setNullText("41");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int13 = strBuilder11.indexOf(strMatcher12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendNewLine();
        int int16 = strBuilder11.lastIndexOf('!');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder11.append((long) 24);
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strBuilder11.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder11.appendFixedWidthPadLeft((int) (short) 0, 57, 'r');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replaceAll("10", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.appendWithSeparators(collection12, "hi!");
        java.io.Reader reader15 = strBuilder5.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder5.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append('r');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(reader15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
    }

    @Test
    public void test2521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2521");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setLength((int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.insert(12, (long) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadRight(9, 5, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray29 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.insert(0, charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.replaceFirst("", "hi!");
        boolean boolean39 = strBuilder16.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder32.deleteAll("41");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder55.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        int int66 = strBuilder64.lastIndexOf(strMatcher65);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder45.append((java.lang.Object) int66);
        char[] charArray70 = new char[] { ' ', '#' };
        char[] charArray71 = strBuilder45.getChars(charArray70);
        char[] charArray72 = strBuilder32.getChars(charArray70);
        char[] charArray73 = strBuilder8.getChars(charArray70);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[ , #]");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(charArray72);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray72), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray72), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray72), "[ , #]");
        org.junit.Assert.assertNotNull(charArray73);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray73), "i!\000\000\000\000\000\000\000\000\000\0000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0009####");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray73), "i!\000\000\000\000\000\000\000\000\000\0000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0009####");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray73), "[i, !, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, 0, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, \000, 9, #, #, #, #]");
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
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.append('r');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean10 = strBuilder7.equalsIgnoreCase(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder9.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendWithSeparators(collection25, "");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder27.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer38 = strBuilder34.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer45 = strBuilder44.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean51 = strBuilder48.equalsIgnoreCase(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder50.append('4');
        boolean boolean56 = strBuilder50.contains("");
        java.lang.Object[] objArray57 = new java.lang.Object[] { "hi!", stringBuffer38, (byte) -1, strTokenizer45, "", boolean56 };
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder9.appendWithSeparators(objArray57, "");
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
        char[] charArray84 = strBuilder59.getChars(charArray81);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder1.append(charArray84);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder1.insert(0, "10########10##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder88.insert(57, 11);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strTokenizer45);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
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
        org.junit.Assert.assertNotNull(charArray84);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[#, #, #, #, #, #, #, #, 1, 0, h, i, !, #, #, #, #, #, #, #, #, #, #, -, 1, S, t, r, T, o, k, e, n, i, z, e, r, [, n, o, t,  , t, o, k, e, n, i, z, e, d,  , y, e, t, ], t, r, u, e]");
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder91);
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        int int22 = strBuilder3.lastIndexOf("###10", 3);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.setLength(12);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        int int49 = strBuilder47.lastIndexOf(strMatcher48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder28.append((java.lang.Object) int49);
        char[] charArray53 = new char[] { ' ', '#' };
        char[] charArray54 = strBuilder28.getChars(charArray53);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder28.appendPadding((int) (short) 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder28.insert(10, false);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder28.insert(15, (long) 24);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder3.append(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + (-1) + "'", int49 == (-1));
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray53);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray53), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray53), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray53), "[ , #]");
        org.junit.Assert.assertNotNull(charArray54);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray54), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray54), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray54), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.setLength((int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.insert(12, (long) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendFixedWidthPadRight(9, 5, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray29 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder16.insert(0, charArray29);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer37 = strBuilder36.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.insert(0, (java.lang.Object) strBuilder40);
        int int44 = strBuilder30.lastIndexOf("10", (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder30.append(13);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder30.replaceFirst('1', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder12.append(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strTokenizer37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 23 + "'", int44 == 23);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        java.lang.String str32 = strBuilder21.rightString((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder21.deleteAll("########10-1");
        java.lang.String str37 = strBuilder21.substring((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder21.minimizeCapacity();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "41" + "'", str32, "41");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "1\n" + "'", str37, "1\n");
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder7.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.clear();
        boolean boolean11 = strBuilder8.startsWith("zed yet]true");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.appendFixedWidthPadLeft(13, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder9.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder9.append((long) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strBuilder9.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder9.appendNull();
        int int27 = strBuilder9.length();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 105 + "'", int27 == 105);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        int int8 = strBuilder7.length();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.append((int) (byte) 10);
        java.io.Reader reader11 = strBuilder7.asReader();
        int int14 = strBuilder7.indexOf('a', 23);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder7.deleteAll("ue##########-1StrTokenizer[nothi!tokenizedhi!yet]true-1-1StrTokenizer[nothi!tokenizedhi!yet]trueStrTokenizer[not tokenized yet]-1StrTokenizer[nothi!tokenizedhi!yet]true-1StrTokenizer[nothi!tokenizedhi!yet]truetrue");
        java.lang.String str18 = strBuilder16.leftString((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(reader11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "410" + "'", str18, "410");
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder30.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.appendFixedWidthPadRight((int) (byte) 1, 3, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) 'a', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.appendFixedWidthPadRight(24, 12, '#');
        int int44 = strBuilder35.lastIndexOf('0');
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
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.setNewLineText("10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.append('#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.ensureCapacity(15);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        boolean boolean16 = strBuilder14.contains(strMatcher15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.reverse();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('a', '4');
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder34.lastIndexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append((java.lang.Object) int36);
        char[] charArray40 = new char[] { ' ', '#' };
        char[] charArray41 = strBuilder15.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder10.append(charArray41, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder10.appendPadding(32, '4');
        int int50 = strBuilder47.lastIndexOf('!', 105);
        boolean boolean51 = strBuilder47.isEmpty();
        java.lang.String str53 = strBuilder47.leftString(97);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , #]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "44444444444444444444444444444444" + "'", str53, "44444444444444444444444444444444");
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        java.lang.String str8 = strBuilder7.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int11 = strBuilder7.lastIndexOf(strMatcher9, (int) (byte) 100);
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.deleteAll(strMatcher12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.insert(74, '0');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 74");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2534");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        int int29 = strBuilder27.size();
        java.io.Reader reader30 = strBuilder27.asReader();
        boolean boolean32 = strBuilder27.startsWith("10##########");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.deleteFirst(strMatcher33);
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder27.replace(strMatcher35, "##", 0, 0, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        int int45 = strBuilder43.lastIndexOf(strMatcher44);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.deleteAll('a');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder40.insert((int) (short) 0, (java.lang.Object) strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteFirst("41");
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst(strMatcher7);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteAll(strMatcher12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder11.replace((int) (byte) 0, 3, "#########");
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        int int20 = strBuilder11.indexOf(strMatcher19);
        java.io.Reader reader21 = strBuilder11.asReader();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(reader21);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.deleteFirst("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.clear();
        java.lang.String str18 = strBuilder15.midString(13, 57);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.deleteAll(strMatcher25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray43 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert(0, charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.append('4');
        boolean boolean54 = strBuilder48.contains("");
        boolean boolean55 = strBuilder44.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder59.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder59.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder59.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = strBuilder75.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder48.appendWithSeparators((java.util.Iterator) strTokenizer76, "41");
        boolean boolean80 = strBuilder78.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder26.append((java.lang.Object) strBuilder78);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder78.append((long) 11);
        org.apache.commons.lang.text.StrMatcher strMatcher84 = null;
        boolean boolean85 = strBuilder83.contains(strMatcher84);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder15.append(strBuilder83, 16, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder59.equals(strBuilder63);
        int int65 = strBuilder59.size();
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder59.deleteAll(strMatcher66);
        boolean boolean68 = strBuilder53.equals(strBuilder67);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder67.insert(1, (float) 19);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strBuilder69);
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
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder20.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        boolean boolean25 = strBuilder23.contains(strMatcher24);
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteFirst(strMatcher26);
        int int28 = strBuilder23.size();
        java.lang.String str30 = strBuilder23.rightString((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder21.append(strBuilder23);
        java.lang.String str33 = strBuilder21.leftString(0);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder21.replaceAll("14", "##########");
        char char38 = strBuilder36.charAt(15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + char38 + "' != '" + '4' + "'", char38 == '4');
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.appendFixedWidthPadLeft(13, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst('!');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.insert((int) '!', (long) 100);
        java.util.Collection collection29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendWithSeparators(collection29, "-1StrTokenizer[nothi!tokenizedhi!yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.delete(0, (int) 'a');
        char[] charArray35 = strBuilder34.toCharArray();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.insert(100, "########10-152.0");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "aaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "aaaaaaaaaaa");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[a, a, a, a, a, a, a, a, a, a, a]");
    }

    @Test
    public void test2540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2540");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt(0);
        char char5 = strBuilder1.charAt((int) (byte) 1);
        java.util.Collection collection6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.appendWithSeparators(collection6, "-1StrTokenizer[nothi!tokenizedhi!yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer14 = strBuilder10.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder34.insert(0, (java.lang.Object) strBuilder44);
        boolean boolean46 = strBuilder10.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder34.deleteFirst('#');
        org.apache.commons.lang.text.StrMatcher strMatcher49 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst(strMatcher49);
        boolean boolean51 = strBuilder8.equals((java.lang.Object) strMatcher49);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder8.appendPadding(42, ' ');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '!' + "'", char5 == '!');
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(stringBuffer14);
        org.junit.Assert.assertEquals(stringBuffer14.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
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
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.replace(0, (int) 'a', "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.append(10);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.replaceFirst("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "####10-1");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.insert(27, "10#####100");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 27");
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
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.deleteFirst("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '#');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll(strMatcher15, "#########");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.append((float) 66);
        java.lang.String str21 = strBuilder19.leftString(13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "########1066." + "'", str21, "########1066.");
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder5.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendWithSeparators(collection21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer34 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.append('4');
        boolean boolean52 = strBuilder46.contains("");
        java.lang.Object[] objArray53 = new java.lang.Object[] { "hi!", stringBuffer34, (byte) -1, strTokenizer41, "", boolean52 };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder5.appendWithSeparators(objArray53, "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder1.appendWithSeparators(objArray53, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder1.insert((int) '4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.deleteFirst('!');
        boolean boolean65 = strBuilder64.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.insert(8, 62);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder66.append("i                 ");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder71);
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("############4##");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.insert((int) (byte) 1, false);
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(strMatcher5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder6.appendFixedWidthPadRight(61, 36, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
    }

    @Test
    public void test2545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2545");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendPadding((int) ' ', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendWithSeparators(collection15, "");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('a', '4');
        boolean boolean24 = strBuilder23.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.appendPadding((int) 'a', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder12.append(strBuilder27);
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder12.replaceFirst(strMatcher29, "1##########");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.setCharAt(25, ' ');
        int int35 = strBuilder31.capacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 129 + "'", int35 == 129);
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
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder20.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        int int47 = strBuilder45.lastIndexOf(strMatcher46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder26.append((java.lang.Object) int47);
        char[] charArray51 = new char[] { ' ', '#' };
        char[] charArray52 = strBuilder26.getChars(charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder21.insert(12, (java.lang.Object) strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder63.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder63.appendFixedWidthPadRight((int) (short) 1, 12, '#');
        boolean boolean69 = strBuilder21.equalsIgnoreCase(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.appendNull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ , #]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strBuilder70);
    }

    @Test
    public void test2547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2547");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        int int12 = strBuilder3.indexOf("##4##", 100);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.append(100L);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.append(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert(32, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.setLength((int) (byte) 10);
        java.lang.StringBuffer stringBuffer12 = strBuilder11.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.replaceAll("zed yet]true", "4##25");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.deleteAll(strMatcher21);
        char[] charArray23 = strBuilder17.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.appendPadding((int) (short) 10, '#');
        java.lang.String str29 = strBuilder25.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder35.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder35.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection51 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendWithSeparators(collection51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer64 = strBuilder60.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer71 = strBuilder70.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean77 = strBuilder74.equalsIgnoreCase(strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder76.append('4');
        boolean boolean82 = strBuilder76.contains("");
        java.lang.Object[] objArray83 = new java.lang.Object[] { "hi!", stringBuffer64, (byte) -1, strTokenizer71, "", boolean82 };
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder35.appendWithSeparators(objArray83, "");
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder31.appendWithSeparators(objArray83, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder25.appendWithSeparators(objArray83, "");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder17.appendWithSeparators(objArray83, "-1StrTokenizer[nothi!tokenizedhi!yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder15.appendWithSeparators(objArray83, "41false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(stringBuffer12);
        org.junit.Assert.assertEquals(stringBuffer12.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(charArray23);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray23), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray23), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray23), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "##########" + "'", str29, "##########");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(stringBuffer64);
        org.junit.Assert.assertEquals(stringBuffer64.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strTokenizer71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(objArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray83), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray83), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder5.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendWithSeparators(collection21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer34 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.append('4');
        boolean boolean52 = strBuilder46.contains("");
        java.lang.Object[] objArray53 = new java.lang.Object[] { "hi!", stringBuffer34, (byte) -1, strTokenizer41, "", boolean52 };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder5.appendWithSeparators(objArray53, "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder1.appendWithSeparators(objArray53, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder1.insert((int) '4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.replaceAll('4', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder62.append(110);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder62.insert(132, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 132");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2550");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteFirst("41");
        int int7 = strBuilder4.size();
        boolean boolean9 = strBuilder4.contains('1');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.setNullText("100.0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.replace((int) (byte) 1, 42, "");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2551");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        int int3 = strBuilder1.lastIndexOf("");
        int int6 = strBuilder1.lastIndexOf("########10hi!##########-1StrTokenizer[not tokenized yet]true", 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 91 + "'", int3 == 91);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.setNewLineText("zed yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder34.lastIndexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append((java.lang.Object) int36);
        char[] charArray40 = new char[] { ' ', '#' };
        char[] charArray41 = strBuilder15.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder15.appendPadding((int) (short) 0, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder15.insert(10, false);
        boolean boolean48 = strBuilder9.equalsIgnoreCase(strBuilder47);
        int int51 = strBuilder9.lastIndexOf("10", 17);
        boolean boolean53 = strBuilder9.contains("32");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , #]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2553");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        int int9 = strBuilder5.indexOf('#');
        int int10 = strBuilder5.length();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.replaceFirst('a', '#');
        boolean boolean25 = strBuilder5.equals(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder19.append((double) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder27.appendNewLine();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(23, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteFirst("10\n");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.append(5);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst("1", "## ##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendWithSeparators(collection41, "");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.append(false);
        org.apache.commons.lang.text.StrTokenizer strTokenizer52 = strBuilder51.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder38.appendWithSeparators((java.util.Iterator) strTokenizer52, "-1.0 #");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strTokenizer52);
        org.junit.Assert.assertNotNull(strBuilder54);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.replaceAll(strMatcher54, "########10-1");
        int int59 = strBuilder3.lastIndexOf('1', (int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder3.replaceFirst("###########4########", "41");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder62);
    }

    @Test
    public void test2556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2556");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder5.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendWithSeparators(collection21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer34 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.append('4');
        boolean boolean52 = strBuilder46.contains("");
        java.lang.Object[] objArray53 = new java.lang.Object[] { "hi!", stringBuffer34, (byte) -1, strTokenizer41, "", boolean52 };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder5.appendWithSeparators(objArray53, "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder1.appendWithSeparators(objArray53, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder1.insert((int) '4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.append(3);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.append("        0");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder68.appendWithSeparators(collection69, "");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.deleteFirst("41");
        int int74 = strBuilder71.size();
        boolean boolean76 = strBuilder71.contains('1');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder71.setNullText("100.0");
        boolean boolean79 = strBuilder64.equals(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 0 + "'", int74 == 0);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        int int22 = strBuilder3.lastIndexOf("###10", 3);
        java.util.Collection collection23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.appendWithSeparators(collection23, "10########10##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray43 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert(0, charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.append('4');
        boolean boolean54 = strBuilder48.contains("");
        boolean boolean55 = strBuilder44.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder48.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.setNewLineText("41");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder57.ensureCapacity((int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder3.insert(10, (java.lang.Object) strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder3.deleteCharAt(11);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder3.replaceAll("##########0.0", "44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(15);
        boolean boolean3 = strBuilder1.contains('1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.insert(9, (float) 35);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 9");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        java.lang.String str32 = strBuilder21.rightString((int) (short) 10);
        java.lang.String str35 = strBuilder21.midString((int) (byte) 0, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder21.append((long) 57);
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "41" + "'", str32, "41");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "41" + "'", str35, "41");
        org.junit.Assert.assertNotNull(strBuilder37);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        java.lang.String str27 = strBuilder25.substring((int) (byte) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        int int29 = strBuilder25.lastIndexOf(strMatcher28);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "-1" + "'", str27, "-1");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
    }

    @Test
    public void test2561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2561");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder3.equals(strBuilder7);
        int int9 = strBuilder3.size();
        int int10 = strBuilder3.size();
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.replaceFirst(strMatcher11, "##########");
        boolean boolean15 = strBuilder3.startsWith("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int28 = strBuilder19.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder19.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        int int34 = strBuilder19.indexOf(strMatcher32, 0);
        boolean boolean35 = strBuilder3.equals(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder19.replaceFirst('#', '!');
        java.lang.String str41 = strBuilder38.midString(105, (int) '1');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.insert((int) (short) 1, (float) 57);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder38.append(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.appendNewLine();
        int int15 = strBuilder12.lastIndexOf('r');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt(0);
        char char5 = strBuilder1.charAt((int) (byte) 1);
        java.util.Collection collection6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.appendWithSeparators(collection6, "-1StrTokenizer[nothi!tokenizedhi!yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer14 = strBuilder10.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray33 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder20.insert(0, charArray33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder40.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder34.insert(0, (java.lang.Object) strBuilder44);
        boolean boolean46 = strBuilder10.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder34.deleteFirst('#');
        org.apache.commons.lang.text.StrMatcher strMatcher49 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteFirst(strMatcher49);
        boolean boolean51 = strBuilder8.equals((java.lang.Object) strMatcher49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder8.deleteAll('0');
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '!' + "'", char5 == '!');
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(stringBuffer14);
        org.junit.Assert.assertEquals(stringBuffer14.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.replaceFirst("", "hi!");
        boolean boolean26 = strBuilder3.equalsIgnoreCase(strBuilder19);
        int int29 = strBuilder19.lastIndexOf('!', 23);
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        int int31 = strBuilder19.indexOf(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder19.append((double) 55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        int int12 = strBuilder7.indexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder7.append("");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int17 = strBuilder14.indexOf(strMatcher15, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.minimizeCapacity();
        int int21 = strBuilder18.lastIndexOf("#10#4###", 52);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = strBuilder18.substring(11, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test2566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2566");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean5 = strBuilder2.equalsIgnoreCase(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.trim();
        boolean boolean7 = strBuilder0.equals(strBuilder6);
        boolean boolean9 = strBuilder6.startsWith("0.0\n########10-");
        int int12 = strBuilder6.indexOf('4', 36);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        int int11 = strBuilder3.indexOf(strMatcher10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.append("1");
        java.lang.String str17 = strBuilder16.getNullText();
        int int19 = strBuilder16.lastIndexOf('4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
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
        java.io.Reader reader10 = strBuilder9.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder15.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder15.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendWithSeparators(collection31, "");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer44 = strBuilder40.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strBuilder50.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean57 = strBuilder54.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.append('4');
        boolean boolean62 = strBuilder56.contains("");
        java.lang.Object[] objArray63 = new java.lang.Object[] { "hi!", stringBuffer44, (byte) -1, strTokenizer51, "", boolean62 };
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder15.appendWithSeparators(objArray63, "");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder9.insert((int) (byte) 0, (java.lang.Object) strBuilder15);
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder66.replace(strMatcher67, "## ##########10", 0, 23, 100);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder66.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder66.append(true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(reader10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append(true);
        java.lang.String str30 = strBuilder27.midString((-1), (int) '#');
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.replaceFirst(strMatcher31, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder33.trim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.insert(40, (double) 105);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 40");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "########10-1true" + "'", str30, "########10-1true");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.replaceFirst('4', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder56.appendNull();
        java.lang.String str63 = strBuilder61.rightString(9);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.replaceFirst("", "hi!");
        boolean boolean26 = strBuilder3.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        int int31 = strBuilder29.lastIndexOf(strMatcher30);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.append((double) 31);
        boolean boolean35 = strBuilder33.startsWith("41true");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        java.lang.String str14 = strBuilder13.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.deleteFirst("zed yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.reverse();
        boolean boolean19 = strBuilder17.endsWith("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        boolean boolean6 = strBuilder1.startsWith("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.deleteFirst("10");
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int10 = strBuilder8.lastIndexOf(strMatcher9);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder19.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.clear();
        java.lang.String str27 = strBuilder19.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder19.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder19.insert(0, (long) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strBuilder31.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder8.appendWithSeparators((java.util.Iterator) strTokenizer32, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.replaceFirst(strMatcher43, "");
        int int47 = strBuilder42.indexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder42.append("");
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.deleteFirst(strMatcher50);
        char[] charArray52 = strBuilder51.toCharArray();
        boolean boolean53 = strBuilder34.equals((java.lang.Object) charArray52);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[]");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder16.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        boolean boolean20 = strBuilder7.equals(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder7.insert(0, true);
        int int25 = strBuilder7.lastIndexOf('1');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder7.replaceAll('#', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        java.lang.String str34 = strBuilder30.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder40.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection56 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.appendWithSeparators(collection56, "");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder58.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer69 = strBuilder65.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer76 = strBuilder75.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean82 = strBuilder79.equalsIgnoreCase(strBuilder81);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder81.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder81.append('4');
        boolean boolean87 = strBuilder81.contains("");
        java.lang.Object[] objArray88 = new java.lang.Object[] { "hi!", stringBuffer69, (byte) -1, strTokenizer76, "", boolean87 };
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder40.appendWithSeparators(objArray88, "");
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder36.appendWithSeparators(objArray88, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder30.appendWithSeparators(objArray88, "");
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder28.appendWithSeparators(objArray88, "#####100");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "##########" + "'", str34, "##########");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(stringBuffer69);
        org.junit.Assert.assertEquals(stringBuffer69.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strTokenizer76);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray88), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray88), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replace(strMatcher6, "10.0##4##", 132, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder5);
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        java.io.Reader reader8 = strBuilder4.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.appendNull();
        // The following exception was thrown during execution in test generation
        try {
            char char11 = strBuilder4.charAt(47);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 47");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst(strMatcher22, "");
        boolean boolean25 = strBuilder13.equals(strBuilder21);
        char[] charArray28 = strBuilder21.toCharArray(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.appendFixedWidthPadLeft(13, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceAll(strMatcher33, "10########10##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder10.append(strBuilder32, (int) '1', 23);
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        int int41 = strBuilder32.lastIndexOf(strMatcher39, 22);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder32.replaceFirst("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000", "10##########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
    }

    @Test
    public void test2578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2578");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt(0);
        char char5 = strBuilder1.charAt((int) (byte) 1);
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceFirst(strMatcher6, "1                      ");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.deleteFirst('!');
        java.io.Writer writer11 = strBuilder10.asWriter();
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendWithSeparators(collection12, "0.0\n########10-");
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int16 = strBuilder10.lastIndexOf(strMatcher15);
        int int17 = strBuilder10.capacity();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '!' + "'", char5 == '!');
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 35 + "'", int17 == 35);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.replaceAll("########10-1", "##########");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder16.replaceAll(strMatcher23, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder16.setNullText("-140");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder16.clear();
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        boolean boolean30 = strBuilder16.contains(strMatcher29);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
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
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder20.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher46 = null;
        int int47 = strBuilder45.lastIndexOf(strMatcher46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder26.append((java.lang.Object) int47);
        char[] charArray51 = new char[] { ' ', '#' };
        char[] charArray52 = strBuilder26.getChars(charArray51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder21.insert(12, (java.lang.Object) strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append(25);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadLeft((int) 'a', (int) '!', '!');
        boolean boolean60 = strBuilder59.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(charArray51);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray51), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray51), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray51), "[ , #]");
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.appendFixedWidthPadRight((int) '!', 3, '1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        java.lang.String str14 = strBuilder13.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.deleteFirst("zed yet]true");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder13.deleteFirst(strMatcher17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = strBuilder13.substring(23);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2583");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.replaceFirst(' ', 'a');
        int int11 = strBuilder8.lastIndexOf("hi!", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer27 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(stringBuffer27, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder8.append(stringBuffer27, (int) (byte) 0, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder8.insert(110, '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 110");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2584");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean5 = strBuilder2.equalsIgnoreCase(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.trim();
        boolean boolean7 = strBuilder0.equals(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder0.insert((int) (byte) 0, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder0.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder13.appendFixedWidthPadLeft((int) (byte) -1, 0, '!');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder0.append(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.reverse();
        java.lang.String str12 = strBuilder11.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.append(2);
        java.lang.String str16 = strBuilder14.substring((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2" + "'", str16, "2");
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        java.lang.String str8 = strBuilder7.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.deleteFirst('!');
        java.lang.String str12 = strBuilder7.leftString((int) (byte) 1);
        int int14 = strBuilder7.lastIndexOf('0');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "1" + "'", str12, "1");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteFirst("41");
        int int7 = strBuilder4.size();
        java.io.Reader reader8 = strBuilder4.asReader();
        java.io.Writer writer9 = strBuilder4.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.append(true);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertNotNull(writer9);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2588");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendNull();
        java.lang.String str12 = strBuilder8.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.deleteFirst(strMatcher13);
        int int17 = strBuilder14.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13", 105);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "10\n" + "'", str12, "10\n");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test2589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2589");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteFirst(strMatcher5);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append('a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer24 = strBuilder20.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.append(stringBuffer24, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strBuilder32.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray58 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder45.insert(0, charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder38.append(charArray58);
        char[] charArray61 = strBuilder32.getChars(charArray58);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder27.append(charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder1.appendFixedWidthPadRight((java.lang.Object) strBuilder62, 0, '!');
        java.io.Reader reader66 = strBuilder65.asReader();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(reader66);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.appendFixedWidthPadRight(105, (int) (short) 1, '!');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.replaceFirst(strMatcher14, "###########4##########100");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append((int) (byte) 10);
        java.lang.String str25 = strBuilder24.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.ensureCapacity(25);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder(11);
        int int31 = strBuilder29.lastIndexOf("########10-1");
        org.apache.commons.lang.text.StrMatcher strMatcher32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.deleteAll(strMatcher32);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append((int) (byte) 10);
        int int43 = strBuilder39.indexOf('#');
        int int44 = strBuilder39.length();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.replaceFirst('a', '#');
        boolean boolean59 = strBuilder39.equals(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean64 = strBuilder61.equalsIgnoreCase(strBuilder63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder63.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder63.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer73 = strBuilder72.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder39.append(stringBuffer73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder33.append(stringBuffer73);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder27.append(stringBuffer73);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder16.append(stringBuffer73, 9, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "10" + "'", str25, "10");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 2 + "'", int44 == 2);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(stringBuffer73);
        org.junit.Assert.assertEquals(stringBuffer73.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder76);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.setNewLineText("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replace(42, 61, "## ##########10");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void test2592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2592");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        boolean boolean3 = strBuilder1.contains(strMatcher2);
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteFirst(strMatcher4);
        int int6 = strBuilder1.size();
        java.lang.String str8 = strBuilder1.rightString((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.deleteAll("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((float) 1L);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.deleteFirst("hi!hi!##########hi!-1hi!StrTokenizer[not tokenized yaet]hi!hi!true3");
        java.lang.String str20 = strBuilder18.rightString(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "##########" + "'", str20, "##########");
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
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
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.replaceFirst("", "hi!");
        boolean boolean52 = strBuilder29.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder29.replaceAll('4', ' ');
        java.io.Reader reader56 = strBuilder29.asReader();
        boolean boolean57 = strBuilder3.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder3.append(0);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.insert((int) '0', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strBuilder59);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        int int18 = strBuilder16.indexOf("hi!");
        int int21 = strBuilder16.lastIndexOf("1##########", 17);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.replaceAll("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "41##########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        java.lang.String str32 = strBuilder21.rightString((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder21.deleteAll("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.setNullText("41");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.append("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder35.insert((int) (short) 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder35.clear();
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
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "41" + "'", str32, "41");
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
    }

    @Test
    public void test2596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2596");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        int int8 = strBuilder4.indexOf('4', 13);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.replaceFirst("###########4##########100", "");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2597");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNewLineText("41");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.appendPadding(0, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.append((float) 13);
        org.apache.commons.lang.text.StrMatcher strMatcher38 = null;
        boolean boolean39 = strBuilder37.contains(strMatcher38);
        int int41 = strBuilder37.lastIndexOf("#########");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder37.replaceAll('r', 'r');
        java.lang.String str45 = strBuilder44.getNullText();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNull(str45);
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.append((long) (byte) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.replaceAll(strMatcher31, "##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        boolean boolean41 = strBuilder34.equals(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder34.insert((int) (byte) 0, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.insert((int) (byte) 1, (double) 10L);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray64 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder51.insert(0, charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean70 = strBuilder67.equalsIgnoreCase(strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder67.replaceFirst("", "hi!");
        boolean boolean74 = strBuilder51.equalsIgnoreCase(strBuilder67);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder67.deleteAll("41");
        char[] charArray77 = strBuilder76.toCharArray();
        char[] charArray78 = strBuilder47.getChars(charArray77);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder33.append(charArray78, 100, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 4");
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
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[]");
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "#10.0#######10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "#10.0#######10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[#, 1, 0, ., 0, #, #, #, #, #, #, #, 1, 0, h, i, !, #, #, #, #, #, #, #, #, #, #, -, 1, S, t, r, T, o, k, e, n, i, z, e, r, [, n, o, t,  , t, o, k, e, n, i, z, e, d,  , y, e, t, ], t, r, u, e, 0]");
    }

    @Test
    public void test2599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2599");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        int int8 = strBuilder7.length();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean13 = strBuilder10.equalsIgnoreCase(strBuilder12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray25 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder12.insert(0, charArray25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.append('4');
        boolean boolean36 = strBuilder30.contains("");
        boolean boolean37 = strBuilder26.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder41.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder41.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strBuilder57.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder30.appendWithSeparators((java.util.Iterator) strTokenizer58, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder7.appendWithSeparators((java.util.Iterator) strTokenizer58, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.ensureCapacity((int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder64.append(false);
        java.lang.String str69 = strBuilder64.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "4 false" + "'", str69, "4 false");
    }

    @Test
    public void test2600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2600");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.insert(0, '0');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll('1', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int30 = strBuilder21.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder21.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder21.replaceAll(strMatcher34, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer37 = strBuilder21.toStringBuffer();
        int int40 = strBuilder21.lastIndexOf("###10", 3);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder21.setLength(12);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder21.deleteFirst("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa32aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13");
        boolean boolean45 = strBuilder17.equals((java.lang.Object) strBuilder44);
        int int47 = strBuilder44.lastIndexOf("\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('a', '4');
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder34.lastIndexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append((java.lang.Object) int36);
        char[] charArray40 = new char[] { ' ', '#' };
        char[] charArray41 = strBuilder15.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder10.append(charArray41, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder10.append(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean51 = strBuilder48.equalsIgnoreCase(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.deleteFirst('a');
        int int59 = strBuilder55.lastIndexOf("########10-1true");
        boolean boolean60 = strBuilder46.equalsIgnoreCase(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , #]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test2602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2602");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder16.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("");
        boolean boolean20 = strBuilder7.equals(strBuilder17);
        boolean boolean21 = strBuilder7.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder7.ensureCapacity(14);
        int int26 = strBuilder23.lastIndexOf('r', 91);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.append('!');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder17.setNullText("1");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder33.clear();
        boolean boolean36 = strBuilder34.endsWith("100.0########10");
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        int int38 = strBuilder34.indexOf(strMatcher37);
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2604");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        char[] charArray18 = strBuilder3.toCharArray(10, 25);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.appendPadding(24, '#');
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder43.append('4');
        boolean boolean49 = strBuilder43.contains("");
        boolean boolean50 = strBuilder39.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder39.append((long) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append("0");
        java.lang.StringBuffer stringBuffer55 = strBuilder54.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.append(stringBuffer55);
        java.lang.String str57 = strBuilder3.getNullText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[]");
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
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(stringBuffer55);
        org.junit.Assert.assertEquals(stringBuffer55.toString(), "##4##########1000");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNull(str57);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.setLength((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.deleteAll("!#######10");
        int int14 = strBuilder13.length();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder23.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.appendPadding((int) ' ', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendWithSeparators(collection30, "");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceFirst('a', '4');
        boolean boolean39 = strBuilder38.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.appendPadding((int) 'a', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder27.append(strBuilder42);
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder27.replaceFirst(strMatcher44, "1##########");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder27.deleteFirst('!');
        java.lang.StringBuffer stringBuffer49 = strBuilder48.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder13.append(stringBuffer49);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strBuilder50);
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
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.appendFixedWidthPadRight(62, (int) (byte) 10, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append(false);
        int int27 = strBuilder24.indexOf("4##########", 103);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((long) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceAll(strMatcher10, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst("10\n", "[not tokenized yaet]hi!hi!true3");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.setNullText("#####100");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst("########10-152.0", "#4##########10");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder((int) 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        int int15 = strBuilder13.lastIndexOf(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteCharAt(0);
        int int21 = strBuilder19.lastIndexOf('4');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder25.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendWithSeparators(collection41, "");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer54 = strBuilder50.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer61 = strBuilder60.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean67 = strBuilder64.equalsIgnoreCase(strBuilder66);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.append('4');
        boolean boolean72 = strBuilder66.contains("");
        java.lang.Object[] objArray73 = new java.lang.Object[] { "hi!", stringBuffer54, (byte) -1, strTokenizer61, "", boolean72 };
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder25.appendWithSeparators(objArray73, "");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.append((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder77.append(strBuilder78);
        int int81 = strBuilder77.indexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder19.appendFixedWidthPadRight((java.lang.Object) 'a', (int) (short) 10, 'a');
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strBuilder19.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder13.appendWithSeparators((java.util.Iterator) strTokenizer85, "##########100");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder10.appendWithSeparators((java.util.Iterator) strTokenizer85, "000000000000000000000000000000000000000000000105");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder89.append((float) 105);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder91.append((-1.0f));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(stringBuffer54);
        org.junit.Assert.assertEquals(stringBuffer54.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strTokenizer61);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray73), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray73), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + (-1) + "'", int81 == (-1));
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2609");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        java.io.Writer writer11 = strBuilder10.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.setLength((int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll(strMatcher24, "##########");
        java.lang.String str27 = strBuilder23.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder13.insert(15, (java.lang.Object) strBuilder23);
        java.lang.String str30 = strBuilder13.substring(11);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder13.replaceFirst(strMatcher31, "41");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder13.insert((int) (short) -1, '#');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000" + "'", str30, "\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertNotNull(strBuilder33);
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
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder32.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder32.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer49 = strBuilder48.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer49, "41");
        boolean boolean53 = strBuilder51.contains('4');
        int int56 = strBuilder51.lastIndexOf("1", (int) '1');
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder51.replaceAll(strMatcher57, "100.0");
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
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strTokenizer49);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 14 + "'", int56 == 14);
        org.junit.Assert.assertNotNull(strBuilder59);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.insert((int) (short) 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder3.replaceFirst("##4##", "10");
        int int61 = strBuilder59.lastIndexOf("## ##########10");
        int int64 = strBuilder59.lastIndexOf("000000000000000000000000000000000000000000000105", 25);
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        int int66 = strBuilder59.indexOf(strMatcher65);
        java.lang.Class<?> wildcardClass67 = strBuilder59.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + (-1) + "'", int61 == (-1));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass67);
    }

    @Test
    public void test2612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2612");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt(0);
        char char5 = strBuilder1.charAt((int) (byte) 1);
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.replaceFirst(strMatcher6, "1                      ");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.deleteFirst('!');
        java.io.Writer writer11 = strBuilder10.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst(strMatcher20, "");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder22.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append((long) 23);
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
        java.lang.String str51 = strBuilder49.rightString((int) '4');
        boolean boolean52 = strBuilder25.equalsIgnoreCase(strBuilder49);
        java.lang.String str54 = strBuilder49.rightString(10);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder49.append((float) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder49.appendPadding(32, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder10.appendFixedWidthPadLeft((java.lang.Object) 32, 31, ' ');
        java.io.Writer writer63 = strBuilder10.asWriter();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '!' + "'", char5 == '!');
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "##4##" + "'", str51, "##4##");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "##4##" + "'", str54, "##4##");
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(writer63);
    }

    @Test
    public void test2613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2613");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.insert((int) (short) 10, ' ');
        java.lang.String str57 = strBuilder3.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder3.ensureCapacity((int) '1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strBuilder59);
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        int int12 = strBuilder7.indexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        java.lang.String str54 = strBuilder53.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "########10hi!##########-1StrTokenizer[not tokenized yet]true" + "'", str54, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNewLineText("41");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder32.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst("##########hi!##########-1StrTokenizer[not tokenized yet]true0.0");
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder((int) (byte) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.append((double) 3);
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        int int6 = strBuilder3.lastIndexOf(strMatcher4, 17);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replaceAll("10", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder5.replaceFirst(' ', ' ');
        int int19 = strBuilder5.indexOf('#');
        java.lang.StringBuffer stringBuffer20 = strBuilder5.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder5.append(63);
        int int25 = strBuilder5.indexOf("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(stringBuffer20);
        org.junit.Assert.assertEquals(stringBuffer20.toString(), "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.append((double) (short) 100);
        java.lang.String str22 = strBuilder21.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "########10100.0" + "'", str22, "########10100.0");
    }

    @Test
    public void test2620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2620");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('a', '4');
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder34.lastIndexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append((java.lang.Object) int36);
        char[] charArray40 = new char[] { ' ', '#' };
        char[] charArray41 = strBuilder15.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder10.append(charArray41, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder10.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder10.append(11);
        boolean boolean51 = strBuilder10.endsWith("##4##");
        boolean boolean53 = strBuilder10.contains("32");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , #]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.insert(0, (-1));
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int33 = strBuilder30.indexOf(strMatcher31, 17);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendWithSeparators(collection36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder38.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean51 = strBuilder48.equalsIgnoreCase(strBuilder50);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder50.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.append((int) (byte) 10);
        int int56 = strBuilder52.indexOf('#');
        int int57 = strBuilder52.length();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder63.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder66.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder66.replaceFirst('a', '#');
        boolean boolean72 = strBuilder52.equals(strBuilder66);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean77 = strBuilder74.equalsIgnoreCase(strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder76.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder76.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer86 = strBuilder85.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder52.append(stringBuffer86);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder38.append(stringBuffer86);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder30.append(stringBuffer86, (int) (byte) -1, 62);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + (-1) + "'", int33 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 2 + "'", int57 == 2);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(stringBuffer86);
        org.junit.Assert.assertEquals(stringBuffer86.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder88);
    }

    @Test
    public void test2622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2622");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replaceAll("10", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder5.replaceFirst(' ', ' ');
        int int19 = strBuilder5.indexOf('#');
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        int int22 = strBuilder5.lastIndexOf(strMatcher20, 99);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2623");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.deleteAll('#');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder12.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.deleteAll(strMatcher14);
        int int16 = strBuilder15.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.insert(0, (-1));
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray33 = strBuilder3.toCharArray(27, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
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
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.append((long) 25);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendWithSeparators(collection21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteFirst("41");
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.deleteFirst(strMatcher26);
        org.apache.commons.lang.text.StrTokenizer strTokenizer28 = strBuilder27.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.insert((int) (short) 0, "########10");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder33.clear();
        boolean boolean35 = strBuilder31.equals(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder33.append((java.lang.Object) strBuilder41);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder3.insert(103, (java.lang.Object) strBuilder41);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 103");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strTokenizer28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer44 = strBuilder40.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.append(stringBuffer44, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder21.append(stringBuffer44);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.deleteAll("########10-1true");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean55 = strBuilder52.equalsIgnoreCase(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher59 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.replaceFirst(strMatcher59, "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder61.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.append((long) 23);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean69 = strBuilder66.equalsIgnoreCase(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean74 = strBuilder71.equalsIgnoreCase(strBuilder73);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder73.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray86 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder73.insert(0, charArray86);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder66.append(charArray86);
        java.lang.String str90 = strBuilder88.rightString((int) '4');
        boolean boolean91 = strBuilder64.equalsIgnoreCase(strBuilder88);
        java.lang.String str93 = strBuilder88.rightString(10);
        boolean boolean94 = strBuilder50.equals((java.lang.Object) 10);
        java.io.Reader reader95 = strBuilder50.asReader();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "##4##" + "'", str90, "##4##");
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "##4##" + "'", str93, "##4##");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(reader95);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.replaceFirst('4', '!');
        java.lang.String str63 = strBuilder56.midString(13, 12);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder56.setNewLineText("##4##");
        int int68 = strBuilder65.lastIndexOf("###########4########", 68);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test2628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2628");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst(strMatcher11, "zed yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder22.append((long) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.append('4');
        int int35 = strBuilder34.length();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.append((int) (byte) 10);
        int int39 = strBuilder37.indexOf('!');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.replaceAll("1", "!#######10");
        char[] charArray43 = strBuilder37.toCharArray();
        char[] charArray44 = strBuilder22.getChars(charArray43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder10.append(charArray43, 36, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Invalid startIndex: 32");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "4 100####100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "4 100####100");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[4,  , 1, 0, 0, #, #, #, #, 1, 0, 0]");
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "4 100####100");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "4 100####100");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[4,  , 1, 0, 0, #, #, #, #, 1, 0, 0]");
    }

    @Test
    public void test2629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2629");
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
        java.util.Iterator iterator24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder1.appendWithSeparators(iterator24, "-1");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray43 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert(0, charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.append('4');
        boolean boolean54 = strBuilder48.contains("");
        boolean boolean55 = strBuilder44.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder67.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer71 = strBuilder67.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder65.append(stringBuffer71, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder48.append(stringBuffer71);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean80 = strBuilder77.equalsIgnoreCase(strBuilder79);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder79.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder81.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder85.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer89 = strBuilder85.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder81.append(stringBuffer89);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder75.append(stringBuffer89, 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder1.append(stringBuffer89);
        org.apache.commons.lang.text.StrMatcher strMatcher95 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder94.replaceAll(strMatcher95, "##4##########10");
        int int98 = strBuilder94.length();
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
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(stringBuffer71);
        org.junit.Assert.assertEquals(stringBuffer71.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(stringBuffer89);
        org.junit.Assert.assertEquals(stringBuffer89.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 15 + "'", int98 == 15);
    }

    @Test
    public void test2630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2630");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.appendFixedWidthPadLeft(13, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray37 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder24.insert(0, charArray37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.append('4');
        boolean boolean48 = strBuilder42.contains("");
        boolean boolean49 = strBuilder38.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strBuilder56.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder42.appendWithSeparators((java.util.Iterator) strTokenizer57, "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder9.appendWithSeparators((java.util.Iterator) strTokenizer57, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        int int64 = strBuilder9.indexOf('4', 0);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder9.append((double) 67);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strBuilder66);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        char[] charArray28 = new char[] { ' ', '#' };
        char[] charArray29 = strBuilder3.getChars(charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder3.appendPadding((int) (short) 0, '#');
        java.lang.String str33 = strBuilder32.getNewLineText();
        java.util.Collection collection34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.appendWithSeparators(collection34, "#");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.insert(99, (float) 67);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , #]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strBuilder36);
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
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.replaceFirst('4', '!');
        java.lang.String str63 = strBuilder56.midString(13, 12);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder56.setNewLineText("10##########");
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder56.replaceAll(strMatcher66, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder56.append((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder70.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.replaceFirst("########10-1true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder71.ensureCapacity(13);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder71.append((float) 1L);
        java.io.Writer writer79 = strBuilder78.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.ensureCapacity((int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder78.deleteFirst("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(writer79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
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
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder9.appendFixedWidthPadRight((int) (short) 1, 12, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int16 = strBuilder9.indexOf(strMatcher15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int14 = strBuilder11.lastIndexOf(strMatcher12, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((int) 'a');
        char[] charArray19 = strBuilder18.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.append(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "97");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "97");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[9, 7]");
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll("10");
        boolean boolean5 = strBuilder3.endsWith("##");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.ensureCapacity(2);
        java.lang.String str10 = strBuilder3.midString((int) ' ', 3);
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2636");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder3.equals(strBuilder7);
        java.util.Collection collection9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.appendWithSeparators(collection9, "");
        java.io.Reader reader12 = strBuilder11.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendWithSeparators(collection15, "");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst("41");
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.deleteFirst(strMatcher20);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.replaceFirst('#', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.deleteAll(strMatcher25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.appendFixedWidthPadLeft(25, (int) '4', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder11.append(strBuilder27, (int) '!', 11);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder43.replaceFirst('a', '#');
        java.lang.String str49 = strBuilder48.getNewLineText();
        boolean boolean50 = strBuilder11.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrMatcher strMatcher51 = null;
        int int53 = strBuilder11.indexOf(strMatcher51, 24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(reader12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
    }

    @Test
    public void test2637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2637");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.deleteAll("");
        int int9 = strBuilder1.indexOf('#');
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.replaceAll(strMatcher10, "");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst('0');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.replaceFirst(strMatcher15, "4141");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        int int31 = strBuilder17.lastIndexOf("10", (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder17.append((double) 1L);
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        int int35 = strBuilder17.indexOf(strMatcher34);
        boolean boolean37 = strBuilder17.startsWith("4!#######100");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 23 + "'", int31 == 23);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.append((double) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((long) 2);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.replaceAll(strMatcher15, "##4##");
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
        java.lang.String str43 = strBuilder41.rightString((int) '4');
        int int45 = strBuilder41.indexOf('!');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.setNullText("########10");
        boolean boolean48 = strBuilder17.equals(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder17.append((long) 27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
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
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "##4##" + "'", str43, "##4##");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strBuilder50);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.clear();
        java.lang.String str16 = strBuilder8.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder8.insert(0, "");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean24 = strBuilder21.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        boolean boolean30 = strBuilder8.equalsIgnoreCase(strBuilder23);
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int32 = strBuilder8.indexOf(strMatcher31);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder8.insert((int) (short) 10, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.replaceFirst('4', '!');
        java.lang.String str63 = strBuilder56.midString(13, 12);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder56.setNewLineText("10##########");
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder56.replaceAll(strMatcher66, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder56.append((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder70.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.replaceFirst("########10-1true", "##");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.append("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.append((double) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.setNewLineText("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2643");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        int int12 = strBuilder7.indexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.appendNull();
        java.lang.StringBuffer stringBuffer14 = strBuilder13.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(stringBuffer14);
        org.junit.Assert.assertEquals(stringBuffer14.toString(), "");
    }

    @Test
    public void test2644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2644");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder49.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strBuilder65.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder38.appendWithSeparators((java.util.Iterator) strTokenizer66, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder68, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean76 = strBuilder73.equalsIgnoreCase(strBuilder75);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder73.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.replaceFirst(strMatcher80, "");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder79.setNullText("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder9.append(strBuilder79);
        org.apache.commons.lang.text.StrMatcher strMatcher86 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder79.replaceAll(strMatcher86, "1                      ");
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder79.setNewLineText("!##########-1StrTokenizer[not tokenized yet]truetrue");
        int int93 = strBuilder90.lastIndexOf('a', 70);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder19.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder24.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder24.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder20.append(strBuilder40);
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        int int44 = strBuilder42.lastIndexOf(strMatcher43);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.insert(12, (long) 11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2646");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.appendPadding((int) ' ', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendWithSeparators(collection15, "");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst('a', '4');
        boolean boolean24 = strBuilder23.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.appendPadding((int) 'a', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder12.append(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder12.appendPadding(24, '1');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder31.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.setLength(0);
        java.io.Reader reader35 = strBuilder31.asReader();
        java.util.Collection collection36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder31.appendWithSeparators(collection36, "10\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2647");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        boolean boolean3 = strBuilder1.contains(strMatcher2);
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteFirst(strMatcher4);
        java.lang.String str6 = strBuilder5.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean11 = strBuilder8.equalsIgnoreCase(strBuilder10);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.replaceFirst('a', '#');
        java.lang.String str21 = strBuilder20.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.deleteFirst("zed yet]true");
        char[] charArray24 = strBuilder23.toCharArray();
        char[] charArray25 = strBuilder5.getChars(charArray24);
        int int27 = strBuilder5.indexOf("1");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "41" + "'", str6, "41");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "41\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "41\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[4, 1, \n]");
        org.junit.Assert.assertNotNull(charArray25);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray25), "41\n");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray25), "41\n");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray25), "[4, 1, \n]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder5.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendWithSeparators(collection21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder23.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer34 = strBuilder30.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer41 = strBuilder40.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.append('4');
        boolean boolean52 = strBuilder46.contains("");
        java.lang.Object[] objArray53 = new java.lang.Object[] { "hi!", stringBuffer34, (byte) -1, strTokenizer41, "", boolean52 };
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder5.appendWithSeparators(objArray53, "");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder1.appendWithSeparators(objArray53, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder1.insert((int) '4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.append("");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.append(3);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder62.replaceAll('0', '!');
        int int69 = strBuilder62.lastIndexOf('0');
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(stringBuffer34);
        org.junit.Assert.assertEquals(stringBuffer34.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strTokenizer41);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray53), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder3.equals(strBuilder7);
        int int9 = strBuilder3.size();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.appendNewLine();
        java.lang.String str12 = strBuilder3.rightString(22);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceFirst(strMatcher13, "##");
        java.lang.String str17 = strBuilder15.substring((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\n" + "'", str12, "\n");
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        boolean boolean6 = strBuilder1.startsWith("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.deleteFirst("10");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder1.delete(23, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strBuilder8);
    }

    @Test
    public void test2651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2651");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.replaceFirst(' ', 'a');
        int int11 = strBuilder8.lastIndexOf("hi!", (int) '#');
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteFirst(strMatcher12);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder17.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder17.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendWithSeparators(collection33, "");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder35.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer46 = strBuilder42.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer53 = strBuilder52.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.append('4');
        boolean boolean64 = strBuilder58.contains("");
        java.lang.Object[] objArray65 = new java.lang.Object[] { "hi!", stringBuffer46, (byte) -1, strTokenizer53, "", boolean64 };
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder17.appendWithSeparators(objArray65, "");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean72 = strBuilder69.equalsIgnoreCase(strBuilder71);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean77 = strBuilder74.equalsIgnoreCase(strBuilder76);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder76.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder76.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray89 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder76.insert(0, charArray89);
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder69.append(charArray89);
        char[] charArray92 = strBuilder67.getChars(charArray89);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder13.append(charArray89);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder93.insert(61, (long) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 61");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strTokenizer53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray65), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray65), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(charArray89);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray89), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray89), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray89), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(charArray92);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray92), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray92), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray92), "[#, #, #, #, #, #, #, #, 1, 0, h, i, !, #, #, #, #, #, #, #, #, #, #, -, 1, S, t, r, T, o, k, e, n, i, z, e, r, [, n, o, t,  , t, o, k, e, n, i, z, e, d,  , y, e, t, ], t, r, u, e]");
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray24 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.insert(0, charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strBuilder31.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder25.insert(0, (java.lang.Object) strBuilder35);
        boolean boolean37 = strBuilder1.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder25.deleteFirst('#');
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder25.deleteAll(strMatcher40);
        java.lang.String str42 = strBuilder41.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.append((double) 97);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strTokenizer32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "###########4##########10" + "'", str42, "###########4##########10");
        org.junit.Assert.assertNotNull(strBuilder44);
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
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
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.replaceFirst("", "hi!");
        boolean boolean45 = strBuilder22.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.deleteAll("41");
        char[] charArray48 = strBuilder47.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder18.append(charArray48);
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        int int51 = strBuilder49.indexOf(strMatcher50);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder49.ensureCapacity((int) '0');
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray56 = strBuilder49.toCharArray((int) '0', 7);
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[]");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.setNullText("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceAll("##########", "########10-1true");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.deleteAll("");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.setCharAt((int) (byte) 100, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 100");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.clear();
        java.lang.String str16 = strBuilder8.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.insert(0, (long) ' ');
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strBuilder20.asTokenizer();
        java.lang.Object obj22 = null;
        boolean boolean23 = strBuilder20.equals(obj22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.setLength(15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder20.insert(57, (float) 105);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 57");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2656");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        int int22 = strBuilder3.lastIndexOf("###10", 3);
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.replaceAll(strMatcher23, "-140");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder3.replaceAll('#', '!');
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteFirst(strMatcher29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendNewLine();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder3.insert((int) (short) 10, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.insert((int) (byte) 0, "########10-1true");
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.deleteFirst(strMatcher60);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean66 = strBuilder63.equalsIgnoreCase(strBuilder65);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean71 = strBuilder68.equalsIgnoreCase(strBuilder70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder70.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray83 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder70.insert(0, charArray83);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder63.append(charArray83);
        java.util.Iterator iterator86 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder63.appendWithSeparators(iterator86, "-1");
        boolean boolean89 = strBuilder61.equalsIgnoreCase(strBuilder63);
        int int90 = strBuilder61.size();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(charArray83);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray83), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray83), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray83), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 77 + "'", int90 == 77);
    }

    @Test
    public void test2658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2658");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.deleteFirst('0');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder9.appendFixedWidthPadLeft((int) (short) 0, 32, '!');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer25 = strBuilder24.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher26 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.deleteAll(strMatcher26);
        java.lang.StringBuffer stringBuffer28 = strBuilder24.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder9.append(stringBuffer28);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strTokenizer25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(stringBuffer28);
        org.junit.Assert.assertEquals(stringBuffer28.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder29);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.replaceFirst('4', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder32.insert(0, (java.lang.Object) strBuilder42);
        char[] charArray44 = strBuilder32.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder10.append(charArray44, (int) (byte) 0, 15);
        int int50 = strBuilder47.indexOf(' ', (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(charArray44);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray44), "############4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray44), "############4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray44), "[#, #, #, #, #, #, #, #, #, #, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        int int12 = strBuilder3.indexOf("##4##", 100);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceFirst('a', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        boolean boolean21 = strBuilder19.contains(strMatcher20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder11.append(charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder11.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder11.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder9.append(strBuilder11, 2, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder9.replaceFirst("10\n", "10##########");
        int int45 = strBuilder42.lastIndexOf("10\n", 27);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.setLength((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder3.deleteAll("!#######10");
        int int14 = strBuilder13.length();
        java.lang.String str15 = strBuilder13.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "########10" + "'", str15, "########10");
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
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray28 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder15.insert(0, charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append('4');
        boolean boolean39 = strBuilder33.contains("");
        boolean boolean40 = strBuilder29.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.setNewLineText("41");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder42, 32, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.appendFixedWidthPadLeft((int) (short) 0, (int) '#', '4');
        int int53 = strBuilder47.indexOf('0');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder47.replaceAll("########10hi!##########-1StrTokenizer[not tokenized yet]true", "10\n");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 66 + "'", int53 == 66);
        org.junit.Assert.assertNotNull(strBuilder56);
    }

    @Test
    public void test2664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2664");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("!#######10");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean7 = strBuilder4.equalsIgnoreCase(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray24 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.insert(0, charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder4.append(charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder1.insert(2, charArray24, (int) (byte) 1, 1);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder29.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.setCharAt((int) (byte) 10, '!');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.appendFixedWidthPadLeft(8, 22, 'r');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder37);
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNewLineText("41");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        int int34 = strBuilder32.lastIndexOf(strMatcher33);
        java.util.Collection collection35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.appendWithSeparators(collection35, "0");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append('1');
        boolean boolean41 = strBuilder37.endsWith("!!!!!!!!!!!!!!");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2666");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((long) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceAll(strMatcher10, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.replaceFirst("10\n", "[not tokenized yaet]hi!hi!true3");
        int int18 = strBuilder15.indexOf("#", 61);
        java.io.Reader reader19 = strBuilder15.asReader();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(reader19);
    }

    @Test
    public void test2667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2667");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll("10");
        boolean boolean5 = strBuilder3.endsWith("##");
        boolean boolean7 = strBuilder3.startsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder11.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder11.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection27 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder26.appendWithSeparators(collection27, "");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder29.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer40 = strBuilder36.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer47 = strBuilder46.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.append('4');
        boolean boolean58 = strBuilder52.contains("");
        java.lang.Object[] objArray59 = new java.lang.Object[] { "hi!", stringBuffer40, (byte) -1, strTokenizer47, "", boolean58 };
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder11.appendWithSeparators(objArray59, "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder61.minimizeCapacity();
        int int64 = strBuilder62.indexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean69 = strBuilder66.equalsIgnoreCase(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder68.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder68.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.append(' ');
        int int78 = strBuilder75.indexOf("hi!", (int) ' ');
        boolean boolean79 = strBuilder62.equalsIgnoreCase(strBuilder75);
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strBuilder75.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer80, "10");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder82.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder82.insert(77, ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 77");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strTokenizer47);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray59), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray59), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
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
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.replaceFirst("", "hi!");
        boolean boolean52 = strBuilder29.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder29.replaceAll('4', ' ');
        java.io.Reader reader56 = strBuilder29.asReader();
        boolean boolean57 = strBuilder3.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder3.deleteFirst('a');
        java.lang.StringBuffer stringBuffer60 = strBuilder3.toStringBuffer();
        int int63 = strBuilder3.indexOf("10\n", (int) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder3.deleteFirst("4141");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
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
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(reader56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(stringBuffer60);
        org.junit.Assert.assertEquals(stringBuffer60.toString(), "########10-1");
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder65);
    }

    @Test
    public void test2669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2669");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder1.replaceFirst(strMatcher14, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder16.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendPadding(14, '!');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll("zed yet]true", "\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2670");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll(strMatcher5, "");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher31 = null;
        int int32 = strBuilder30.lastIndexOf(strMatcher31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder11.append((java.lang.Object) int32);
        char[] charArray36 = new char[] { ' ', '#' };
        char[] charArray37 = strBuilder11.getChars(charArray36);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder11.appendPadding((int) (short) 0, '#');
        boolean boolean41 = strBuilder4.equals((java.lang.Object) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder4.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.append((float) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder46.appendNewLine();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[ , #]");
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer13 = strBuilder12.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        boolean boolean22 = strBuilder12.equals(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder12.append("########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.appendNewLine();
        int int27 = strBuilder25.lastIndexOf("########10-1true");
        org.apache.commons.lang.text.StrMatcher strMatcher28 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.replaceFirst(strMatcher28, "1                      ");
        int int32 = strBuilder30.indexOf("hi!hi!##########hi!-1hi!StrTokenizer[not tokenized yaet]hi!hi!true3");
        int int35 = strBuilder30.indexOf('0', 11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "########10");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + (-1) + "'", int32 == (-1));
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 19 + "'", int35 == 19);
    }

    @Test
    public void test2672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2672");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(11);
        int int3 = strBuilder1.lastIndexOf("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.append(1.0d);
        java.lang.String str6 = strBuilder5.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1.0" + "'", str6, "1.0");
    }

    @Test
    public void test2673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2673");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean5 = strBuilder2.equalsIgnoreCase(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.trim();
        boolean boolean7 = strBuilder0.equals(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder0.append((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.append((double) 15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
    }

    @Test
    public void test2674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2674");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('a', '4');
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        int int36 = strBuilder34.lastIndexOf(strMatcher35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append((java.lang.Object) int36);
        char[] charArray40 = new char[] { ' ', '#' };
        char[] charArray41 = strBuilder15.getChars(charArray40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder10.append(charArray41, (int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder10.append(0);
        boolean boolean47 = strBuilder10.isEmpty();
        java.lang.String str49 = strBuilder10.leftString(105);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.replaceFirst(strMatcher60, "");
        boolean boolean63 = strBuilder51.equals(strBuilder59);
        boolean boolean65 = strBuilder59.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean71 = strBuilder68.equalsIgnoreCase(strBuilder70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder75.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder75.clear();
        java.lang.String str83 = strBuilder75.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder75.deleteFirst("41");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder59.append(strBuilder75);
        boolean boolean87 = strBuilder10.equals(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(charArray40);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray40), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray40), "[ , #]");
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "0" + "'", str49, "0");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
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
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.deleteAll(strMatcher22);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.setNullText("");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
    }

    @Test
    public void test2676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2676");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        int int11 = strBuilder3.indexOf(strMatcher10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.deleteAll('#');
        java.lang.String str19 = strBuilder3.midString(13, 14);
        int int21 = strBuilder3.indexOf('!');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder3.insert(0, false);
        java.lang.StringBuffer stringBuffer25 = strBuilder3.toStringBuffer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "false4");
    }

    @Test
    public void test2677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2677");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.ensureCapacity((int) (short) 10);
        java.lang.StringBuffer stringBuffer7 = strBuilder6.toStringBuffer();
        org.junit.Assert.assertNotNull(strBuilder3);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(stringBuffer7);
        org.junit.Assert.assertEquals(stringBuffer7.toString(), "");
    }

    @Test
    public void test2678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2678");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append(true);
        java.lang.String str30 = strBuilder27.midString((-1), (int) '#');
        char[] charArray31 = strBuilder27.toCharArray();
        org.apache.commons.lang.text.StrTokenizer strTokenizer32 = strBuilder27.asTokenizer();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = strBuilder27.substring(99);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "########10-1true" + "'", str30, "########10-1true");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "########10-1true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "########10-1true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, #, #, #, #, #, #, 1, 0, -, 1, t, r, u, e]");
        org.junit.Assert.assertNotNull(strTokenizer32);
    }

    @Test
    public void test2679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2679");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.clear();
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        int int17 = strBuilder8.indexOf(strMatcher15, (int) ' ');
        java.lang.StringBuffer stringBuffer18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder8.append(stringBuffer18, 25, (int) (short) 1);
        int int24 = strBuilder8.indexOf('4', 1);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder8.deleteAll("41##########");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder8.append("########10-1true");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
    }

    @Test
    public void test2680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2680");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.replaceFirst('4', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteAll("\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        java.io.Reader reader14 = strBuilder8.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.replaceAll("##########", "########10-1");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(reader14);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2681");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder49.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strBuilder65.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder38.appendWithSeparators((java.util.Iterator) strTokenizer66, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder68, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher72 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder71.replace(strMatcher72, "########10-1", (int) (byte) 0, (int) '4', 25);
        boolean boolean78 = strBuilder71.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder71.setNullText("41##########");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = strBuilder80.substring(67, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strBuilder80);
    }

    @Test
    public void test2682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2682");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.deleteFirst("41");
        org.apache.commons.lang.text.StrMatcher strMatcher7 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.deleteFirst(strMatcher7);
        org.apache.commons.lang.text.StrTokenizer strTokenizer9 = strBuilder8.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.insert((int) (short) 0, "########10");
        java.util.Collection collection13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.appendWithSeparators(collection13, "ue0");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder17.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.setLength((int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft(52, 68, '0');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strTokenizer9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2683");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.replaceAll(strMatcher15, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder12.replaceFirst("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13", "");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder12.setNullText("4##########!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.setNullText("########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.String str33 = strBuilder30.midString((int) '#', (int) 'a');
        java.lang.String str35 = strBuilder30.substring((int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.deleteAll("#####100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder30.insert(97, (long) ' ');
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
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "###10" + "'", str35, "###10");
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.append(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.replaceFirst('4', '!');
        java.lang.String str63 = strBuilder56.midString(13, 12);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder56.setNewLineText("10##########");
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder56.replaceAll(strMatcher66, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder56.append((int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder70.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.appendNull();
        boolean boolean74 = strBuilder70.contains("########10-152.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
    }

    @Test
    public void test2686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2686");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        int int9 = strBuilder4.indexOf("########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.deleteAll("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.insert(10, (double) 1);
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendWithSeparators(collection15, "[not tokenized yaet]hi!hi!true3");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceFirst(strMatcher37, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder39.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean46 = strBuilder43.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder45.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean56 = strBuilder53.equalsIgnoreCase(strBuilder55);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder55.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder55.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher65 = null;
        int int66 = strBuilder64.lastIndexOf(strMatcher65);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder45.append((java.lang.Object) int66);
        char[] charArray70 = new char[] { ' ', '#' };
        char[] charArray71 = strBuilder45.getChars(charArray70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder40.insert(12, (java.lang.Object) strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.append((double) 110);
        char[] charArray77 = strBuilder72.toCharArray((int) (byte) 10, 105);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder14.insert(25, charArray77);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 25");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
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
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[ , #]");
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(charArray77);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray77), "##########10-14##110.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray77), "##########10-14##110.0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray77), "[#, #, #, #, #, #, #, #, #, #, 1, 0, -, 1, 4, #, #, 1, 1, 0, ., 0]");
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        int int22 = strBuilder3.lastIndexOf("###10", 3);
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder3.indexOf(strMatcher23);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test2688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2688");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        boolean boolean15 = strBuilder9.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.clear();
        java.lang.String str33 = strBuilder25.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder25.deleteFirst("41");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder9.append(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder25.deleteAll("4!#######100");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.replace(10, 17, "##4##########10");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
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
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int22 = strBuilder20.lastIndexOf(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean27 = strBuilder24.equalsIgnoreCase(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray39 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder26.insert(0, charArray39);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        boolean boolean51 = strBuilder40.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder44.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer59 = strBuilder58.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder44.appendWithSeparators((java.util.Iterator) strTokenizer59, "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean66 = strBuilder63.equalsIgnoreCase(strBuilder65);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder65.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder65.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder65.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder78.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer82 = strBuilder81.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder61.appendWithSeparators((java.util.Iterator) strTokenizer82, "10");
        boolean boolean85 = strBuilder20.equals(strBuilder84);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder84.appendNewLine();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray39);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray39), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray39), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strTokenizer59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strTokenizer82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(strBuilder86);
    }

    @Test
    public void test2690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2690");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setNullText("41");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int13 = strBuilder11.indexOf(strMatcher12);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder14.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer21 = strBuilder20.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer21, "########10########10hi!##########-1StrTokenizer[nothi!tokenizedhi!yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder15.trim();
        int int25 = strBuilder15.size();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strTokenizer21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 23 + "'", int25 == 23);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        int int20 = strBuilder3.indexOf("10", (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder3.deleteFirst("4");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceFirst(strMatcher33, "");
        boolean boolean36 = strBuilder24.equals(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.appendPadding((int) (short) 10, '#');
        java.lang.String str42 = strBuilder38.toString();
        boolean boolean43 = strBuilder24.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder38.insert((int) (short) 10, true);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder38.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.setNullText("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strBuilder56.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.replaceFirst(' ', 'a');
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
        char[] charArray85 = strBuilder56.getChars(charArray82);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder48.insert(2, charArray85);
        char[] charArray87 = strBuilder22.getChars(charArray85);
        java.io.Writer writer88 = strBuilder22.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher89 = null;
        int int90 = strBuilder22.lastIndexOf(strMatcher89);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "##########" + "'", str42, "##########");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strBuilder60);
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
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(charArray87);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray87), "############10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray87), "############10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray87), "[#, #, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(writer88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test2692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2692");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        int int9 = strBuilder4.indexOf("########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray28 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder15.insert(0, charArray28);
        org.apache.commons.lang.text.StrMatcher strMatcher30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.replaceFirst(strMatcher30, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder32.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder48.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher58 = null;
        int int59 = strBuilder57.lastIndexOf(strMatcher58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder38.append((java.lang.Object) int59);
        char[] charArray63 = new char[] { ' ', '#' };
        char[] charArray64 = strBuilder38.getChars(charArray63);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder33.insert(12, (java.lang.Object) strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.append((double) 110);
        char[] charArray70 = strBuilder65.toCharArray((int) (byte) 10, 105);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder4.insert((int) (short) -1, charArray70);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: -1");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-1) + "'", int59 == (-1));
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(charArray63);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray63), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray63), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray63), "[ , #]");
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(charArray70);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray70), "##########10-14##110.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray70), "##########10-14##110.0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray70), "[#, #, #, #, #, #, #, #, #, #, 1, 0, -, 1, 4, #, #, 1, 1, 0, ., 0]");
    }

    @Test
    public void test2693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2693");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        int int8 = strBuilder7.length();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.append((int) (byte) 10);
        int int12 = strBuilder10.indexOf('!');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder10.replaceAll("1", "!#######10");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.insert(5, (long) 55);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder15.append((float) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
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
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        int int22 = strBuilder3.lastIndexOf("###10", 3);
        java.util.Collection collection23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.appendWithSeparators(collection23, "10########10##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray43 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder30.insert(0, charArray43);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder48.append('4');
        boolean boolean54 = strBuilder48.contains("");
        boolean boolean55 = strBuilder44.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder48.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.setNewLineText("41");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder57.ensureCapacity((int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder3.insert(10, (java.lang.Object) strBuilder61);
        org.apache.commons.lang.text.StrMatcher strMatcher63 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder61.deleteFirst(strMatcher63);
        org.apache.commons.lang.text.StrTokenizer strTokenizer65 = strBuilder61.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder61.replaceAll(strMatcher66, "0.0\n########10-");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(charArray43);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray43), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray43), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strTokenizer65);
        org.junit.Assert.assertNotNull(strBuilder68);
    }

    @Test
    public void test2695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2695");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        int int9 = strBuilder4.indexOf("########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.deleteAll("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder4.replaceAll('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.appendFixedWidthPadLeft((int) '!', 105, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.replaceFirst(strMatcher29, "");
        boolean boolean32 = strBuilder20.equals(strBuilder28);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        boolean boolean34 = strBuilder20.contains(strMatcher33);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder20.insert((int) (short) 0, false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder57.replaceFirst("", "hi!");
        boolean boolean64 = strBuilder41.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder57.deleteAll("41");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean71 = strBuilder68.equalsIgnoreCase(strBuilder70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder70.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean81 = strBuilder78.equalsIgnoreCase(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder80.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder80.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher90 = null;
        int int91 = strBuilder89.lastIndexOf(strMatcher90);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder70.append((java.lang.Object) int91);
        char[] charArray95 = new char[] { ' ', '#' };
        char[] charArray96 = strBuilder70.getChars(charArray95);
        char[] charArray97 = strBuilder57.getChars(charArray95);
        char[] charArray98 = strBuilder20.getChars(charArray97);
        char[] charArray99 = strBuilder14.getChars(charArray98);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
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
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + (-1) + "'", int91 == (-1));
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(charArray95);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray95), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray95), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray95), "[ , #]");
        org.junit.Assert.assertNotNull(charArray96);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray96), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray96), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray96), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(charArray97);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray97), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray97), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray97), "[ , #]");
        org.junit.Assert.assertNotNull(charArray98);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray98), "false");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray98), "false");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray98), "[f, a, l, s, e]");
        org.junit.Assert.assertNotNull(charArray99);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray99), "##########                                                                                                       33");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray99), "##########                                                                                                       33");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray99), "[#, #, #, #, #, #, #, #, #, #,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  , 3, 3]");
    }

    @Test
    public void test2696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2696");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replaceAll("10", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        int int13 = strBuilder5.indexOf("10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder5.delete(12, 55);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder5.setCharAt((int) '!', '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2697");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder9.setNewLineText("##########");
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder9.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder9.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst('r');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
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
        java.util.Collection collection9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendWithSeparators(collection9, "");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll(strMatcher12, "##########");
        java.io.Reader reader15 = strBuilder14.asReader();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(reader15);
    }

    @Test
    public void test2699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2699");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.deleteFirst("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder15.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder15.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection31 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.appendWithSeparators(collection31, "");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder33.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer44 = strBuilder40.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer51 = strBuilder50.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean57 = strBuilder54.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder56.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder56.append('4');
        boolean boolean62 = strBuilder56.contains("");
        java.lang.Object[] objArray63 = new java.lang.Object[] { "hi!", stringBuffer44, (byte) -1, strTokenizer51, "", boolean62 };
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder15.appendWithSeparators(objArray63, "");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder65.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strBuilder66.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder3.appendWithSeparators((java.util.Iterator) strTokenizer70, "hi!");
        boolean boolean74 = strBuilder3.contains(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean79 = strBuilder76.equalsIgnoreCase(strBuilder78);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder78.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder78.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder78.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder78.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder3.append((java.lang.Object) strBuilder91);
        java.lang.String str93 = strBuilder91.getNewLineText();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strTokenizer51);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNull(str93);
    }

    @Test
    public void test2700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2700");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray28 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder15.insert(0, charArray28);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder33.append('4');
        boolean boolean39 = strBuilder33.contains("");
        boolean boolean40 = strBuilder29.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder33.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.setNewLineText("41");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder42, 32, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder47.appendFixedWidthPadLeft((int) (short) 0, (int) '#', '4');
        int int53 = strBuilder47.indexOf('0');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder47.deleteFirst("41##########100.0########10");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.insert(0, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 66 + "'", int53 == 66);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
    }

    @Test
    public void test2701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2701");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder13.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher20 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.replaceFirst(strMatcher20, "########10-1");
        boolean boolean24 = strBuilder19.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.appendNull();
        int int28 = strBuilder25.indexOf('#', (int) (byte) -1);
        java.lang.String str29 = strBuilder25.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.replaceAll("hi!", "########10-1true");
        boolean boolean33 = strBuilder1.equalsIgnoreCase(strBuilder32);
        java.lang.String str35 = strBuilder1.rightString((int) 'r');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "##########" + "'", str35, "##########");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer44 = strBuilder40.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.append(stringBuffer44, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder21.append(stringBuffer44);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer62 = strBuilder58.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder54.append(stringBuffer62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder48.append(stringBuffer62, 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder48.clear();
        int int69 = strBuilder48.lastIndexOf("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder48.append((long) 24);
        int int73 = strBuilder71.lastIndexOf('#');
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-1) + "'", int69 == (-1));
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.appendWithSeparators(collection19, "");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder21.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder28.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer32 = strBuilder28.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer39 = strBuilder38.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean45 = strBuilder42.equalsIgnoreCase(strBuilder44);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder44.append('4');
        boolean boolean50 = strBuilder44.contains("");
        java.lang.Object[] objArray51 = new java.lang.Object[] { "hi!", stringBuffer32, (byte) -1, strTokenizer39, "", boolean50 };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder3.appendWithSeparators(objArray51, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean63 = strBuilder60.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray75 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder62.insert(0, charArray75);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder55.append(charArray75);
        char[] charArray78 = strBuilder53.getChars(charArray75);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder53.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder53.deleteAll('!');
        int int83 = strBuilder82.capacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(stringBuffer32);
        org.junit.Assert.assertEquals(stringBuffer32.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strTokenizer39);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(charArray78);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray78), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray78), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray78), "[#, #, #, #, #, #, #, #, 1, 0, h, i, !, #, #, #, #, #, #, #, #, #, #, -, 1, S, t, r, T, o, k, e, n, i, z, e, r, [, n, o, t,  , t, o, k, e, n, i, z, e, d,  , y, e, t, ], t, r, u, e]");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 60 + "'", int83 == 60);
    }

    @Test
    public void test2704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2704");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst(strMatcher22, "");
        boolean boolean25 = strBuilder13.equals(strBuilder21);
        char[] charArray28 = strBuilder21.toCharArray(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.appendFixedWidthPadLeft(13, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceAll(strMatcher33, "10########10##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder10.append(strBuilder32, (int) '1', 23);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder32.appendFixedWidthPadRight((int) ' ', 32, '1');
        int int43 = strBuilder32.length();
        int int45 = strBuilder32.indexOf("#########");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 132 + "'", int43 == 132);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + (-1) + "'", int45 == (-1));
    }

    @Test
    public void test2705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2705");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder49.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strBuilder65.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder38.appendWithSeparators((java.util.Iterator) strTokenizer66, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder68, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder9.minimizeCapacity();
        java.lang.String str74 = strBuilder72.rightString(4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        int int29 = strBuilder27.size();
        java.io.Reader reader30 = strBuilder27.asReader();
        boolean boolean32 = strBuilder27.startsWith("10##########");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder27.deleteFirst(strMatcher33);
        int int36 = strBuilder34.indexOf("");
        int int38 = strBuilder34.lastIndexOf(' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 10 + "'", int29 == 10);
        org.junit.Assert.assertNotNull(reader30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2707");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.replaceFirst(' ', 'a');
        int int11 = strBuilder8.lastIndexOf("hi!", (int) '#');
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.replace(strMatcher12, "10##########", (int) (byte) 0, 25, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.insert((int) (short) 0, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder20.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder23.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer27 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean34 = strBuilder31.equalsIgnoreCase(strBuilder33);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray46 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder33.insert(0, charArray46);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strBuilder53.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder53.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder47.insert(0, (java.lang.Object) strBuilder57);
        boolean boolean59 = strBuilder23.equalsIgnoreCase(strBuilder47);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) strBuilder23, 132, 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher63 = null;
        int int65 = strBuilder23.indexOf(strMatcher63, 110);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(stringBuffer27);
        org.junit.Assert.assertEquals(stringBuffer27.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(charArray46);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray46), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray46), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.setNewLineText("41");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        int int34 = strBuilder32.lastIndexOf(strMatcher33);
        java.util.Collection collection35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.appendWithSeparators(collection35, "0");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.append('1');
        boolean boolean41 = strBuilder37.startsWith("##");
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2709");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.append(' ');
        java.io.Writer writer11 = strBuilder8.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteAll(strMatcher12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strBuilder13);
    }

    @Test
    public void test2710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2710");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer13 = strBuilder9.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append(stringBuffer13);
        int int15 = strBuilder14.length();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.deleteFirst('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2711");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        boolean boolean9 = strBuilder3.contains("");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        int int11 = strBuilder3.indexOf(strMatcher10);
        java.util.Collection collection12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.appendWithSeparators(collection12, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.deleteAll('#');
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer61 = strBuilder57.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder55.append(stringBuffer61, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder38.append(stringBuffer61);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean70 = strBuilder67.equalsIgnoreCase(strBuilder69);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder69.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer79 = strBuilder75.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder71.append(stringBuffer79);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder65.append(stringBuffer79, 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder16.append(stringBuffer79);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder16.appendPadding(52, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.setLength(31);
        java.lang.String str91 = strBuilder87.leftString(20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(stringBuffer61);
        org.junit.Assert.assertEquals(stringBuffer61.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(stringBuffer79);
        org.junit.Assert.assertEquals(stringBuffer79.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "4##########444444444" + "'", str91, "4##########444444444");
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.replaceAll("########10-1", "##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.deleteAll("100.0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strTokenizer24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
    }

    @Test
    public void test2713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2713");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append((long) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setNullText("41");
        int int13 = strBuilder9.lastIndexOf("########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.util.Collection collection14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.appendWithSeparators(collection14, "########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.appendFixedWidthPadLeft((int) (byte) -1, 0, '!');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendPadding((int) (short) 10, '#');
        java.lang.String str28 = strBuilder24.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder34.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder34.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder34.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection50 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.appendWithSeparators(collection50, "");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder52.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer63 = strBuilder59.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strBuilder69.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean76 = strBuilder73.equalsIgnoreCase(strBuilder75);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder75.append('4');
        boolean boolean81 = strBuilder75.contains("");
        java.lang.Object[] objArray82 = new java.lang.Object[] { "hi!", stringBuffer63, (byte) -1, strTokenizer70, "", boolean81 };
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder34.appendWithSeparators(objArray82, "");
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder30.appendWithSeparators(objArray82, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder24.appendWithSeparators(objArray82, "");
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder22.appendWithSeparators(objArray82, "#10#4###");
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder9.appendWithSeparators(objArray82, "hi!10##########10-110StrTokenizer[not tokenized yet]1010true");
        java.util.Collection collection93 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder9.appendWithSeparators(collection93, "i                 ");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "##########" + "'", str28, "##########");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(stringBuffer63);
        org.junit.Assert.assertEquals(stringBuffer63.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(objArray82);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray82), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray82), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder95);
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder3.insert(0, (-1));
        char[] charArray31 = strBuilder30.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer37 = strBuilder33.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray56 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder43.insert(0, charArray56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder60.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer64 = strBuilder63.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder63.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder57.insert(0, (java.lang.Object) strBuilder67);
        boolean boolean69 = strBuilder33.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder57.deleteFirst('#');
        org.apache.commons.lang.text.StrMatcher strMatcher72 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder57.deleteAll(strMatcher72);
        char[] charArray74 = strBuilder73.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder30.append(charArray74);
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher78 = null;
        boolean boolean79 = strBuilder77.contains(strMatcher78);
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder77.deleteFirst(strMatcher80);
        int int82 = strBuilder77.size();
        java.lang.String str84 = strBuilder77.rightString((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder77.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder77.ensureCapacity(1);
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder88.append((double) 11);
        char[] charArray91 = strBuilder90.toCharArray();
        boolean boolean92 = strBuilder75.equalsIgnoreCase(strBuilder90);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "-1########10-1true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "-1########10-1true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[-, 1, #, #, #, #, #, #, #, #, 1, 0, -, 1, t, r, u, e]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(stringBuffer37);
        org.junit.Assert.assertEquals(stringBuffer37.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(charArray56);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray56), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray56), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strTokenizer64);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(charArray74);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray74), "###########4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray74), "###########4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray74), "[#, #, #, #, #, #, #, #, #, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "1" + "'", str84, "1");
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertNotNull(charArray91);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray91), "41false11.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray91), "41false11.0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray91), "[4, 1, f, a, l, s, e, 1, 1, ., 0]");
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
    }

    @Test
    public void test2715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2715");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("1                      ");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst(strMatcher2, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder10.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.replaceAll("10", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.util.Collection collection17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder10.appendWithSeparators(collection17, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder10.append((int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder1.append((java.lang.Object) '#');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder22);
    }

    @Test
    public void test2716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2716");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        char[] charArray28 = new char[] { ' ', '#' };
        char[] charArray29 = strBuilder3.getChars(charArray28);
        java.lang.String str31 = strBuilder3.leftString(12);
        java.lang.String str32 = strBuilder3.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder36.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder36.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder49.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.replaceAll("########10-1", "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder49.deleteAll(' ');
        java.lang.StringBuffer stringBuffer58 = strBuilder57.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder3.append((java.lang.Object) strBuilder57);
        org.apache.commons.lang.text.StrMatcher strMatcher60 = null;
        int int62 = strBuilder3.lastIndexOf(strMatcher60, 15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(charArray28);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray28), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray28), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray28), "[ , #]");
        org.junit.Assert.assertNotNull(charArray29);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray29), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray29), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray29), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "########10-1" + "'", str31, "########10-1");
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(stringBuffer58);
        org.junit.Assert.assertEquals(stringBuffer58.toString(), "100.0########10");
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
    }

    @Test
    public void test2717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2717");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.clear();
        java.lang.String str16 = strBuilder8.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.insert(0, (long) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder20.append("##########hi!##########-1StrTokenizer[not tokenized yet]true0.0", 36, 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
    }

    @Test
    public void test2718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2718");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray31 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder18.insert(0, charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder11.append(charArray31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder11.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder11.append((long) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder9.append(strBuilder11, 2, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder9.replaceFirst("10\n", "10##########");
        java.lang.String str45 = strBuilder42.substring(0, (int) (short) 100);
        boolean boolean47 = strBuilder42.startsWith("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder42.replaceAll('0', '!');
        int int52 = strBuilder50.indexOf("zed yet]true");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "########10" + "'", str45, "########10");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + (-1) + "'", int52 == (-1));
    }

    @Test
    public void test2719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2719");
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strBuilder35.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer36, "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder38.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.append(1);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder41.reverse();
        boolean boolean44 = strBuilder42.contains('r');
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer44 = strBuilder40.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.append(stringBuffer44, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder21.append(stringBuffer44);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer62 = strBuilder58.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder54.append(stringBuffer62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder48.append(stringBuffer62, 0, 0);
        int int68 = strBuilder66.lastIndexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder66.deleteAll("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean75 = strBuilder72.equalsIgnoreCase(strBuilder74);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder74.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder74.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder80.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder80.append((double) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder66.append(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder84.deleteCharAt(13);
        java.io.Writer writer87 = strBuilder86.asWriter();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 10 + "'", int68 == 10);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(writer87);
    }

    @Test
    public void test2721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2721");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.clear();
        java.lang.String str16 = strBuilder8.leftString((int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("0.0\n########10-");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder18.minimizeCapacity();
        boolean boolean20 = strBuilder8.equals(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2722");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer13 = strBuilder9.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append(stringBuffer13);
        java.lang.String str17 = strBuilder5.midString((-1), (int) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer23 = strBuilder22.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.deleteAll(strMatcher24);
        int int27 = strBuilder22.indexOf("########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder22.deleteAll("########10-1");
        boolean boolean30 = strBuilder5.equals(strBuilder29);
        java.io.Writer writer31 = strBuilder5.asWriter();
        java.util.Iterator iterator32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder5.appendWithSeparators(iterator32, "##0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10##########" + "'", str17, "10##########");
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strTokenizer23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(writer31);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2723");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean16 = strBuilder13.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder15.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.append('4');
        int int20 = strBuilder19.length();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray37 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder24.insert(0, charArray37);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.append('4');
        boolean boolean48 = strBuilder42.contains("");
        boolean boolean49 = strBuilder38.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder53.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder53.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder66.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer70 = strBuilder69.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder42.appendWithSeparators((java.util.Iterator) strTokenizer70, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder19.appendWithSeparators((java.util.Iterator) strTokenizer70, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder11.appendWithSeparators((java.util.Iterator) strTokenizer70, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean81 = strBuilder78.equalsIgnoreCase(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder80.append('4');
        int int85 = strBuilder84.length();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder11.appendFixedWidthPadRight((java.lang.Object) int85, 23, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder11.insert((int) (byte) 0, (float) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder91.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder92.appendPadding((int) (byte) -1, 'a');
        int int97 = strBuilder95.lastIndexOf('#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strTokenizer70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + (-1) + "'", int97 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder34.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer44 = strBuilder40.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.append(stringBuffer44, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder21.append(stringBuffer44);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder58.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer62 = strBuilder58.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder54.append(stringBuffer62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder48.append(stringBuffer62, 0, 0);
        int int67 = strBuilder66.capacity();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean73 = strBuilder70.equalsIgnoreCase(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.trim();
        boolean boolean75 = strBuilder68.equals(strBuilder74);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder68.insert((int) (byte) 0, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder66.append(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean84 = strBuilder81.equalsIgnoreCase(strBuilder83);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder83.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder85.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder87.append(false);
        int int91 = strBuilder89.lastIndexOf('0');
        java.lang.StringBuffer stringBuffer92 = strBuilder89.toStringBuffer();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder66.append(stringBuffer92, 23, 99);
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(stringBuffer44);
        org.junit.Assert.assertEquals(stringBuffer44.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(stringBuffer62);
        org.junit.Assert.assertEquals(stringBuffer62.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 32 + "'", int67 == 32);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
        org.junit.Assert.assertNotNull(stringBuffer92);
        org.junit.Assert.assertEquals(stringBuffer92.toString(), "10false");
    }

    @Test
    public void test2725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2725");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder9.appendFixedWidthPadLeft(13, (int) (byte) 100, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteFirst('!');
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.insert((int) '!', (long) 100);
        org.apache.commons.lang.text.StrMatcher strMatcher29 = null;
        int int31 = strBuilder28.lastIndexOf(strMatcher29, 23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
    }

    @Test
    public void test2726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2726");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst(strMatcher12, "########10-1");
        boolean boolean16 = strBuilder11.endsWith("");
        int int19 = strBuilder11.lastIndexOf("##4##", 0);
        java.lang.String str21 = strBuilder11.leftString(8);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "10\n" + "'", str21, "10\n");
    }

    @Test
    public void test2727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2727");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.trim();
        int int14 = strBuilder10.lastIndexOf("##4##", (int) (byte) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceAll(strMatcher15, "##4##########10");
        boolean boolean19 = strBuilder10.contains('0');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder10.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder10.insert((int) (byte) 1, true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2728");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int12 = strBuilder3.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder3.replaceAll("##########", "41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder3.replaceAll(strMatcher16, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        java.lang.StringBuffer stringBuffer19 = strBuilder3.toStringBuffer();
        int int22 = strBuilder3.lastIndexOf("###10", 3);
        java.util.Collection collection23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.appendWithSeparators(collection23, "10########10##########10");
        java.lang.String str27 = strBuilder3.rightString((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(stringBuffer19);
        org.junit.Assert.assertEquals(stringBuffer19.toString(), "########10");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.deleteFirst("##########");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst('#', '#');
        java.util.Collection collection15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendWithSeparators(collection15, "10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2730");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
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
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder49.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer66 = strBuilder65.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder38.appendWithSeparators((java.util.Iterator) strTokenizer66, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) strBuilder68, (int) (byte) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean76 = strBuilder73.equalsIgnoreCase(strBuilder75);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder73.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.replaceFirst(strMatcher80, "");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder79.setNullText("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder9.append(strBuilder79);
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder9.deleteFirst("########10");
        java.lang.String str88 = strBuilder9.getNewLineText();
        java.lang.String str89 = strBuilder9.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder90 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = strBuilder9.equalsIgnoreCase(strBuilder90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
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
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strTokenizer66);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNull(str88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
    }

    @Test
    public void test2731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2731");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean5 = strBuilder2.equalsIgnoreCase(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.trim();
        boolean boolean7 = strBuilder0.equals(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder0.insert((int) (byte) 0, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder14.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder14.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.replaceAll("########10-1", "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder27.deleteAll(' ');
        java.lang.StringBuffer stringBuffer36 = strBuilder35.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder0.append(stringBuffer36);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder0.replace(47, 6, "44444444444444444444444444444444444444444444444");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(stringBuffer36);
        org.junit.Assert.assertEquals(stringBuffer36.toString(), "100.0########10");
        org.junit.Assert.assertNotNull(strBuilder37);
    }

    @Test
    public void test2732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2732");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('a', '4');
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendPadding((int) 'a', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceAll('#', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.replaceAll("10", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder17.insert(13, (java.lang.Object) "10");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder40.appendNull();
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilder41.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder17.appendWithSeparators((java.util.Iterator) strTokenizer42, "hi!hi!##########hi!-1hi!StrTokenizer[not tokenized yaet]hi!hi!true3");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.append((double) 75);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder44.replaceFirst("2", "100.0");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
    }
}

