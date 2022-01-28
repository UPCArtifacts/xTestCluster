import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test1001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1001");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######" + "'", str1, "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                          ", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     " + "'", str2, "                     ");
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 32, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str3, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!hi!h444444444444444444444444444444444444444...", (int) (byte) 0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h", 100, "                                                   hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..h" + "'", str3, "                                                   hi!hi!h444444444444444444444444444444444444444..h");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 " + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", (int) (byte) 1, "hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str3, "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444...", "                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!h444444444444444444444444444444444444444...", "i!hi!hi!");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.split("", 'a');
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "", (java.lang.CharSequence[]) strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence[]) strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str11, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("        ", 15, 15);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        " + "'", str3, "        ");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                  44hi!hi!hi!h                   ", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  44hi!hi!hi!h                   " + "'", str2, "                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444...44hi!hi!hi!h4444444444444" + "'", str1, "4444444...44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (int) (byte) 0, 47);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str3, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######" + "'", str2, "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (int) (short) 100, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444444444", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hhi!hi!hi!hhi!hi!hi", 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                 hhi!hi!hi!hhi!hi!hi" + "'", str3, "                                                                                 hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                               ", (java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "444444444444444444444444444444444444444444444444", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("44hi!hi!hi!hclass [Ljava.lang.Strin", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "#", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "4444hi!444", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", charArray9);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", "###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######" + "'", str2, "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...", (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaa444444444444444aaaaaaaaa                                                                    ", "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444h!ihh###                                               " + "'", str1, "44444444444444444444444444444444h!ihh###                                               ");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", 90, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######" + "'", str3, "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("44hi!hi!hi!h", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "               ", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", 92, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hhi!hi!hi!hhi!hi!hi", "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hi!hi!hhi!hi!hi" + "'", str2, "hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                                                                          ", "4444hi!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "#", 48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                    ", (java.lang.CharSequence) "#####################4444hi!444####################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable((java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("444444444444hi!hi!hi!h4444444444444", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   444444444444hi!hi!hi!h4444444444444    " + "'", str2, "   444444444444hi!hi!hi!h4444444444444    ");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444...", "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444..." + "'", str2, "4444444...");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "        ", (int) '#');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ", (java.lang.CharSequence) "444...", 15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!h444444444444444444444444444444444444444..", "###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444.." + "'", str2, "hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                      hi!hi!hi!ha...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      hi!hi!hi!ha..." + "'", str2, "                                                                                      hi!hi!hi!ha...");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("#####################4444hi!444#####################", "###HHI!H444444444444444444444444444444444444444...", "hi", 12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#####################4444hi!444#####################" + "'", str4, "#####################4444hi!444#####################");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", 32);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.CharSequence charSequence1 = null;
        java.lang.CharSequence charSequence4 = null;
        java.lang.CharSequence charSequence5 = null;
        char[] charArray10 = new char[] { 'a', 'a', '#', '#' };
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence5, charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence4, charArray10);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny(charSequence1, charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "h!ih!ih!ih                                                                                          ", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###H", (java.lang.CharSequence) "i!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        java.lang.CharSequence charSequence0 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(charSequence0, (java.lang.CharSequence) "h!ih!ih!ih                     ", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", 100, 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                                                                 hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                 hhi!hi!hi!hhi!hi!hi" + "'", str1, "                                                                                 hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444#####################44" + "'", str1, "#####################4444hi!444#####################44");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("###HHI!H444444444444444444444444444444444444444...", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!H444444444444444444444444444444444444444..." + "'", str2, "HI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih!ih" + "'", str1, "h!ih!ih!ih");
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("###H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###H" + "'", str1, "###H");
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "#####################4444HI!444#####################44", (java.lang.CharSequence) "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h!ih!ih!ih", "444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h!ih!ih!ih" + "'", str2, "h!ih!ih!ih");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi!h444444444444444444444444444444444444444..", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444.." + "'", str2, "hi!hi!h444444444444444444444444444444444444444..");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", "aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (int) (byte) 1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###HHI!H444444444444444444444444444444444444444...", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HHI!H444444444444444444444444444444444444444..." + "'", str2, "HHI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "hi!", "                                                   hi!hi!h444444444444444444444444444444444444444..h", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "##########", (java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "#####################4444hi!444#####################44", (java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("4444   444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "#####################4444hi!444####################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                    ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                          HI!HI!HI!H", 2, "          ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                          HI!HI!HI!H" + "'", str3, "                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                                                                          hi!hi!hi!h", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("    ", "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...", "444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444" + "'", str2, "4444444444444444444444444");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "        ", (java.lang.CharSequence) "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", (java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               " + "'", str1, "                                               ");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviateMiddle("                     ", "                                                                                      hi!hi!hi!ha...", 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     " + "'", str3, "                     ");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa" + "'", str1, "aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (java.lang.CharSequence) "#####################4444hi!444#####################", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h!ih!ih!ih", (java.lang.CharSequence) "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!h444444444444444444444444444444444444444..", "   444444444444hi!hi!hi!h4444444444444    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "                                                                                          ", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444" + "'", str2, "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444" + "'", str2, "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase((java.lang.CharSequence) "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                                                 hhi!hi!hi!hhi!hi!hi", 2, 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "                                                                                          hi!hi!hi!h", (java.lang.CharSequence) "4444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44hi!hi!hi!h", "4444444...44hi!hi!hi!h4444444444444", "#####################4444hi!444#####################", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44hi!hi!hi!h" + "'", str4, "44hi!hi!hi!h");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444hi!hi!hi!h4444444444444" + "'", str1, "444444444444hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "", 25, 35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("#####################4444hi!444####################", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "#", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                      hi!hi!hi!ha...", "aaa...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.CharSequence charSequence1 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "h!ih!ih!ih                                                                                          ", charSequence1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Strings must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h", "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", str1, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                   " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "###", (int) ' ');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "###h", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("", 27, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "h!ih!ih!ih", (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", "               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 48);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444...", (java.lang.CharSequence) "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 99 + "'", int2 == 99);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                 hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H444444444444444444444444444444444444444..." + "'", str1, "HI!HI!HI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                               ###hhi!h44444444444444444444444444444444", "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               ###hhi!h44444444444444444444444444444444" + "'", str2, "                                               ###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#####################4444HI!444#####################44", "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444HI!444#####################44" + "'", str2, "#####################4444HI!444#####################44");
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                                   hi!hi!h444444444444444444444444444444444444444..h", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                   hi!hi!h444444444444444444444444444444444444444..h" + "'", str2, "                                                   hi!hi!h444444444444444444444444444444444444444..h");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("##########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########" + "'", str1, "##########");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.lang.CharSequence charSequence2 = null;
        java.lang.CharSequence charSequence3 = null;
        char[] charArray8 = new char[] { 'a', 'a', '#', '#' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence3, charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence2, charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                    ", 53, "#####################4444hi!444#####################44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                    " + "'", str3, "                                                                                                    ");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", "hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "444hhi!h4444444444...44444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!H444444444444444444444444444444444444444...", "   ", "4444   444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444" + "'", str1, "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                          ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         " + "'", str2, "                                         ");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "h!ih!ih!ih                                                                                          ", "###H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str3, "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444" + "'", str2, "44444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hi!h444444444444444444444444444444444444444..", "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h!ih!ih!ih" + "'", str1, "h!ih!ih!ih");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h", "hi!hi!h444444444444444444444444444444444444444...", (int) (short) 100);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hi!h", "hi!");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray5, strArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.endsWithAny((java.lang.CharSequence) "          ", (java.lang.CharSequence[]) strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, '#', 25, 90);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 25");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "4444444444444h!ih!ih!ih444444444444", (java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                   hi!hi!h444444444444444444444444444444444444444...", '4');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     ", "", 92);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("        ", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("#####################4444hi!444####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444####################" + "'", str1, "#####################4444hi!444####################");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###hhi!h44444444444444444444444444444444", "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h44444444444444444444444444444444" + "'", str2, "###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ", (java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("aaaaaaaa444444444444444aaaaaaaaa", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    aaaaaaaa444444444444444aaaaaaaaa" + "'", str2, "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaa               aaaaaaaaa", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                  44hi!hi!hi!h                   ", "HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                  44hi!hi!hi!h                   " + "'", str2, "                  44hi!hi!hi!h                   ");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "44hi!hi!hi!h", (java.lang.CharSequence) " ", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                      hi!hi!hi!ha.." + "'", str1, "                                                                                      hi!hi!hi!ha..");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str1, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "###h              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.lang.CharSequence[] charSequenceArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "h!ih!ih!ih", charSequenceArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "###h              ", (java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444", 49);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", 42);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("    ", 46, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("444444444444hi!hi!hi!h4444444444444", "44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h4444444444444" + "'", str2, "hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!HI!H444444444444444444444444444444444444444...", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 1);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("#");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("hhi!hi!hi!hhi!hi!hi", strArray4, strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hhi!hi!hi!hhi!hi!hi" + "'", str9, "hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "#####################4444HI!444#####################44", (java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!HI!HI!H444444444444444444444444444444444444444...", "h!ih!ih!ih                                                                                          ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("###HHI!H44444444444444444444444444444444", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str2, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h!ih!ih!ih                     ", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      h!ih!ih!ih                     " + "'", str2, "                      h!ih!ih!ih                     ");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!", strArray1, strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 99, (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa", (java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!hi!hi!h4444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("h", "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "###", "aaa...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444444444444444", 47);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("#####################4444hi!444#####################", 27, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444#####################" + "'", str3, "#####################4444hi!444#####################");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str2, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "###hhi!h44444444444444444444444444444444", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###hhi!h44444444444444444444444444444444" + "'", charSequence2, "###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("###HHI!H44444444444444444444444444444444", 27);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str2, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444                               " + "'", str2, "444444444444444                               ");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "       444...        ", (java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#####################4444HI!444#####################44", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444HI!444#####################44" + "'", str2, "#####################4444HI!444#####################44");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                  44hi!hi!hi!h                   ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!hi!h                   4                  " + "'", str2, "hi!hi!hi!h                   4                  ");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                                   hi!hi!h444444444444444444444444444444444444444..h", charSequence1, 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                      h!ih!ih!ih                     ", "                                                                                                    ", "44hi!hi!hi!hclass [Ljava.lang.Strin");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str3, "4444444444444444444444h!ih!ih!ih444444444444444444444");
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "444444444444444                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", charSequence2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                   ", (java.lang.CharSequence) "i!hi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;" + "'", str2, "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("###HHI!H444444444444444444444444444444444444444...", (int) (byte) 100, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444..." + "'", str3, "...4444...");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###H", "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44hi!hi!hi!h4444444444444", 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444444", (java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.CharSequence charSequence0 = null;
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "", 100);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny(charSequence0, (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str1, "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "hi!hi!hi!h", 32);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', 90, 2);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444                               ", (int) (short) -1, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444                               " + "'", str3, "444444444444444                               ");
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#####################4444hi!444####################", 25, "                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#####################4444hi!444####################" + "'", str3, "#####################4444hi!444####################");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly((java.lang.CharSequence) "#####################4444HI!444#####################44", "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "        ", (java.lang.CharSequence) "4444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                     ", (java.lang.CharSequence) "hi!hi!hi!ha...", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                               ###hhi!h44444444444444444444444444444444", "4444444...44hi!hi!hi!h4444444444444", 6);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", strArray1, strArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", str6, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("", "    ", "#####################4444HI!444#####################44", 53);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "                                                                    aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("###HHI!H44444444444444444444444444444444", "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "4444444444444h!ih!ih!ih444444444444", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str4, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...", "aaaaaaaa               aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                                         ", "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                         " + "'", str2, "                                         ");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###h              ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                  44hi!hi!hi!h                   ", "                                               ###hhi!h444444444444444444444444444444444444444...", "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444..", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("                                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                         " + "'", str1, "                                         ");
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", (java.lang.CharSequence) "##########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(' ', 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                  " + "'", str2, "                                                                                                  ");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, '4', 21, 32);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str3, "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("", "h!ih!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("       444...        ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("44hi!hi!hi!h4444444444444", "4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!h4444444444444" + "'", str2, "44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", (java.lang.CharSequence) "#####44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444######");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("4444hi!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444!ih4444" + "'", str1, "444!ih4444");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!hi!hi!h                   4                  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                      h!ih!ih!ih                     ", "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    " + "'", str1, "    ");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", (java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" ", "                      h!ih!ih!ih                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H444444444444444444444444444444444444444..." + "'", str1, "HI!HI!HI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444h!ih!ih!ih444444444444444444444", (-1), 34);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444h!ih!ih!ih44" + "'", str3, "4444444444444444444444h!ih!ih!ih44");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#####################4444hi!444#####################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444#####################" + "'", str1, "#####################4444hi!444#####################");
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444" + "'", str1, "4444444444444444444444444");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!hi!hi!h444444444444444444444444444444444444444...", "4444   444", 98);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4', 4, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                                                    aaaaaaaa444444444444444aaaaaaaaa", 92, 53);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("          ", "44hi!hi!hi!h", (int) '4', 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "          44hi!hi!hi!h" + "'", str4, "          44hi!hi!hi!h");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444444", (java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", (int) ' ', "                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444h!ih!ih!ih444444444444", (int) (byte) 100, 12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.lang.CharSequence charSequence1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...", charSequence1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("4444   444", "#####################4444hi!444#####################", "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("4444444444444444444444h!ih!ih!ih444444444444444444444", "                                               ", "4444hi!444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", (java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("###hhi!h444444444444444444444444444444444444444..", "hi!hi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                          ", "4444444...44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "               ", 35, 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                      hi!hi!hi!ha...", "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                  ", "                                                   hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("###HHI!H44444444444444444444444444444444", "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H44444444444444444444444444444444" + "'", str2, "###HHI!H44444444444444444444444444444444");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("4444444444444444444444h!ih!ih!ih444444444444444444444", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str2, "4444444444444444444444h!ih!ih!ih444444444444444444444");
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "          44hi!hi!hi!h", (java.lang.CharSequence) "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.lang.CharSequence charSequence3 = null;
        java.lang.CharSequence charSequence4 = null;
        char[] charArray9 = new char[] { 'a', 'a', '#', '#' };
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(charSequence4, charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(charSequence3, charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "hi!hi!hi!h", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        java.lang.Class<?> wildcardClass15 = charArray9.getClass();
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "aa##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[a, a, #, #]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("###", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (-1), "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase((java.lang.CharSequence) "       444...        ", (java.lang.CharSequence) "###HHI!H44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!h4444444444444" + "'", str1, "44hi!hi!hi!h4444444444444");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("###", 34, "4444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444h!###4444444444444h!i" + "'", str3, "4444444444444h!###4444444444444h!i");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444" + "'", str2, "4444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih4444444444444444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444" + "'", str1, "4444444444444444444444444");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444...44hi!hi!hi!h4444444444444", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                   " + "'", str3, "                                   ");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                   hi!hi!h444444444444444444444444444444444444444...", "                                               ", "#####################4444HI!444#####################44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###################################################hi!hi!h444444444444444444444444444444444444444..." + "'", str3, "###################################################hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                   ", "hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat('4', (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException; message: null");
        } catch (java.lang.NegativeArraySizeException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!h" + "'", str1, "44hi!hi!hi!h");
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "                                                                                          hi!hi!hi!h", "                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih444444444444444444444", (java.lang.CharSequence) "                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "444hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "###h              ", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "   ", "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str3, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    " + "'", str1, "    ");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric((java.lang.CharSequence) "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "hi!hi!h444444444444444444444444444444444444444...", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripAccents("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str1, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444444444                               ", "444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               " + "'", str2, "                               ");
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("                                                                                          HI!HI!HI!H", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H" + "'", str2, "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  " + "'", str3, "                                 ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44hi!hi!hi!h", "                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44hi!hi!hi!h" + "'", str2, "44hi!hi!hi!h");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.CharSequence charSequence1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", charSequence1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("44444444444444444444444444444444444444444444444444444", "                                                   hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "4444hi!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "4444444...44hi!hi!hi!h4444444444444", (java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444                               ", 35);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444                               " + "'", str2, "444444444444444                               ");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444h!ih!ih!ih44444444444" + "'", str1, "444444444444h!ih!ih!ih44444444444");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("444444444444h!ih!ih!ih444444444444", "44hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", str2, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###", "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   " + "'", str3, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi   ");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4444444444444444444444444...!h4444444444444", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444" + "'", str2, "444");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihihihihihihihihihi" + "'", str2, "hihihihihihihihihihi");
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("h!ih!ih!ih                                   ###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("###h", "hi!");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny((java.lang.CharSequence) "               ", (java.lang.CharSequence[]) strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                               " + "'", str1, "                                               ");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaa444444444444444aaaaaaaaa                                                                   ", "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                   " + "'", str2, "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       444...        ", "", "                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       444...        " + "'", str3, "       444...        ");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace((java.lang.CharSequence) "4444hi!444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 " + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444 ");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "                                                     ", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih444444444444444444444", (java.lang.CharSequence) "                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "#####################4444hi!444#####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "                                         ", (java.lang.CharSequence) "4444hi!444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                                   ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "###HHI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "h!ih!ih!ih", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "h!ih!ih!ih", (java.lang.CharSequence) "                                                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hi!h444444444444444444444444444444444444444...", 27, 46);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444..." + "'", str3, "4444444444444444444...");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                  ", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                  " + "'", str3, "                                                                                                  ");
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                                                                                          HI!HI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("###HHI!H444444444444444444444444444444444444444...", "4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!H444444444444444444444444444444444444444..." + "'", str2, "###HHI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ", (java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "h!ih!ih!ih                                                                                          ", (java.lang.CharSequence) "4444444444444444444444h!ih!ih!ih44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...", 35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (java.lang.CharSequence) "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "i!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray4 = null;
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", (java.lang.CharSequence) "444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...", "###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        java.lang.CharSequence charSequence1 = null;
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf((java.lang.CharSequence) "4444444444444h!###4444444444444h!i", charSequence1, (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase((java.lang.CharSequence) "hi!", (java.lang.CharSequence) "                                               ###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444" + "'", str1, "444444444444444");
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(charSequence0, "44hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaa444444444444444aaaaaaaaa                                                                    ", "#444444444444444444444444aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!44444444", "aaaaaaaa444444444444444aaaaaaaaa                                                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaa444444444444444aaaaaaaaa                                                                    " + "'", str3, "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int3 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "i!hi!hi!", (java.lang.CharSequence) "###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!" + "'", str3, "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", (java.lang.CharSequence) "                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          HI!HI!HI!H");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        java.lang.String[] strArray1 = new java.lang.String[] {};
        java.lang.String[][] strArray2 = new java.lang.String[][] { strArray0, strArray1 };
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String[][] strArray5 = new java.lang.String[][] { strArray3, strArray4 };
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String[] strArray7 = new java.lang.String[] {};
        java.lang.String[][] strArray8 = new java.lang.String[][] { strArray6, strArray7 };
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String[] strArray10 = new java.lang.String[] {};
        java.lang.String[][] strArray11 = new java.lang.String[][] { strArray9, strArray10 };
        java.lang.String[][][] strArray12 = new java.lang.String[][][] { strArray2, strArray5, strArray8, strArray11 };
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join(strArray12);
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains((java.lang.CharSequence) "                                                                                          HI!HI!HI!H                                                                                          HI!HI!HI!H", (java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("44hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44hi!hi!hi!h" + "'", str1, "44hi!hi!hi!h");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!H444444444444444444444444444444444444444.." + "'", str1, "HI!HI!HI!H444444444444444444444444444444444444444..");
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("44444444444444444444444444444444444444444444444444444444444444444444444HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###hhi!h44444444444444444444444444444444" + "'", str2, "###hhi!h44444444444444444444444444444444");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("#####################4444hi!444####################", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#####################4444hi!444" + "'", str2, "#####################4444hi!444");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!", "hi!hi!hi!h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!h");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("hi!hi!hi!h", strArray3, strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!hi!hi!h" + "'", str7, "hi!hi!hi!h");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444", (java.lang.CharSequence) "###################################################hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("44444444444444444444444444444444444444444444444444444", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                                                                                          hi!hi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h" + "'", str1, "hi!hi!hi!h");
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "444...", (java.lang.CharSequence) "                                                                                      hi!hi!hi!ha...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444!ih4444", "                                               ###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", (java.lang.CharSequence) "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.lang.CharSequence charSequence0 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(charSequence0, (java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444..." + "'", str1, "444...");
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.substringsBetween("", "###h              ", "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny((java.lang.CharSequence) "                                   ", (java.lang.CharSequence[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric((java.lang.CharSequence) "               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!H444444444444444444444444444444444444444..." + "'", str1, "HI!H444444444444444444444444444444444444444...");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###hhi!h44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 35, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "aaaaaaaa444444444444444aaaaaaaaahi!aaaaaaaa444444444444444aaaaaaaaahi!", (java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444" + "'", str1, "hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "##########", (java.lang.CharSequence) "                                         ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444..." + "'", str1, "###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...###hhi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HI!HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi" + "'", str3, "###hhi!hi!hi!hhi!hi!hi!hhi!hi!hi");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "#####################4444hi!444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444444444444444444h!ih!ih!ih444444444444444444444", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str2, "4444444444444444444444h!ih!ih!ih444444444444444444444");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence) "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", (java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "444!ih4444", (java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...", 31);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", (java.lang.CharSequence) "hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "4444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "hhi!hi!hi!hhi!hi!hi", (java.lang.CharSequence) "444444444444hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "                                                                                          ", (java.lang.CharSequence) "444", 46);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("44hi!hi!hi!h4444444444444", "hi!hi!hi!h4444444444444", "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa", 41);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa" + "'", str4, "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###hhi!h444444444444444444444444444444444444444...", "4444444444444h!ih!ih!ih444444444444");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "   444444444444hi!hi!hi!h4444444444444    ", (java.lang.CharSequence) "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 39 + "'", int2 == 39);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "#####################4444HI!444#####################44", (java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hhi!hi!hi!h444444444444444444444444444444444444444...!h444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        int int1 = org.apache.commons.lang3.StringUtils.length((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!" + "'", str3, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h########444444444444444#########hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!");
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance((java.lang.CharSequence) "hi!hi!hi!h", (java.lang.CharSequence) "#####################4444HI!444#####################44");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 53 + "'", int2 == 53);
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###HHI!HI!HI!HHI!HI!HI!HHI!HI!H", "#####################4444hi!444####################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H" + "'", str2, "###HHI!HI!HI!HHI!HI!HI!HHI!HI!H");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hihihihihihihihihihi", "hi!", "        ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                 hhi!hi!hi!hhi!hi!hi", "                                                                                                    ", "                               ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("   444444444444hi!hi!hi!h4444444444444    ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444!ih4444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444!ih4444" + "'", str2, "444!ih4444");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("44444444444444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "h!ih!ih!ih                     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "          ", 39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h", 48);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               h" + "'", str2, "                                               h");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("#####################4444hi!444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#####################4444hi!444" + "'", str1, "#####################4444hi!444");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.containsWhitespace((java.lang.CharSequence) "                  44hi!hi!hi!h                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase((java.lang.CharSequence) "   ", (java.lang.CharSequence) "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                          hi!hi!hi!h");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!h444444444444444444444444444444444444444..." + "'", str1, "hi!hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                  44hi!hi!hi!h                   ", "hi!hi!h444444444444444444444444444444444444444...", "hi!hi!hi!h4444444444444");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("...4444...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4444..." + "'", str1, "...4444...");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#####################4444hi!444#####################44");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("###HHI!H44444444444444444444444444444444", 99, 39);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("", "44hhi!hi!hi!haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa...!haaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("          ", "hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          " + "'", str2, "          ");
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny((java.lang.CharSequence) "444hhi!h4444444444...44444444...", (java.lang.CharSequence) "###HHI4Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        int int3 = org.apache.commons.lang3.StringUtils.lastOrdinalIndexOf((java.lang.CharSequence) "                                         ", (java.lang.CharSequence) "                      h!ih!ih!ih                     ", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!hi!h444444444444444444444444444444444444444...", "class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!h444444444444444444444444444444444444444..." + "'", str2, "hi!hi!h444444444444444444444444444444444444444...");
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("4444444444444444444...", "h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444..." + "'", str2, "4444444444444444444...");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444", "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                ", 25, "4444444444444444444...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                " + "'", str3, "                                ");
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", "                                                                                          HI!HI!HI!H", 53, 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H" + "'", str4, "HHI!HI!HI!HHI!HI!HI!HHI!HI!                                                                                          HI!HI!HI!H");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase((java.lang.CharSequence) "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf((java.lang.CharSequence) "    ", (java.lang.CharSequence) "HI!HI!HI!H444444444444444444444444444444444444444..", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                          HI!HI!HI!H", 46);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    HI!HI!HI!H" + "'", str2, "                                    HI!HI!HI!H");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444h!ih!ih!ih444444444444", "###h              ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                          HI!HI!HI!H", 2, 92);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("4444444444444444444444h!ih!ih!ih444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444h!ih!ih!ih444444444444444444444" + "'", str1, "4444444444444444444444h!ih!ih!ih444444444444444444444");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h" + "'", str1, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...", (java.lang.CharSequence) "ss [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44..." + "'", charSequence2, "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa44...");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444444444444..", "                                               h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444.." + "'", str2, "4444444444444444444444444444444..");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches((java.lang.CharSequence) "hi!hi!hi!ha...", (java.lang.CharSequence) "44hi!hi!hi!h4444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("class [Ljava.lang.String;class [Ljava.lang.String;class [Ljava.lang.String;class [C", 98, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ava.lang.String;class [C" + "'", str3, "...ava.lang.String;class [C");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith((java.lang.CharSequence) "#####################4444hi!444", (java.lang.CharSequence) "Hi!hi!h444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfIgnoreCase((java.lang.CharSequence) "###hhi!h444444444444444444444444444444444444444...", (java.lang.CharSequence) "i!hi!hi!h!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("444444444444h!ih!ih!ih444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444h!ih!ih!ih444444444444" + "'", str1, "444444444444h!ih!ih!ih444444444444");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HHI!H444444444444444444444444444444444444444...", "44444444444444444444444444444444h!ihh###                                               ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference((java.lang.CharSequence[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf((java.lang.CharSequence) "                                               ###hhi!h44444444444444444444444444444444", (-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "44hhi!hi!hi!h444444444444444444444444444444444444444...!h4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("444hhi!h4444444444...44444444...", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!hi!h444444444444444444444444444444444444444..", "                                               h", 90, 35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!hi!h4444444444444444444444444444                                               h" + "'", str4, "hi!hi!h4444444444444444444444444444                                               h");
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.normalizeSpace("###h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###h" + "'", str1, "###h");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha((java.lang.CharSequence) "hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HIhi!hi!hi!h444444444444444444444444444444444444444...###HHI!HI!HI!HHI!HI!HI!HHI!HI!HI", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone((java.lang.CharSequence) "444hhi!h4444444444...44444444...", "aaaaaaaa444444444444444aaaaaaaaa                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "HI!H444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4444hi!444", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444hi!444" + "'", str2, "4444hi!444");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        java.lang.CharSequence charSequence2 = org.apache.commons.lang3.StringUtils.defaultIfBlank((java.lang.CharSequence) "aaaaaaaa               aaaaaaaaa", (java.lang.CharSequence) "#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + charSequence2 + "' != '" + "aaaaaaaa               aaaaaaaaa" + "'", charSequence2, "aaaaaaaa               aaaaaaaaa");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("aaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaa..." + "'", str1, "aaa...");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444...", "HI!HI!HI!H444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444..." + "'", str2, "4444444444444444444...");
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                                    HI!HI!HI!H", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    HI!HI!HI!H" + "'", str2, "                                    HI!HI!HI!H");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfIgnoreCase((java.lang.CharSequence) "hi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!haaaaaaaa444444444444444aaaaaaaaahi!hi!hi!hhi!hi!hi!hhi!hi!hi!hhi!h", (java.lang.CharSequence) "44444444444444444444444444444444h!ihh###                                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace((java.lang.CharSequence) "44444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }
}

