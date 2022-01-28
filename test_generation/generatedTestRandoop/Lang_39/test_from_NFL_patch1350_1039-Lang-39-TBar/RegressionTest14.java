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
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###" + "'", str1, "###");
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi! i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i !ih" + "'", str1, "!i !ih");
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi#!", 42, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi#!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "  hi#!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("                             ...", "#H  #HI      #HI      #");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaHHHHHHHHHHHHHHHHHHH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               " + "'", str2, "                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "###");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI  hI      hI      hI", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi hi! hi!" + "'", str3, "hi! hi hi! hi!");
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", "I!      HI  HI!      HI!      HI                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 72, 11);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "h                                   i!      hi  hi!      hi!!ih                                   ", (int) (byte) 10, (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "   hi!    ", (int) '4', 10);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "hi!hihi!hi!", (int) '#', (int) '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        java.lang.Class<?> wildcardClass13 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("##########################################################################################################################################################################  hi     ###########################################################################################################################################################################", "HI#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################  hi     ###########################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################  hi     ###########################################################################################################################################################################");
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hi!Hi!!IH!IH!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("                         #IH                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                         #IH                       " + "'", str1, "                         #IH                       ");
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("IIII", 452, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IIII                                                                                                                                                                                                                                                                                                                                                                                                                                                                " + "'", str3, "IIII                                                                                                                                                                                                                                                                                                                                                                                                                                                                ");
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!ihi!ihi!ihi!ihi!              hi#                           H   H      ", "Hi     ", 422);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("#######################################...", "444 hi!444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 42 + "'", int2 == 42);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    I!    AAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "    I!    AAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!!!!!! hi!!#hi!!!!!!!hi!!!!!! hi!iI !!!!!", 11, 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!" + "'", str3, "!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!");
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ", "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", 121);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!!IH!IH!i#!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" Hi  H", (int) (byte) 1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  H" + "'", str3, " Hi  H");
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", "    i!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("!IH      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str2, "I#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "                                             ah                          h                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!                                                                                                 hi!", "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "!ih                       !ih                       ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "########  hi!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444", "!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                        HI", "#########                                                                  h      !ih      !ih  ih      !ih  ########", "hi! hi hi! hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        HI" + "'", str3, "                        HI");
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI!I!!!!", "hihi!hi!i!hihiHiHiHi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
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
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                 ", "i!HIHI!HI!H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("ahh", "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 17);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "..I!aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "..I!aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp(" #h  #hi      #hi      #", "!ih                       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " #h  #hi      #hi      #" + "'", str2, " #h  #hi      #hi      #");
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "  hi!                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444", 33, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str1, "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
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
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!ihi!ihi!ihi!ihi!              hi#                         ", 10, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!ihi!ihi!ihi!ihi!              hi#                         " + "'", str3, "i!ihi!ihi!ihi!ihi!              hi#                         ");
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("H                          hH                I!HIHI!HI!HH                          hH                ", 88);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                          hH                I!HIHI!HI!HH                          hH                " + "'", str2, "H                          hH                I!HIHI!HI!HH                          hH                ");
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("", "       hI!########################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH", '#');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i", ' ');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi" + "'", str7, "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" hi!      hi  hi!      hi!      h                                                                 ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!h" + "'", str2, "hi!hihi!hi!h");
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hI...", 9, "H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hI...H " + "'", str3, "  hI...H ");
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI                                                  ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("###############################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###############################################################################################################################################################################################################################################################################################################################################################################################################################################..." + "'", str1, "###############################################################################################################################################################################################################################################################################################################################################################################################################################################...");
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 439 + "'", int2 == 439);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("4444444444444444444444444444444444444444444444444444i!      hi                               ", "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ", 119);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", 119);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                    HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str2, "                                    HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
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
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH", "hi  hi!      hi!i!   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("4444444444444444444444444444444444444444444444444444i!      hi                               ", "444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444", 98);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str1, "Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
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
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "...i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!hihi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                       ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha", "hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("a                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                    a" + "'", str1, "                                                    a");
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!IAAAAA...", "  Hi     ###########################################################################################  Hi     ###############################################################  hi!      hi  hi!      ", "                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IAAAAA..." + "'", str3, "!IAAAAA...");
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHi!ihi!ihi!ihi!ihi!              hi#   ", 518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
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
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" i  Hi... ", "     ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                              ########  hi!      hi  hi!      ...                                ", "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("      HI       HI       HI       HI       HI       HI       HI       HI ", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("#  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#" + "'", str1, "#");
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
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
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ah                          h                        ...                                                                                                 ...                                        ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "        ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("##########################################################################################################################################################################HI###########################################################################################################################################################################", "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H ", 518);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!#", "############################################################", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("AH                          H", "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i     ###########################################################################################", "  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i     ###########################################################################################" + "'", str2, "i     ###########################################################################################");
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("###############################################################################################################################################################################################################################################################################################################################################################################################################################################...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                    ", "hi!    i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                    " + "'", str2, "                                                                                                    ");
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                              !IH   ", "  hi!      hi  h  Hi       hi!      hi  hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "       hi#");
        int int7 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("  hI...", "hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hI..." + "'", str2, "  hI...");
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i", "i!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("HIa!hi!Hi!!IH!IH!                                                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                    ih!ih!ihih!ih                                                    ", 42, 36);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          ih!ih!ihih!ih             " + "'", str3, "          ih!ih!ihih!ih             ");
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi!                                  ", 120, (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                                " + "'", str3, "...                                ");
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("..", "!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH", 161, "!hi!!#!hi!i  hi#!hi!h  hi#   hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi!!#!hi!i  hi#!hi!h  hi#   hi!hi!!#!hi!i  hi#!hi!h  hi#   hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH" + "'", str3, "!hi!!#!hi!i  hi#!hi!h  hi#   hi!hi!!#!hi!i  hi#!hi!h  hi#   hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH");
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                        I!HIHI!HI!HI", "!I                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        I!HIHI!HI!HI" + "'", str2, "                                                                                        I!HIHI!HI!HI");
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("      hi ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp(" hi  hi...hi#!hi#!h hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi  hi...hi#!hi#!h hi  hi!      hi!" + "'", str1, " hi  hi...hi#!hi#!h hi  hi!      hi!");
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#################################!ih      !ih  ih      !ih  ##################################", "hi i! H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", 143);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H " + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
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
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("", "      HI ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        int int1 = org.apache.commons.lang3.StringUtils.length("...iH  iH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("H                                                                                                   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H                                                                                                   " + "'", str1, "H                                                                                                   ");
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            ", "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", 0, 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            " + "'", str4, "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            ");
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################" + "'", str1, "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################");
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("H                          h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H                          h" + "'", str1, "H                          h");
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  H   H       H       H         ", "", "ah                          h                        ...                                                                                                 ...                                        ", 273);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  H   H       H       H         " + "'", str4, "  H   H       H       H         ");
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("!IH   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH" + "'", str1, "!IH");
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                 hi!      hi  hi!      hi!      hi                               ", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " " + "'", str2, " ");
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ", " H       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#", "AhhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#" + "'", str2, "hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#");
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("H!IH!IH!IH  hi!      hi  hi!      h", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        int int1 = org.apache.commons.lang3.StringUtils.length("iHiHiHi");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 7 + "'", int1 == 7);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("  Hi     ", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("..I!aaaaaaaaaaaaaaaaaaaaaaaa", 96);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                    ..I!aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "                                                                    ..I!aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                             ah                          h                                                                                                ", 9, 8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        " + "'", str3, "        ");
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih   " + "'", str1, "!ih   ");
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI" + "'", str1, " HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     " + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     ");
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                      ", "!44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("I!HIHI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!HIHI!HI!H" + "'", str1, "I!HIHI!HI!H");
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HI!HI!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!!IH!IH" + "'", str1, "!HI!HI!!IH!IH");
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hIH      !IH      !IH  IH      !IH  IH      !IH          I!    aaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 63 + "'", int2 == 63);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...", 422);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              " + "'", str2, "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("4444444hia!4444444444444", (int) (byte) -1, "HAIA###########################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444hia!4444444444444" + "'", str3, "4444444hia!4444444444444");
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444HIA!44444444444444444444444444444444444HI!HI!!IH!IH!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", (int) 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7133");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("4H4i4  4H", "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4H4i4  4H" + "'", str2, "4H4i4  4H");
    }

    @Test
    public void test7134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7134");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace(" Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7135");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                                                                                                                                                                                                                                                                                                              ", "...hi ....i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7136");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444hi!hi!!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi!hi!!ih!ih44444444444444444444444444444444444!aih444444444444444444444444444444444444444444444444" + "'", str1, "!hi!hi!!ih!ih44444444444444444444444444444444444!aih444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!  hihi!  hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!  hihi!  hi!" + "'", str2, "Hi!  hihi!  hi!");
    }

    @Test
    public void test7138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!hihi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7139");
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
    public void test7140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7140");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                                               iHiHiHiH                                                                                                                                                ", ' ', 69);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 69 + "'", int3 == 69);
    }

    @Test
    public void test7141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hI  hI..." + "'", str1, " hI  hI...");
    }

    @Test
    public void test7142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7142");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("h Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, "h hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test7143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7143");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("H   H   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7144");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("ahi!", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test7145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7145");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hI!     ", "44444444444444444444444444444444444hi!Hi!!IH!  Hi...", 63, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "44444444444444444444444444444444444hi!Hi!!IH!  Hi..." + "'", str4, "44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
    }

    @Test
    public void test7146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7146");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!     ", "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a', 96, 60);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!44444444444444444444444444444444444hi!Hi!!IH!  Hi...", "ahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!44444444444444444444444444444444444hi!Hi!!IH!  Hi..." + "'", str2, "!44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
    }

    @Test
    public void test7148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7148");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                        #                        HI");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(" hi  hi!      hi!", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi!" + "'", str2, " hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi! hi  hi!      hi!");
    }

    @Test
    public void test7150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7150");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih         HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI     ", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              ", 170);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              " + "'", str2, "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test7153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("   hi!    i!", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!" + "'", str2, "   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!   hi!    i!");
    }

    @Test
    public void test7154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7154");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!iH       !iH       !iH     ...", "  HI                                          ...", 99);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test7155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7155");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "I#!!!!!!iI!!iI#!!!!!!iI#!!!!!!iI");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                        HI#", 72);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                                             " + "'", str2, "                        HI#                                             ");
    }

    @Test
    public void test7157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7157");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!!IH!IH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7158");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("HI#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7159");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("...                                                                                                 ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                 " + "'", str2, "...                                                                                                 ");
    }

    @Test
    public void test7160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7160");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test7161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("##HI!####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##HI!####" + "'", str1, "##HI!####");
    }

    @Test
    public void test7162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7162");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("#                                 hi!      hi  h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7163");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("                        HI#", "!ih                       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test7164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7164");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("  hi!                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7165");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ", 'a', 157);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7166");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI" + "'", str1, "  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test7167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7167");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i", "                                                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7168");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("...  ...", "########  hi!      hi  hi!      hi!      h                                                                  #########", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!", "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test7170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7170");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!ih                       !ih", "Hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("444444444444444444444444444444444444444444444444hiIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444HIIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444HIIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7172");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i", "444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#   hi!    i");
    }

    @Test
    public void test7173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7173");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "  Hi     ###########################################################################################", 52);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "444444444444444444444444444444444444444444444444h!444444444444444444444444444444444444444444444444" + "'", str5, "444444444444444444444444444444444444444444444444h!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test7174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7174");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", "             ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa#ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test7176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7176");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test7177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7177");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("444444Ih######!ih######!ih##i4444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7179");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "Hi!!IH!IH!                                                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7180");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("                                                                        ##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", "      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      " + "'", str2, "hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test7181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7181");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7182");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 52, "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "...aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  hi!      hi  hi!      hi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test7183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7183");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444", "                                                                                                 ", 414);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test7184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("##################################", "########  hi!      hi  hi!      ...", "!iH       !iH       !iH     ...");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test7185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7185");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7186");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7187");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!      hi  hi!       HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test7188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7188");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI###########################################################################################                             ...", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 92 + "'", int2 == 92);
    }

    @Test
    public void test7189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7189");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih..." + "'", str1, "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
    }

    @Test
    public void test7190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7190");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!" + "'", str3, "HI!");
    }

    @Test
    public void test7191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7191");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   " + "'", str2, "                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ");
    }

    @Test
    public void test7192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7192");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!     ", "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test7193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7193");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################", "444444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################" + "'", str2, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################");
    }

    @Test
    public void test7194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7194");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !...", "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !..." + "'", str2, "...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !...");
    }

    @Test
    public void test7195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi", "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi" + "'", str2, "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi");
    }

    @Test
    public void test7196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7196");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a", '4');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "a" + "'", str4, "a");
    }

    @Test
    public void test7197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7197");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!ih      !ih  ih      !ih         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih      !ih  ih      !ih         " + "'", str1, "!ih      !ih  ih      !ih         ");
    }

    @Test
    public void test7198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7198");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaa", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test7200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7200");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "444444Ih######!ih######!ih##i4444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test7201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#h  #hi      #hi      #", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#h  #hi      #hi      #" + "'", str2, "#h  #hi      #hi      #");
    }

    @Test
    public void test7202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7202");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI!!IH!IH!I#!", 119, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!!IH!IH!I#!" + "'", str3, "HI!!IH!IH!I#!");
    }

    @Test
    public void test7203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7203");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("##########################################################################################################################################################################HI###########################################################################################################################################################################", '4', 343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", 518, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test7205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7205");
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
    public void test7206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!i!", 440, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                   hi!i!" + "'", str3, "                                                                                                                                                                                                                                                                                                                                                                                                                                                   hi!i!");
    }

    @Test
    public void test7207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7207");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih", "!ih                                   i!      hi  hi!      hi!!ih                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test7208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7208");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("!IH       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test7209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7209");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   #", 4, (int) (byte) 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test7210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7210");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("HIa!hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!HI!HI!!iH!ih!aIH" + "'", str1, "!HI!HI!!iH!ih!aIH");
    }

    @Test
    public void test7211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7211");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#", '4', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test7212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" 4H4I4  4H4I4      4H4I4      4H4I", "hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4H4I44H4I44H4I44H4I" + "'", str3, "4H4I44H4I44H4I44H4I");
    }
}

