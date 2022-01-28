import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test4501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4501");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i", "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!Hi!!IH!IH!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("Hi!!IH!IH!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("HI!I!  ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 352, 183);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!" + "'", str1, "hi!hihi!hi!");
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!#", "I!44", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", "        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                       !i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       Hi!", "!IH", (int) (byte) 1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!#");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!hihi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a###                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hihi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "i!hihi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      hi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("  ...", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("        I#", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        I" + "'", str2, "        I");
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ", (int) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        " + "'", str3, "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ");
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                hi#!!IH!IH!                 ", "hi!      hi  hi!      hi!      hi", "HI!hIhIhIhIhIhIhIhIhIhIhIhIhI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hI!44", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hI!44 " + "'", str2, " hI!44 ");
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("", "hi!#", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!       hI!", "!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. " + "'", str1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi.. ");
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi  Hi      Hi      Hi", "####          !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! HI  HI      HI      HI  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! " + "'", str1, "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! HI  HI      HI      HI  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!", "#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!" + "'", str2, "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!");
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str2, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!i#", "hi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#", "                                                                                          ...#######");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 0, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###AAA" + "'", str3, "###AAA");
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H", "aa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H" + "'", str2, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H");
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" H  ", "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("HI!hI!!ih!i", (int) (short) 100, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  ", "i!hihi!hi!hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("####          !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!          ####" + "'", str1, "hi!          ####");
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i", "!ih", 352);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                             HI#                              ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", "aaaaaaaaaaaaaaaaaaaaaaaaaa  HI!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  HI!    ", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("...   ...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "aaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...   ...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH" + "'", str2, "...   ...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!  HI!   ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      hi!  HI!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi#");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hiIH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(" hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                                             I#                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH" + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!      hi  hi!      hi!      hi                       !i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!      HI                       !I!" + "'", str1, "HI!      HI  HI!      HI!      HI                       !I!");
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi#####################...      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#####################...      " + "'", str1, "hi#####################...      ");
    }

    @Test
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi!      hi  hi!      hi!      h");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hI!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hI!hihI!!hI!      hI!hihI!  hI!hihI!!hI!      hI!hihI!!hI!      hI!h" + "'", str3, "  hI!hihI!!hI!      hI!hihI!  hI!hihI!!hI!      hI!hihI!!hI!      hI!h");
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("##      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", " Hi  Hi      Hi      Hi", (int) (short) 100);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "4444444444" + "'", str5, "4444444444");
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals(" hI!44 ", "Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str2, " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#######hi#", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("####          !ih####      !!!hhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!      hi  hi!      hi!      hi                       !i!", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi                       !i!" + "'", str2, "hi!      hi  hi!      hi!      hi                       !i!");
    }

    @Test
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaa" + "'", str1, "aaaa");
    }

    @Test
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                     hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", 57, "     !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                     hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h" + "'", str3, "                     hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "HI#       ", 67);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", "      hi #!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str2, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###aaaah  h  h  h  h  h  h  h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###aaaah  h  h  h  h  h  h  h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "###aaaah  h  h  h  h  h  h  h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!!!hi!!!!!", "IH");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("####!ih####!ih####!ih####!ih####!####!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("HI !I", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        int int1 = org.apache.commons.lang3.StringUtils.length(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 99 + "'", int1 == 99);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("       hi#hi!I#hi!I#hi!I#hi!I#hi", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi#hi!I#hi!I#hi!I#hi!I#hi" + "'", str3, "       hi#hi!I#hi!I#hi!I#hi!I#hi");
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '4', (int) (byte) 100, 32);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", " !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("###aaaah  h  h  h  h  h  h  h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 356 + "'", int2 == 356);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("a##", "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a##" + "'", str2, "a##");
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                  ", 10, "#        i##  HI!      HI  HI!      HI!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                  " + "'", str3, "                                                                  ");
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#" + "'", str2, "!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#");
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("H", " ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("        HI! ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        HI! " + "'", str2, "        HI! ");
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "       hI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", "AAAAAAAAA HI  HI      HI      HIAAAAAAAA", "HI!I#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h" + "'", str3, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...#######", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("#        I##  HI!      HI  HI!      HI!     ", 349, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...     HI!     " + "'", str3, "...     HI!     ");
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("#        I##  hi!      hi  hi!      hi!     ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#        I##  hi!      hi  hi!      hi!     " + "'", str1, "#        I##  hi!      hi  hi!      hi!     ");
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI!I#", "I", "hi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hhi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#!I#" + "'", str3, "Hhi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#!I#");
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "                                 h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str2, "Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                hi#!!IH!IH!                 ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("aaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "hihi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH" + "'", str1, "!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH");
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                                                                                      !!!hhIHhIHh", "####################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      !!!hhIHhIHh" + "'", str2, "                                                                                      !!!hhIHhIHh");
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!i", "hI! hI! hI! hI! hI! hI! hI! hI! hI! hI! hI! hI! hI! hI! hI! hI! hI!                            ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "                                                                                                                                                                          aaaaaaaaaa                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("hi", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("IH", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#", "  hi!      hi  hi!      hi!      hi", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#" + "'", str4, "#");
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split(" hi", "i!    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("  HI4...");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI4..." + "'", str1, "  HI4...");
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI!44", "hi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi! hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hi hi  hi!      hi!      hihi# hi  hi!      hi!      hi hi  hi!      hi!      hi hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIH", "  ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("", "hi#####################...      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                 h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", "  HI!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("        I", 62, 92);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("  hi!  ...", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" HI!  hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI!  hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI" + "'", str2, " HI!  hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI");
    }

    @Test
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       H" + "'", str1, " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       H");
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      hi!      hi  hi!      hi!      h HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!hi!hihi!hi!hHIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!H" + "'", str1, "HI!HIHI!HI!HIHI!HIHI!HI!hi!hihi!hi!hHIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!H");
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "  HI4...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H" + "'", str2, "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                      ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("         ", "!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hI!44", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf(".", "!#Ih", 341);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("#        I##  hi!      hi  hi!      hi!    ", "", "                       !i!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaa", " hi!  ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ih      !", "hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !" + "'", str2, "ih      !");
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", "Hhi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#!I#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi!    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!    " + "'", str2, "Hi!    ");
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", 16, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str3, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  #h", "", "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  #h" + "'", str3, "!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  !ih!ih      !ih  ih      !ih  #h");
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                 h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!!!hi!!!!!", "Hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("       HI!                                                                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI!                                                                                       " + "'", str2, "       HI!                                                                                       ");
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "ih!ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444", '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                          " + "'", str3, "                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                          ");
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I" + "'", str1, "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I");
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("          ", "###aaaah  h  h  h  h  h  h  h...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "HI!44H  H  H  H  H  H  H    H        H   H        H        HH  H  H  H  H  H  H  H  H  H  H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("       Hi!       444444444", 97, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "aaaaaaaaa ", 94, 95);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 94");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..." + "'", str2, "...");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
        int int1 = org.apache.commons.lang3.StringUtils.length("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 130 + "'", int1 == 130);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH", 94, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH" + "'", str3, "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#        I##  hi!      hi  hi!      hi!" + "'", str1, "#        I##  hi!      hi  hi!      hi!");
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444444444444444", "aaaaaaaaa ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444" + "'", str2, "4444444444444444444444444");
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hI!44", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI", "...     HI!     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str2, "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaa", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("... ", "   hi !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... " + "'", str2, "... ");
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("            HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI", "################!!!hhihhihh#################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 130, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!I" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!I");
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", "hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("IH", 356, "                     hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  " + "'", str3, "IH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  ");
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!" + "'", str1, "hi!hihi!hi!");
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih " + "'", str4, "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!", "...", "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!");
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#", "                                                                                                                                                                            Hi                                                                                                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ", "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", 67);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
        int int1 = org.apache.commons.lang3.StringUtils.length("        HI! ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 12 + "'", int1 == 12);
    }

    @Test
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("...   ...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                                                                                          aaaaaaaaaa                                                                                      !!!hhIHhIHh", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!!!                                                                                                 ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("                                                         Hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                         Hi!    " + "'", str1, "                                                         Hi!    ");
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!#", "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 113 + "'", int2 == 113);
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa", "ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa" + "'", str2, "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa");
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      hi!      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "                                                                                                I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          I" + "'", str2, "                                                                                          I");
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH" + "'", str1, "IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH  IH");
    }

    @Test
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                                          ...#######");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...#######" + "'", str1, "...#######");
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("    ", "HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IIHi!!IH!IH!i#!Hi!!IH!IH!i#!Hi!!IH", '4', 110);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("a##", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "...I  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" Hi!", "", "Hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi!" + "'", str3, " Hi!");
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("    !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", 89, "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! " + "'", str3, "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 347, "Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i      " + "'", str3, "Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i     hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhHi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i         Hi!i!             HHi!i!     hi #!Hi!i!             Hi!i      ");
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "  HI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!" + "'", str2, "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!");
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "hi#hi!I#hi!I#hi!I#hi!I#hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", 24, "hi!      hi  hi!    hi!      hi  hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str3, "!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi!      hi  hi!      hi!      h");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str2, "  hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", "###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  hi!   ", 230, 16);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#####################...      ", "       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!    ", 65);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!    ", "hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!    " + "'", str3, "!    ");
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("", "#######hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                          ...#######");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a###" + "'", str1, "a###");
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("#        I##  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi" + "'", str2, " hi");
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("444444444444444444444444444444444444444444hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh444444444444444444444444444444444444444444", "          !ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  " + "'", str2, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ");
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", 168, 173);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...HI ...", "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("4444444444", "     hi      hi      hi      hi !i", "hi!      hi  hi!      hi!      hi                       !i!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444" + "'", str3, "4444444444");
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!#Ih", "        I#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH", "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!                                                                                                            ...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH", "!ih", 2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#!!IH!IH!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!IH" + "'", str5, "!IH");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 4 + "'", int6 == 4);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 119);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!          ####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      hi ", "                                                                                      !!!hhIHhIHh");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!!IH!IH!", strArray7, strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("          ", strArray2, strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) '4', 113);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "..." + "'", str4, "...");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!!IH!IH!" + "'", str11, "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "          " + "'", str12, "          ");
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", 13, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  hi!    ", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!    " + "'", str2, "  hi!    ");
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("...I  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray4, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!ih", strArray4);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi !i", 5, 79);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h" + "'", str1, "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!", "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       " + "'", str2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       ");
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("IH", 183, "I!44");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHI!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I" + "'", str3, "IHI!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I!44I");
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("i!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("a##", "Hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" hi!", "ih      !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!" + "'", str2, " hi!");
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                                          hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh                                          ", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 58 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ", "iH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hiIH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", 67, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hiIH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str3, "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hiIH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("H", "a##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" HI  HI  HI  HI  HI  HI  HI  HI  HI", 67, 340);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HI  HI  HI  HI  HI  HI  HI  HI  HI" + "'", str3, " HI  HI  HI  HI  HI  HI  HI  HI  HI");
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("4444444444444444444444444          ", "                                          hi!hihi!hi!hhi!hihi!hi!hH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444          " + "'", str2, "4444444444444444444444444          ");
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !" + "'", str1, "...4   4...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !");
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!    ", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!    " + "'", str4, "  hi!    ");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("          !IH", "HIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIaHIaaaHIaaaaaaaHIaaHIaaaaaaaHIa");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("Aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444!#ih444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ", '4', 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!i!  ...", "H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI!      HI  HI!      HI!      H", "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                                                                             HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                             IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH...Ih  IH                                                                                                                             " + "'", str1, "                                                                                                                             IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH!#IH...Ih  IH                                                                                                                             ");
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH!IH!", "ih      !ih      !ih  ih      !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!" + "'", str2, "!IH!IH!");
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ii             ii         ii             ii             ii         ii");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ii             ii         ii             ii             ii         ii" + "'", str1, "ii             ii         ii             ii             ii         ii");
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                        HI#                         ", 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 12, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!!IH!IH!                 #                hi", "       Hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!       " + "'", str2, "       Hi!       ");
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                " + "'", str3, "                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ");
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!I!  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!I!  ..." + "'", str1, "HI!I!  ...");
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("aaaaaaaaaa                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! " + "'", str2, "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa##########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("          !IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "          !IH" + "'", str1, "          !IH");
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                             I#                                             ", (int) (byte) -1, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                             I#                                             " + "'", str3, "                                             I#                                             ");
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("IH                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                     hi#                  ", 119, 97);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#                     hi#                     hi#                     hi#                     h" + "'", str3, "hi#                     hi#                     hi#                     hi#                     h");
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                      !!!hhihhihh", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!!!                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ", 10, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      " + "'", str3, "ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("###AAA", " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("    !ih", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", 341);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH" + "'", str2, "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h  h  h  h  h  h  h  h...", "####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h  h  h  h  h  h  h  h..." + "'", str2, "h  h  h  h  h  h  h  h...");
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("!hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi" + "'", str2, "!hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi");
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("...   ...", "iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH  !ih                                                                                                                                                                  ", "####          !ih####      !!!hhihh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!I!  ...", "       hi!      hi  hi!      hi!      hi       hi!      hi  hi!      hi!      hi       hi!    ", "h  h  h  h  h  h  h  h...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!I!  ..." + "'", str3, "HI!I!  ...");
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hhi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#!I#", "iiiiiiiiiiiiiii", "Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hhi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#!I#" + "'", str4, "Hhi#   hi!    hi#   hi!    hi#   hi!    hi#hi!      hi  hi!    hi!      hi  hihi#   hi!    hi#   hi!    hi#   hi!    hi#!I#");
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "################!!!hhihhihh#################", "        hI!44", 349);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", "      hi #!      ", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHH" + "'", str3, " HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHH");
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("..", "!ih                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                    I#                                             ", 35, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                 I#             " + "'", str3, "                 I#             ");
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        char[] charArray3 = new char[] { ' ', '4' };
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone("  hi!   ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), " 4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), " 4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[ , 4]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("hi", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("IH", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("!#i                                                                                                 ", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!I", "                                                                                   hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!IH", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                !IH                                                 " + "'", str2, "                                                !IH                                                 ");
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih", "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi", 32, "...4   4...h !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi" + "'", str3, "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi");
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH", 262, 25);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  .  HI!      HI  HI!      HI!      H                                                                                                                                                                                                                                 ", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##.##HI!######HI##HI!######HI!######H#################################################################################################################################################################################################################################" + "'", str3, "##.##HI!######HI##HI!######HI!######H#################################################################################################################################################################################################################################");
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", 882, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iH" + "'", str1, "iH");
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("####          !IH", 110, "hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!      hi  hi!      hi!hi!  hi!      hi  hi!####          !IHhi!      hi  hi!      hi!hi!  hi!      hi  hi! " + "'", str3, "hi!      hi  hi!      hi!hi!  hi!      hi  hi!####          !IHhi!      hi  hi!      hi!hi!  hi!      hi  hi! ");
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("a###                      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                     hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h" + "'", str1, "hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444", "                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       !i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       !i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                       !i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi", "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####################################################################################################################Hi!", 7, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################################Hi!" + "'", str3, "####################################################################################################################Hi!");
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      hi #!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   ", '4');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "4444444444444444444444444          ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HII!      HI!      HI", "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "hi!hihi!hi!hhi!hihi!hi!hH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      hi #!      ", "          !ih");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                   hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                  ", "  hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa", (int) (byte) -1, (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("     hi ", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("I...", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("HI !I", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("###################################################Hi!!IH!IH!i#!####################################################", "                                                                                                                                         #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i                                                                                                                                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                          hI!##h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h                                           ", "ih!ih!ihih!i", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("aaaaaaaaa ", "hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaa " + "'", str2, "aaaaaaaaa ");
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       hi!      hi  hi!      hi!      hi", 1, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIH", "        HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       HI!                                                                                       ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "####          !ih####          !ih####          !ih####          !ih####          !####          !ih");
        java.lang.Class<?> wildcardClass5 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#        i##  HI!      HI  HI!      HI!    ", "...#######", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray3);
        java.lang.Class<?> wildcardClass7 = charArray3.getClass();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi", "Hi!!IH!IH!i#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                                                                       ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ih      !ih      !ih  ih      !ih", "       Hi!       444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("", "                                          hi!hihi!hi!hhi!hihi!hi!hH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                I", "h  h  h  h  h  h  h  h...", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiI");
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", charArray6);
        java.lang.Class<?> wildcardClass13 = charArray6.getClass();
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                   ", "                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H" + "'", str1, "Hi!i!             Hi!i         Hi!i!             HHi!i!             Hi!i         Hi!i!             H");
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h", 4, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h" + "'", str3, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!h");
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       H...");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("        hI!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!44" + "'", str1, "hI!44");
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "#        I##  HI!      HI  HI!      HI!     ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "IH");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #i", "hi!Hi!!IH!I");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!!IH!I" + "'", str2, "hi!Hi!!IH!I");
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce(" !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  iH      iH      iH  iH !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H ", "       hi#hi!I#hi!I#hi!I#hi!I#hi", "        I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  iH      iH      iH  iH !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H " + "'", str3, " !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  iH      iH      iH  iH !IH      !IH  IH      !IH  H      !IH      !IH  IH      !IH  H ");
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                                                                 HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                     ", " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                 HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                     " + "'", str2, "                                                                 HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                     ");
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("...!ih ...", "!   ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!    ");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 2, 183);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi  Hi      Hi      Hi", "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi      Hi      Hi" + "'", str2, "Hi  Hi      Hi      Hi");
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaa  HI!    ", "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("        ", "                                                         Hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      hi!      hi  hi!      hi!      h HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "!Ih", "                                                                                                                         hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!                                                                                                                                ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                                                                 hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      h" + "'", str1, "hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str1, "!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("#        I##  HI!      HI  HI!      HI!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#        I##  HI!      HI  HI!      HI!     " + "'", str1, "#        I##  HI!      HI  HI!      HI!     ");
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH                hi#!!IH!IH!                                                                                                                                                                                             Hi                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH                hi#!!IH!IH!                                                                                                                                                                                             Hi                                  " + "'", str1, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH                hi#!!IH!IH!                                                                                                                                                                                             Hi                                  ");
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a", 0, "i!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a" + "'", str3, "a");
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                              HI#!                               ", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!hihi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!" + "'", str1, "hi!hihi!hi!");
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("          !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#hi!I#", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", 356);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            " + "'", str2, "                            !!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi                            ");
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h" + "'", str3, "h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("###", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     " + "'", str4, "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny(" hi  hi!      hi!      hi", charArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "hI  hI...HI#!HI#!HI#!HI#!HI#!...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str2, "hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    ", 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih " + "'", str2, "ih ");
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str2, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hI!44", "     hi      hi      hi      hi !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ", "   hi!    ", 347);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!", strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                                                                                                                                  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!HI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HiHiHiHiHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!" + "'", str1, "hi!HI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HiHiHiHiHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!HHI!HIHI!HI!");
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!HI!HI!!#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                   ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 79, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" hi!  ", 24, "!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!HIHI!HI!HIHI!HIHI hi!  " + "'", str3, "!HIHI!HI!HIHI!HIHI hi!  ");
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "hi!#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi                                                                 hi!      hi  hi!      hi!      h", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi                                                                 hi!      hi  hi!      hi!      h" + "'", str2, "hi                                                                 hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("  hi", " HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHHHHHH HHHHHHHHHHHH HHHHHHHH HHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi" + "'", str2, "  hi");
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHaa", "hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                                                I", "  ...#######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                I" + "'", str2, "                                                                                                I");
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!hI!!ih!i", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!hI!!ih!i" + "'", str2, "HI!hI!!ih!i");
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!   ", "#        I##  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "        I#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", "hI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str2, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("####!ih####!ih####!ih####!ih####!####!ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", 11, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str3, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("#        I##  HI!      HI  HI!      HI!     ", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "HI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !IHI !I", (int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("        hI!44", "HI#       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        hI!44" + "'", str2, "        hI!44");
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi!" + "'", str1, " Hi!");
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (short) 1, "                                                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#", "     hi ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("        I");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hI!", "Hi!!IH!IH!i#!", "                        HI#                         ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("          !ih");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("####################################################", 82);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####################################################                              " + "'", str2, "####################################################                              ");
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###", "                                                                                                                             HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###" + "'", str2, "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###");
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 97, "                                                                                     #######hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi", "                                                                                      !!!hhihhihh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi");
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####          !IH", 76, "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI! ####          !IH" + "'", str3, "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI! ####          !IH");
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("    !iH", "", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    !iH" + "'", str3, "    !iH");
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "I!44I!44I!44I!44I!44I!44HI!44I!44HI!44I!44I!44I!44I!44I!44HI!44I!44I!44I!44I!44I!44HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "!!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("AAAAAAAAA HI  HI      HI      HIAAAAAAAA", "aaaaaaaaahi!I#aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("...   hi !i                           ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   hi !i                           ..." + "'", str1, "...   hi !i                           ...");
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...   ...H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH", "aAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   ...! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i!" + "'", str3, "...   ...! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i! !i!");
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!i!  ...", "Hi  Hi      Hi      Hi                                                                                                                                                                                                                                                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("h#", '4', 347);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i!      hi  hi!      hi!      hi", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("          ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("IH", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!!!hhIHhIHh", 339, 65);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!hhIHhIHh" + "'", str3, "!!!hhIHhIHh");
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("!ih", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!Hi!!IH!IH", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("i!    ", ".", 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "                                                                                      !!!hhihhihh");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "hi#####################...      ");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", 33, "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str3, "  HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "       hI!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", charArray8);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("I...", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#hi!i#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         " + "'", str1, "         ");
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("...   ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...   ..." + "'", str1, "...   ...");
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        int int1 = org.apache.commons.lang3.StringUtils.length("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h" + "'", str1, "h");
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                                                                             !                                                                                                                                                                                ", "ih      !ih      !ih  ih      !ih  ");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!    " + "'", str1, "Hi!    ");
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#######hi#", "  hi!      hi  hi!      hi!      hi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!#i", "!hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("aa");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "hi...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                hi#!!IH!IH!                 ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str3, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa", 16);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa" + "'", str2, "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa");
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("!IH                                                                                            ", "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!         hI!HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("#        I##", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!a###hi!a###hia###hi!a###hi!a###hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "I#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("iiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                    I#                                             ", 'a', 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaa", "                             HI#                              ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa" + "'", str2, "aaaaaaaaaa");
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "                                                                                     #######hi#", "                        hi#                         ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str4, "hi!      hi  hi!      hi!h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi #!", "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("####          !ih####          !ih####          !ih####          !ih####          !####          !ih", 1, 352);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####          !ih####          !ih####          !ih####          !ih####          !####          !ih" + "'", str3, "####          !ih####          !ih####          !ih####          !ih####          !####          !ih");
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "hihihihihiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                   " + "'", str1, "                                                                                                                   ");
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi!      h", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hIh!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "...!IH ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("iiiiiiiiiiiiiiii", "...!IH ...", "#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 92);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iiiiiiiiiiiiiiii" + "'", str4, "iiiiiiiiiiiiiiii");
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h", 17, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h" + "'", str3, "                                                                 hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      hHI#                                                                        hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 33, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#################################" + "'", str3, "#################################");
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "      hi #!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  " + "'", str2, "  ");
    }

    @Test
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                hi#!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                " + "'", str2, "                hi!!IH!IH!                                                                                                                                                                                             Hi                                                                                                                                                                                ");
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH  !ih ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "         " + "'", str1, "         ");
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi #!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("      hi #!      ", "   hi!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!ih                                ", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      hi!      hi  hi!      hi!      h HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" Hi!", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                              Hi!                                              " + "'", str2, "                                              Hi!                                              ");
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("####!ih####!ih####!ih####!ih####!####!ih", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH                hi#!!IH!IH!                                                                                                                                                                                             Hi                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                                             I#                                             ", 340);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             I#                                                                                                                                                                                                                                                                                                     " + "'", str2, "                                             I#                                                                                                                                                                                                                                                                                                     ");
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI" + "'", str2, "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI");
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi#####################...", "!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("ih!ih!ihih!i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ", 44, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      " + "'", str3, "      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      ");
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI" + "'", str1, "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("          hI  hI...HI#!HI#!HI#!HI#!HI#!...          ", 277);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "          hI  hI...HI#!HI#!HI#!HI#!HI#!...          " + "'", str2, "          hI  hI...HI#!HI#!HI#!HI#!HI#!...          ");
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH       iH  !ih ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih  !ih " + "'", str1, "ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih       ih  !ih ");
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("        I", "HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" HI!  hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI       hI", "                                                                                                                                                                          aaaaaaaaaa                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("", 67);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!IH!IH!", 121);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!                                                                                                                  " + "'", str2, "!IH!IH!                                                                                                                  ");
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", " ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str2, "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("AAAAAAAAA HI  HI      HI      HIAAAAAAAA", "hI!44h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AAAAAAAAA HI  HI      HI      HIAAAAAAAA" + "'", str3, "AAAAAAAAA HI  HI      HI      HIAAAAAAAA");
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("aaaaaaaaaaaaaaaaaaaaaa", 7, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("4444444444", "hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444" + "'", str3, "4444444444");
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          !ih", "          ");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray6 = null;
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("4444444444444444444444444          ", strArray3, strArray6);
        java.lang.Class<?> wildcardClass8 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "4444444444444444444444444          " + "'", str7, "4444444444444444444444444          ");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!i!", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i!" + "'", str3, "!i!");
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("####          !ih####      !!!hhihhihh####          !ih####      ", "I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ih      !ih      !ih  ih      !ih  ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444444444444444!ih!i...4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444!ih!i...4444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444!ih!i...4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("h", 270, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444h444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("HI#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("!!!hhihhihh", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("I#", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("          ", charArray7);
        java.lang.Class<?> wildcardClass15 = charArray7.getClass();
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi #!", "####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi #!" + "'", str2, "hi #!");
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hi", 130, "Hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hiHi!    Hi!    H" + "'", str3, "!      hihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!      hiHi!    Hi!    H");
    }
}
