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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" Hi  Hi...", "  hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi..." + "'", str2, " Hi  Hi...");
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("Hi!!IH!IH!i#!", "");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', (int) (byte) 0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "               HI#                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi  Hi...", (int) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi  Hi..." + "'", str3, "Hi  Hi...");
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("ah                          h", "H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ah                          h" + "'", str2, "ah                          h");
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!", "  Hi     ", "      HI                                                                                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h !" + "'", str3, "h !");
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("  Hi     ", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  Hi     " + "'", str2, "  Hi     ");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("hi#!!IH!IH", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!", "                        hi#                         ", 120);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih..." + "'", str1, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("      HI                                                                                        ", "i!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("    !iH   ", "                                                       hi!                                                           ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h !", (int) (short) -1, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h !" + "'", str3, "h !");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                                                                     ", "# Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!      hi  hi!      hi!      hi                               " + "'", str1, "i!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!      hi  hi!      hi!", "   !iH    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  hi!    ", "               HI#                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  hi", 52, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str1, "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!      h                                                                  ", 117, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "########  hi!      hi  hi!      hi!      h                                                                  #########" + "'", str3, "########  hi!      hi  hi!      hi!      h                                                                  #########");
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  H   H       H       H ", "                        hi#                         ", "!iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  H   H       H       H " + "'", str3, "  H   H       H       H ");
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hi!!ih!ih!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH!" + "'", str1, "Hi!!IH!IH!");
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("                        hi#                         ", "                                             ah                          h                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("   hi!    i!", "      HI ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  ", "    !iH   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi!      hi  hi!      hi!      hi", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   hi!    ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    " + "'", str2, "   hi!    ");
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("       Hi!", "                                                                                                                     ", "                          h                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "########  hi!      hi  hi!      hi!      h                                                                  #########", "!IH");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                     ", (int) ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             ..." + "'", str2, "                             ...");
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat(" Hi  Hi      Hi      Hi", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi      Hi      Hi" + "'", str2, " Hi  Hi      Hi      Hi");
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "  Hi     ###########################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 74 + "'", int2 == 74);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("hi!hihi!hi!", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!" + "'", str2, "hi!hihi!hi!");
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                       hi!                                                           ", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         " + "'", str2, "         ");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("H   H       H       H", "hi#!!IH!IH!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi", (int) '4', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi                                                " + "'", str3, "  hi                                                ");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", "hi!  hihi!  hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih..." + "'", str2, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ahi!", "                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ahi!" + "'", str2, "ahi!");
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!      hi  hi!      hi!      hi", "    i!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                 hi!                                                                                                 hi!", "  hi!     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!", "ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", (int) '4', "!ih                                                                                                 !ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih                       !ih                       " + "'", str3, "!ih                       !ih                       ");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      h                                                                  ", "h !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Hi!!IH!IH!", "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("   hi!    i", "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("   Hi!    ", "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi                                                ", "hi!hihi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi                                                " + "'", str2, "  hi                                                ");
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("H   H       H       H", "    !iH   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", "Hi!!IH!IH!i#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih..." + "'", str2, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", "Hi###########################################################################################", "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "   hi!    i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str2, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                          h                        ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "    !ih   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(objArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi#!", "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", (int) (byte) 1, 24);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str4, "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  H   H       H       H ", (int) '#', (int) '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  H   H       H       H " + "'", str3, "  H   H       H       H ");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("       Hi!", "                        hi#                         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                              ", "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("!ih                                                                                                 !ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("ahi!", "Hi###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("##hi!####", "hi!hihi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##hi!####" + "'", str2, "##hi!####");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("ah                          h                        ", "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ah                          h                        " + "'", str2, "ah                          h                        ");
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("Hi###########################################################################################", "                             ...", (int) (byte) 100, 117);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi###########################################################################################                             ..." + "'", str4, "Hi###########################################################################################                             ...");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("Hi", "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", "  hi!      hi  hi!      hi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!Hi!!IH!IH!", "##########################################################################################################################################################################Hi###########################################################################################################################################################################");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi  Hi...", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi", "  hi                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str1, "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!i" + "'", str1, "!i");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i!      hi  hi!      hi!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!" + "'", str2, "i!      hi  hi!      hi!");
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", "Ah                          h", "hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "    I!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                                       hi!                                                           ", 3, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                       hi!                                                           " + "'", str3, "                                                       hi!                                                           ");
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("   hi!    i", "444444hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    i" + "'", str2, "   hi!    i");
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("    !iH   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  hi#!", '#', (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ah                          h                        ", "!ih                                                                                                 !ih", "                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a                                                    " + "'", str3, "a                                                    ");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("a                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("    i!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("H   H       H       H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H   H       H       H" + "'", str1, "H   H       H       H");
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i!      hi  hi!      hi!", "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!" + "'", str2, "i!      hi  hi!      hi!");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("    I!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" hi!", "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!", "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    " + "'", str3, "    ");
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("H", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("Hi!", "I!", (int) ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!" + "'", str3, "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!");
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("########  hi!      hi  hi!      hi!      h                                                                  #########", "HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", 4, 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########" + "'", str4, "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "hi#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str2, "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("  Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi     ###########################################################################################" + "'", str1, "Hi     ###########################################################################################");
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("  hi!     ", "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                               hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               " + "'", str2, "                               hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                             ...", "ah                          h                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        int int1 = org.apache.commons.lang3.StringUtils.length("##hi!####");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 9 + "'", int1 == 9);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   hi!    " + "'", str1, "   hi!    ");
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!      hi", "hi!", (int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 24 + "'", int3 == 24);
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        int int1 = org.apache.commons.lang3.StringUtils.length("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 72 + "'", int1 == 72);
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("Hi  Hi...", 36);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi..." + "'", str2, "Hi  Hi...");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                       hi!                                                           ", "Hi###########################################################################################                             ...", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!hi!!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!hi!!ih!ih!" + "'", str1, "Hi!hi!!ih!ih!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        HI#                        ", "       hi#");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " Hi!", 0, 151);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ah                          h                        ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih                       !ih                       ", "                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                       !ih" + "'", str2, "!ih                       !ih");
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("##########################################################################################################################################################################Hi###########################################################################################################################################################################", "    !ih   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("   #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih      !ih      !ih  ih      !ih  ", 91, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!!IH!IH!", (int) (byte) -1, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!" + "'", str3, "Hi!!IH!IH!");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "                                 hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str2, "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("hi#!", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI  hI      hI      hI", "  Hi     ###########################################################################################", "!ih                       !ih                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!!hI!!!!!!hI!!!!!!hI" + "'", str3, "hI!!hI!!!!!!hI!!!!!!hI");
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "Hi!!IH!IH!");
        java.lang.String[] strArray8 = null;
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("Hi", strArray3, strArray8);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!Hi!!IH!IH!" + "'", str7, "hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi" + "'", str9, "Hi");
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        java.lang.String[] strArray0 = null;
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray0, "");
        org.junit.Assert.assertNull(strArray2);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", (int) (short) 100);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 9, 9);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("h !", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        HI#                         ", "Hi  Hi...", 3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("       hi#", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                             ah                          h                       ", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  ", '#', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("  hi#!", "Hi!", (int) '4', 435);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi#!Hi!" + "'", str4, "  hi#!Hi!");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("Hi!hi!!ih!ih!", "ah                          h                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("  hi!    ", "a                                                    ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("!iH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi  Hi...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi..." + "'", str2, "Hi  Hi...");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  hi!      hi  hi!      hi!", "hi!Hi!!IH!IH!", "Hi  Hi...", (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  hi!      hi  hi!      hi!" + "'", str4, "  hi!      hi  hi!      hi!");
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("   hi!    i", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!    i" + "'", str3, "   hi!    i");
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih                                                                                                 !ih                                                                                                 ", "ah                          h");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########" + "'", str1, "####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!      hi  hi!      hi!", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih                                                                                                 ", "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                                                                                                 " + "'", str2, "!ih                                                                                                 ");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!      hi  hi!      hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!" + "'", str2, "i!      hi  hi!      hi!");
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                                                                                                 hi!                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!                                                                                                 hi!" + "'", str1, "hi!                                                                                                 hi!");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                                 hi!                                                                                                 hi!", "       Hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "hi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray6);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("       hi#", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("  Hi     ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      " + "'", str2, "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ");
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("  hi!      hi  hi!      hi!      h                                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      H                                                                  " + "'", str1, "  HI!      HI  HI!      HI!      H                                                                  ");
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hI!!hI!!!!!!hI!!!!!!hI", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!ih                                                                                                 !ih", "", "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("   hi!    i", "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", 120, (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str4, "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih                                                                                                 ", "                        HI#                         ", 0);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!    ", "                                                                                                                                                                                                                                                                                                                                                              ", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!", "  HI!      HI  HI!      HI!      H                                                                  ", (int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", "  Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               " + "'", str2, "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", 2);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH" + "'", str2, "IH");
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "HI#", 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, " Hi!", (int) (byte) 100, 9);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray9);
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi#", "hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("    i!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "hI  hI      hI      hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi  Hi..." + "'", str1, "Hi  Hi...");
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("      hi ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      hi " + "'", str1, "      hi ");
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!!IH!IH", "ah                          h                       ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("      HI ", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI " + "'", str2, "      HI ");
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                             ah                          h                       ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone(" hi!", "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("    i!    ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    i!    " + "'", str2, "    i!    ");
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("##########################################################################################################################################################################Hi###########################################################################################################################################################################", "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  hi!     ", 3, (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("               HI#                        ", '4', (int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!", "ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  Hi     ###########################################################################################", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", "  Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !" + "'", str2, "IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI", "               HI#                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("Hi!!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI!!ih!ih" + "'", str1, "hI!!ih!ih");
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("   hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    !ih   " + "'", str1, "    !ih   ");
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str1, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("         ", "hI!!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                        HI#                        ", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("       Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI!" + "'", str1, "       HI!");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi###########################################################################################", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#", " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   hi!    ", strArray4, strArray8);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "  hi!     ");
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "   Hi!    " + "'", str9, "   Hi!    ");
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  hi!      hi  hi!      hi!      h                                                                  ", "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h                                                                  " + "'", str2, "  hi!      hi  hi!      hi!      h                                                                  ");
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!" + "'", str2, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("   hi!    i   hi!    i   hi!    i   hi!    i   hi! ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!ihi!ihi!ihi!ihi!" + "'", str1, "hi!ihi!ihi!ihi!ihi!");
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("    !iH   ", 91);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !iH   " + "'", str2, "    !iH   ");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!!IH!IH", "444444hi#!", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("   hi!    i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!    i!" + "'", str1, "hi!    i!");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!      hi  hi!      hi!", "i!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("      HI ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ah                          h                       ", (int) (byte) 1, "H   H       H       H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ah                          h                       " + "'", str3, "ah                          h                       ");
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                 hi!      hi  hi!      hi!      hi                               ", (int) 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                 hi!      hi  hi!      hi!      hi                               " + "'", str3, "                                 hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "  hi", (int) (short) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("IH");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH" + "'", str1, "IH");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str1, "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "hi!      hi  hi!      hi!      hi", 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str3, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   Hi!    ", 4, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   Hi!    " + "'", str3, "   Hi!    ");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    !ih   ", "ah                          h                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !ih   " + "'", str2, "    !ih   ");
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hihi!hi!", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("# Hi  Hi      Hi      Hi", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi" + "'", str1, "  hi");
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("", "", 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", 'a', 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi#!!IH!IH!", "Hi  Hi...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hI!!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!!IH!IH", "Ah                          h", "ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH" + "'", str3, "Hi!!IH!IH");
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("         ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ahi!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   hi!    i!", "HI#", (int) (short) 1);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ah                          h                        ", ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("   !iH    ", strArray4, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 51");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!IH", "hI!!ih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   hi!    i   hi!    i   hi!    i   hi!    i   hi! ", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!    i   hi!    i   hi!    i   hi!    i   hi! " + "'", str3, "   hi!    i   hi!    i   hi!    i   hi!    i   hi! ");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                                                                                                                                                                                                                                                                                                                                              ", "      HI ", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  hi!      hi  hi!      hi!      h                                                                  ", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h                                                                  " + "'", str2, "  hi!      hi  hi!      hi!      h                                                                  ");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str1, "hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("ah                          h", (int) '4', (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("a                                                    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 53 + "'", int3 == 53);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", "!ih                       !ih                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" ih      ", "ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("       Hi!", "Hi!!IH!IH!i#!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEach("IH", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 10 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("               HI#                        ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#" + "'", str2, "HI#");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi#!!IH!IH", "  hi!      hi  hi!      hi!      h                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      hi!      h                                                                  " + "'", str2, "  hi!      hi  hi!      hi!      h                                                                  ");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi!      hi  hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        int int1 = org.apache.commons.lang3.StringUtils.length("  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase(" hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       HI!", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("                             ...", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                             ..." + "'", str2, "                             ...");
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                             ...", "hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             ..." + "'", str3, "                             ...");
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("  hi!    ", "h !");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                 hi!                                                                                                 hi!", ' ', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                                                                                                                                                                                                                                                                                                                                              ", "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 435);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h", 6, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444h" + "'", str3, "44444h");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("  Hi     ###########################################################################################", "!ih                       !ih", "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("HI#", "44444h");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "hI  hI      hI      hI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("", "Hi!!IH!IH!                                                                                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("   Hi!    ", "  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Hi!", " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray3, strArray8);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', (int) (byte) 1, (int) (byte) 0);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", 6, 52);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     " + "'", str3, "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!     " + "'", str1, "  hi!     ");
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "H   H       H       H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi#!!IH!IH", 6, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi", "i!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi" + "'", str2, "Hi");
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                ", 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                      " + "'", str2, "                                                                                      ");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", 72, "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  " + "'", str3, "   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance(" Hi  Hi...", "                                                                                                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi#!Hi!", "444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI#", 17, 117);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#" + "'", str3, "HI#");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ", "##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  " + "'", str2, "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih                                                                                                 !ih", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!", "       HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!" + "'", str2, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               " + "'", str1, "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("h", "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str2, "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  Hi     ###########################################################################################", "                          h                        ", 0);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("##########################################################################################################################################################################Hi###########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##########################################################################################################################################################################HI###########################################################################################################################################################################" + "'", str1, "##########################################################################################################################################################################HI###########################################################################################################################################################################");
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                             ah                          h                       ", "  hi!      hi  hi!      hi!      h", "!ih", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                             ah                          h                       " + "'", str4, "                                             ah                          h                       ");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("H", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                   H" + "'", str2, "                                                                                                   H");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("                                                                                                                                                                                                                                                                                                                                                              ", "hi!ihi!ihi!ihi!ihi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("#", "444444hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "hi!      hi  hi!      hi!      hi", "                        HI#                        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "hi!      hi  hi!      hi!", 17, (int) '#');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H " + "'", str4, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H ");
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" Hi  Hi      Hi      Hi", '#', 13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi     ###########################################################################################", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  " + "'", str1, "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "  hi#!Hi!", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!i", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                       hi!                                                           ", '4', (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("   !iH    ", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("i!      hi  hi!      hi!      hi                               ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("Hi!hi!!ih!ih!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("Hi###########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi###########################################################################################" + "'", str1, "Hi###########################################################################################");
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("ah                          h                        ", "hi!                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ah                          h", "  H   H       H       H ", 72);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    I!    ", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    I!    " + "'", str2, "    I!    ");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444", "hI!!hI!!!!!!hI!!!!!!hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("IH", "      hi ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!  hihi!  hi!", "hI!!ih!ih", 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", 24, (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444..." + "'", str3, "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  Hi     ", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    " + "'", str2, "    ");
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ", "hi!      hi  hi!      hi!", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("444444hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444hi#!" + "'", str1, "444444hi#!");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "IH" + "'", str1, "IH");
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!", 9);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!" + "'", str2, "444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!");
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", '4');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 100, (int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hI  hI      hI      hI", "hI!!hI!!!!!!hI!!!!!!hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI  hI      hI      hI" + "'", str2, "hI  hI      hI      hI");
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi#!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "   hi!    i   hi!    i   hi!    i   hi!    i   hi! ", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444" + "'", str3, "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   Hi!    ", 'a');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   Hi!    " + "'", str3, "   Hi!    ");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!    ", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", 13);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("Hi  Hi      Hi      Hi", "Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi      Hi      Hi" + "'", str2, "Hi  Hi      Hi      Hi");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("               HI#                        ", "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("!iH", strArray8, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!!IH!IH!i#!", strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "!iH" + "'", str13, "!iH");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 13 + "'", int14 == 13);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  " + "'", str2, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("IH", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("      HI                                                                                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "      HI                                                                                        " + "'", str1, "      HI                                                                                        ");
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "  H   H       H       H ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str2, "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!" + "'", str2, "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                             ...", 13, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                             ..." + "'", str3, "                             ...");
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" hi!", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("H", (int) (byte) 0, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H" + "'", str3, "H");
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!      hi  hi!      hi!      hi", "hi!hi!!ih!ih!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 17, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str3, "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("hi!hi!!ih!ih!", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444", "i!", "    !iH   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444" + "'", str3, "       !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih                                                                                                 ", "                        HI#                         ", 0);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, 'a');
        java.lang.String[] strArray7 = null;
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("                                 hi!      hi  hi!      hi!      hi                               ", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "!ih                                                                                                 " + "'", str6, "!ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "                                 hi!      hi  hi!      hi!      hi                               " + "'", str8, "                                 hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" ih      ", "  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444", (int) (byte) -1, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", "  hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!" + "'", str2, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!hihi!hi!", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!                                                                                                             " + "'", str2, "hi!hihi!hi!                                                                                                             ");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("########  hi!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########                                                                  h      !ih      !ih  ih      !ih  ########" + "'", str1, "#########                                                                  h      !ih      !ih  ih      !ih  ########");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("                                                                                                   H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("Ah                          h", "##########################################################################################################################################################################Hi###########################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ah                          h" + "'", str2, "Ah                          h");
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                        HI#                         ", "Hi!", 100);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "Hi!!IH!IH!                                                                                       ");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str1, "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("a                                                    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!" + "'", str1, "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", 24, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str3, "hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                             ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             " + "'", str1, "...                             ");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("#", "Hi!", 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#!!IH!IH", "               HI#                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  Hi     ", 442);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      " + "'", str2, "  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("    i!    ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "Hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    i!    " + "'", str3, "    i!    ");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "  hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!ihi!ihi!ihi!ihi!", 4, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!ihi!ihi!ihi!ihi!" + "'", str3, "hi!ihi!ihi!ihi!ihi!");
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       Hi!", "", 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("HI", (int) (byte) 0, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI" + "'", str3, "HI");
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("                        HI#                        ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        HI#                        " + "'", str1, "                        HI#                        ");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  Hi     ###########################################################################################", " Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  Hi     ###########################################################################################" + "'", str2, "  Hi     ###########################################################################################");
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str2, "444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("hi!hi!!ih!ih!", "       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hi!!ih!ih!" + "'", str3, "hi!hi!!ih!ih!");
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                       hi!                                                           ", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                   H", "hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                       hi!                                                           ", '4', 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", "hi!                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" ih      ", "   hi!    i   hi!    i   hi!    i   hi!    i   hi! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       Hi!", "Hi!!IH!IH!i#!");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("                        HI#                         ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#" + "'", str1, "HI#");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "                               hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444", "hi!hi!!ih!ih!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!" + "'", str2, "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!");
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("          ", "hi#", (int) 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', (int) 'a', 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("!iH", "ah                          h                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("i!      hi  hi!      hi!      hi                               ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hi                               " + "'", str2, "i!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Hi!!IH!IH!                                                                                       ", "    ", "   hi!    ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", 11, "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  " + "'", str3, "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!      hi  hi!      hi!      hi                               ", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!hihi!hi!hi" + "'", str2, "i!hihi!hi!hi");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("##hi!####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("i!", "!ih                       !ih                       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444", "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("       hi#", " hi!", 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#" + "'", str3, "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("h !");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!      hi  hi!      hi!", "444444hi#!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("ah                          h                        ", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ah                          h                        " + "'", str2, "ah                          h                        ");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str3, "   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!", "Hi!!IH!IH!i#!", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444h", "ahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("i!", "     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("Ah                          h", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ah                          h" + "'", str2, "Ah                          h");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("                                                                                                 ", 36, "...                             ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                 " + "'", str3, "                                                                                                 ");
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        int int1 = org.apache.commons.lang3.StringUtils.length("444444hi#!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 10 + "'", int1 == 10);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("...                             ", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                                                                                                 " + "'", str2, "...                                                                                                 ");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("   hi!    i   hi!    i   hi!    i   hi!    i   hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart(" Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################", "hi!ihi!ihi!ihi!ihi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  hi!    ", '4');
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", 11, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH" + "'", str3, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444" + "'", str1, "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  HI!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!     " + "'", str1, "  HI!     ");
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "Hi!");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!", strArray3);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "!ih", "", "" };
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray8);
        int int10 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray8);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.stripAll(strArray12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEach("IH", strArray8, strArray12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 5 vs 157");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(strArray13);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI  hI      hI      hI", 74, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  Hi     ###########################################################################################", "  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", 24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("########  hi!      hi  hi!      hi!      h                                                                  #########", "  hi!     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", (int) (short) 100);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray10);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi!Hi!!IH!IH!", strArray4, strArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!Hi!!IH!IH!" + "'", str12, "hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("    i!    ", "  hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ahi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("a                                                    ", "hi!", "       HI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a                                                    " + "'", str3, "a                                                    ");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  hi#!", "!ih                       !ih                       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi#!" + "'", str2, "  hi#!");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444", 36, "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444" + "'", str3, "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("i!", "  Hi     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 8 + "'", int2 == 8);
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("i!", "ah                          h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!" + "'", str2, "i!");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" Hi  Hi      Hi      Hi", "      HI ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("   hi!    i!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "##########################################################################################################################################################################Hi###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   Hi!    ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   Hi!    " + "'", str2, "   Hi!    ");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!", "                        HI#                         ", "hI  hI      hI      hI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!" + "'", str3, "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!");
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("", "####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!ih", "       hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih" + "'", str2, "!ih");
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("########  hi!      hi  hi!      hi!      h                                                                  #########", "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi!    i!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!    i!" + "'", str2, "hi!    i!");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("hI  hI      hI      hI", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  hi!      hi  hi!      hi!      h                                                                  ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("Hi!!IH!IH!                                                                                       ", "h", 34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i!      hi  hi!      hi!", "hI  hI      hI      hI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!" + "'", str2, "i!      hi  hi!      hi!");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ah                          h                        ", "         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, " Hi  Hi      Hi      Hi");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "       Hi!", (int) (byte) 100, (int) (byte) 100);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!" + "'", str4, "Hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("       Hi!", "Hi###########################################################################################                             ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!" + "'", str2, "       Hi!");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens(" Hi  Hi      Hi      Hi", "i!      hi  hi!      hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("...                             ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "I!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                             ...", "  hi#!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!", 51);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           " + "'", str2, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ");
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 74);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i! " + "'", str2, " i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i! ");
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("IH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", "####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("   hi!    i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!    i" + "'", str1, "hi!    i");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                 hi!      hi  hi!      hi!      hi                               ", " Hi!", "       !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("!ih                                                                                                 !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                                                                                                 !ih" + "'", str1, "!ih                                                                                                 !ih");
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("         ", "H   H       H       H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "         " + "'", str2, "         ");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!      hi  hi!      hi!      hi                               ", "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", (int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!      hi  hi!      hi!      hi", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!######hi##hi!######hi!######hi" + "'", str3, "hi!######hi##hi!######hi!######hi");
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("##hi!####", "HI#", "hi!######hi##hi!######hi!######hi");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("    !ih   ", "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi#!!IH!IH", (int) (short) 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH" + "'", str3, "hi#!!IH!IH");
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("   #");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("  hi!    ", "# Hi  Hi      Hi      Hi", (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("                        HI#                         ", "Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("hi!                                                                                                 hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  hi!     ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Hi  Hi...");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hI  hI      hI      hI", 24, 9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!    i!", "#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#", "                                                                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.lang.String[] strArray1 = new java.lang.String[] { "HI#" };
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.Class<?> wildcardClass3 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#" + "'", str2, "HI#");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", " ih      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("##########################################################################################################################################################################Hi###########################################################################################################################################################################", "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################Hi###########################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################Hi###########################################################################################################################################################################");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("i!hihi!hi!hi", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                        i!hihi!hi!hi" + "'", str2, "                                                                                        i!hihi!hi!hi");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("########  hi!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "########  hi!      hi  hi!      hi!      h                                                                  #########" + "'", str1, "########  hi!      hi  hi!      hi!      h                                                                  #########");
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444", "Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("########  hi!      hi  hi!      hi!      h                                                                  #########", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 442);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" Hi  Hi      Hi      Hi", " hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("  hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi#" + "'", str1, "  hi#");
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("    I!    ", "HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    I!    " + "'", str2, "    I!    ");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi  Hi...", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("  hi", "   hi!    ", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi" + "'", str3, "  hi");
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", "  HI!      HI  HI!      HI!      H                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!" + "'", str2, "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!");
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!Hi!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    i!    ", "hi!      hi  hi!      hi", 117);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", (int) (short) 10, "                          h                        ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str3, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        int int1 = org.apache.commons.lang3.StringUtils.length("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 34 + "'", int1 == 34);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi                                                ", 0, "                                             ah                          h                       ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi                                                " + "'", str3, "  hi                                                ");
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("                        HI#                         ", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                         " + "'", str2, "                        HI#                         ");
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("                                                                                                ", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                                                                        i!hihi!hi!hi", "", "  hi#");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", "Hi###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("  hi!      hi  hi!      hi!", "hi!######hi##hi!######hi!######hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      " + "'", str2, "  hi!      hi  hi!      ");
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("Hi  Hi...", "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi     ###########################################################################################", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi     ###########################################################################################" + "'", str2, "Hi     ###########################################################################################");
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", "         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("     ");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "hi!hihi!hi!                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Hi!", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!" + "'", str2, "Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!");
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("  hi#", "   !iH    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("       HI!", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI" + "'", str2, "       HI");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("      hi ", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#" + "'", str1, "ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#");
    }
}
