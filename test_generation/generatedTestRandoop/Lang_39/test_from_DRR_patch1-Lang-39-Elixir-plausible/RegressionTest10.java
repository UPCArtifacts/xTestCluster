import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "hi!    i! ", "   4");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!     ", 135, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi! hI!       hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!  " + "'", str3, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi! hI!       hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!  ");
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                       h", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               h" + "'", str2, "                               h");
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "               HI#                        ", "h !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hi##########################################################################################", "!ih                                                                                                 HI!", 435);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat(" Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "                       Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########                                                                                                                                                                                                                                                                                                                              ", 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih", "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 72, 11);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("Hahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahiHi#", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        char[] charArray8 = new char[] { 'a', '4', '#', 'a' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hihi!hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                       hi!                                                           ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  HI!     ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("hi!hihi!hi!", charArray8);
        java.lang.Class<?> wildcardClass13 = charArray8.getClass();
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi  ", "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("h");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "ah                          h                        ", 1, (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h" + "'", str2, "h");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi!     ", 13, "HI!!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!     HI!" + "'", str3, "  hi!     HI!");
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!      hi  hi!      hi!      hi" + "'", str1, "I!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("44444", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              " + "'", str2, "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hhhHI!HIHI!HI!hhhhhhhhhhhh", '#', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase(" Hi  Hi...", "h                                   i!      hi  hi!      hi!!ih                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi..." + "'", str2, " Hi  Hi...");
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444", " hi  hi...hi#!hi#!hi#!hi#!hi#!h...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("  hi!                                                                                                                   ", "ah                          h                        ", "!ih   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!                                                                                                                   " + "'", str3, "  hi!                                                                                                                   ");
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#ih" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#ih");
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "  H   H       H       H ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                       hi!                                                           ", "I!      HI  HI!      HI!      HI                               ", 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    hi# hi!       hi# hi!       hi#", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "iHiHiHiH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...", "!ih                       !i");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444..." + "'", str3, "444444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444...");
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "                                                                    hi!     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                                                       h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("  hi!      hi  hi!      hi!      h                                                                  ", "    !iH   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("!ih", "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", 29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi! hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi!", "  hi!      hi  hi!      hi!      h                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "HHHhi!hihi!hi!HHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  !i" + "'", str1, "  !i");
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi  ", "HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi  " + "'", str2, "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi  ");
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents(" hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!" + "'", str1, " hi!");
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("444444444444444444444444444444444H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, " HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("!ih      !ih  ih      !ih         ", "##########################################################################################################################################################################Hi###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!h...", " hI  hI...HI#!HI#!HI#!HI#!HI#!H...", 201);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!" + "'", str4, "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!");
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("HI!I!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!I!!!!" + "'", str1, "HI!I!!!!");
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                                                                                   H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                   a" + "'", str1, "                                                   a");
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4ih######!ih######!ih##i4", 25, 50);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!h...", 17, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!h..." + "'", str3, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!h...");
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                                    ih!ih!ihih!ih                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("                               h", "Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("4hi4!4      4hi4  4hi4!4      4hi4!4      4hi", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("  hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("  Hi     ###########################################################################################", "  !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!ih      !ih  ih      !ih         ", "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", "H   H       H    hi!      hi  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih      !ih  ih      !ih         " + "'", str3, "!ih      !ih  ih      !ih         ");
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ahi!", "ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!" + "'", str2, "ahi!");
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("          ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        HI#                         ", "Hi  Hi...", 3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '4');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!IH                                                                                                 ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                        HI#                         " + "'", str5, "                        HI#                         ");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                             ah                          h                       ", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             ah                          h                       " + "'", str2, "                                             ah                          h                       ");
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("I!HIHI!HI!HI", "#########                                            hi!    !ih  ########444444hi#!444444hi#!444444h", "  Hi     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hi!      hi  hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi hi!" + "'", str2, "hi! hi hi!");
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H   H       H    hi!      hi  hi!  ", "  hi                                                ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("   hi#!Hi!H  hi#!Hi!i  hi#!Hi!!", "Ah                          h                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!                                                                                        i!hihi!hi!hi", "                                                                                    hi  hi...hi#!hi#!hi#!hi#!hi#!h...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "ihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("      HI ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI       HI       HI       HI       HI       HI       HI       HI " + "'", str2, "      HI       HI       HI       HI       HI       HI       HI       HI ");
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i     ###########################################################################################", "hia!4444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi!hi!!ih!ih           ", 440);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!!ih!ih           " + "'", str2, "hi!hi!!ih!ih           ");
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   Hi!    ", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", 120);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("#######################################...", strArray9);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("hI!HHHHHH!I!HHHHHH!I!HHI!HHHHHH!I!HHI!HHHHHH!I!HHHHHH!I!HH!I!I!HH!I!I!HHHHHH!I!HHHHHH!I!HHI!HHHHHH!I!HHI!HHHHHH!I!HHHHHH!", "44444h");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("     ..", strArray3, strArray14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 157 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!", "ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     aaaaaaaaaaaaaaaaahi!Hi!!IH!IH!                                                       #########", "hi!hi!!ih!ih           ", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                            hi!     ", "", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("ahhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AhhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!" + "'", str1, "AhhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!");
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("        ########  hi!      hi  hi!      ...         ", "ih      !hi!ihi!ihi!ihi!ihi!              hi#                         #!  hi#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!Hi!H...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", 29, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str3, "4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("########  hi!      hi  hi!      ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Haia###########################################################################################", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Haiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "Haiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi" + "'", str1, "HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str1, "HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "!ih                                   i!      hi  hi!      hi!!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!iH", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iH" + "'", str3, "!iH");
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!", "##########################################################################################################################################################################HI###########################################################################################################################################################################", "...  ih  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!" + "'", str3, "hi!hi!");
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                                                                                                               iHiHiHiH                                                                                                                                                ", 24, "ih      !ih      !ih  i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                               iHiHiHiH                                                                                                                                                " + "'", str3, "                                                                                                                                               iHiHiHiH                                                                                                                                                ");
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h                          h", 13, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  hi!      hi  hi!      hi!...iH  iH", 6, 216);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     hi  hi!      hi!...iH  iH" + "'", str3, "     hi  hi!      hi!...iH  iH");
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#", "AH                          H                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  4hi4!4      4hi4  4hi4!4      4hi4!4      4hi", "!IH", (int) (short) 10);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", "      HI                                                                                        ");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("44444h", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "44444h" + "'", str8, "44444h");
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH", '#', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH" + "'", str3, "  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH");
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", 216);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                             hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#" + "'", str2, "                                                                                                                                                             hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("HHHhi!hihi!hi!HHHHHHHHHHHH", "ah                          h                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih" + "'", str1, "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih");
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################", "  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!hi!!ih!ih!", "  4hi4!4      4hi4  4hi4!4      4hi4!4      4hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("HI#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                        #                        HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 434 + "'", int2 == 434);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("..    I       HI..    I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi  ...", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(" Hi  H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi  H" + "'", str1, " Hi  H");
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("...                  ...", "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "!ih      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                  ..." + "'", str3, "...                  ...");
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "H ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  4hi4!4      4hi4  4hi4!4      4hi4!4      4hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4hi4!4      4hi4  4hi4!4      4hi4!4      4hi" + "'", str1, "4hi4!4      4hi4  4hi4!4      4hi4!4      4hi");
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ", 170);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str4, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("!..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi! !..   hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi" + "'", str2, "hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hi!", "Hi##########################################################################################", "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 343);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
        int int1 = org.apache.commons.lang3.StringUtils.length("ahh");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 3 + "'", int1 == 3);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i  Hi...", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("i!ihi!ihi!ihi", 419);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Ih######!ih######!ih##i", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih######!ih######!ih##i" + "'", str3, "Ih######!ih######!ih##i");
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!..", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ", "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                      hi#                                 HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                               ", "Ih      !ih      !ih  i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      hi#                                 HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                               " + "'", str2, "                      hi#                                 HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                               ");
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("                        HI#                        ", 472, 35);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...     HI#                        " + "'", str3, "...     HI#                        ");
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Hahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahiHi#", "                     hi                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("       hi!      hi  hi!           ", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444", "i!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("4H4i4  4H", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4H4i4  4H" + "'", str2, "4H4i4  4H");
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  Hi     ", 242);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  Hi     " + "'", str2, "  Hi     ");
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  !ih      !ih  ih      !ih  ", "   4");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", "hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..    I!    aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "..    I!    aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i! ", "h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                    hi!     ", '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  hi!                                  ", "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", (int) (short) 10, 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + " i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!                             " + "'", str4, " i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!                             ");
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "       hi#", (int) (byte) 1);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("     ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("HI                                                  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!!IH!IH", "HI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "Hi     ###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("    Hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("h#h#h#h", "H ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!Hi!H...", "!Ih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("  hI...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("######                                               ", "    !iH       !iH       !iH     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "######" + "'", str2, "######");
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                       ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "i!      hi                               ", 434);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih          ", ' ', 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("########  hi!      hi  hi!      hi!      h                                                                  #########", "hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("       hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("a                                                   ", "Hi!hi!!ih!ih!", "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444hi!hi!!ih!ih!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a                                                   " + "'", str3, "a                                                   ");
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!!IH!IH!i#!", "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  HI  HI!      HI!I!      HI  HI hI  hI      hI     ", "444444hi#!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "h                                   i!      hi  hi!      hi!!ih                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI  HI!      HI!I!      HI  HI hI  hI      hI     " + "'", str3, "  HI  HI!      HI!I!      HI  HI hI  hI      hI     ");
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ih######!ih######!ih##i", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("       Hi!", "Hi!!IH!IH!i#!");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a', 117, 96);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "ih######!ih######!ih##i");
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          ", "hi#", (int) 'a');
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray18, "   hi!    ", (int) '4', 10);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("hi#", strArray16, strArray18);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray18);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "       " + "'", str11, "       ");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi#" + "'", str23, "hi#");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "HI!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hI###########################################################################################                             ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !" + "'", str1, "IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("4444444hia!4444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ih!ih", "...                  ...", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                 hi!                                                                                                 hi!", "Hi!!IH!IH!i#!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 hi!                                                                                                 hi!" + "'", str3, "                                                                                                 hi!                                                                                                 hi!");
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi" + "'", str1, " hi");
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H   " + "'", str2, "H   H   ");
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "   hi!    i   hi!    i   hi!    i   hi!    i   hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                          IH                                               ", "!iH       !iH       !iH     ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !" + "'", str1, "IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ih!ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih!ih!ihih!ih" + "'", str1, "ih!ih!ihih!ih");
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("  hi!     HI!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Ih      !ihi  Hi...", "hI###########################################################################################                             ...", "ahi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih      !ihi  Hi..." + "'", str3, "Ih      !ihi  Hi...");
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "hi#!!IH!IH", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        java.lang.String[] strArray6 = new java.lang.String[] { "I!HIHI!HI!H", "hi! hi hi!", "HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!", "!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih", "ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "      hi        Hi!!ih...");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  " + "'", str1, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("                        hi#                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hiIHhi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("I!      hi  hi!      hi!      hi", "######           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("ahi!", "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                      " + "'", str2, "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                      ");
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                                               Hi!                                         ", "hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi  ...", (int) (byte) 1, 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi  ..." + "'", str3, "  hi  ...");
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", '4', (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444" + "'", str1, "!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                          h                        ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("H!IH!IH!IH  hi!      hi  hi!      h", "i#!!IH!IH!hi#!!IH!IH!hi#!!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("!IH", "4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("                                            hi!     ", "#######", "...                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                            hi!     " + "'", str3, "                                            hi!     ");
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H" + "'", str1, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H");
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", "ah                          h                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("   ", "               ih      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   " + "'", str2, "   ");
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("ihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################", "hi!Hi!H...", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!", charArray6);
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
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi  ...", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter(" #h  #hi      #hi      #", "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim(" Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi" + "'", str1, "Hi");
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   ...", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi" + "'", str2, "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("      hi        Hi!", (int) '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      hi        Hi!" + "'", str2, "      hi        Hi!");
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        char[] charArray7 = new char[] {};
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!!IH!IH!i#!", charArray7);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!######hi##hi!######hi!######hi", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("H   H   ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #HI!!!!!I!ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #i", 121, 74);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !..." + "'", str3, "...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !...");
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("               ih      ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!      hi  hi!      hi!", "  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#", "!ih      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   !!!!!!  !!   !!!!!!   " + "'", str3, "   !!!!!!  !!   !!!!!!   ");
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                    ", 9, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                    " + "'", str3, "                    ");
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("i!ihi!ihi!ihi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H", 27);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", "", "i!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  " + "'", str3, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!44444444444444444444444444444444444hi!Hi!!IH!  Hi...", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi!!IH!IH       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("4444444444444444444444444444444444444444444444444444", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i#!!IH!IH!hi#!!IH!IH!hi#!!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i#!!IH!IH!hi#!!IH!IH!hi#!!IH!" + "'", str1, "i#!!IH!IH!hi#!!IH!IH!hi#!!IH!");
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        java.lang.String[] strArray3 = null;
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", "", 10);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", 435, 0);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray3, strArray7);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("ah                          h                       ");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("   hi!    i   hi!    i   hi!    i   hi!    i   hi! ", strArray3, strArray14);
        java.lang.String[] strArray16 = null;
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("H!IH!IH!IH  hi!      hi  hi!      h", strArray14, strArray16);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "   hi!    i   hi!    i   hi!    i   hi!    i   hi! " + "'", str15, "   hi!    i   hi!    i   hi!    i   hi!    i   hi! ");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "H!IH!IH!IH  hi!      hi  hi!      h" + "'", str17, "H!IH!IH!IH  hi!      hi  hi!      h");
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("#########                                            hi!    !ih  ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########hi!!ih########" + "'", str1, "#########hi!!ih########");
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih      !ih      !ih  ih      !ih  aaaa", "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H", '4', 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hhhHI!HIHI!HI!hhhhhhhhhhhh", "                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("i!      hi  hi!      hi!      hi", "               !ih!ihih!ih                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str2, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", "H!IH!IH!IH  hi!      hi  hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  " + "'", str2, "IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ");
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("          ", "i  Hi...", "  hi!      hi  hi!      hi!      h                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          " + "'", str3, "          ");
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("H                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                               hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("                     hi                   ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ihih!ih", "hi!hi!!ih!ih!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray9);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!!IH!IH!", strArray14, strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEach("!IH", strArray9, strArray14);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       Hi!", "!IH", (int) (byte) 1);
        java.lang.String str24 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("Hi!!IH!IH!", strArray9, strArray23);
        java.lang.String str25 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!", strArray3, strArray23);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.stripAll(strArray23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi#!!IH!IH!" + "'", str18, "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "!IH" + "'", str19, "!IH");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Hi!!IH!IH!" + "'", str24, "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!" + "'", str25, "hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray26);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("#", "!iH", 440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" hi  hi...hi#!hi#!hi#!hi#!hi#!h...", "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ih      !ih      !ih  ih      !ih  aaaa", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("  H   H       H       H", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("       !iH            !iH   a ", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "                                                       hi!                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   hi!    ", " hi  hi!      hi!      hi", 1);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("               ih      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("                                                                                                 ", " 4H4i4  4H4i4      4H4i4      4H4i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                 " + "'", str2, "                                                                                                 ");
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi!#", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h !", "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                        #                        HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "  hi!      hi  hi!      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Ih      !ih      !ih  i", 135, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                        Ih      !ih      !ih  i                                                        " + "'", str3, "                                                        Ih      !ih      !ih  i                                                        ");
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    H" + "'", str1, "    H");
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  " + "'", str1, "#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ");
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("h                          h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H                          h" + "'", str1, "H                          h");
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hI!     ", 196, "      HI                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      HI                                                                                      hI!           HI                                                                                      " + "'", str3, "      HI                                                                                      hI!           HI                                                                                      ");
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("ah                          h                       ", "ahh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih", 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih" + "'", str3, "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih");
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("4444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  hi!      hi  hi!   ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!   ..." + "'", str2, "  hi!      hi  hi!   ...");
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "ahh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "aahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahhi!aaaaaahiaahi!aaaaaahi!" + "'", str4, "aahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahhi!aaaaaahiaahi!aaaaaahi!");
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("Ih      !ih      !ih  i", "HI  HI!      HI!I!      HI  HI hI  hI      hI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                                                                    ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                " + "'", str2, "                                                                                                                                                ");
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Ah                          h", "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ah                          h" + "'", str2, "Ah                          h");
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################" + "'", str2, "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################");
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("       hi#", "i#!!IH!IH!hi#!!IH!IH!hi#!!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi#" + "'", str2, "       hi#");
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h#h#h#h", "Ih      !ih      !ih  i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     ", "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Ih      !ih      !ih  i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih", "                                                       ", "      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih" + "'", str3, "ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih");
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!!IH!I", "hi!ihi!ihi!ihi!ihi!", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("ih      !ih      !ih  i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Hi!", "  hi!    ", 2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny(" Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################", strArray6);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "!IH");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, "Hi  Hi      Hi      Hi", 10, 452);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "H" + "'", str5, "H");
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!!!!!I!", "!      hi!444 hi!444444 hi!444444 hi!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!!!!!I!" + "'", str2, "HI!!!!!I!");
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################", 29);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################" + "'", str2, "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...Hi######################");
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!      hi  hi!      hi!      hi                               ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!Hi!!IH!IH!", "iHiHiHiH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("H   hi!    i", "hi!hi!!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "!ih                       !i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("HHHhi!hihi!hi!HHHHHHHHHHHH", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Ah                          h                       ", "ahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ah                          h                       " + "'", str2, "Ah                          h                       ");
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("  hi                                                ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("  H   H       H       H ", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("  hi!      hi  hi!      ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", charArray7);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("...     HI#                        ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("   ", "h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("i!      hi  hi!      hi!      hi                               ", " #h  #hi      #hi      #");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("aahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahhi!aaaaaahiaahi!aaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("ahhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha" + "'", str1, "!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha");
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IAAAAA..." + "'", str2, "!IAAAAA...");
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#!", "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("...                             ", "!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", 0, 22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..    I!    aaaaaaa..." + "'", str3, "..    I!    aaaaaaa...");
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", "  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               " + "'", str2, "                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("##########################################################################################################################################################################hi###########################################################################################################################################################################", "  Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################hi###########################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################hi###########################################################################################################################################################################");
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!Hi!H...", "4", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H", "   Hi!    HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!i!      hi  hi!      hi!      h                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H" + "'", str2, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H");
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ih      !ih      !ih  ih      !ih  ", "Hi!!IH!IH!", (int) (byte) 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("                                               Hi!                                         ", strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", " #h  #hi      #hi      #", "");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##HI!####", "       Hi!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##HI!####" + "'", str2, "##HI!####");
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                        Ih      !ih      !ih  i                                                        ", "############################################################", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi! hI!       hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!  ", "#########                                                                  h      !ih      !ih  ih      !i!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi! hI!       hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!  " + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi! hI!       hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!  ");
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!", "H                                                                                                   ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!" + "'", str3, "HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!");
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("  hi                                                ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("  H   H       H       H ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("  hi!      hi  hi!      ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsAny("hi!ihi!ihi!ihi!ihi!              hi#                           H   H      ", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!!IH!IH", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "  !");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!h...", "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  ", 52);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, " hI  hI...HI#!HI#!HI#!HI#!HI#!H...");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "H!IH!IH!IH!", 50, 11);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ii...hiiiii" + "'", str6, "ii...hiiiii");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "a!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("       HI", "########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("               !ih!ihih!ih                ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaa   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 32, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################" + "'", str3, "################################");
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih   ", "  hi!    ", 0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("    I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  " + "'", str1, "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "i!      hi                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!      hi  hi!      hi!      hi                               ", "h      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", "Ah                          h                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("!ih                       !ih                       ", "       HH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!", "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                            hi!     ", "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                    hi!     ", "HI!", "hi!      hi  hi!      hi", 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                    hi!     " + "'", str4, "                                                                    hi!     ");
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("ih      !hi!ihi!ihi!ihi!ihi!              hi#                         #!  hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !hi!ihi!ihi!ihi!ihi!              hi#                         #!  hi#" + "'", str1, "ih      !hi!ihi!ihi!ihi!ihi!              hi#                         #!  hi#");
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   ", 22, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444   " + "'", str3, "4444444444444444444   ");
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ih                                   i!      hi  hi!      hi!!ih", "Hi!!IH!IH!             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("  Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha", "ih######!ih######!ih##i", 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!ihi!ihi!ihi!ihi!              hi#                         ", "ahhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!ihi!ihi!ihi!ihi!              hi#                         " + "'", str2, "i!ihi!ihi!ihi!ihi!              hi#                         ");
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI  hI      hI      hI", ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!ih      !ih  ih      !ih  ");
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                               Hi!                                         ", strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 91 + "'", int6 == 91);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "IIII" + "'", str7, "IIII");
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                            ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("               HI#                        ", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!!IH!I", 440, "!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str3, "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", " hi!", (int) (short) 1);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("                             ...", strArray5);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("  hi!    ", '4');
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray10);
        java.lang.String[] strArray16 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray16);
        java.lang.String[] strArray20 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   hi!    ", strArray16, strArray20);
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEach("  hi!      hi  hi!      hi!", strArray10, strArray16);
        java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("!ih      !ih  ih      !ih  ", strArray5, strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "   Hi!    " + "'", str21, "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!  hihi!  hi!" + "'", str22, "hi!  hihi!  hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "!ih      !ih  ih      !ih  " + "'", str23, "!ih      !ih  ih      !ih  ");
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444hia!4444444444444", "       hi!      hi  hi!           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("", '4', 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hI###########################################################################################                             ...", "      HI ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI " + "'", str2, "      HI ");
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "ih######!ih######!ih##i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                        HI", "    Hi!  H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hi!hihi!", "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!i!ih      !ih  ih      !ih  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H   H       H       H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H   H       H       H" + "'", str1, "H   H       H       H");
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!..", "   #");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                      ", "hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                   ", "       Hi!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("                                                                                              !IH   ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                              !IH   " + "'", str1, "                                                                                              !IH   ");
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi!                                                                                                 hi!", "!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        ", "               !ih!ihih!ih                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hi!!IH!I", 96, 440);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      hi" + "'", str1, "hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  !ih      !ih  ih      !ih  ", "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " Hi  Hi      Hi      Hi");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "       Hi!", (int) (byte) 100, (int) (byte) 100);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       Hi!", "!IH", (int) (byte) 1);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("hI  hI      hI      hI", strArray14);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEach("  HI!     ", strArray3, strArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String str20 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        java.lang.String str21 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "  HI!     " + "'", str17, "  HI!     ");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Hi!" + "'", str20, "Hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Hi!" + "'", str21, "Hi!");
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ih", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "HI#", 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', (int) ' ', 60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str5, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         ", "                                                        Ih      !ih      !ih  i                                                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " i  Hi... ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(" i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihih", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihih" + "'", str2, "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihih");
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!      hi  hi!      hi!      h", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!  hihi!  hi!", "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  hihi!  hi!" + "'", str3, "hi!  hihi!  hi!");
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        java.lang.Object[] objArray0 = null;
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join(objArray0, "hi!  hihi!  hi!", 93, 966);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hi!      hi  hi!", "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ", "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  " + "'", str2, "   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("Hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                            ", "!ih...", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!!IH!IH!", strArray5, strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", (int) (short) 100);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ih      ", strArray5, strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                    hi!     ", strArray14);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi#!!IH!IH!" + "'", str9, "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Hi!" + "'", str10, "Hi!");
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + " ih      " + "'", str15, " ih      ");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!       hi!      hi  hi!           ", ' ', 98);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("Hi     ###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("...aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH" + "'", str2, "!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH");
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", (int) (short) 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("hi!Hi!!IH!IH!", strArray7, strArray13);
        int int16 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!!IH!IH", strArray7);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########", strArray7);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!...iH  iH", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!Hi!!IH!IH!" + "'", str15, "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 368 + "'", int17 == 368);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("Hahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahiHi#", "                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!ih!", "hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi      Ih      !ihi  Hi...                                                                                                                                                                                                                                                                                                                                                     !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi      Ih      !ihi  Hi...                                                                                                                                                                                                                                                                                                                                                     !" + "'", str1, "hi      Ih      !ihi  Hi...                                                                                                                                                                                                                                                                                                                                                     !");
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   hi!    ", strArray4, strArray8);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8, "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "   Hi!    " + "'", str9, "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Hi!" + "'", str11, "Hi!");
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "Ah                          h", 3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    ", "hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    " + "'", str2, " Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    ");
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  hI...", "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!", (-1), 91);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!" + "'", str4, "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!");
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("...iH  iH", 23);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hI  hI      hI      hI", "  hi      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaa                                              ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("##########################################################################################################################################################################hi###########################################################################################################################################################################", "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################hi###########################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################hi###########################################################################################################################################################################");
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", charArray7);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAny(" ih      ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("                                               hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                               ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!hihi!hi!hi" + "'", str1, "I!hihi!hi!hi");
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!!IH!IH!i#!                                                                                ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("4444444444444444444   ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("4hi4!4      4hi4  4hi4!4      4hi4!4      4hi", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#ih" + "'", str1, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#ih");
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("######           ", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "######           " + "'", str3, "######           ");
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("IIII", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIII" + "'", str2, "IIII");
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("ih      !hi!ihi!ihi!ihi!ihi!              hi#                         #!  hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!      hi  hi!      hi", "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!      hi  hi!      hi" + "'", str3, "hi!      hi  hi!      hi");
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("H   H       H       H", "      Ih      !ihi  Hi...                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H       H       H" + "'", str2, "H   H       H       H");
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH", "!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH" + "'", str2, "!IH");
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!    i!", ' ');
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray6);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#ih", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ", 201, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H                                                                                                       " + "'", str3, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H                                                                                                       ");
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!ih                                                                                                 !ih", "  hi!                                  ", 440);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444", "!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444" + "'", str2, "444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444");
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                   ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!ihi!ihi!ihi!ihi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10, "    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "h Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H", "44444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H");
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H", "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444hi!hi!!ih!ih!", " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H" + "'", str3, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H");
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!ihi!ihi!ihi!ihi!              hi#                         ", "hi!hihi!hi!                                                                                                             ", 414);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "#" + "'", str4, "#");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "#" + "'", str5, "#");
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("  HI  HI!      HI!I!      HI  HI hI  hI      hI     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####################################################################################################");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', (int) ' ', 472);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("    H#", " hi  hi!      hi!", "!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH", 22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    H#" + "'", str4, "    H#");
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("  hi#!", "!ih                                   i!      hi  hi!      hi!!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("..    I       HI..    I!", "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha", "ih      !ih      !ih  ih      !ih  aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("      HI       HI       HI       HI       HI       HI       HI       HI ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   !iH    ", "    !iH   ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 25, 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!!IH!IH!", "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!                                                                                                 hi!", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("               HI#                        ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("...hi#!hi#!hi#!hi#!hi#!h...", "                                                                                                                            44444                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("H                                                                                                   ", "  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("       !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444", "!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ", "HI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split(" hi  hi!      hi!      hi", '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("Ah                          h", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 58 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i", 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i  Hi...", 'a', 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("!ih                                                                                                 !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444hi!hi!!ih!ih!", (int) ' ', "#########                                                                  h      !ih      !ih  ih      !i!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH####");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444hi!hi!!ih!ih!" + "'", str3, "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444hi!hi!!ih!ih!");
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#######", "ih      !ih      !ih  ih      !ih  aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#######" + "'", str2, "#######");
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("!ih                       !ih                       ", "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!", "hi!hi!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("    !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH   ", "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", 414);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("        ########  hi!      hi  hi!      ...         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("             hi!      hi  hi!      hi!i!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih", '#', 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 96 + "'", int3 == 96);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str2, "HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("   Hi!    ", '4', 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("4");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String[] strArray17 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   Hi!    ", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", 120);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("#######################################...", strArray17);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray11, strArray17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH", strArray4, strArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 157");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!ih                                                                                                 HI!", "    I!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "..    I!    aaaaaaa...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih                                                                                                 HI!" + "'", str3, "!ih                                                                                                 HI!");
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("a!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A!444444444444444444444444444444444444444444444444" + "'", str1, "A!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!ih                                                                                                 !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                                 !ih" + "'", str1, "!ih                                                                                                 !ih");
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!iH       !iH       !iH     ...", 2, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iH       !iH       !iH     ..." + "'", str3, "!iH       !iH       !iH     ...");
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi  Hi...", " Hi!", 151);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!ih          ");
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi  Hi..." + "'", str5, "Hi  Hi...");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        char[] charArray3 = new char[] {};
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsNone("", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...hi#!hi#!hi#!hi#!hi#!h...", "Haiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "  Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("          ", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("        HI!     I  HI!     h  HI!             HI!     !  HI!     ihi  HI!         HI!     H  HI!     i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  hi!      hi  hi!      hi!      h                                                                 ", 98);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi!      hi  hi!      hi!      h                                                                 " + "'", str2, " hi!      hi  hi!      hi!      h                                                                 ");
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!hi!!ih!ih           ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i!      hi                               ", "a                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi                               " + "'", str2, "i!      hi                               ");
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("4444444444", "ihihihihihihihihihihihihihihihihihihihihihihihihi", (int) (short) -1, 27);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ihihihihihihihihihihihihihihihihihihihihihihihihi" + "'", str4, "ihihihihihihihihihihihihihihihihihihihihihihihihi");
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH   " + "'", str1, "!IH   ");
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "i!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("      HI ", "ih      !ih      !ih  ih      !ih  aaaa", 25);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("444444444444444444444444444444444444444444444444HIA!44444444444444444444444444444444444HI!HI!!IH!IH!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                            hi!                                            ", "hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi!", 120);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("   hi!    i!", "", "                                             Hi!                                             ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("        ########  hi!      hi  hi!      ...         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "        ########  hi!      hi  hi!      ...         " + "'", str1, "        ########  hi!      hi  hi!      ...         ");
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("AH                          H", 53, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "############AH                          H############" + "'", str3, "############AH                          H############");
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("   ", 50);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                      " + "'", str2, "                                                                                                                                                      ");
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!######hi##hi!######hi!######hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("...iH  iH", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                          IH                                               ", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("       hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("                                                                                        i!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444", "    !ih   ", 49);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4444444444" + "'", str4, "4444444444");
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", "Hihi!hihi!hi!44444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!!IH!IH", "                      hi#                                 HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                               ", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!!IH!IH!", "!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha", 157);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("                                                    ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!44444444444444444444444444444444444hi!Hi!!IH!  Hi...", "   4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!44444444444444444444444444444444444hi!Hi!!IH!  Hi..." + "'", str2, "!44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                             ...", "##########################################################################################################################################################################  hi     ###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("a                                                    ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaa   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("...i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#", "  hi!      hi  hi!      hi!      h                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#" + "'", str2, "...i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!      hi!", '#');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("                      HI#");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", strArray3, strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str6, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "!44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################", "##########################################################################################################################################################################  hi     ###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                   " + "'", str1, "                                   ");
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!                                                                                                 hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                               Hi!                                         ", "!ih", (int) 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                                               Hi!                                         " + "'", str5, "                                               Hi!                                         ");
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444H" + "'", str1, "444444444444444444444444444444444H");
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "    !iH       !iH       !iH     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...", "hi!i!!!!", "Haia###########################################################################################", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ..." + "'", str4, "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...");
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("i!      hi  hi!      hi!      hi                               ", 21);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                     " + "'", str2, "                     ");
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("#################################!ih      !ih  ih      !ih  ##################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##################################  hi!      hi  hi!      hi!#################################" + "'", str1, "##################################  hi!      hi  hi!      hi!#################################");
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", "I!HIHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                            ", "                               h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI!     ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                        HI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("..    I!    aaaaaaa...", "hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("HI!", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!" + "'", str2, "!");
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!" + "'", str1, "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!ih      ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("       Hi!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!" + "'", str2, "       Hi!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric(" Hi  H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  hi#", "..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI!HHHHHH!I!HHHHHH!I!HHI!HHHHHH!I!HHI!HHHHHH!I!HHHHHH!I!HH!I!I!HH!I!I!HHHHHH!I!HHHHHH!I!HHI!HHHHHH!I!HHI!HHHHHH!I!HHHHHH!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!hihi!hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("HI!!!!!I!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(" ih      ", "       !iH        444444444444444444444444444444444444444444444444    !iH   a 44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("...hi#!hi#!hi#!hi#!hi#!h...", "hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi#!hi#!hi#!hi#!hi#!h..." + "'", str2, "...hi#!hi#!hi#!hi#!hi#!h...");
    }
}
