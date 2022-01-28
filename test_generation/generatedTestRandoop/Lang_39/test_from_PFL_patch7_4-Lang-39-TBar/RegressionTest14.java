import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("IIII", 452, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIII                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "IIII                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!ihi!ihi!ihi!ihi!              hi#                           H   H      ", "Hi     ", 422);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("#######################################...", "444 hi!444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    I!    AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "    I!    AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!!!!!! hi!!#hi!!!!!!!hi!!!!!! hi!iI !!!!!", 11, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!");
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ", "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", 121);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!!IH!IH!i#!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" Hi  H", (int) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  H" + "'", str3, " Hi  H");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", "    i!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!IH      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str2, "I#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "                                             ah                          h                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444", "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                        HI", "#########                                                                  h      !ih      !ih  ih      !ih  ########", "hi! hi hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        HI" + "'", str3, "                        HI");
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!I!!!!", "hihi!hi!i!hihiHiHiHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("          ", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("     ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..I!aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "..I!aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" #h  #hi      #hi      #", "!ih                       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #h  #hi      #hi      #" + "'", str2, " #h  #hi      #hi      #");
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "  hi!                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444", 33, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str1, "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                                                                                                                                                                                                                                                                                              ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 350 + "'", int7 == 350);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!ihi!ihi!ihi!ihi!              hi#                         ", 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!ihi!ihi!ihi!ihi!              hi#                         " + "'", str3, "i!ihi!ihi!ihi!ihi!              hi#                         ");
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H                          hH                I!HIHI!HI!HH                          hH                ", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                          hH                I!HIHI!HI!HH                          hH                " + "'", str2, "H                          hH                I!HIHI!HI!HH                          hH                ");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "       hI!########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi" + "'", str7, "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" hi!      hi  hi!      hi!      h                                                                 ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!h" + "'", str2, "hi!hihi!hi!h");
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hI...", 9, "H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hI...H " + "'", str3, "  hI...H ");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI                                                  ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("###############################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str1, "###############################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 439 + "'", int2 == 439);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444i!      hi                               ", "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ", 119);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str2, "                                    HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("  hi!      hi  hi!      hi!      h", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("a                                                   ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH", "hi  hi!      hi!i!   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444444i!      hi                               ", "444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "...i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hihi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                       ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha", "hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    a" + "'", str1, "                                                    a");
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!IAAAAA...", "  Hi     ###########################################################################################  Hi     ###############################################################  hi!      hi  hi!      ", "                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IAAAAA..." + "'", str3, "!IAAAAA...");
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHi!ihi!ihi!ihi!ihi!              hi#   ", 518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" i  Hi... ", "     ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                              ########  hi!      hi  hi!      ...                                ", "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("      HI       HI       HI       HI       HI       HI       HI       HI ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("                                                                                                                                                     ######Ih", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ah                          h                        ...                                                                                                 ...                                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("##########################################################################################################################################################################HI###########################################################################################################################################################################", "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H ", 518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!#", "############################################################", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AH                          H", "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i     ###########################################################################################", "  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i     ###########################################################################################" + "'", str2, "i     ###########################################################################################");
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###############################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                    ", "hi!    i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                              !IH   ", "  hi!      hi  h  Hi       hi!      hi  hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       hi#");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("  hI...", "hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hI..." + "'", str2, "  hI...");
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i", "i!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("HIa!hi!Hi!!IH!IH!                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                    ih!ih!ihih!ih                                                    ", 42, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ih!ih!ihih!ih             " + "'", str3, "          ih!ih!ihih!ih             ");
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi!                                  ", 120, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                " + "'", str3, "...                                ");
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("..", "!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH", 161, "!hi!!#!hi!i  hi#!hi!h  hi#   hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!!#!hi!i  hi#!hi!h  hi#   hi!hi!!#!hi!i  hi#!hi!h  hi#   hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH" + "'", str3, "!hi!!#!hi!i  hi#!hi!h  hi#   hi!hi!!#!hi!i  hi#!hi!h  hi#   hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH");
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                        I!HIHI!HI!HI", "!I                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        I!HIHI!HI!HI" + "'", str2, "                                                                                        I!HIHI!HI!HI");
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      hi ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" hi  hi...hi#!hi#!h hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi  hi...hi#!hi#!h hi  hi!      hi!" + "'", str1, " hi  hi...hi#!hi#!h hi  hi!      hi!");
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#################################!ih      !ih  ih      !ih  ##################################", "hi i! H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Hi###########################################################################################                             ...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "      HI ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        int int1 = org.apache.commons.lang3.StringUtils.length("...iH  iH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H                                                                                                   " + "'", str1, "H                                                                                                   ");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            ", "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", 0, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            " + "'", str4, "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            ");
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################" + "'", str1, "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################");
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("H                          h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H                          h" + "'", str1, "H                          h");
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  H   H       H       H         ", "", "ah                          h                        ...                                                                                                 ...                                        ", 273);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  H   H       H       H         " + "'", str4, "  H   H       H       H         ");
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!IH   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 hi!      hi  hi!      hi!      hi                               ", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ", " H       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#", "AhhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#" + "'", str2, "hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#");
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H!IH!IH!IH  hi!      hi  hi!      h", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        int int1 = org.apache.commons.lang3.StringUtils.length("iHiHiHi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("  Hi     ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("..I!aaaaaaaaaaaaaaaaaaaaaaaa", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    ..I!aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                    ..I!aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                             ah                          h                                                                                                ", 9, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        " + "'", str3, "        ");
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih   " + "'", str1, "!ih   ");
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI" + "'", str1, " HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     " + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     ");
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                      ", "!44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("I!HIHI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HIHI!HI!H" + "'", str1, "I!HIHI!HI!H");
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!HI!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!!IH!IH" + "'", str1, "!HI!HI!!IH!IH");
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hIH      !IH      !IH  IH      !IH  IH      !IH          I!    aaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...", 422);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              " + "'", str2, "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444hia!4444444444444", (int) (byte) -1, "HAIA###########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444hia!4444444444444" + "'", str3, "4444444hia!4444444444444");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444HIA!44444444444444444444444444444444444HI!HI!!IH!IH!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4H4i4  4H", "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4H4i4  4H" + "'", str2, "4H4i4  4H");
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                              ", "...hi ....i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444hi!hi!!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!!ih!ih44444444444444444444444444444444444!aih444444444444444444444444444444444444444444444444" + "'", str1, "!hi!hi!!ih!ih44444444444444444444444444444444444!aih444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!  hihi!  hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!  hihi!  hi!" + "'", str2, "Hi!  hihi!  hi!");
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!hihi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!", "!IH");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 0, 441);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i" + "'", str3, "i");
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                               iHiHiHiH                                                                                                                                                ", ' ', 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hI  hI..." + "'", str1, " hI  hI...");
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("h Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "h hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("H   H   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ahi!", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI!     ", "44444444444444444444444444444444444hi!Hi!!IH!  Hi...", 63, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444hi!Hi!!IH!  Hi..." + "'", str4, "44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!     ", "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 96, 60);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!44444444444444444444444444444444444hi!Hi!!IH!  Hi...", "ahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!44444444444444444444444444444444444hi!Hi!!IH!  Hi..." + "'", str2, "!44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                        #                        HI");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(" hi  hi!      hi!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi!" + "'", str2, " hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi!");
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih         HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI     ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              ", 170);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              " + "'", str2, "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("   hi!    i!", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!" + "'", str2, "   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!");
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!iH       !iH       !iH     ...", "  HI                                          ...", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "I#!!!!!!iI!!iI#!!!!!!iI#!!!!!!iI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                        HI#", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                                             " + "'", str2, "                        HI#                                             ");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!!IH!IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("HI#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...                                                                                                 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                 " + "'", str2, "...                                                                                                 ");
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("##HI!####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##HI!####" + "'", str1, "##HI!####");
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("#                                 hi!      hi  h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                        HI#", "!ih                       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("  hi!                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ", 'a', 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI" + "'", str1, "  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i", "                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...  ...", "########  hi!      hi  hi!      hi!      h                                                                  #########", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!", "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!ih                       !ih", "Hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444hiIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444HIIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444HIIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i", "444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i");
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "  Hi     ###########################################################################################", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444444444444444444444444444h!444444444444444444444444444444444444444444444444" + "'", str5, "444444444444444444444444444444444444444444444444h!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", "             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("444444Ih######!ih######!ih##i4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "Hi!!IH!IH!                                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                        ##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", "      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      " + "'", str2, "hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 52, "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444", "                                                                                                 ", 414);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("##################################", "########  hi!      hi  hi!      ...", "!iH       !iH       !iH     ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!      hi  hi!       HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI###########################################################################################                             ...", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih..." + "'", str1, "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   " + "'", str2, "                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ");
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!     ", "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################", "444444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################" + "'", str2, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################");
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !...", "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !..." + "'", str2, "...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !...");
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi", "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi" + "'", str2, "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi");
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih      !ih  ih      !ih         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih      !ih  ih      !ih         " + "'", str1, "!ih      !ih  ih      !ih         ");
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaa", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444Ih######!ih######!ih##i4444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#h  #hi      #hi      #", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#h  #hi      #hi      #" + "'", str2, "#h  #hi      #hi      #");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!!IH!IH!I#!", 119, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!!IH!IH!I#!" + "'", str3, "HI!!IH!IH!I#!");
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("##########################################################################################################################################################################HI###########################################################################################################################################################################", '4', 343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", 518, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "       hi#", (int) (byte) 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi!hihi!hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!i!", 440, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                   hi!i!" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                   hi!i!");
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih", "!ih                                   i!      hi  hi!      hi!!ih                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("!IH       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   #", 4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HIa!hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!!iH!ih!aIH" + "'", str1, "!HI!HI!!iH!ih!aIH");
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#", '4', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" 4H4I4  4H4I4      4H4I4      4H4I", "hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4H4I44H4I44H4I44H4I" + "'", str3, "4H4I44H4I44H4I44H4I");
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(" hi  hi...hi#!hi#!hi#!hi#!hi#!h...", "ih!ih", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                         ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 427 + "'", int5 == 427);
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!hi!hi!!ih!ih44444444444444444444444444444444444!aih444444444444444444444444444444444444444444444444", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  hi!      hi  hi!      hi!      h                                                                  ", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h                                        " + "'", str2, "  hi!      hi  hi!      hi!      h                                        ");
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" ", "# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                                                          ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "ih!ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 144 + "'", int2 == 144);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           ", "HHHhi!hihi!hi!HHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                          ", "Hi!!IH!IH!i#!                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 67 + "'", int2 == 67);
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        char[] charArray4 = new char[] { '4' };
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("################################", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[4]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("HI!!IH!IH", "HI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 196, 368);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 196");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("Hi", "...hi#!hi#!hi#!hi#!hi#!h...", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi" + "'", str3, "Hi");
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("  hi!                                                                                                                   ", "Ah                          h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 93 + "'", int2 == 93);
    }

    @Test
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("##hi!#######hi##hi!#######hi##hi!#######hi##hi!#######hi#", "H!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("HHHhi!hihi!hi!HHHHHHHHHHHH", "                                                    ih!ih!ihih!ih                                                                                                        ih!ih!ihih!ih                                                                                                        ih!ih!ihih!ih                                                                                               hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hhi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                               hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                               ", "IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!", 435);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i  Hi...", "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih", 476);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", 966, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str3, "444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########", "!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7213");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  hi!                           ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!                           " + "'", str1, "  hi!                           ");
    }

    @Test
    public void test7214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ih!ih", "!ih          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7215");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444", "i!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test7216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7216");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("H   H       H    hi!      hi  hi!", " 4H4I4  4H4I4      4H4I4      4H4I");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7217");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7218");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       ", "!ih                                                                                                 !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                               ", 135);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test7219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7219");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("  hi                                                ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("  H   H       H       H ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("  hi!      hi  hi!      ", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("...     HI#                        ", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("!ih!ihih!ih", charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7220");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                     ", 72, 428);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7221");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" Hi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("h                          h", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7222");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7223");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("i!HIHI!HI!H", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7224");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI!!IH!IH", "    Hi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!!IH!IH" + "'", str4, "HI!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7225");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("       hi!      hi  hi!           ", "Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7226");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!IH      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH      !" + "'", str1, "!IH      !");
    }

    @Test
    public void test7227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7227");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!" + "'", str1, "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!");
    }

    @Test
    public void test7228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7228");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IAAAAA...", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7229");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!hihi!hi!                                                                                                             ", "#                        ", 117);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!      hi  hi!      hi!      hi                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7230");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444hia!4", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444444444444444hia!4" + "'", str2, "44444444444444444444444444444444444444444444444hia!4");
    }

    @Test
    public void test7231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7231");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahhi!aaaaaahiaahi!aaaaaahi!", "!h...#!hi#!hi#!hi#!hi#...hi", 368);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test7232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7232");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih", "#########                                            hi!    !ih  ########444444hi#!444444hi#!444444h                                                                                                                                                                                                                                                                                                                                              ", 350);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7233");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hIH      !IH      !IH  IH      !IH  IH      !IH          I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIH      !IH      !IH  IH      !IH  IH      !IH          I!    AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "HIH      !IH      !IH  IH      !IH  IH      !IH          I!    AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test7234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test7235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7235");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih", "  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7236");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("...                             ", "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7237");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                             ah                          h                       ", "                                              ##########################################################################################################################################################################HI###########################################################################################################################################################################                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ih", "!Hi!H...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih" + "'", str2, "ih");
    }

    @Test
    public void test7239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7239");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!", "i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 215 + "'", int2 == 215);
    }

    @Test
    public void test7240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("hI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#", "                        HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#" + "'", str2, "hI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#");
    }

    @Test
    public void test7241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("44444444444444444hi!Hi!!IH!IH!                                                       #########", "Hi!!IH!IH!                                                                                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str2, "44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test7243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7243");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                 ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test7244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7244");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "444444hi#!Hihi!hihi!hi!444444444", "  hI...H ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + ". H..................................................................................." + "'", str3, ". H...................................................................................");
    }

    @Test
    public void test7245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7245");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("  hi                                                ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("  H   H       H       H ", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("##################################", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test7246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("...####...", "4444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...####..." + "'", str2, "...####...");
    }

    @Test
    public void test7247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7247");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("", "                                               hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7248");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i!HIHI!HI!H", "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!HIHI!HI!H" + "'", str2, "i!HIHI!HI!H");
    }

    @Test
    public void test7250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test7251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7251");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!IH!IH!I#!I#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!I#!I#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str2, "!IH!IH!I#!I#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test7252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi!      hi  hi!      hi!", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##hi!######hi##hi!######hi!" + "'", str3, "##hi!######hi##hi!######hi!");
    }

    @Test
    public void test7253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi..    i!     Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi...hi#!hi#!hi#!hi#!hi#!h... Hi  Hi..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4" + "'", str3, "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4");
    }

    @Test
    public void test7254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7254");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", " Hi!", 0);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "Hi!hi!!ih!ih!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7255");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test7256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7256");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #HI!!!!!I!ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #i", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7257");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("!IAAAAA..", "...####...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test7258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("Hihi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7259");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!!#IH####", "I!!#IH####");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test7260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7260");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("#HIa!hi!Hi!!IH!IH!##", (int) (short) 100, "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444h444444444444444444444444444444444444444444444444hia!444444444444444444#HIa!hi!Hi!!IH!IH!##" + "'", str3, "444444444h444444444444444444444444444444444444444444444444hia!444444444444444444#HIa!hi!Hi!!IH!IH!##");
    }

    @Test
    public void test7261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7261");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!h...#!hi#!hi#!hi#!hi#...hi", '#', 119);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7262");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            ", "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H" + "'", str1, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H");
    }

    @Test
    public void test7264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7264");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", "hi!i!", 143);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7265");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("H!IH!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H!IH!IH!IH" + "'", str1, "H!IH!IH!IH");
    }

    @Test
    public void test7266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7266");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!IH      !", "   Hi!    HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!HI!!IH!IH!i!      hi  hi!      hi!      h                                                                  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("HHHhi!hihi!hi!HHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7268");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ih      !ih      !ih  ih      !ih  aaaa", "44444444444444444444444444444444444444444444444hia!4", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7269");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                                        Ih      !ih      !ih  i                                                        ", " hi!      hi  hi!      hi!      h                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H    ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7271");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    ", "AhhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7272");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                        i!hihi!hi!hi", 'a', 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("  !", "44444", "       Hi!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  !" + "'", str3, "  !");
    }

    @Test
    public void test7274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7274");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "hi!hi!!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7275");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("H", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("      ", "444 hi!444", "#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      " + "'", str3, "      ");
    }

    @Test
    public void test7277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!!!!!! hi!!#hi!!!!!!!hi!!!!!! hi!iI !!!!!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!!!!!! hi!!#hi!!!!!!!hi!!!!!! hi!iI !!!!!" + "'", str1, "...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!!!!!! hi!!#hi!!!!!!!hi!!!!!! hi!iI !!!!!");
    }

    @Test
    public void test7278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7278");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("444444hi#!Hihi!hihi!hi!444444444", "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#", 170, 17);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444hi#!Hihi!hi                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#" + "'", str4, "444444hi#!Hihi!hi                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#");
    }

    @Test
    public void test7279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7279");
        java.lang.CharSequence charSequence0 = null;
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty(charSequence0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7280");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty(" H       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H" + "'", str1, "H");
    }

    @Test
    public void test7281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7281");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!      hi  hi!      hi!", "HIa!hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7282");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", "##########################################################################################################################################################################Hi###########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  " + "'", str2, "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ");
    }

    @Test
    public void test7283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7283");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                      ", "HHHhi!hihi!hi!HHHHHHHHHHHH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7284");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih                                                                                                 ", "      hi ", (-1));
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("    !iH   ", "                          h                        ", (int) (byte) -1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "HI#", 1);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  hi!      hi  hi!      hi!      h", strArray10, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h !", strArray5, strArray15);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!", 'a');
        java.lang.String str22 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", strArray15, strArray21);
        java.lang.Class<?> wildcardClass23 = strArray15.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str16, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str17, "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h !" + "'", str18, "h !");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444" + "'", str22, "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test7285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi!      hi  hi!      hi!      hi", "  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test7286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7286");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                 ", "444444444h444444444444444444444444444444444444444444444444hia!444444444444444444#HIa!hi!Hi!!IH!IH!##", 20);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7287");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" hI  hI...", '4', 121);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7288");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" hI  hI...HI#!HI#!HI#!HI#!HI#!H...", "...####...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7289");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!                                                                                                 hi!", "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "!ih                       !ih                       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "########  hi!      hi  hi!      hi!      h                                                                  #########");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, ' ', 2, 442);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 104");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test7290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7290");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                          ih                                               ", 120, 91);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7291");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                      ", 90);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                          " + "'", str2, "                                                                                          ");
    }

    @Test
    public void test7292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7292");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444aaaaaaaaaaa" + "'", str2, "444444444444444444444444aaaaaaaaaaa");
    }

    @Test
    public void test7293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA" + "'", str1, "h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA");
    }

    @Test
    public void test7294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7294");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7295");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i", "  HI  HI!      HI!I!      HI  HI hI  hI      hI     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI  HI!      HI!I!      HI  HI hI  hI      hI     " + "'", str2, "  HI  HI!      HI!I!      HI  HI hI  hI      hI     ");
    }

    @Test
    public void test7296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7296");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                          h                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                          h                       " + "'", str1, "                          h                       ");
    }

    @Test
    public void test7297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7297");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("               HI#                        ", "ih      !hi!ihi!ihi!ihi!ihi!              hi#                         #!  hi#", "hi!      hi  hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "               HI#                        " + "'", str3, "               HI#                        ");
    }

    @Test
    public void test7298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("ahh", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahh" + "'", str2, "ahh");
    }

    @Test
    public void test7299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7299");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("i!HIHI!HI!H", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7300");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("h hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4", "... ... h", 13);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str4, "h hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test7301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7301");
        char[] charArray9 = new char[] { '4' };
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray9);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("       hi#", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("", charArray9);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsNone("  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", charArray9);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny(" H       ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[4]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test7302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7302");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" 4H4i4  4H          ", 518, 966);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " 4H4i4  4H          " + "'", str3, " 4H4i4  4H          ");
    }

    @Test
    public void test7303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7303");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!      hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi", "...     !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi" + "'", str2, "hi!      hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi");
    }

    @Test
    public void test7305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7305");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("4hi4!4      4hi4  4hi4!4      4hi4!4      4hi", "hI  444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7306");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" hi  hi!      hi!      hi", "HIH      !IH      !IH  IH      !IH  IH      !IH          I!    AAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi!      hi" + "'", str2, " hi  hi!      hi!      hi");
    }

    @Test
    public void test7307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7307");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("hi!    i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!    i!" + "'", str1, "hi!    i!");
    }

    @Test
    public void test7308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7308");
        int int1 = org.apache.commons.lang3.StringUtils.length("i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 32 + "'", int1 == 32);
    }

    @Test
    public void test7309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih");
    }

    @Test
    public void test7310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7310");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", 254);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str2, "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7311");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", 452);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihH..." + "'", str2, "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihH...");
    }

    @Test
    public void test7312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7312");
        int int1 = org.apache.commons.lang3.StringUtils.length("HI!!IH!IH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test7313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test7314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7314");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("!ih", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 254);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7315");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("##########################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("IIII", "             hi!      hi  hi!      hi!i!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IIII" + "'", str2, "IIII");
    }

    @Test
    public void test7317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7317");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#########                                                                  h      !ih      !ih  ih      !ih  ########", "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########                                                                  h      !ih      !ih  ih      !ih  ########" + "'", str2, "#########                                                                  h      !ih      !ih  ih      !ih  ########");
    }

    @Test
    public void test7318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7318");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Haiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                        ##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444hi#!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7319");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "    H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7320");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hI!!hI!!!!!!hI!!!!!!hI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7321");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("iH      iH      iH  iH ", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ", "hi  hi!      hi!i!      hi  hi Hi  Hi      Hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test7322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7322");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!  hihi!  hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7323");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
    }

    @Test
    public void test7324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7324");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7325");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("", "# hi!       hi# hi!       hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("       Hi!", "#######################################...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!" + "'", str2, "       Hi!");
    }

    @Test
    public void test7327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7327");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("      hi        Hi!", "!IH      !");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi        Hi!" + "'", str2, "hi        Hi!");
    }

    @Test
    public void test7328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7328");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!i!!!!", "iHiHiHiH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7329");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("H   H       H    hi!      hi  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7330");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  " + "'", str1, "#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ");
    }

    @Test
    public void test7331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7331");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH       ", "  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7332");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("  Hi     ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7333");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444", 10, "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     44444" + "'", str3, "     44444");
    }

    @Test
    public void test7334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7334");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase(" 4H4i4  4H          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " 4h4i4  4h          " + "'", str1, " 4h4i4  4h          ");
    }

    @Test
    public void test7335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7335");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("", "hi!      hi  hi!      hi!      h", (int) (short) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", "hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################");
    }

    @Test
    public void test7337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444..." + "'", str2, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444...");
    }

    @Test
    public void test7338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7338");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i  Hi... ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "4444444444444444444444444444444444444444444444444444i!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7340");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ", "", 39);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7341");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "!HI!HI!!iH!ih!aIH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7342");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444 hi!444", 254, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##########################################################################################################################444 hi!444##########################################################################################################################" + "'", str3, "##########################################################################################################################444 hi!444##########################################################################################################################");
    }

    @Test
    public void test7344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("h   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H" + "'", str1, "h   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H");
    }

    @Test
    public void test7345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7345");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("      HI       HI       HI       HI       HI       HI       HI       HI ", ' ', (int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test7346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7346");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ", "!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7347");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("...                                           ...", "                                                                                                                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7348");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                                                                                                                                                                                                                              ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7349");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!ih", 67, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "################################!ih################################" + "'", str3, "################################!ih################################");
    }

    @Test
    public void test7350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7350");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ', 51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7351");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hhhHI!HIHI!HI!hhhhhhhhhhhh", 'a', 94);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7352");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("  hi!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7353");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("#h  #hi      #hi      #", 161, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#h  #hi      #hi      #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "#h  #hi      #hi      #aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7354");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                        HI", "Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iiiiiiiiiiiiiiiiiiiiiiiiH!" + "'", str3, "iiiiiiiiiiiiiiiiiiiiiiiiH!");
    }

    @Test
    public void test7355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#", "!ih         HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI     ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test7356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7356");
        char[] charArray8 = new char[] { 'a', '4', '#', 'a' };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hihi!hi!", charArray8);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                       hi!                                                           ", charArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  HI!     ", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "a4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "a4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[a, 4, #, a]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7357");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("                       Hi  Hi...h!     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi  Hi...h!     ..." + "'", str1, "Hi  Hi...h!     ...");
    }

    @Test
    public void test7358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7358");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih" + "'", str1, "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih");
    }

    @Test
    public void test7359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", "ii...hiiiii", "hH hhH ...  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h    hhhhhhh  hh  hhhhhhh  hhhhhhh  hH hhH ...  #h  #h #h  #h  #h  #h    hhhhhhh  hh  hhhhhhh  hhhhhhh  hH hhH ...  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h    hhhhhhh  hh  hhhhhhh  hhhhhhh  hH hhH ...  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h  #h    hhhhhhh  hh  hhhhhhh  hhhhhhh  hH hhH ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test7360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7360");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH444H4444444H4444444HH444H4444444H4444444HH444H4444444H4444444HH444H4444444H44H444H4444444H4444444H4", '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 367 + "'", int3 == 367);
    }

    @Test
    public void test7361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7361");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ", "                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7363");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7364");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hihi!hi!i!hihiHiHiHi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!hi!i!hihiHiHiHi" + "'", str1, "hihi!hi!i!hihiHiHiHi");
    }

    @Test
    public void test7365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7365");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("H", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("    !iH       !iH       !iH     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...     Hi!       Hi!       Hi!    " + "'", str1, "...     Hi!       Hi!       Hi!    ");
    }

    @Test
    public void test7367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  ", "!ih                       !ih                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7368");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", "i!      hi  hi!      hi!      hi                               ");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 398 + "'", int4 == 398);
    }

    @Test
    public void test7369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7369");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test7370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7370");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                      HI#", "hi!hi!!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...", "A!444444444444444444444444444444444444444444444444                                                                                                     ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!h...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "..." + "'", str3, "...");
    }

    @Test
    public void test7372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7372");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 69, 121);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444" + "'", str3, "444444444444444444444");
    }

    @Test
    public void test7373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7373");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test7374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7374");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahh", "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 17);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444                                                          hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7375");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHHHHHHHHHHHH", "H   H   ", 144);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7376");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("      hi        Hi!!ih...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7377");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("!iH", strArray4, strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "#########                                                                  h      !ih      !ih  ih      !ih  ########");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("                        HI#", strArray8, strArray12);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "!iH" + "'", str9, "!iH");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "                        HI#" + "'", str13, "                        HI#");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test7378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7378");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7379");
        char[] charArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh", charArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################" + "'", str1, "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...Hi     ###########################################################################################");
    }

    @Test
    public void test7381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7381");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" i  Hi... ", '4', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7382");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "ah                          h                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test7383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7383");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              " + "'", str1, "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
    }

    @Test
    public void test7384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7384");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("hi#", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("      HI ", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("                                                                                                                                                             hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7385");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 ", "i!HIHI!HI!H");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 151, 34);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7386");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("!i");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test7387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HHHhi!hihi!hi!HHHHHHHHHHHH", "                                                                                                                            44444                                                                                                                             ", "ih      !ih      !ih  i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHhi!hihi!hi!HHHHHHHHHHHH" + "'", str3, "HHHhi!hihi!hi!HHHHHHHHHHHH");
    }

    @Test
    public void test7389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7389");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!!IH!IH!", strArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("   4", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test7390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7390");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "               ih      ", 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7391");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "Hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "       hi#", 3, (int) (byte) -1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 422, (int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7392");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                     hi                   ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", 98, 440);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7394");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#IH", "i  Hi... ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7395");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih    i!hihi!hi!hiHi  Hi...  !ih      !ih  ih      !ih  #ih       ih    ", "!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 0);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("                               hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7396");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7397");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7398");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("Hi###########################################################################################                             ...", charArray8);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly(" !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!      hi  hi!      hi!", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test7399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7399");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("Hi!!IH!IH!                                                                                       ", "..    I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!                                                                                       " + "'", str2, "Hi!!IH!IH!                                                                                       ");
    }
}
