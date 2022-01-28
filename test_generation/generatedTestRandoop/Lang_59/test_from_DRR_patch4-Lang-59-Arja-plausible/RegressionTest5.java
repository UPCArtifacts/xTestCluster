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
        org.apache.commons.lang.text.StrBuilder strBuilder6 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean9 = strBuilder6.equalsIgnoreCase(strBuilder8);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray21 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder8.insert(0, charArray21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder1.append(charArray21);
        java.lang.String str25 = strBuilder23.rightString((int) '4');
        int int27 = strBuilder23.indexOf('!');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder23.insert((int) (short) 0, false);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.append('a');
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
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "##4##" + "'", str25, "##4##");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2502");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(1);
        java.lang.String str3 = strBuilder1.rightString(20);
        int int4 = strBuilder1.capacity();
        int int6 = strBuilder1.lastIndexOf('1');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test2503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2503");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        boolean boolean3 = strBuilder1.contains(strMatcher2);
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteFirst(strMatcher4);
        int int6 = strBuilder1.size();
        java.lang.String str8 = strBuilder1.rightString((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder1.ensureCapacity(1);
        boolean boolean13 = strBuilder1.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder1.appendFixedWidthPadRight((int) (byte) -1, 0, '#');
        int int20 = strBuilder1.lastIndexOf('\000', 31);
        java.lang.String str21 = strBuilder1.getNullText();
        java.lang.String str22 = strBuilder1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "41false" + "'", str22, "41false");
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
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder32.appendFixedWidthPadRight(17, 3, '9');
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder42.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer52 = strBuilder51.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean57 = strBuilder54.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder54.replaceFirst("", "hi!");
        boolean boolean61 = strBuilder51.equals(strBuilder60);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder51.append((long) 24);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean68 = strBuilder65.equalsIgnoreCase(strBuilder67);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder67.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder67.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder67.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean81 = strBuilder78.equalsIgnoreCase(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder86.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer90 = strBuilder86.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder82.append(stringBuffer90);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder67.append(stringBuffer90);
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder63.append(stringBuffer90);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder38.append(stringBuffer90, 101, 67);
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(stringBuffer52);
        org.junit.Assert.assertEquals(stringBuffer52.toString(), "########10");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(stringBuffer90);
        org.junit.Assert.assertEquals(stringBuffer90.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(strBuilder93);
    }

    @Test
    public void test2505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2505");
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.insert(1, (long) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteAll('\000');
        java.lang.Class<?> wildcardClass39 = strBuilder38.getClass();
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
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test2506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2506");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder3.append(' ');
        int int8 = strBuilder6.lastIndexOf('9');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2507");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append((long) 23);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append(charArray35);
        java.lang.String str39 = strBuilder37.rightString((int) '4');
        boolean boolean40 = strBuilder13.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.deleteFirst('#');
        org.apache.commons.lang.text.StrMatcher strMatcher43 = null;
        int int44 = strBuilder37.indexOf(strMatcher43);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "##4##" + "'", str39, "##4##");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
    }

    @Test
    public void test2508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2508");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer23 = strBuilder22.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder25.replaceFirst("", "hi!");
        boolean boolean32 = strBuilder22.equals(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder22.append((long) 24);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean39 = strBuilder36.equalsIgnoreCase(strBuilder38);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder38.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder38.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder38.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer61 = strBuilder57.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder53.append(stringBuffer61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder38.append(stringBuffer61);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder34.append(stringBuffer61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder4.append(stringBuffer61);
        java.lang.String str66 = strBuilder65.getNullText();
        int int68 = strBuilder65.indexOf('a');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(stringBuffer23);
        org.junit.Assert.assertEquals(stringBuffer23.toString(), "########10");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(stringBuffer61);
        org.junit.Assert.assertEquals(stringBuffer61.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
    }

    @Test
    public void test2509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2509");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("1                      ");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst(strMatcher2, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(strMatcher5);
        char[] charArray9 = strBuilder1.toCharArray(0, 66);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "1                      ");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "1                      ");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[1,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ,  ]");
    }

    @Test
    public void test2510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2510");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder12.deleteCharAt(0);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder12.minimizeCapacity();
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2511");
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder39.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder39.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection55 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.appendWithSeparators(collection55, "");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder57.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder64 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder64.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer68 = strBuilder64.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder71.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strBuilder74.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder78 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean81 = strBuilder78.equalsIgnoreCase(strBuilder80);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder80.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder80.append('4');
        boolean boolean86 = strBuilder80.contains("");
        java.lang.Object[] objArray87 = new java.lang.Object[] { "hi!", stringBuffer68, (byte) -1, strTokenizer75, "", boolean86 };
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder39.appendWithSeparators(objArray87, "");
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder35.appendWithSeparators(objArray87, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder21.appendWithSeparators(objArray87, "##4##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder93.appendFixedWidthPadRight((int) '4', (int) (short) -1, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder99 = strBuilder97.append((double) (short) 1);
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
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(stringBuffer68);
        org.junit.Assert.assertEquals(stringBuffer68.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strTokenizer75);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray87), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray87), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder93);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertNotNull(strBuilder99);
    }

    @Test
    public void test2512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2512");
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
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder64.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder64.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder64.insert((int) (byte) 1, false);
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
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder69);
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.append('!');
        int int32 = strBuilder17.lastIndexOf("10##########");
        java.lang.String str34 = strBuilder17.leftString((-1));
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder17.appendNewLine();
        org.apache.commons.lang.text.StrMatcher strMatcher36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder17.replace(strMatcher36, "410", 0, 15, (int) (short) -1);
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2514");
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
        java.lang.String str69 = strBuilder66.midString((int) (byte) 10, 0);
        int int72 = strBuilder66.lastIndexOf("hi!", 15);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder66.append('a');
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
    }

    @Test
    public void test2515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2515");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray26 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder13.insert(0, charArray26);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean32 = strBuilder29.equalsIgnoreCase(strBuilder31);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.replaceFirst("", "hi!");
        boolean boolean36 = strBuilder13.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder29.deleteAll("41");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean43 = strBuilder40.equalsIgnoreCase(strBuilder42);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder42.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean53 = strBuilder50.equalsIgnoreCase(strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder52.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder52.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher62 = null;
        int int63 = strBuilder61.lastIndexOf(strMatcher62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder42.append((java.lang.Object) int63);
        char[] charArray67 = new char[] { ' ', '#' };
        char[] charArray68 = strBuilder42.getChars(charArray67);
        char[] charArray69 = strBuilder29.getChars(charArray67);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder4.append(charArray67);
        int int72 = strBuilder4.indexOf("#########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray26);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray26), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray26), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[ , #]");
        org.junit.Assert.assertNotNull(charArray68);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray68), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray68), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray68), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[ , #]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
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
        java.lang.String str8 = strBuilder7.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int11 = strBuilder7.lastIndexOf(strMatcher9, (int) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.setLength((int) '\000');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.setNullText("10");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replace(strMatcher16, "aaaaaa", 52, 31, 47);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
    }

    @Test
    public void test2517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2517");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.append("##########100");
        char[] charArray14 = strBuilder11.toCharArray((int) (byte) 0, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #, #, #, #, #, #, #, #, #]");
    }

    @Test
    public void test2518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2518");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean5 = strBuilder2.equalsIgnoreCase(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.trim();
        boolean boolean7 = strBuilder0.equals(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder0.insert((int) (byte) 0, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.insert(32, (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.deleteAll("########1110.021");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        int int29 = strBuilder20.indexOf("", (int) (byte) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder20.replaceAll("##########", "41");
        char[] charArray35 = strBuilder20.toCharArray(10, 25);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder15.insert(14, charArray35);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[]");
        org.junit.Assert.assertNotNull(strBuilder36);
    }

    @Test
    public void test2519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2519");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('a', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.deleteFirst(' ');
        java.lang.StringBuffer stringBuffer24 = strBuilder23.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder7.append(stringBuffer24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder7.append(61);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.insert(66, true);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 66");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(stringBuffer24);
        org.junit.Assert.assertEquals(stringBuffer24.toString(), "10\n");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
    }

    @Test
    public void test2520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2520");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder3.equals(strBuilder7);
        int int9 = strBuilder3.size();
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder3.deleteAll(strMatcher10);
        java.lang.String str12 = strBuilder3.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.deleteAll("1");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strBuilder14);
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
        char[] charArray58 = strBuilder53.toCharArray((int) (short) 1, (int) (short) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean63 = strBuilder60.equalsIgnoreCase(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder62.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray75 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder62.insert(0, charArray75);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer83 = strBuilder82.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder82.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder76.insert(0, (java.lang.Object) strBuilder86);
        char[] charArray88 = strBuilder76.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder53.appendFixedWidthPadLeft((java.lang.Object) charArray88, (int) '4', '0');
        int int93 = strBuilder53.indexOf('e');
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
        org.junit.Assert.assertNotNull(charArray58);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray58), "1########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray58), "1########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray58), "[1, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(charArray75);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray75), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray75), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray75), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strTokenizer83);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertNotNull(charArray88);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray88), "############4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray88), "############4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray88), "[#, #, #, #, #, #, #, #, #, #, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + (-1) + "'", int93 == (-1));
    }

    @Test
    public void test2522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2522");
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
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer19 = strBuilder18.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder18.replaceFirst(' ', 'a');
        int int25 = strBuilder22.lastIndexOf("hi!", (int) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder31.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer41 = strBuilder37.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder35.append(stringBuffer41, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder22.append(stringBuffer41, (int) (byte) 0, (int) (byte) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.replaceAll(strMatcher48, "1                      ");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder13.append((java.lang.Object) strMatcher48);
        org.apache.commons.lang.text.StrMatcher strMatcher52 = null;
        int int53 = strBuilder51.indexOf(strMatcher52);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder51.append("izer[not tokenized yaet]hi!hi!true3");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder61.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean72 = strBuilder69.equalsIgnoreCase(strBuilder71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder71.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder71.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher81 = null;
        int int82 = strBuilder80.lastIndexOf(strMatcher81);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder61.append((java.lang.Object) int82);
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder61.append(true);
        java.lang.String str88 = strBuilder85.midString((-1), (int) '#');
        boolean boolean89 = strBuilder85.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder85.setNewLineText("0");
        int int94 = strBuilder85.lastIndexOf("10##########", 52);
        char[] charArray95 = strBuilder85.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder56.insert(31, charArray95);
        org.apache.commons.lang.text.StrMatcher strMatcher97 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder99 = strBuilder56.replaceAll(strMatcher97, "!!!!!!!!!!!!\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\0004112false");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "10" + "'", str8, "10");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strTokenizer19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(stringBuffer41);
        org.junit.Assert.assertEquals(stringBuffer41.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "########10-1true" + "'", str88, "########10-1true");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + (-1) + "'", int94 == (-1));
        org.junit.Assert.assertNotNull(charArray95);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray95), "########10-1true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray95), "########10-1true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray95), "[#, #, #, #, #, #, #, #, 1, 0, -, 1, t, r, u, e]");
        org.junit.Assert.assertNotNull(strBuilder96);
        org.junit.Assert.assertNotNull(strBuilder99);
    }

    @Test
    public void test2523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2523");
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
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        int int43 = strBuilder39.indexOf(strMatcher41, 25);
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
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + (-1) + "'", int43 == (-1));
    }

    @Test
    public void test2524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2524");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.append('0');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.insert(105, "10########10##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean35 = strBuilder32.equalsIgnoreCase(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder36.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer46 = strBuilder42.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.append(stringBuffer46, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder30.append(stringBuffer46);
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder52.setNewLineText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.append('4');
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        boolean boolean58 = strBuilder54.contains(strMatcher57);
        boolean boolean59 = strBuilder30.equals((java.lang.Object) strBuilder54);
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(stringBuffer46);
        org.junit.Assert.assertEquals(stringBuffer46.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test2525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2525");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        java.io.Reader reader8 = strBuilder4.asReader();
        int int10 = strBuilder4.indexOf("10");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.append(0.0f);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(reader8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(strBuilder12);
    }

    @Test
    public void test2526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2526");
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
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder5.delete(23, 23);
        java.io.Writer writer23 = strBuilder22.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher24 = null;
        boolean boolean25 = strBuilder22.contains(strMatcher24);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(writer23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test2527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2527");
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
        java.lang.String str30 = strBuilder23.leftString(23);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder23.deleteAll("011");
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
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "10\n" + "'", str30, "10\n");
        org.junit.Assert.assertNotNull(strBuilder32);
    }

    @Test
    public void test2528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2528");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.append(22);
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.deleteFirst(strMatcher13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2529");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder4.replaceFirst(' ', 'a');
        int int11 = strBuilder8.lastIndexOf("hi!", (int) '#');
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder8.replace(strMatcher12, "10##########", (int) (byte) 0, 25, (int) (short) -1);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.insert((int) (short) 0, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.deleteAll("######10##########105");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder22);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer13 = strBuilder12.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        boolean boolean22 = strBuilder12.equals(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder12.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.insert(1, (long) 2);
        java.lang.String str29 = strBuilder27.leftString(7);
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
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "#2#####" + "'", str29, "#2#####");
    }

    @Test
    public void test2531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2531");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.String str5 = strBuilder1.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
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
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder7.appendWithSeparators(objArray59, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder1.appendWithSeparators(objArray59, "");
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder1.setLength(105);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean73 = strBuilder70.equalsIgnoreCase(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder72.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder72.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder72.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder72.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder79.trim();
        org.apache.commons.lang.text.StrMatcher strMatcher81 = null;
        int int83 = strBuilder79.lastIndexOf(strMatcher81, (-1));
        boolean boolean84 = strBuilder79.isEmpty();
        char[] charArray85 = strBuilder79.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder67.insert((int) '0', charArray85);
        org.apache.commons.lang.text.StrMatcher strMatcher87 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder67.replace(strMatcher87, "true0false", 0, 0, 8);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "##########" + "'", str5, "##########");
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
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(charArray85);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray85), "4true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray85), "4true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray85), "[4, t, r, u, e]");
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder92);
    }

    @Test
    public void test2532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2532");
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
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder52.append('4');
        boolean boolean58 = strBuilder52.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder48.append((java.lang.Object) strBuilder52);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder52.insert((int) (short) 1, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder52.reverse();
        boolean boolean65 = strBuilder63.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder63.clear();
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
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
    }

    @Test
    public void test2533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2533");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("########100");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceAll('!', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.reverse();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder5);
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
        int int56 = strBuilder55.capacity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder55.delete(117, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
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
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 61 + "'", int56 == 61);
    }

    @Test
    public void test2535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2535");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder(20);
    }

    @Test
    public void test2536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2536");
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
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        int int19 = strBuilder8.indexOf(strMatcher18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.replaceFirst(strMatcher21, "1aa                                                                                                 ");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder27.append('4');
        int int32 = strBuilder31.length();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.append((int) (byte) 10);
        java.io.Reader reader35 = strBuilder31.asReader();
        int int38 = strBuilder31.indexOf('a', 23);
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder31.deleteFirst('9');
        org.apache.commons.lang.text.StrMatcher strMatcher41 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder31.replaceFirst(strMatcher41, "10\n");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) strBuilder43, 10, '!');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(reader35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
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
        int int40 = strBuilder38.lastIndexOf('4');
        java.lang.String str41 = strBuilder38.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.append(0);
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder38.replaceAll("########10-1true", "okenized yet]true");
        int int49 = strBuilder38.lastIndexOf('1', (int) '0');
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
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1aa                                                                                                 " + "'", str41, "1aa                                                                                                 ");
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        int int29 = strBuilder28.size();
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
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 25 + "'", int29 == 25);
    }

    @Test
    public void test2539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2539");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher16 = null;
        boolean boolean17 = strBuilder15.contains(strMatcher16);
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder15.deleteFirst(strMatcher18);
        int int20 = strBuilder15.size();
        java.lang.String str22 = strBuilder15.rightString((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder15.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder15.ensureCapacity(1);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder26.deleteAll('4');
        boolean boolean29 = strBuilder8.equals(strBuilder26);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst(strMatcher40, "");
        boolean boolean43 = strBuilder31.equals(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendPadding((int) (short) 10, '#');
        java.lang.String str49 = strBuilder45.toString();
        boolean boolean50 = strBuilder31.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder45.insert((int) (short) 10, true);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder45.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder55.replaceAll('4', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder55.appendPadding((int) '#', '!');
        boolean boolean62 = strBuilder26.equals(strBuilder55);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "##########" + "'", str49, "##########");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
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
        java.lang.String str45 = strBuilder42.midString(27, 2);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection48 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder47.appendWithSeparators(collection48, "");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.replaceAll("#########-1StrTokenizer[not tokenized yet]true", "##########");
        boolean boolean57 = strBuilder42.equals((java.lang.Object) "##########");
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
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "##" + "'", str45, "##");
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
    }

    @Test
    public void test2541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2541");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst(strMatcher22, "");
        boolean boolean25 = strBuilder13.equals(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding((int) (short) 10, '#');
        java.lang.String str31 = strBuilder27.toString();
        boolean boolean32 = strBuilder13.equalsIgnoreCase(strBuilder27);
        java.lang.Class<?> wildcardClass33 = strBuilder13.getClass();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) wildcardClass33, (int) '\000', '!');
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
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder56.replaceFirst("", "hi!");
        boolean boolean63 = strBuilder40.equalsIgnoreCase(strBuilder56);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder40.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        int int68 = strBuilder66.lastIndexOf(strMatcher67);
        int int71 = strBuilder66.indexOf('a', (int) '4');
        java.lang.String str73 = strBuilder66.rightString(105);
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) 105, (int) (byte) 10, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder9.appendNewLine();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "##########" + "'", str31, "##########");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
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
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + (-1) + "'", int68 == (-1));
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "## ##########10" + "'", str73, "## ##########10");
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test2542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2542");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("10");
        org.apache.commons.lang.text.StrBuilder strBuilder2 = strBuilder1.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher3 = null;
        int int5 = strBuilder1.indexOf(strMatcher3, 0);
        org.junit.Assert.assertNotNull(strBuilder2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test2543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2543");
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
        java.lang.String str26 = strBuilder5.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder5.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection30 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendWithSeparators(collection30, "");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceAll(strMatcher33, "");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean50 = strBuilder47.equalsIgnoreCase(strBuilder49);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder49.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder49.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder49.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher59 = null;
        int int60 = strBuilder58.lastIndexOf(strMatcher59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder39.append((java.lang.Object) int60);
        char[] charArray64 = new char[] { ' ', '#' };
        char[] charArray65 = strBuilder39.getChars(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder39.appendPadding((int) (short) 0, '#');
        boolean boolean69 = strBuilder32.equals((java.lang.Object) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder32.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder32.deleteAll('!');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) strBuilder73, 62, 'a');
        int int79 = strBuilder76.indexOf("######10##########105", 54);
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
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + (-1) + "'", int60 == (-1));
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[ , #]");
        org.junit.Assert.assertNotNull(charArray65);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray65), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray65), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray65), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test2544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2544");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst(strMatcher11, "zed yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder13.clear();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder14.replace(5, 97, "##");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        java.lang.String str32 = strBuilder21.rightString((int) (short) 10);
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder21.deleteAll(strMatcher33);
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
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2546");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        int int12 = strBuilder8.lastIndexOf("########10-1true");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder8.insert(18, (int) 'e');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 18");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder21.append((double) 12);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer38 = strBuilder34.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder32.append(stringBuffer38);
        java.lang.String str40 = strBuilder39.getNullText();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(stringBuffer38);
        org.junit.Assert.assertEquals(stringBuffer38.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNull(str40);
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
        java.lang.String str69 = strBuilder66.midString((int) (byte) 10, 0);
        int int72 = strBuilder66.lastIndexOf("hi!", 15);
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder66.append(0);
        org.apache.commons.lang.text.StrTokenizer strTokenizer75 = strBuilder66.asTokenizer();
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
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strTokenizer75);
    }

    @Test
    public void test2549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2549");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder8.appendFixedWidthPadRight(0, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray59 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder46.insert(0, charArray59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder39.append(charArray59);
        int int63 = strBuilder61.lastIndexOf(' ');
        char[] charArray64 = strBuilder61.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder8.append(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.deleteFirst('\000');
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder67.appendFixedWidthPadLeft((int) '4', 132, '1');
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
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
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.deleteAll('\000');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean17 = strBuilder14.equalsIgnoreCase(strBuilder16);
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder16.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer26 = strBuilder22.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.append(stringBuffer26);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strBuilder32.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.replaceFirst(' ', 'a');
        boolean boolean37 = strBuilder27.equals((java.lang.Object) ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer43 = strBuilder39.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder27.append(stringBuffer43);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder12.append(stringBuffer43, 130, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(stringBuffer26);
        org.junit.Assert.assertEquals(stringBuffer26.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(stringBuffer43);
        org.junit.Assert.assertEquals(stringBuffer43.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder44);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.replaceAll(strMatcher15, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.deleteFirst('1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert(117, (float) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 117");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2552");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder4.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder4.setCharAt(2, '4');
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer18 = strBuilder17.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher19 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.deleteAll(strMatcher19);
        int int22 = strBuilder17.indexOf("########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.deleteAll("########10-1");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder24.insert(10, (double) 1);
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
        char[] charArray52 = strBuilder27.getChars(charArray49);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder4.append(charArray49);
        boolean boolean55 = strBuilder53.endsWith("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strTokenizer18);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
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
        org.junit.Assert.assertNotNull(charArray52);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray52), "##########1.0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray52), "##########1.0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray52), "[#, #, #, #, #, #, #, #, #, #, 1, ., 0]");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder30.trim();
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.deleteFirst(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean44 = strBuilder41.equalsIgnoreCase(strBuilder43);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder43.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean48 = strBuilder43.equals(strBuilder47);
        java.util.Collection collection49 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder51 = strBuilder43.appendWithSeparators(collection49, "");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder43.deleteFirst('4');
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        int int56 = strBuilder53.indexOf(strMatcher54, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder53.append(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder53.appendFixedWidthPadRight((int) (byte) 1, 0, '!');
        org.apache.commons.lang.text.StrMatcher strMatcher63 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder62.replaceFirst(strMatcher63, "0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder38.insert(6, (java.lang.Object) "0");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 6");
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
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strBuilder51);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder65);
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
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder30.append((double) '1');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder30.deleteCharAt(3);
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
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2555");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean12 = strBuilder9.equalsIgnoreCase(strBuilder11);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder11.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray24 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder11.insert(0, charArray24);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder29.append('4');
        boolean boolean35 = strBuilder29.contains("");
        boolean boolean36 = strBuilder25.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean41 = strBuilder38.equalsIgnoreCase(strBuilder40);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder40.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder40.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder40.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder40.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder53.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer57 = strBuilder56.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder29.appendWithSeparators((java.util.Iterator) strTokenizer57, "41");
        boolean boolean61 = strBuilder59.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder7.append((java.lang.Object) strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder62.append(false);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(charArray24);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray24), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray24), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertNotNull(strTokenizer57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder12.insert(10, '4');
        java.lang.String str17 = strBuilder12.leftString((int) (short) 100);
        java.lang.String str20 = strBuilder12.midString((int) (byte) 0, 104);
        int int22 = strBuilder12.lastIndexOf('1');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "########104" + "'", str17, "########104");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "########104" + "'", str20, "########104");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 8 + "'", int22 == 8);
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
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.insert((int) (short) 10, (long) 20);
        java.io.Reader reader74 = strBuilder73.asReader();
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
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(reader74);
    }

    @Test
    public void test2558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2558");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("011fa\000lse");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = strBuilder1.deleteAll("########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.junit.Assert.assertNotNull(strBuilder3);
    }

    @Test
    public void test2559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2559");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.setNewLineText("10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder8.append('#');
        boolean boolean14 = strBuilder12.contains('1');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder12.deleteAll(strMatcher15);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2560");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("########1110.021");
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder21.appendFixedWidthPadLeft(34, 18, '1');
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
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2562");
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
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder19.deleteAll("41");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean36 = strBuilder33.equalsIgnoreCase(strBuilder35);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder33.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher40 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder39.replaceFirst(strMatcher40, "");
        boolean boolean43 = strBuilder31.equals(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendPadding((int) (short) 10, '#');
        java.lang.String str49 = strBuilder45.toString();
        boolean boolean50 = strBuilder31.equalsIgnoreCase(strBuilder45);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder45.insert((int) (short) 10, true);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder58.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder58.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder65.trim();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 0.0d, (short) 10, 2, strBuilder65 };
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder28.appendWithSeparators(objArray67, "10##########");
        org.apache.commons.lang.text.StrMatcher strMatcher70 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder28.deleteFirst(strMatcher70);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder71.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder71.replaceAll('!', '1');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder75.deleteCharAt((int) (byte) 10);
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "##########" + "'", str49, "##########");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[0.0, 10, 2, 4true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[0.0, 10, 2, 4true]");
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder77);
    }

    @Test
    public void test2563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2563");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        int int9 = strBuilder5.indexOf('#');
        int int10 = strBuilder5.length();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder5.appendFixedWidthPadRight((int) (short) 0, (int) (short) 10, 'a');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder15);
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
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.append('4');
        boolean boolean27 = strBuilder21.contains("");
        boolean boolean28 = strBuilder17.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder17.append('!');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder17.setNullText("1");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder17.appendNewLine();
        java.io.Reader reader34 = strBuilder17.asReader();
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
        org.junit.Assert.assertNotNull(reader34);
    }

    @Test
    public void test2565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2565");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        int int9 = strBuilder5.indexOf('#');
        int int10 = strBuilder5.length();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder5.setNullText("10\n");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder5.replaceFirst("zed yet]true", "##4##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.appendPadding((int) (short) 10, '#');
        java.lang.String str21 = strBuilder17.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder27.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder27.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection43 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.appendWithSeparators(collection43, "");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder45.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer56 = strBuilder52.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder59.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer63 = strBuilder62.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean69 = strBuilder66.equalsIgnoreCase(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder68.append('4');
        boolean boolean74 = strBuilder68.contains("");
        java.lang.Object[] objArray75 = new java.lang.Object[] { "hi!", stringBuffer56, (byte) -1, strTokenizer63, "", boolean74 };
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder27.appendWithSeparators(objArray75, "");
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder23.appendWithSeparators(objArray75, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder17.appendWithSeparators(objArray75, "");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder81.append((double) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder5.append((java.lang.Object) (byte) 0);
        java.io.Writer writer85 = strBuilder84.asWriter();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "##########" + "'", str21, "##########");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(stringBuffer56);
        org.junit.Assert.assertEquals(stringBuffer56.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strTokenizer63);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(writer85);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder3.appendPadding(0, 'a');
        boolean boolean22 = strBuilder20.startsWith("hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int25 = strBuilder20.lastIndexOf(strMatcher23, 12);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder31.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder34.deleteFirst(' ');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder20.appendFixedWidthPadRight((java.lang.Object) strBuilder39, (int) (short) -1, '!');
        char[] charArray44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder42.insert((int) '\000', charArray44, 32, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2567");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.replaceFirst('4', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder10.replaceFirst("ue0", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder10.replaceAll("", " 14.0");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.insert(12, (float) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 12");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder20);
    }

    @Test
    public void test2568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2568");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        char[] charArray16 = strBuilder9.toCharArray(0, (int) (byte) 10);
        int int17 = strBuilder9.length();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder9.append((double) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.append((double) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2569");
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
        char[] charArray47 = strBuilder46.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.setNewLineText("########104");
        java.io.Writer writer50 = strBuilder49.asWriter();
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
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "0");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "0");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[0]");
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertNotNull(writer50);
    }

    @Test
    public void test2570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2570");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceFirst(' ', 'a');
        boolean boolean12 = strBuilder5.contains("############4##");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append('!');
        java.lang.StringBuffer stringBuffer15 = strBuilder14.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.deleteAll('9');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(stringBuffer15);
        org.junit.Assert.assertEquals(stringBuffer15.toString(), "10!");
        org.junit.Assert.assertNotNull(strBuilder17);
    }

    @Test
    public void test2571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2571");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.insert(0, "4");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder22.append((float) 20);
        java.lang.String str28 = strBuilder27.toString();
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
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1320.0" + "'", str28, "4aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa1320.0");
    }

    @Test
    public void test2572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2572");
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
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder11.appendFixedWidthPadLeft(7, 99, '9');
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
        org.junit.Assert.assertNotNull(strBuilder38);
    }

    @Test
    public void test2573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2573");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder8.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.deleteFirst("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher22 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.replaceFirst(strMatcher22, "");
        boolean boolean25 = strBuilder13.equals(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding((int) (short) 10, '#');
        java.lang.String str31 = strBuilder27.toString();
        boolean boolean32 = strBuilder13.equalsIgnoreCase(strBuilder27);
        java.lang.Class<?> wildcardClass33 = strBuilder13.getClass();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder9.appendFixedWidthPadLeft((java.lang.Object) wildcardClass33, (int) '\000', '!');
        org.apache.commons.lang.text.StrMatcher strMatcher37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder9.deleteAll(strMatcher37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder9.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder9.appendNewLine();
        boolean boolean42 = strBuilder40.endsWith("###10");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "##########" + "'", str31, "##########");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test2574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2574");
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
        int int34 = strBuilder30.indexOf(' ', (int) '4');
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder30.replaceAll("!#######10", "hi!");
        int int39 = strBuilder30.indexOf('9');
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
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-1) + "'", int34 == (-1));
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
    }

    @Test
    public void test2575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2575");
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
        org.apache.commons.lang.text.StrMatcher strMatcher67 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder64.deleteFirst(strMatcher67);
        int int71 = strBuilder68.lastIndexOf('!', 10);
        org.apache.commons.lang.text.StrMatcher strMatcher72 = null;
        int int73 = strBuilder68.indexOf(strMatcher72);
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
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + (-1) + "'", int71 == (-1));
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
    }

    @Test
    public void test2576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2576");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        boolean boolean3 = strBuilder1.contains(strMatcher2);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder5.equalsIgnoreCase(strBuilder7);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst(strMatcher12, "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder14.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.append('4');
        int int24 = strBuilder23.length();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.append('4');
        boolean boolean52 = strBuilder46.contains("");
        boolean boolean53 = strBuilder42.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder57.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder57.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strBuilder73.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder46.appendWithSeparators((java.util.Iterator) strTokenizer74, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer74, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer74, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean85 = strBuilder82.equalsIgnoreCase(strBuilder84);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder84.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder84.append('4');
        int int89 = strBuilder88.length();
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder15.appendFixedWidthPadRight((java.lang.Object) int89, 23, ' ');
        java.lang.String str95 = strBuilder15.midString((int) (byte) 0, 105);
        boolean boolean96 = strBuilder1.equalsIgnoreCase(strBuilder15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder99 = strBuilder15.insert((int) 'e', (float) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 101");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "1                      " + "'", str95, "1                      ");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2577");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder7.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder7.clear();
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.indexOf(strMatcher13);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder24.appendFixedWidthPadRight((int) (short) 1, 12, '#');
        boolean boolean30 = strBuilder12.equalsIgnoreCase(strBuilder24);
        // The following exception was thrown during execution in test generation
        try {
            char char32 = strBuilder12.charAt((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 10");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.insert(23, "-140");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 23");
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
        org.junit.Assert.assertNotNull(strBuilder39);
    }

    @Test
    public void test2579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2579");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder8.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder8.replaceFirst('a', '#');
        java.lang.StringBuffer stringBuffer14 = strBuilder13.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder18.equals(strBuilder22);
        int int24 = strBuilder18.size();
        org.apache.commons.lang.text.StrMatcher strMatcher25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder18.deleteAll(strMatcher25);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean31 = strBuilder28.equalsIgnoreCase(strBuilder30);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder30.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder34.setNewLineText("zed yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.append(strBuilder37);
        boolean boolean39 = strBuilder18.equalsIgnoreCase(strBuilder36);
        java.lang.StringBuffer stringBuffer40 = strBuilder18.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder13.append(stringBuffer40);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder13.replaceAll("##4##########10", "#########");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder44.setNullText("########1110.021");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(stringBuffer14);
        org.junit.Assert.assertEquals(stringBuffer14.toString(), "10\n");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(stringBuffer40);
        org.junit.Assert.assertEquals(stringBuffer40.toString(), "");
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
    }

    @Test
    public void test2580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2580");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder7.append(false);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder7.append("-140", (int) '!', (int) '!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: startIndex must be valid");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder9);
    }

    @Test
    public void test2581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2581");
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
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder62.insert((int) (byte) 1, (long) (short) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder69 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean72 = strBuilder69.equalsIgnoreCase(strBuilder71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder71.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder73.append((int) (byte) 10);
        java.lang.String str76 = strBuilder75.toString();
        org.apache.commons.lang.text.StrMatcher strMatcher77 = null;
        int int79 = strBuilder75.lastIndexOf(strMatcher77, (int) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer80 = strBuilder75.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder62.appendWithSeparators((java.util.Iterator) strTokenizer80, "44444444979");
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
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "10" + "'", str76, "10");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
        org.junit.Assert.assertNotNull(strTokenizer80);
        org.junit.Assert.assertNotNull(strBuilder82);
    }

    @Test
    public void test2582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2582");
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
        int int42 = strBuilder25.lastIndexOf(strMatcher40, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder25.append((long) 6);
        int int47 = strBuilder44.lastIndexOf("############4#####", 19);
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder44.append((long) 42);
        org.apache.commons.lang.text.StrMatcher strMatcher50 = null;
        int int51 = strBuilder44.indexOf(strMatcher50);
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
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + (-1) + "'", int42 == (-1));
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder9.setLength((int) (short) 0);
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int14 = strBuilder11.lastIndexOf(strMatcher12, (-1));
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.setNullText("");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        int int19 = strBuilder16.lastIndexOf(strMatcher17, 99);
        int int20 = strBuilder16.capacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
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
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder17.replaceFirst(strMatcher18, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder17.appendNewLine();
        java.lang.String str22 = strBuilder17.getNewLineText();
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder17.deleteFirst(strMatcher23);
        java.util.Collection collection25 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder17.appendWithSeparators(collection25, "41\n");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer33 = strBuilder32.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.deleteAll(strMatcher34);
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
        org.apache.commons.lang.text.StrBuilder strBuilder66 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean69 = strBuilder66.equalsIgnoreCase(strBuilder68);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder68.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder68.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder68.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder68.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder81.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer85 = strBuilder84.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder87 = strBuilder57.appendWithSeparators((java.util.Iterator) strTokenizer85, "41");
        boolean boolean89 = strBuilder87.contains("");
        org.apache.commons.lang.text.StrBuilder strBuilder90 = strBuilder35.append((java.lang.Object) strBuilder87);
        char char92 = strBuilder87.charAt(7);
        org.apache.commons.lang.text.StrMatcher strMatcher93 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder87.deleteFirst(strMatcher93);
        int int95 = strBuilder87.size();
        org.apache.commons.lang.text.StrBuilder strBuilder96 = strBuilder17.append(strBuilder87);
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
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strTokenizer33);
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
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strTokenizer85);
        org.junit.Assert.assertNotNull(strBuilder87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertNotNull(strBuilder90);
        org.junit.Assert.assertTrue("'" + char92 + "' != '" + '#' + "'", char92 == '#');
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertTrue("'" + int95 + "' != '" + 16 + "'", int95 == 16);
        org.junit.Assert.assertNotNull(strBuilder96);
    }

    @Test
    public void test2585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2585");
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
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder85.replaceAll("##########100", "## ##########10");
        int int90 = strBuilder85.indexOf("#4a440##########");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder93 = strBuilder85.insert(19, (double) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 19");
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
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-1) + "'", int90 == (-1));
    }

    @Test
    public void test2586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2586");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteFirst(strMatcher5);
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.append('a');
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        int int11 = strBuilder8.lastIndexOf(strMatcher9, 100);
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int13 = strBuilder8.indexOf(strMatcher12);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test2587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2587");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder3.equals(strBuilder7);
        boolean boolean10 = strBuilder7.endsWith("10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray27 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder14.insert(0, charArray27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean33 = strBuilder30.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder32.append('4');
        boolean boolean38 = strBuilder32.contains("");
        boolean boolean39 = strBuilder28.equalsIgnoreCase(strBuilder32);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder32.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder41.clear();
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder42.appendFixedWidthPadRight((int) (byte) 1, 3, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder46.appendPadding((int) 'a', ' ');
        int int51 = strBuilder49.lastIndexOf('4');
        boolean boolean52 = strBuilder7.equals((java.lang.Object) int51);
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder7.setNullText("#########-1StrTokenizer[not tokenized yet]true");
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray57 = strBuilder54.toCharArray((int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + (-1) + "'", int51 == (-1));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(strBuilder54);
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
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceFirst(' ', 'a');
        boolean boolean12 = strBuilder5.contains("############4##");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer18 = strBuilder14.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder5.append(stringBuffer18);
        char[] charArray20 = strBuilder5.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean25 = strBuilder22.equalsIgnoreCase(strBuilder24);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder24.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder24.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray37 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder24.insert(0, charArray37);
        int int41 = strBuilder24.indexOf("10", (int) (short) -1);
        org.apache.commons.lang.text.StrTokenizer strTokenizer42 = strBuilder24.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder5.appendWithSeparators((java.util.Iterator) strTokenizer42, "\000\000\000\00010\n\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000\000");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(stringBuffer18);
        org.junit.Assert.assertEquals(stringBuffer18.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(charArray20);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray20), "10##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray20), "10##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray20), "[1, 0, #, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(charArray37);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray37), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray37), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 13 + "'", int41 == 13);
        org.junit.Assert.assertNotNull(strTokenizer42);
        org.junit.Assert.assertNotNull(strBuilder44);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        int int14 = strBuilder12.lastIndexOf(strMatcher13);
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder12.replaceAll(strMatcher15, "##");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.trim();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder18.insert(99, false);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 99");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder18);
    }

    @Test
    public void test2590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2590");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.replaceAll("########10-1", "##########");
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder16.deleteAll(' ');
        java.lang.StringBuffer stringBuffer25 = strBuilder24.toStringBuffer();
        int int26 = strBuilder24.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(stringBuffer25);
        org.junit.Assert.assertEquals(stringBuffer25.toString(), "100.0########10");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 15 + "'", int26 == 15);
    }

    @Test
    public void test2591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2591");
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
        java.io.Reader reader16 = strBuilder3.asReader();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder3.replaceFirst(strMatcher17, "");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder19.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(reader16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder20);
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
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.append((float) 32);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder(15);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder30.appendFixedWidthPadLeft((java.lang.Object) strBuilder32, 19, '\000');
        int int38 = strBuilder30.indexOf("h12.0i!##########-1StrTokenizer[not tokenized yet]true", (-1));
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
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + (-1) + "'", int38 == (-1));
    }

    @Test
    public void test2593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2593");
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
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder17.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder17.replaceFirst('a', '#');
        java.lang.String str23 = strBuilder22.getNewLineText();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder22.deleteFirst("zed yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder7.appendFixedWidthPadLeft((java.lang.Object) strBuilder25, (int) (short) 0, '0');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.append('\000');
        org.apache.commons.lang.text.StrTokenizer strTokenizer31 = strBuilder25.asTokenizer();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strTokenizer31);
    }

    @Test
    public void test2594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2594");
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
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder9.append(false);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder26.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher33 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.replaceFirst(strMatcher33, "");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder35.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder35.replaceFirst('4', '!');
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
        char[] charArray69 = strBuilder57.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder35.append(charArray69, (int) (byte) 0, 15);
        java.lang.String str74 = strBuilder35.leftString(25);
        boolean boolean75 = strBuilder24.equals((java.lang.Object) 25);
        char[] charArray76 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder24.append(charArray76, 35, 61);
        org.apache.commons.lang.text.StrMatcher strMatcher80 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder24.replaceFirst(strMatcher80, "10");
        org.apache.commons.lang.text.StrMatcher strMatcher83 = null;
        int int85 = strBuilder82.indexOf(strMatcher83, 31);
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
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder36);
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
        org.junit.Assert.assertNotNull(charArray69);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray69), "############4##########10");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray69), "############4##########10");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray69), "[#, #, #, #, #, #, #, #, #, #, #, #, 4, #, #, #, #, #, #, #, #, #, #, 1, 0]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "############4##" + "'", str74, "############4##");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + (-1) + "'", int85 == (-1));
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
        org.apache.commons.lang.text.StrTokenizer strTokenizer58 = strBuilder55.asTokenizer();
        int int59 = strBuilder55.size();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder55.replaceFirst('!', '1');
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
        org.junit.Assert.assertNotNull(strTokenizer58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 61 + "'", int59 == 61);
        org.junit.Assert.assertNotNull(strBuilder62);
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
        org.apache.commons.lang.text.StrMatcher strMatcher81 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder53.replaceAll(strMatcher81, "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder83.append((long) 130);
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
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
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
        int int44 = strBuilder42.indexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean49 = strBuilder46.equalsIgnoreCase(strBuilder48);
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder48.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder48.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray61 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder48.insert(0, charArray61);
        org.apache.commons.lang.text.StrBuilder strBuilder65 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder65.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer69 = strBuilder68.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder68.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder62.insert(0, (java.lang.Object) strBuilder72);
        int int76 = strBuilder62.lastIndexOf("10", (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder62.append(13);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder42.append((java.lang.Object) 13);
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder79.replaceAll('4', '4');
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.append((long) '!');
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
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertNotNull(strTokenizer69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 23 + "'", int76 == 23);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test2598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2598");
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
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder4.deleteAll('!');
        java.io.Writer writer46 = strBuilder45.asWriter();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.insert((int) '0', "41\n");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 48");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(writer46);
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
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder53.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder57.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer61 = strBuilder57.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder55.append(stringBuffer61);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder62.appendFixedWidthPadLeft((int) (byte) 1, (int) (byte) 10, '#');
        boolean boolean67 = strBuilder66.isEmpty();
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
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(stringBuffer61);
        org.junit.Assert.assertEquals(stringBuffer61.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder8.trim();
        boolean boolean35 = strBuilder8.contains("#10");
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }

    @Test
    public void test2601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2601");
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
        int int65 = strBuilder60.lastIndexOf('4', 7);
        org.apache.commons.lang.text.StrMatcher strMatcher66 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder60.replaceAll(strMatcher66, "## ##0");
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
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + (-1) + "'", int65 == (-1));
        org.junit.Assert.assertNotNull(strBuilder68);
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
        int int9 = strBuilder5.indexOf('#');
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.append(' ');
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        int int14 = strBuilder11.lastIndexOf(strMatcher12, 6);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test2603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2603");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        int int9 = strBuilder5.indexOf('#');
        int int10 = strBuilder5.length();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.setLength((int) '\000');
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.append((float) 25);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer24 = strBuilder23.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder23.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder17.insert(0, (java.lang.Object) strBuilder27);
        int int29 = strBuilder27.size();
        java.io.Reader reader30 = strBuilder27.asReader();
        boolean boolean32 = strBuilder27.startsWith("##");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder27.replaceAll("", "4444444497");
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
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strBuilder35);
    }

    @Test
    public void test2605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2605");
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
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder10.append(false);
        org.apache.commons.lang.text.StrMatcher strMatcher54 = null;
        int int56 = strBuilder53.indexOf(strMatcher54, (int) (short) 100);
        org.apache.commons.lang.text.StrMatcher strMatcher57 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder53.replaceAll(strMatcher57, "1aa                                                                                                 ");
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
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(strBuilder59);
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
        java.lang.String str19 = strBuilder3.leftString((int) (short) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder3.deleteCharAt(12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strBuilder21);
    }

    @Test
    public void test2607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2607");
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
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder12.deleteFirst('!');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder33.deleteCharAt(18);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder35.append(0.0d);
        int int40 = strBuilder37.lastIndexOf('a', 22);
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
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
    }

    @Test
    public void test2608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2608");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("###10");
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.appendFixedWidthPadRight(0, 52, 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.apache.commons.lang.text.StrMatcher strMatcher69 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder56.deleteAll(strMatcher69);
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.append((double) 0L);
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
        org.junit.Assert.assertNotNull(strBuilder72);
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
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder21.append(1L);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer36 = strBuilder35.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder21.appendWithSeparators((java.util.Iterator) strTokenizer36, "##########");
        org.apache.commons.lang.text.StrMatcher strMatcher39 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder21.replace(strMatcher39, "41\n", (int) '\000', 0, 20);
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder44.minimizeCapacity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder45.replace(129, 15, "10");
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strTokenizer36);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertNotNull(strBuilder45);
    }

    @Test
    public void test2611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2611");
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
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.deleteAll('0');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder23.appendFixedWidthPadRight((int) '\000', 1, '1');
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
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder29);
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
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder5.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.append("##########100");
        boolean boolean13 = strBuilder11.endsWith("0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer13 = strBuilder12.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        boolean boolean22 = strBuilder12.equals(strBuilder21);
        boolean boolean23 = strBuilder12.isEmpty();
        java.lang.String str26 = strBuilder12.substring((int) (byte) 1, 62);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "########10");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "#######10" + "'", str26, "#######10");
    }

    @Test
    public void test2614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2614");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        int int9 = strBuilder1.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13");
        char[] charArray10 = null;
        char[] charArray11 = strBuilder1.getChars(charArray10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray11);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray11), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray11), "[]");
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
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder38.setNullText("## ##########10");
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
    }

    @Test
    public void test2616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2616");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst('a', '4');
        boolean boolean11 = strBuilder10.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder10.appendPadding((int) 'a', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.append("41");
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder14.replaceFirst(strMatcher17, "100.0#######");
        int int22 = strBuilder14.lastIndexOf("-140", 27);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test2617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2617");
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
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendWithSeparators(collection36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer49 = strBuilder45.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strBuilder55.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.append('4');
        boolean boolean67 = strBuilder61.contains("");
        java.lang.Object[] objArray68 = new java.lang.Object[] { "hi!", stringBuffer49, (byte) -1, strTokenizer56, "", boolean67 };
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder20.appendWithSeparators(objArray68, "");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder70.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder11.append(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder72.append('1');
        org.apache.commons.lang.text.StrMatcher strMatcher76 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder75.replaceAll(strMatcher76, "-1StrTokenizer[nothi!tokenizedhi!yet]true");
        boolean boolean80 = strBuilder75.contains('9');
        org.apache.commons.lang.text.StrMatcher strMatcher81 = null;
        int int83 = strBuilder75.indexOf(strMatcher81, (int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
    }

    @Test
    public void test2618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2618");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("1                      ");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.replaceFirst(strMatcher2, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(strMatcher5);
        int int8 = strBuilder1.indexOf('9');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test2619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2619");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        boolean boolean3 = strBuilder1.contains(strMatcher2);
        org.apache.commons.lang.text.StrMatcher strMatcher4 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder1.deleteFirst(strMatcher4);
        int int6 = strBuilder1.size();
        java.lang.String str8 = strBuilder1.rightString((int) (short) 1);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder1.append(false);
        java.io.Writer writer11 = strBuilder1.asWriter();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder1.appendFixedWidthPadRight(42, (-1), '\000');
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder15.replaceAll('4', '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(writer11);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder18);
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder31.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.replace((int) (byte) 0, (int) '!', "#########-1StrTokenizer[not tokenized yet]true4444444444444444444444444444444444444444444444444444");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.deleteFirst("1000000");
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.replaceFirst("", "hi!");
        boolean boolean26 = strBuilder3.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.replaceAll('4', ' ');
        int int31 = strBuilder29.indexOf('a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder46.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher56 = null;
        int int57 = strBuilder55.lastIndexOf(strMatcher56);
        org.apache.commons.lang.text.StrBuilder strBuilder58 = strBuilder36.append((java.lang.Object) int57);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder36.append(true);
        java.lang.String str63 = strBuilder60.midString((-1), (int) '#');
        boolean boolean64 = strBuilder60.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder60.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder60.append((double) 14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder32.append(strBuilder68, (int) (byte) 0, 101);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: length must be valid");
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
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + (-1) + "'", int31 == (-1));
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + (-1) + "'", int57 == (-1));
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "########10-1true" + "'", str63, "########10-1true");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder68);
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
        int int35 = strBuilder3.indexOf('0', 2);
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
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
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
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder53.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder54.replaceFirst('4', '4');
        org.apache.commons.lang.text.StrMatcher strMatcher58 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.deleteAll(strMatcher58);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder57.setNullText("#########");
        int int64 = strBuilder57.indexOf("############4##", 32);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder57.ensureCapacity(10);
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
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + (-1) + "'", int64 == (-1));
        org.junit.Assert.assertNotNull(strBuilder66);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("10");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean19 = strBuilder16.equalsIgnoreCase(strBuilder18);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder18.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder18.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder18.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder18.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection34 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder33.appendWithSeparators(collection34, "");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder36.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder36.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder43 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer47 = strBuilder43.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder50.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer54 = strBuilder53.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean60 = strBuilder57.equalsIgnoreCase(strBuilder59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder59.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.append('4');
        boolean boolean65 = strBuilder59.contains("");
        java.lang.Object[] objArray66 = new java.lang.Object[] { "hi!", stringBuffer47, (byte) -1, strTokenizer54, "", boolean65 };
        org.apache.commons.lang.text.StrBuilder strBuilder68 = strBuilder18.appendWithSeparators(objArray66, "");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean73 = strBuilder70.equalsIgnoreCase(strBuilder72);
        org.apache.commons.lang.text.StrBuilder strBuilder75 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean78 = strBuilder75.equalsIgnoreCase(strBuilder77);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder77.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder77.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray90 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder77.insert(0, charArray90);
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder70.append(charArray90);
        char[] charArray93 = strBuilder68.getChars(charArray90);
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder14.append(charArray90);
        org.apache.commons.lang.text.StrBuilder strBuilder95 = strBuilder12.append(charArray90);
        org.apache.commons.lang.text.StrMatcher strMatcher96 = null;
        boolean boolean97 = strBuilder12.contains(strMatcher96);
        int int99 = strBuilder12.indexOf('\000');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(stringBuffer47);
        org.junit.Assert.assertEquals(stringBuffer47.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strTokenizer54);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray66), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray66), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder68);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(charArray90);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray90), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray90), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray90), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertNotNull(charArray93);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray93), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray93), "########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray93), "[#, #, #, #, #, #, #, #, 1, 0, h, i, !, #, #, #, #, #, #, #, #, #, #, -, 1, S, t, r, T, o, k, e, n, i, z, e, r, [, n, o, t,  , t, o, k, e, n, i, z, e, d,  , y, e, t, ], t, r, u, e]");
        org.junit.Assert.assertNotNull(strBuilder94);
        org.junit.Assert.assertNotNull(strBuilder95);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertTrue("'" + int99 + "' != '" + (-1) + "'", int99 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        boolean boolean18 = strBuilder16.contains('!');
        java.lang.String str19 = strBuilder16.toString();
        int int20 = strBuilder16.length();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "########10" + "'", str19, "########10");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test2626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2626");
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
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder8.appendFixedWidthPadRight(0, 0, 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = strBuilder46.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray59 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder46.insert(0, charArray59);
        org.apache.commons.lang.text.StrBuilder strBuilder61 = strBuilder39.append(charArray59);
        int int63 = strBuilder61.lastIndexOf(' ');
        char[] charArray64 = strBuilder61.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder8.append(charArray64);
        org.apache.commons.lang.text.StrBuilder strBuilder67 = strBuilder65.deleteFirst('\000');
        org.apache.commons.lang.text.StrMatcher strMatcher68 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder65.deleteAll(strMatcher68);
        boolean boolean70 = strBuilder69.isEmpty();
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
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder52);
        org.junit.Assert.assertNotNull(charArray59);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray59), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray59), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder61);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + (-1) + "'", int63 == (-1));
        org.junit.Assert.assertNotNull(charArray64);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray64), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray64), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertNotNull(strBuilder67);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
    }

    @Test
    public void test2627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2627");
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
        org.apache.commons.lang.text.StrMatcher strMatcher18 = null;
        int int20 = strBuilder5.lastIndexOf(strMatcher18, 23);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder5.appendFixedWidthPadLeft(25, 15, '1');
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder24.appendFixedWidthPadRight(62, 18, '9');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "10##########" + "'", str17, "10##########");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(strBuilder24);
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder7.appendFixedWidthPadLeft(104, 17, '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = strBuilder7.substring((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: end < start");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
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
        org.junit.Assert.assertNotNull(strBuilder27);
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
        char[] charArray16 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder3.insert(0, charArray16);
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.replaceFirst("", "hi!");
        boolean boolean26 = strBuilder3.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder19.deleteAll("41");
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder19.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder19.minimizeCapacity();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder19.insert(67, '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 67");
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
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
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
        boolean boolean15 = strBuilder9.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.minimizeCapacity();
        org.apache.commons.lang.text.StrMatcher strMatcher17 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder9.deleteFirst(strMatcher17);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendWithSeparators(collection21, "");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder20.append(false);
        boolean boolean26 = strBuilder9.equals((java.lang.Object) strBuilder20);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder18);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test2631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2631");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder1.deleteAll(strMatcher5);
        char[] charArray7 = strBuilder1.toCharArray();
        org.apache.commons.lang.text.StrBuilder strBuilder9 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.appendPadding((int) (short) 10, '#');
        java.lang.String str13 = strBuilder9.toString();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder19.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder19.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.appendWithSeparators(collection35, "");
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder37.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder37.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder44.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer48 = strBuilder44.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = strBuilder51.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer55 = strBuilder54.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder60 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean61 = strBuilder58.equalsIgnoreCase(strBuilder60);
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder60.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder60.append('4');
        boolean boolean66 = strBuilder60.contains("");
        java.lang.Object[] objArray67 = new java.lang.Object[] { "hi!", stringBuffer48, (byte) -1, strTokenizer55, "", boolean66 };
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder19.appendWithSeparators(objArray67, "");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder15.appendWithSeparators(objArray67, "hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder9.appendWithSeparators(objArray67, "");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = strBuilder1.appendWithSeparators(objArray67, "-1StrTokenizer[nothi!tokenizedhi!yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection78 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder77.appendWithSeparators(collection78, "");
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder80.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder80.append((float) (-1L));
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder80.clear();
        boolean boolean87 = strBuilder1.equals(strBuilder86);
        org.apache.commons.lang.text.StrBuilder strBuilder89 = strBuilder1.deleteCharAt(101);
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "##########");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "##########");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[#, #, #, #, #, #, #, #, #, #]");
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "##########" + "'", str13, "##########");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(stringBuffer48);
        org.junit.Assert.assertEquals(stringBuffer48.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder54);
        org.junit.Assert.assertNotNull(strTokenizer55);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray67), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray67), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strBuilder75);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(strBuilder89);
    }

    @Test
    public void test2632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2632");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer5 = strBuilder4.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher6 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.deleteAll(strMatcher6);
        java.lang.StringBuffer stringBuffer8 = strBuilder4.toStringBuffer();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder4.deleteFirst(strMatcher9);
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder10.replaceFirst("########104", "10########10##########10");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder10.setCharAt(5, 'e');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strTokenizer5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(stringBuffer8);
        org.junit.Assert.assertEquals(stringBuffer8.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder16);
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
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        int int22 = strBuilder20.lastIndexOf(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean28 = strBuilder25.equalsIgnoreCase(strBuilder27);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder29.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder32.deleteFirst('a');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder32.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder32.deleteFirst(' ');
        boolean boolean38 = strBuilder20.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.insert(2, "-140");
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
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(strBuilder41);
    }

    @Test
    public void test2634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2634");
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
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) '!', '1');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 33");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2635");
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
        int int17 = strBuilder14.lastIndexOf("");
        java.lang.String str20 = strBuilder14.midString(25, 23);
        int int22 = strBuilder14.indexOf("!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(stringBuffer13);
        org.junit.Assert.assertEquals(stringBuffer13.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
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
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder3.insert(10, false);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder37.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher44 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder46 = strBuilder43.replaceFirst(strMatcher44, "");
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder46.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder47.append((long) 23);
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder53 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean54 = strBuilder51.equalsIgnoreCase(strBuilder53);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder56.equalsIgnoreCase(strBuilder58);
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder58.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder58.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray71 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder58.insert(0, charArray71);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder51.append(charArray71);
        java.lang.String str75 = strBuilder73.rightString((int) '4');
        boolean boolean76 = strBuilder49.equalsIgnoreCase(strBuilder73);
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder73.deleteFirst('#');
        boolean boolean79 = strBuilder35.equals(strBuilder78);
        boolean boolean80 = strBuilder78.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder78.deleteAll("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa13");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = new org.apache.commons.lang.text.StrBuilder("###10");
        org.apache.commons.lang.text.StrBuilder strBuilder85 = strBuilder84.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder78.append((java.lang.Object) strBuilder84);
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
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "##4##" + "'", str75, "##4##");
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder85);
        org.junit.Assert.assertNotNull(strBuilder86);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer13 = strBuilder12.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder15.replaceFirst("", "hi!");
        boolean boolean22 = strBuilder12.equals(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder12.append("########10hi!##########-1StrTokenizer[not tokenized yet]true");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder24.appendNewLine();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.insert((int) '0', '!');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.deleteAll("############4##########1013");
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder30.appendFixedWidthPadRight((int) '#', (int) (byte) 0, '\000');
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
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
    }

    @Test
    public void test2638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2638");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer5 = strBuilder1.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.deleteAll("");
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder1.reverse();
        org.apache.commons.lang.text.StrMatcher strMatcher9 = null;
        boolean boolean10 = strBuilder8.contains(strMatcher9);
        org.apache.commons.lang.text.StrMatcher strMatcher11 = null;
        int int12 = strBuilder8.lastIndexOf(strMatcher11);
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder8.append('1');
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(stringBuffer5);
        org.junit.Assert.assertEquals(stringBuffer5.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
    }

    @Test
    public void test2639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2639");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append((long) 23);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean18 = strBuilder15.equalsIgnoreCase(strBuilder17);
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder22 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean23 = strBuilder20.equalsIgnoreCase(strBuilder22);
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder22.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder22.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray35 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder36 = strBuilder22.insert(0, charArray35);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder15.append(charArray35);
        java.lang.String str39 = strBuilder37.rightString((int) '4');
        boolean boolean40 = strBuilder13.equalsIgnoreCase(strBuilder37);
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
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder60.replaceFirst("", "hi!");
        boolean boolean67 = strBuilder44.equalsIgnoreCase(strBuilder60);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder44.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder74 = strBuilder70.appendFixedWidthPadLeft(0, (int) (byte) 1, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder70.deleteFirst("########10");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder13.append((java.lang.Object) strBuilder76);
        java.lang.Object obj78 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder13.append(obj78);
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder79.setLength(0);
        org.apache.commons.lang.text.StrBuilder strBuilder83 = strBuilder79.deleteAll('4');
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder83.minimizeCapacity();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(charArray35);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray35), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray35), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder36);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "##4##" + "'", str39, "##4##");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strBuilder46);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertNotNull(charArray57);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray57), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray57), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder58);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder83);
        org.junit.Assert.assertNotNull(strBuilder84);
    }

    @Test
    public void test2640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2640");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder5.delete((int) (short) 0, 0);
        java.util.Collection collection9 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.appendWithSeparators(collection9, "");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceAll("1                      ", "0");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder11.setLength(48);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder16);
    }

    @Test
    public void test2641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2641");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean5 = strBuilder2.equalsIgnoreCase(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.trim();
        boolean boolean7 = strBuilder0.equals(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder0.insert((int) (byte) 0, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        int int12 = strBuilder10.lastIndexOf("41");
        java.io.Writer writer13 = strBuilder10.asWriter();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(writer13);
    }

    @Test
    public void test2642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2642");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder3.equals(strBuilder7);
        int int9 = strBuilder3.size();
        int int10 = strBuilder3.size();
        int int12 = strBuilder3.lastIndexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder3.append((long) 61);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(strBuilder14);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst(strMatcher13);
        boolean boolean16 = strBuilder12.startsWith("######10##########105");
        org.apache.commons.lang.text.StrBuilder strBuilder18 = strBuilder12.deleteFirst("0");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strBuilder18);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer20 = strBuilder19.asTokenizer();
        org.apache.commons.lang.text.StrMatcher strMatcher21 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder19.deleteFirst(strMatcher21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.clear();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strTokenizer20);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder23);
    }

    @Test
    public void test2645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2645");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean6 = strBuilder3.equalsIgnoreCase(strBuilder5);
        org.apache.commons.lang.text.StrBuilder strBuilder9 = strBuilder3.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher10 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder9.replaceFirst(strMatcher10, "");
        boolean boolean13 = strBuilder1.equals(strBuilder9);
        boolean boolean15 = strBuilder9.endsWith("");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder9.minimizeCapacity();
        org.apache.commons.lang.text.StrBuilder strBuilder18 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder20 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean21 = strBuilder18.equalsIgnoreCase(strBuilder20);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder20.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder20.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder20.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection36 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder35.appendWithSeparators(collection36, "");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder38.replaceAll('4', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder38.setNullText("hi!");
        org.apache.commons.lang.text.StrBuilder strBuilder45 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder45.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer49 = strBuilder45.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder55 = strBuilder52.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer56 = strBuilder55.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder59 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder61 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean62 = strBuilder59.equalsIgnoreCase(strBuilder61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder61.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder65 = strBuilder61.append('4');
        boolean boolean67 = strBuilder61.contains("");
        java.lang.Object[] objArray68 = new java.lang.Object[] { "hi!", stringBuffer49, (byte) -1, strTokenizer56, "", boolean67 };
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder20.appendWithSeparators(objArray68, "");
        org.apache.commons.lang.text.StrBuilder strBuilder71 = strBuilder70.minimizeCapacity();
        int int73 = strBuilder71.indexOf("##4##");
        org.apache.commons.lang.text.StrBuilder strBuilder75 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder77 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean78 = strBuilder75.equalsIgnoreCase(strBuilder77);
        org.apache.commons.lang.text.StrBuilder strBuilder79 = strBuilder77.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder81 = strBuilder77.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder82 = strBuilder77.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder84 = strBuilder82.append(' ');
        int int87 = strBuilder84.indexOf("hi!", (int) ' ');
        boolean boolean88 = strBuilder71.equalsIgnoreCase(strBuilder84);
        org.apache.commons.lang.text.StrTokenizer strTokenizer89 = strBuilder84.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder91 = strBuilder9.appendWithSeparators((java.util.Iterator) strTokenizer89, "###10");
        org.apache.commons.lang.text.StrBuilder strBuilder94 = strBuilder9.replaceFirst("410", "113.");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(stringBuffer49);
        org.junit.Assert.assertEquals(stringBuffer49.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder55);
        org.junit.Assert.assertNotNull(strTokenizer56);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray68), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray68), "[hi!, ##########, -1, StrTokenizer[not tokenized yet], , true]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder71);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + (-1) + "'", int73 == (-1));
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(strBuilder79);
        org.junit.Assert.assertNotNull(strBuilder81);
        org.junit.Assert.assertNotNull(strBuilder82);
        org.junit.Assert.assertNotNull(strBuilder84);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + (-1) + "'", int87 == (-1));
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(strTokenizer89);
        org.junit.Assert.assertNotNull(strBuilder91);
        org.junit.Assert.assertNotNull(strBuilder94);
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder19.replaceFirst("", "hi!");
        boolean boolean26 = strBuilder3.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder3.replaceAll('4', ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder31 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection32 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder31.appendWithSeparators(collection32, "");
        org.apache.commons.lang.text.StrMatcher strMatcher35 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder37 = strBuilder34.replaceAll(strMatcher35, "");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder41 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean42 = strBuilder39.equalsIgnoreCase(strBuilder41);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder41.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder41.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder49 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder51 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean52 = strBuilder49.equalsIgnoreCase(strBuilder51);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder51.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder57 = strBuilder51.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder60 = strBuilder51.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        int int62 = strBuilder60.lastIndexOf(strMatcher61);
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder41.append((java.lang.Object) int62);
        char[] charArray66 = new char[] { ' ', '#' };
        char[] charArray67 = strBuilder41.getChars(charArray66);
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder41.appendPadding((int) (short) 0, '#');
        boolean boolean71 = strBuilder34.equals((java.lang.Object) '#');
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder29.append(strBuilder34);
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder34.trim();
        // The following exception was thrown during execution in test generation
        try {
            char char75 = strBuilder34.charAt((int) 'e');
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
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder37);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strBuilder53);
        org.junit.Assert.assertNotNull(strBuilder57);
        org.junit.Assert.assertNotNull(strBuilder60);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + (-1) + "'", int62 == (-1));
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), " #");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), " #");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[ , #]");
        org.junit.Assert.assertNotNull(charArray67);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray67), "########10-1");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray67), "########10-1");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray67), "[#, #, #, #, #, #, #, #, 1, 0, -, 1]");
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder3.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        boolean boolean18 = strBuilder16.contains('!');
        int int19 = strBuilder16.size();
        java.lang.String str20 = strBuilder16.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "########10" + "'", str20, "########10");
    }

    @Test
    public void test2648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2648");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("41");
        org.apache.commons.lang.text.StrMatcher strMatcher2 = null;
        boolean boolean3 = strBuilder1.contains(strMatcher2);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder7 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean8 = strBuilder5.equalsIgnoreCase(strBuilder7);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder5.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder11.replaceFirst(strMatcher12, "");
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder14.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder19.append('4');
        int int24 = strBuilder23.length();
        org.apache.commons.lang.text.StrBuilder strBuilder26 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder28 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean29 = strBuilder26.equalsIgnoreCase(strBuilder28);
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder28.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder28.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray41 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder28.insert(0, charArray41);
        org.apache.commons.lang.text.StrBuilder strBuilder44 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder46 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean47 = strBuilder44.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder46.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder50 = strBuilder46.append('4');
        boolean boolean52 = strBuilder46.contains("");
        boolean boolean53 = strBuilder42.equalsIgnoreCase(strBuilder46);
        org.apache.commons.lang.text.StrBuilder strBuilder55 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder57 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean58 = strBuilder55.equalsIgnoreCase(strBuilder57);
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder57.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder57.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder57.replaceAll("", "");
        org.apache.commons.lang.text.StrBuilder strBuilder70 = strBuilder57.appendFixedWidthPadRight((java.lang.Object) (byte) 100, (int) (short) 0, ' ');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder70.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrTokenizer strTokenizer74 = strBuilder73.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder46.appendWithSeparators((java.util.Iterator) strTokenizer74, "41");
        org.apache.commons.lang.text.StrBuilder strBuilder78 = strBuilder23.appendWithSeparators((java.util.Iterator) strTokenizer74, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder80 = strBuilder15.appendWithSeparators((java.util.Iterator) strTokenizer74, "10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder82 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder84 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean85 = strBuilder82.equalsIgnoreCase(strBuilder84);
        org.apache.commons.lang.text.StrBuilder strBuilder86 = strBuilder84.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder88 = strBuilder84.append('4');
        int int89 = strBuilder88.length();
        org.apache.commons.lang.text.StrBuilder strBuilder92 = strBuilder15.appendFixedWidthPadRight((java.lang.Object) int89, 23, ' ');
        java.lang.String str95 = strBuilder15.midString((int) (byte) 0, 105);
        boolean boolean96 = strBuilder1.equalsIgnoreCase(strBuilder15);
        org.apache.commons.lang.text.StrBuilder strBuilder97 = strBuilder1.reverse();
        java.io.Writer writer98 = strBuilder97.asWriter();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(charArray41);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray41), "##4##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray41), "[#, #, 4, #, #]");
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertNotNull(strBuilder50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder66);
        org.junit.Assert.assertNotNull(strBuilder70);
        org.junit.Assert.assertNotNull(strBuilder73);
        org.junit.Assert.assertNotNull(strTokenizer74);
        org.junit.Assert.assertNotNull(strBuilder76);
        org.junit.Assert.assertNotNull(strBuilder78);
        org.junit.Assert.assertNotNull(strBuilder80);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(strBuilder86);
        org.junit.Assert.assertNotNull(strBuilder88);
        org.junit.Assert.assertTrue("'" + int89 + "' != '" + 1 + "'", int89 == 1);
        org.junit.Assert.assertNotNull(strBuilder92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "1                      " + "'", str95, "1                      ");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertNotNull(strBuilder97);
        org.junit.Assert.assertNotNull(writer98);
    }

    @Test
    public void test2649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2649");
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
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean30 = strBuilder27.equalsIgnoreCase(strBuilder29);
        org.apache.commons.lang.text.StrBuilder strBuilder31 = strBuilder29.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder29.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder29.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        java.lang.StringBuffer stringBuffer39 = strBuilder38.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder40 = strBuilder5.append(stringBuffer39);
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder40.insert((int) (byte) 10, "10##########");
        java.lang.String str44 = strBuilder43.toString();
        int int45 = strBuilder43.length();
        org.apache.commons.lang.text.StrBuilder strBuilder49 = strBuilder43.appendFixedWidthPadLeft((int) '#', 1, '1');
        java.lang.String str51 = strBuilder49.substring(4);
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder49.append(false);
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
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(strBuilder31);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(stringBuffer39);
        org.junit.Assert.assertEquals(stringBuffer39.toString(), "########10");
        org.junit.Assert.assertNotNull(strBuilder40);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "10########10##########10" + "'", str44, "10########10##########10");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 24 + "'", int45 == 24);
        org.junit.Assert.assertNotNull(strBuilder49);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "######10##########105" + "'", str51, "######10##########105");
        org.junit.Assert.assertNotNull(strBuilder53);
    }

    @Test
    public void test2650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2650");
        org.apache.commons.lang.text.StrBuilder strBuilder0 = new org.apache.commons.lang.text.StrBuilder();
        org.apache.commons.lang.text.StrBuilder strBuilder2 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder4 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean5 = strBuilder2.equalsIgnoreCase(strBuilder4);
        org.apache.commons.lang.text.StrBuilder strBuilder6 = strBuilder4.trim();
        boolean boolean7 = strBuilder0.equals(strBuilder6);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder0.insert((int) (byte) 0, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder0.clear();
        java.lang.String str12 = strBuilder0.toString();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strBuilder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
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
        boolean boolean31 = strBuilder27.isEmpty();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder27.setNewLineText("0");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder27.append((double) 14);
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder39 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean40 = strBuilder37.equalsIgnoreCase(strBuilder39);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder39.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder39.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        char[] charArray52 = new char[] { '#', '#', '4', '#', '#' };
        org.apache.commons.lang.text.StrBuilder strBuilder53 = strBuilder39.insert(0, charArray52);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder59 = strBuilder56.appendPadding((int) (short) 10, '#');
        org.apache.commons.lang.text.StrTokenizer strTokenizer60 = strBuilder59.asTokenizer();
        org.apache.commons.lang.text.StrBuilder strBuilder63 = strBuilder59.replaceFirst(' ', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder64 = strBuilder53.insert(0, (java.lang.Object) strBuilder63);
        int int67 = strBuilder53.lastIndexOf("10", (int) 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder53.append(13);
        java.io.Writer writer70 = strBuilder53.asWriter();
        org.apache.commons.lang.text.StrMatcher strMatcher71 = null;
        int int72 = strBuilder53.indexOf(strMatcher71);
        boolean boolean73 = strBuilder27.equalsIgnoreCase(strBuilder53);
        java.lang.String str74 = strBuilder27.getNullText();
        org.apache.commons.lang.text.StrBuilder strBuilder77 = strBuilder27.insert(2, '4');
        int int79 = strBuilder27.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
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
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
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
        org.junit.Assert.assertNotNull(strBuilder59);
        org.junit.Assert.assertNotNull(strTokenizer60);
        org.junit.Assert.assertNotNull(strBuilder63);
        org.junit.Assert.assertNotNull(strBuilder64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 23 + "'", int67 == 23);
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(writer70);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + (-1) + "'", int72 == (-1));
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(str74);
        org.junit.Assert.assertNotNull(strBuilder77);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + (-1) + "'", int79 == (-1));
    }

    @Test
    public void test2652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2652");
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
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder8.append("true0false");
        org.apache.commons.lang.text.StrBuilder strBuilder23 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder25 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean26 = strBuilder23.equalsIgnoreCase(strBuilder25);
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder25.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder25.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder32 = strBuilder25.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder34 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder36 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean37 = strBuilder34.equalsIgnoreCase(strBuilder36);
        org.apache.commons.lang.text.StrBuilder strBuilder38 = strBuilder36.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder42 = strBuilder36.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder43 = strBuilder42.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder45 = strBuilder42.append((double) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder47 = strBuilder45.append((long) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder48 = strBuilder25.append((java.lang.Object) strBuilder47);
        boolean boolean50 = strBuilder48.startsWith(" 14.0");
        boolean boolean51 = strBuilder21.equalsIgnoreCase(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(strBuilder32);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(strBuilder38);
        org.junit.Assert.assertNotNull(strBuilder42);
        org.junit.Assert.assertNotNull(strBuilder43);
        org.junit.Assert.assertNotNull(strBuilder45);
        org.junit.Assert.assertNotNull(strBuilder47);
        org.junit.Assert.assertNotNull(strBuilder48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
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
        org.apache.commons.lang.text.StrBuilder strBuilder12 = strBuilder3.replaceAll("##4##", "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrMatcher strMatcher13 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder12.deleteFirst(strMatcher13);
        boolean boolean16 = strBuilder12.startsWith("######10##########105");
        int int19 = strBuilder12.lastIndexOf('!', 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test2654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2654");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder5.append((int) (byte) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder5.replaceFirst(' ', 'a');
        boolean boolean12 = strBuilder5.contains("############4##");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = strBuilder5.append('!');
        org.apache.commons.lang.text.StrMatcher strMatcher15 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder17 = strBuilder14.replaceAll(strMatcher15, "########10-1true");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder21 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean22 = strBuilder19.equalsIgnoreCase(strBuilder21);
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder21.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder21.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder27.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.append((double) 10);
        java.io.Reader reader31 = strBuilder30.asReader();
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder30.ensureCapacity(1);
        boolean boolean34 = strBuilder14.equals(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strBuilder14);
        org.junit.Assert.assertNotNull(strBuilder17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(reader31);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test2655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2655");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder5 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder3.append('4');
        org.apache.commons.lang.text.StrBuilder strBuilder8 = strBuilder3.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder3.append(true);
        org.apache.commons.lang.text.StrBuilder strBuilder12 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder14 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean15 = strBuilder12.equalsIgnoreCase(strBuilder14);
        org.apache.commons.lang.text.StrBuilder strBuilder16 = strBuilder14.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder20 = strBuilder14.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder20.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder23 = strBuilder20.append((double) 10);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder23.append((long) 2);
        org.apache.commons.lang.text.StrBuilder strBuilder26 = strBuilder3.append((java.lang.Object) strBuilder25);
        char[] charArray27 = strBuilder25.toCharArray();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder8);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder20);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder23);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder26);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "########1010.02");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "########1010.02");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #, #, #, #, #, #, #, 1, 0, 1, 0, ., 0, 2]");
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
        org.apache.commons.lang.text.StrBuilder strBuilder69 = strBuilder48.replaceAll("10\n", "41");
        org.apache.commons.lang.text.StrBuilder strBuilder72 = strBuilder69.replaceFirst('a', '0');
        org.apache.commons.lang.text.StrBuilder strBuilder73 = strBuilder69.appendNewLine();
        // The following exception was thrown during execution in test generation
        try {
            org.apache.commons.lang.text.StrBuilder strBuilder76 = strBuilder69.setCharAt(16, '!');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 16");
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
        org.junit.Assert.assertNotNull(strBuilder69);
        org.junit.Assert.assertNotNull(strBuilder72);
        org.junit.Assert.assertNotNull(strBuilder73);
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
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder16.insert((int) (short) 0, (float) (byte) 100);
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder16.replaceAll("########10-1", "##########");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder16.replaceAll(strMatcher23, "########10hi!##########-1StrTokenizer[not tokenized yet]true0");
        org.apache.commons.lang.text.StrBuilder strBuilder27 = strBuilder16.deleteAll("########10##########");
        org.apache.commons.lang.text.StrBuilder strBuilder29 = strBuilder27.append((float) 105);
        org.apache.commons.lang.text.StrBuilder strBuilder33 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder35.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher42 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.replaceFirst(strMatcher42, "");
        boolean boolean45 = strBuilder33.equals(strBuilder41);
        char[] charArray48 = strBuilder41.toCharArray(0, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            strBuilder29.getChars(0, 54, charArray48, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 54");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertNotNull(strBuilder12);
        org.junit.Assert.assertNotNull(strBuilder16);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder27);
        org.junit.Assert.assertNotNull(strBuilder29);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(charArray48);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray48), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray48), "[]");
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
        org.apache.commons.lang.text.StrBuilder strBuilder11 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder13 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean14 = strBuilder11.equalsIgnoreCase(strBuilder13);
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder13.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder19 = strBuilder13.appendFixedWidthPadLeft((java.lang.Object) (short) 10, (int) (short) 10, '#');
        org.apache.commons.lang.text.StrBuilder strBuilder22 = strBuilder13.replaceAll("", "");
        org.apache.commons.lang.text.StrMatcher strMatcher23 = null;
        int int24 = strBuilder22.lastIndexOf(strMatcher23);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder3.append((java.lang.Object) int24);
        org.apache.commons.lang.text.StrBuilder strBuilder28 = strBuilder25.insert(0, (long) (byte) 100);
        boolean boolean30 = strBuilder28.endsWith("ue0");
        org.apache.commons.lang.text.StrBuilder strBuilder33 = strBuilder28.replaceAll('\000', 'a');
        org.apache.commons.lang.text.StrBuilder strBuilder35 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder37 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean38 = strBuilder35.equalsIgnoreCase(strBuilder37);
        org.apache.commons.lang.text.StrBuilder strBuilder39 = strBuilder37.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder41 = strBuilder37.append('4');
        int int42 = strBuilder41.length();
        org.apache.commons.lang.text.StrBuilder strBuilder44 = strBuilder41.append((int) (byte) 10);
        int int46 = strBuilder44.indexOf('!');
        int int48 = strBuilder44.lastIndexOf("10\n");
        boolean boolean50 = strBuilder44.startsWith("########104");
        org.apache.commons.lang.text.StrBuilder strBuilder52 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder54 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean55 = strBuilder52.equalsIgnoreCase(strBuilder54);
        org.apache.commons.lang.text.StrBuilder strBuilder56 = strBuilder54.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder58 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean59 = strBuilder54.equals(strBuilder58);
        int int60 = strBuilder54.size();
        org.apache.commons.lang.text.StrMatcher strMatcher61 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder62 = strBuilder54.deleteAll(strMatcher61);
        boolean boolean63 = strBuilder44.equals(strBuilder62);
        org.apache.commons.lang.text.StrBuilder strBuilder66 = strBuilder33.appendFixedWidthPadLeft((java.lang.Object) strBuilder62, 25, 'e');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder5);
        org.junit.Assert.assertNotNull(strBuilder9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertNotNull(strBuilder19);
        org.junit.Assert.assertNotNull(strBuilder22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strBuilder33);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(strBuilder39);
        org.junit.Assert.assertNotNull(strBuilder41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(strBuilder44);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + (-1) + "'", int46 == (-1));
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + (-1) + "'", int48 == (-1));
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(strBuilder56);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertNotNull(strBuilder62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(strBuilder66);
    }

    @Test
    public void test2659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2659");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        java.util.Collection collection2 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder4 = strBuilder1.appendWithSeparators(collection2, "");
        org.apache.commons.lang.text.StrMatcher strMatcher5 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder4.replaceAll(strMatcher5, "");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        int int9 = strBuilder4.lastIndexOf(strMatcher8);
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder4.deleteFirst("############4##########10#");
        org.apache.commons.lang.text.StrMatcher strMatcher12 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.deleteFirst(strMatcher12);
        java.io.Reader reader14 = strBuilder11.asReader();
        org.junit.Assert.assertNotNull(strBuilder4);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(reader14);
    }

    @Test
    public void test2660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test2660");
        org.apache.commons.lang.text.StrBuilder strBuilder1 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder3 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean4 = strBuilder1.equalsIgnoreCase(strBuilder3);
        org.apache.commons.lang.text.StrBuilder strBuilder7 = strBuilder1.replaceFirst("", "hi!");
        org.apache.commons.lang.text.StrMatcher strMatcher8 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder10 = strBuilder7.replaceFirst(strMatcher8, "");
        org.apache.commons.lang.text.StrBuilder strBuilder11 = strBuilder10.reverse();
        org.apache.commons.lang.text.StrBuilder strBuilder13 = strBuilder11.append((long) 23);
        org.apache.commons.lang.text.StrMatcher strMatcher14 = null;
        org.apache.commons.lang.text.StrBuilder strBuilder15 = strBuilder11.deleteFirst(strMatcher14);
        org.apache.commons.lang.text.StrBuilder strBuilder17 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder19 = new org.apache.commons.lang.text.StrBuilder("");
        boolean boolean20 = strBuilder17.equalsIgnoreCase(strBuilder19);
        org.apache.commons.lang.text.StrBuilder strBuilder21 = strBuilder19.trim();
        org.apache.commons.lang.text.StrBuilder strBuilder24 = strBuilder21.delete((int) (short) 0, 0);
        org.apache.commons.lang.text.StrBuilder strBuilder25 = strBuilder21.appendNull();
        org.apache.commons.lang.text.StrBuilder strBuilder27 = new org.apache.commons.lang.text.StrBuilder("");
        org.apache.commons.lang.text.StrBuilder strBuilder30 = strBuilder27.appendPadding((int) (short) 10, '#');
        java.lang.StringBuffer stringBuffer31 = strBuilder27.toStringBuffer();
        org.apache.commons.lang.text.StrBuilder strBuilder34 = strBuilder25.append(stringBuffer31, (int) (short) 10, (int) (byte) 0);
        org.apache.commons.lang.text.StrBuilder strBuilder35 = strBuilder11.append(stringBuffer31);
        java.lang.String str37 = strBuilder11.leftString(18);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strBuilder7);
        org.junit.Assert.assertNotNull(strBuilder10);
        org.junit.Assert.assertNotNull(strBuilder11);
        org.junit.Assert.assertNotNull(strBuilder13);
        org.junit.Assert.assertNotNull(strBuilder15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strBuilder21);
        org.junit.Assert.assertNotNull(strBuilder24);
        org.junit.Assert.assertNotNull(strBuilder25);
        org.junit.Assert.assertNotNull(strBuilder30);
        org.junit.Assert.assertNotNull(stringBuffer31);
        org.junit.Assert.assertEquals(stringBuffer31.toString(), "##########");
        org.junit.Assert.assertNotNull(strBuilder34);
        org.junit.Assert.assertNotNull(strBuilder35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "23##########" + "'", str37, "23##########");
    }
}

