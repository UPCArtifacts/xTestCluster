import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test6001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6001");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6002");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("I!HIHI!HI!H", "                          h                        ", (int) (short) 100);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6003");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("    ", 53, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6004");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6005");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ah                          h                        ...                                                                                                 ...                                        ", 216);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ah                          h                        ...                                                                                                 ...                                        " + "'", str2, "ah                          h                        ...                                                                                                 ...                                        ");
    }

    @Test
    public void test6006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6006");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih", 3, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih" + "'", str3, "ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih");
    }

    @Test
    public void test6007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#", "hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH ! hi #!! IH ! IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6008");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!    ", "hi#", (-1));
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#', 91, (int) (short) 10);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6009");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("i  Hi...", "  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i  Hi..." + "'", str2, "i  Hi...");
    }

    @Test
    public void test6010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6010");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split("   hi!    ", " hi  hi!      hi!      hi", 1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!!IH!IH!", strArray6);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#!", "hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("               HI#                        ", strArray6, strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi#!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   #", strArray11, strArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "               HI#                        " + "'", str12, "               HI#                        ");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi#!" + "'", str13, "hi#!");
        org.junit.Assert.assertNotNull(strArray15);
    }

    @Test
    public void test6011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6011");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi#!!IH!IH", "                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6013");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hIH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hIH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !" + "'", str1, "hIH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !");
    }

    @Test
    public void test6014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6014");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h", " Hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6015");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I!HIHI!HI!HI");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#');
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIHI!HI!HI" + "'", str2, "I!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "I#!#HIHI#!#HI#!#HI" + "'", str4, "I#!#HIHI#!#HI#!#HI");
    }

    @Test
    public void test6016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6016");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("hi!hihi!hi!                                                                                                             ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6017");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#" + "'", str1, "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#");
    }

    @Test
    public void test6018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6018");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    I!    ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6019");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("  hi", 13);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "           hi" + "'", str2, "           hi");
    }

    @Test
    public void test6020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6020");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("hi!      hi  hi!      hi!      hi", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("         ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("  hi                                                ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6021");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ", "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444", 72, (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444                                                          hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               " + "'", str4, "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444                                                          hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test6022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6022");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("   Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "hI!!hI!!!!!!hI!!!!!!hI", 201);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6023");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("                                                                                                                     ...", "                                          IH                                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                     ..." + "'", str2, "                                                                                                                     ...");
    }

    @Test
    public void test6024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6024");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("Hi!!IH!IH!", "!ih                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6025");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih      !ih  ih      !ih         ", " hi  ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6026");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "...                                                                                                 ", 121, 10);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test6027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6027");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6028");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("a                                                   ", "hi!hihi!hi!                                                                                                             ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 69 + "'", int2 == 69);
    }

    @Test
    public void test6029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6029");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi", " Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi" + "'", str2, "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi");
    }

    @Test
    public void test6030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6030");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("4444444444444 hi  ...44444444444444", "!ih                                                                                                 !ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "4444444444444 hi  ...44444444444444" + "'", str2, "4444444444444 hi  ...44444444444444");
    }

    @Test
    public void test6032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6032");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("aahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahhi!aaaaaahiaahi!aaaaaahi!", "!h...#!hi#!hi#!hi#!hi#...hi", 368);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6033");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("!ih", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6034");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                        HI#                        ", "Hi!!IH!IH", "                                            hi!                                            ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        HI#                        " + "'", str3, "                        HI#                        ");
    }

    @Test
    public void test6035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6035");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...", 6, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6036");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("       !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !i!      hi  hi!      hi!      h                                                                           ", "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ", 343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6037");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("!     ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!     ..." + "'", str1, "!     ...");
    }

    @Test
    public void test6038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6038");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("IH", "#########                                                                  h      !ih      !ih  ih      !i!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6039");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!!IH!IH!i#!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "                                                                                                                                                      ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6040");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!IH                                                                                                 ", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6041");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#  ", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#  " + "'", str2, "#  ");
    }

    @Test
    public void test6042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6042");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Hi###########################################################################################");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6043");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("  HI  HI!      HI!I!      HI  HI hI  hI      hI     ", "  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6044");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6045");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6046");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6047");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("   #", "#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6048");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi     ###########################################################################################" + "'", str1, "  hi     ###########################################################################################");
    }

    @Test
    public void test6049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6049");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih", "###");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6050");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "..    I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, 'a');
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!", strArray6);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("##hi!#######hi##hi!#######hi##hi!#######hi##hi!#######hi#", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "##hi!#######hi##hi!#######hi##hi!#######hi##hi!#######hi#" + "'", str11, "##hi!#######hi##hi!#######hi##hi!#######hi##hi!#######hi#");
    }

    @Test
    public void test6051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6051");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!a", "hi!                                                                                                 hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6052");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!hihi!hi!", "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!h" + "'", str2, "hi!hihi!h");
    }

    @Test
    public void test6053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6053");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("hi!    i! ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!    i! " + "'", str1, "hi!    i! ");
    }

    @Test
    public void test6054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6054");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!!!!!I!", 428, "Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!!!!!I!Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  H" + "'", str3, "HI!!!!!I!Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  H");
    }

    @Test
    public void test6055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6055");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("     ..", "HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6056");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6057");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("I", "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6058");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("", 7);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6059");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("  hi!    ", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!                           " + "'", str2, "  hi!                           ");
    }

    @Test
    public void test6060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6060");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   hi!    ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6061");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi! ", "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6062");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("          ", " Hi  Hi      Hi      Hi", (int) (short) 100);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("ih      !ih      !ih  ih      !ih  aaaa", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test6063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6063");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("    I!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I!" + "'", str1, "I!");
    }

    @Test
    public void test6064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6064");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("Hihi!hihi!hi!44444444444444444444444444444444444444", "                                               Hi!                                         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hihi!hihi!hi!44444444444444444444444444444444444444" + "'", str2, "Hihi!hihi!hi!44444444444444444444444444444444444444");
    }

    @Test
    public void test6065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6065");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi" + "'", str2, "ih!ih!ihih!ih hi  hi!      hi!      hiih!ih!ihih!ihi");
    }

    @Test
    public void test6066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6066");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test6067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6067");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih                                   i!      hi  hi!      hi!!ih                                   ", "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6068");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!" + "'", str1, "hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!");
    }

    @Test
    public void test6069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6069");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!", 'a');
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6070");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      h                                                                  ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!  hihi!  hi!", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray9);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test6071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6071");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#########                                                                  h      !ih      !ih  ih      !ih  ########", "  Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6072");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("   hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6073");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #HI!!!!!I!ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6074");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!", "ih!ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6075");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("4444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444" + "'", str1, "4444444444");
    }

    @Test
    public void test6076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6076");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("Hi!!IH!I", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("hihi###########################################################################################                             ...!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6077");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################", "!     ..");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6078");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", (int) (byte) -1, "ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #HI!!!!!I!ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6079");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi  hi!      hi!i!      hi  hi Hi  Hi      Hi", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, " Hi!    ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hihi!hi!i!hihiHiHiHi" + "'", str5, "hihi!hi!i!hihiHiHiHi");
    }

    @Test
    public void test6080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6080");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "   #");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6081");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ah                          h                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ah                          h" + "'", str1, "ah                          h");
    }

    @Test
    public void test6082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6082");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi      Ih      !ihi  Hi...                                                                                                                                                                                                                                                                                                                                                     !", "                                                                                                             HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", (int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6083");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih", "                      hi#                                 HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                                IH                                       HI!      HI  HI!      HI!      HI                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6084");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", " #h  #hi      #hi      #", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6085");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("    hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    HI# HI!       HI# HI!       HI#" + "'", str1, "    HI# HI!       HI# HI!       HI#");
    }

    @Test
    public void test6086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6086");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6087");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("H                                                                                                     HI                                                ", "    I!    aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6088");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  hi                                                ", 'a', 343);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6089");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi" + "'", str3, "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi");
    }

    @Test
    public void test6091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6091");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("       HI", "     ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + ".." + "'", str2, "..");
    }

    @Test
    public void test6092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6092");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!hi!!ih!ih!", "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6093");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   !!!!!!  !!   !!!!!!   ", " h                        ...                                                                                                 ...                                        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6094");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                    ", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                        " + "'", str2, "                                                                                                                        ");
    }

    @Test
    public void test6095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi", "!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi" + "'", str2, "hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test6096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6096");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("i!      hi                               ", "444444444444444444444444444444444H", 343, 21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "i!      hi           444444444444444444444444444444444H" + "'", str4, "i!      hi           444444444444444444444444444444444H");
    }

    @Test
    public void test6097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6097");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi     ###########################################################################################", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi     " + "'", str2, "Hi     ");
    }

    @Test
    public void test6098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!" + "'", str2, "Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!I!Hi!");
    }

    @Test
    public void test6099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6099");
        char[] charArray4 = new char[] {};
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsNone("", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsOnly("hi!      hi  hi!      hi!      hi", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", charArray4);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6100");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", " Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str3, "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test6101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!ih                       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaa" + "'", str2, "aaa");
    }

    @Test
    public void test6102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6102");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("...aaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6103");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("####################################################################################################");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "..    I       HI..    I!");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####################################################################################################" + "'", str3, "####################################################################################################");
    }

    @Test
    public void test6104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6104");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         ", "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test6105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6105");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#", "i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", 11);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6106");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hIH      !IH      !IH  IH      !IH  IH      !IH          I!    aaaaaaaaaaaaaaaaaaaaaaaa", "i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hIH      !IH      !IH  IH      !IH  IH      !IH          I!    aaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "hIH      !IH      !IH  IH      !IH  IH      !IH          I!    aaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test6107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6107");
        int int1 = org.apache.commons.lang3.StringUtils.length("  hi!      hi  hi!      hi!      h                                                                  ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test6108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6108");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("      hi        Hi!!ih...", "44444444444444444hi!Hi!!IH!IH!#########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6109");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#" + "'", str1, "     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
    }

    @Test
    public void test6110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6110");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!!ih!ih!", "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6111");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih..." + "'", str2, "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
    }

    @Test
    public void test6112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6112");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "i     ###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6113");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hihi!hihi!hi!44444444444444444444444444444444444444", "a                                                    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6114");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih...", "ahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6115");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi", "  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi" + "'", str2, "hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi");
    }

    @Test
    public void test6116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("44444444444444444hi!Hi!!IH!IH!#########", "H   H       H    hi!      hi  hi!Ih      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444hi!Hi!!IH!IH!#########" + "'", str2, "44444444444444444hi!Hi!!IH!IH!#########");
    }

    @Test
    public void test6117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6117");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray4);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6118");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Haia###########################################################################################", '4');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Haia###########################################################################################" + "'", str3, "Haia###########################################################################################");
    }

    @Test
    public void test6119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6119");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" Hi!");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test6120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6120");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                                                                                                                                                ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6121");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!i!ih      !ih  ih      !ih             ", "    !iH   ");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("", strArray8);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", strArray3, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test6122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6122");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("  hi!                           ", "H ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6123");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "..." + "'", str1, "...");
    }

    @Test
    public void test6124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6124");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!      hi  hi!      hi!      hi", "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6125");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("   !iH    ", '#', 4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6126");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("4444444444444444444   ", 119, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6127");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  HI!     ");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!      hi  hi!      hi!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 25 + "'", int3 == 25);
    }

    @Test
    public void test6128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6128");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6129");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("                                   ", "hI  444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH", 55);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6130");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("  hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6131");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##hi!####", "       Hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#', 242, 4);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6132");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("       hi#", "ahi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6133");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("                                                                    hi!     ", 368, 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6134");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("                                            hi!                                            ", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6135");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("i!      hi  hi!      hi!      hi                               ", charArray3);
        boolean boolean5 = org.apache.commons.lang3.StringUtils.containsAny("hi!ihi!ihi!ihi!ihi!", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("!ih                                                                                                                                                                                                                                                                                                                                                                                                                                                       ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6136");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!      hi  hi!      hi!...iH  iH", "HI!!IH!IH", " Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6137");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444", "  HI  HI!      HI!I!      HI  HI hI  hI      hI     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6138");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("                        HI#                         ", 'a');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!       hi!      hi  hi!           hi!       hi!      hi  hi!           hi!       hi!      hi  hi!           ", 0, 170);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6139");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6140");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH", 201, "                                                                                                                     ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH" + "'", str3, "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH");
    }

    @Test
    public void test6141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6141");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("iH      iH      iH  iH ", "hhhHI!HIHI!HI!hhhhhhhhhhhh", "444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test6142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6142");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6143");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!hi!!ih!ih           ", 22);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           " + "'", str2, "hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           hi!hi!!ih!ih           ");
    }

    @Test
    public void test6144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6144");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("   !!!!!!  !!   !!!!!!   ", "  Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6145");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hihi!hihi!hi!", '4', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hihi!hihi!hi!" + "'", str3, "Hihi!hihi!hi!");
    }

    @Test
    public void test6146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6146");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("hi#", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsNone("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6147");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                               Hi!                                         ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                               Hi!                                         " + "'", str2, "                                               Hi!                                         ");
    }

    @Test
    public void test6148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6148");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ah                          h                       ", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", 13);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6149");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("                                                                                                                     ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6150");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("H   H       H    hi!      hi  hi!Ih      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "H   H       H    hi!      hi  hi!Ih      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh    " + "'", str1, "H   H       H    hi!      hi  hi!Ih      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh      !ih      !ih  iIh    ");
    }

    @Test
    public void test6151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6151");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", 94);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi" + "'", str2, "hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test6152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6152");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Hi!!IH!IH!                                                                                       ", 24, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!                                                                                       " + "'", str3, "Hi!!IH!IH!                                                                                       ");
    }

    @Test
    public void test6153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6153");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hi! hi hi! hi!", "!Hi!H...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6154");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase(" Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!", "  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6156");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!", "!ih      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Hi!!IH!I!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "hI", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6158");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HIa!hi!Hi!!IH!IH!                                                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HIa!hi!Hi!!IH!IH!                                                                               " + "'", str1, "HIa!hi!Hi!!IH!IH!                                                                               ");
    }

    @Test
    public void test6159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6159");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Haia###########################################################################################", "   ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6160");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaih", "hihi###########################################################################################                             ...!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6161");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6162");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("", "                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6163");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi!hi!!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!!ih!ih" + "'", str1, "hi!hi!!ih!ih");
    }

    @Test
    public void test6164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6164");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("          ", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6165");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi!                                                                                                                   ", 295, "########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!                                                                                                                   ########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                                       #######" + "'", str3, "  hi!                                                                                                                   ########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                                       #######");
    }

    @Test
    public void test6166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6166");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6167");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hi###########################################################################################                             ...", "H   H       H     ih            hi   ih        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6168");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi!hi! !..   hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "I!HIHI!HI!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6169");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" hi  hi!      hi!      h", "  hi                                                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6170");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH ", "   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444", "!ih                                   i!      hi  hi!      hi!!ih                                   ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test6171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6171");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!i!ih      !ih  ih      !ih             ", 440);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6172");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!hhi!hihi!hi!hhi!hi!!ih!ih" + "'", str1, "hi!hihi!hi!hhi!hihi!hi!hhi!hi!!ih!ih");
    }

    @Test
    public void test6173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6173");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "Hihi!hihi!hi!44444444444444444444444444444444444444", 966);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH" + "'", str4, "!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH");
    }

    @Test
    public void test6174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6174");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6175");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("##################################    Hi##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6176");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!    i!");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("", '#');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hI!     ", strArray2, strArray5);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hI!     " + "'", str6, "hI!     ");
    }

    @Test
    public void test6177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi.." + "'", str1, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi..");
    }

    @Test
    public void test6178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6178");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                            hi!     ", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6179");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("                                          IH                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6180");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("", "ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6181");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase(" H       ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6182");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf(" i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!                             ", "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6183");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", "!ih                                                                                                 !ih");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi" + "'", str4, "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test6184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6184");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("                                                                                              !IH   ", 117);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                              !IH   " + "'", str2, "                                                                                              !IH   ");
    }

    @Test
    public void test6185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6185");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize(" hi ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi " + "'", str1, " hi ");
    }

    @Test
    public void test6186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6186");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", "       hi!      hi  hi!           ", 17);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa                                              ", strArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                 ", strArray5);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, 'a', 88, 6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test6187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6187");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   Hi!    ", "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", 120);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("#######################################...", strArray8);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray2, strArray8);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        java.lang.Class<?> wildcardClass12 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6188");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!ih      ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6189");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("", "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi      !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6190");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray7);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsAny("Hi###########################################################################################                             ...", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly(" !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", charArray7);
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
    public void test6191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6191");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Hi!!IH!I", "hi!      hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6192");
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" Hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("hi!Hi!!IH!IH!", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("!IH                                   I!      HI  HI!      HI!!IH                                   ", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      hi!...iH  iH", charArray10);
        int int19 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", charArray10);
        org.junit.Assert.assertNotNull(charArray10);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray10), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray10), "[4]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    }

    @Test
    public void test6193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6193");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!!IH!IH       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!IH       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#" + "'", str1, "Hi!!IH!IH       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
    }

    @Test
    public void test6194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6194");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H                                                                                                       ", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6195");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!I" + "'", str1, "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!I");
    }

    @Test
    public void test6196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6196");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("               !ih!ihih!ih                ", "!ih                       !ihaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6197");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6198");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6199");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hIH      !IH      !IH  IH      !IH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", 10);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test6200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6200");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "  Hi     ###########################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6201");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd(" hi  hi...hi#!hi#!h hi  hi!      hi!", "Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi...hi#!hi#!h hi  hi!      hi!" + "'", str2, " hi  hi...hi#!hi#!h hi  hi!      hi!");
    }

    @Test
    public void test6202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6202");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("#########                                                                  h      !ih      !ih  ih      !ih  ########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#########                                                                  h      !ih      !ih  ih      !ih  ########" + "'", str1, "#########                                                                  h      !ih      !ih  ih      !ih  ########");
    }

    @Test
    public void test6203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6203");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("!ih!ihih!ih", 452);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6204");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase(" hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ", "a!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6205");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("##################################  hi!      hi  hi!      hi!#################################", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6206");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("      HI                                                                                      hI!           HI                                                                                      ", "a!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6207");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444", "                                                                                                    ");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "##########################################################################################################################################################################HI###########################################################################################################################################################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test6208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6208");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                        HI#", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6209");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  ", 93, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "#############################################  ##############################################" + "'", str3, "#############################################  ##############################################");
    }

    @Test
    public void test6210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6210");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  !i", 8, 27);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6211");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444        ", "                                                          ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh" + "'", str3, "hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh");
    }

    @Test
    public void test6212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6212");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("ih      !ih      !ih  ih      !ih  aaaa", "aaaa...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !ih      !ih  ih      !ih  aaaa" + "'", str2, "ih      !ih      !ih  ih      !ih  aaaa");
    }

    @Test
    public void test6213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ", 93);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                             " + "'", str2, "                                                                                             ");
    }

    @Test
    public void test6214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6214");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 161 + "'", int2 == 161);
    }

    @Test
    public void test6215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6215");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("############AH                          H############", "...     HI#                        ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6216");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!      hi  hi!      hi", "  HI!     ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6217");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("   hi!    ", " hi  hi!      hi!      hi", 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!!IH!IH!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6218");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("hi!", 428);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test6219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6219");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ", '#', 20);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6220");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("h      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6221");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("HI#HI#HI#HI#HI#aaaaaaaaaaaaaaaaahi!Hi!!IH!IH!#########", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6222");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("H                          h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6223");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!IH      !");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6224");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                                               hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                               ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6225");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 295, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6226");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("Hi!!IH!IH!", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6227");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("A!444444444444444444444444444444444444444444444444", 151, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "A!444444444444444444444444444444444444444444444444                                                                                                     " + "'", str3, "A!444444444444444444444444444444444444444444444444                                                                                                     ");
    }

    @Test
    public void test6228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6228");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", 'a', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6229");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("########  hi!      hi  hi!      hi!      h                                                                  #########", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("44444444444444444hi!Hi!!IH!IH!#########", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test6230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6230");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hhi!hihi!hi!" + "'", str1, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hhi!hihi!hi!");
    }

    @Test
    public void test6231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6231");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  hi", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6232");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#" + "'", str1, "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#");
    }

    @Test
    public void test6233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6233");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("H                          h", "   !!!!!!  !!   !!!!!!   ", "hi!      hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "H                          h" + "'", str3, "H                          h");
    }

    @Test
    public void test6234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6234");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  " + "'", str2, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test6235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" ih     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ih     " + "'", str2, " ih     ");
    }

    @Test
    public void test6236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6236");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!a");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6237");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("  H   H       H       H ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("ih!ih!ihih!ih", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6238");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("  HI!     ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6239");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" hi  hi!      hi!      h", "##################################    Hi##################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6240");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hI!", "     ..", "hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi", 42);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hI!" + "'", str4, "hI!");
    }

    @Test
    public void test6241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6241");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!    ", 98, "                     hi                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!    " + "'", str3, "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!    ");
    }

    @Test
    public void test6242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!ih!ih", "H   H       H    hi!      hi  hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih!ih" + "'", str2, "!ih!ih");
    }

    @Test
    public void test6243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6243");
        char[] charArray2 = new char[] {};
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", charArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsOnly("i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("               ih      ", 11);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ..." + "'", str2, "        ...");
    }

    @Test
    public void test6245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6245");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("ah                          h", " hi  hi!      hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6246");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi" + "'", str2, "  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi");
    }

    @Test
    public void test6247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6247");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!!IH!IH", 966, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!!IH!IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIH" + "'", str3, "HI!!IH!IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIIHIHIHIHIHIHIHIHIHIHIHIHIH");
    }

    @Test
    public void test6248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6248");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("#############################################  ##############################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################  ##############################################" + "'", str1, "#############################################  ##############################################");
    }

    @Test
    public void test6249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6249");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "       hi444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str2, "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6250");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi! hi hi!", "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("  H   H       H       H         ", 69, 96);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6252");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "4444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6253");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                                                     ", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!");
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("ii...hiiiii", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test6254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6255");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!       hi!      hi  hi!           ", "       HI!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6256");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444" + "'", str1, "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6257");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH", 2, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH" + "'", str3, "  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH");
    }

    @Test
    public void test6258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6258");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6259");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("       HI!", 0, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       HI!" + "'", str3, "       HI!");
    }

    @Test
    public void test6260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6260");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6261");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6262");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6263");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("                                                                                      ", "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6264");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a", 254, 428);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a" + "'", str3, "...4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a");
    }

    @Test
    public void test6265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6265");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6266");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("..    I       HI..    I!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6268");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         " + "'", str1, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ");
    }

    @Test
    public void test6269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6269");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!44444444444444444444", 472);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str4, "Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test6270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6270");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#", ' ');
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6271");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi!      hi", 'a');
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("                        HI#                        ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6272");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("  H   H       H       H         ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6273");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################", "hi!hi!hihi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################" + "'", str2, "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih#################################################################################################");
    }

    @Test
    public void test6274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6274");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("H                          h");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6275");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!!IH!IH!", strArray4, strArray7);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray4);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("", "hi!", (int) (short) 100);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly(" ih      ", strArray4, strArray13);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray13, "!IH      !");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi#!!IH!IH!" + "'", str8, "hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Hi!" + "'", str9, "Hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + " ih      " + "'", str14, " ih      ");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test6276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6276");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("...aaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6277");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", 17);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi" + "'", str2, "!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test6278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6278");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i!      hi  hi!      hi!i!      hi  hi Hi  Hi      Hi      Hii!      hi  hi!      hi!i!      hi  hi!", "                        hi#                         ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6279");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i", "h   h       h    hi!      hi  hi!      hi!      hh   h       h       hh   h       h  h   h       h", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i" + "'", str4, "  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i  !i");
    }

    @Test
    public void test6280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6280");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("#HIa!hi!Hi!!IH!IH!##", charArray6);
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
    public void test6281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6281");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                                        ih!ih!ihih!ih", "...  ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6282");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" hi!", "  hi#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hI...", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hI..." + "'", str2, "  hI...");
    }

    @Test
    public void test6284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6284");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) " hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6285");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("########hi!hihi!hi!h#########", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6286");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("i!hi", " hi!      hi  hi!      hi!      h                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6287");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!", (int) 'a', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!                                                                " + "'", str3, "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!                                                                ");
    }

    @Test
    public void test6288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6288");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("                                                    ih!ih!ihih!ih                                                    ", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################", 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6289");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " Hi  Hi      Hi      Hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("                        HI#                         ", "Hi  Hi...", 3);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEach("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ", strArray7, strArray11);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "!iH");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         " + "'", str12, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ");
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test6290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6290");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("                                             Hi!                                             ", "       hi!      hi  hi!      hi!       ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                             Hi!                                             " + "'", str2, "                                             Hi!                                             ");
    }

    @Test
    public void test6291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6291");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6292");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi  hi!      hi!" + "'", str1, "hi  hi!      hi!");
    }

    @Test
    public void test6293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                    ", "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", 435);
        java.lang.Class<?> wildcardClass4 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test6294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6294");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI", "hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI" + "'", str2, "HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI");
    }

    @Test
    public void test6295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6295");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih" + "'", str1, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih");
    }

    @Test
    public void test6296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6296");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Hi  Hi...", (int) (short) 100, (int) (short) 100);
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!ih                                                                                                 ", "                        HI#                         ", 0);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", strArray4, strArray12);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str13, "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test6297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6297");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd(" hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ", "################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       " + "'", str2, " hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test6298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6298");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!!!!!I!Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  Hi...Hi  H", "hIH      !IH      !IH  IH      !IH  IH      !IH          I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6299");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, " Hi  Hi      Hi      Hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                        ##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Hi!" + "'", str5, "Hi!");
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6300");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "      hi        Hi!!ih...", 0);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", 442, 20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6301");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "Ih      !ihi  Hi...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6302");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hI!     ", "iH      iH      iH  iH ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 3 + "'", int2 == 3);
    }

    @Test
    public void test6303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6303");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!      h                                                                 ", "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ", 99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6304");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI  hI      hI      hI", "");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6305");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("!Ih", "...HI#!HI#!HI#!HI#!HI#!H...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6306");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("i!      hi           444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!      hi           444444444444444444444444444444444H" + "'", str1, "i!      hi           444444444444444444444444444444444H");
    }

    @Test
    public void test6307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6307");
        char[] charArray7 = new char[] { 'a', '4', '#', 'a' };
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hihi!hi!", charArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   #", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsAny("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                         ", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "a4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "a4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[a, 4, #, a]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6308");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#" + "'", str1, "  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#");
    }

    @Test
    public void test6309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6309");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("Haia###########################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HAIA###########################################################################################" + "'", str1, "HAIA###########################################################################################");
    }

    @Test
    public void test6310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6310");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("Hi!!IH!I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!!IH!I" + "'", str1, "Hi!!IH!I");
    }

    @Test
    public void test6311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6311");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H                                                                                                       ", "444444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6312");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("!     ..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!     .." + "'", str1, "!     ..");
    }

    @Test
    public void test6313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6313");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!hihi!hi!hhi!hihi!hi!hhi!hi!!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6314");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!" + "'", str1, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
    }

    @Test
    public void test6315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6315");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                        HI#", "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6316");
        char[] charArray6 = new char[] { 'a', '4', '#', 'a' };
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hihi!hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("#######", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "a4#a");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "a4#a");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[a, 4, #, a]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6317");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        HI#                        ", " Hi  Hi      Hi      Hi", (int) (short) 10);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray4, "hi!hihi!hi!                                                                                                             ");
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray6);
        java.lang.Class<?> wildcardClass8 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6318");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6319");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ", "  hi!     HI!", 419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6320");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  ", "ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray3, strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str7, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test6321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6321");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("hi!ihi!ihi!ihi!ihi!              hi#                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6322");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("4444444444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!                           ");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444" + "'", str3, "4444444444");
    }

    @Test
    public void test6323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6323");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6324");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("!      hi!444 hi!444444 hi!444444 hi!44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6325");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("i!hihi!hi!hi", " HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6326");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test6327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6327");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "      HI       HI       HI       HI       HI       HI       HI       HI ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6328");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("       hI!########################################", "        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6329");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...", 121, "hi! hi hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str3, "hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test6330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6330");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("                                                                        ##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", (-1));
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                        ##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################" + "'", str2, "                                                                        ##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################");
    }

    @Test
    public void test6331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6331");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#                        ", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                          #                        " + "'", str2, "                                                                          #                        ");
    }

    @Test
    public void test6332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6332");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("ih!ih!ihih!ih", "                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("h      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", "  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi#       #hi###  #hi#!#      #hi#  #hi#!#      #hi#!#      #hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6334");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  hi!    ", "..    I!    aaaaaaa...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6335");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test6336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6336");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("444444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444...", 196);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6337");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hi!hihi!h", "       hi#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hihi!" + "'", str2, "!hihi!");
    }

    @Test
    public void test6338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6338");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hi#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6339");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("  Hi     ", "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "...HI#!HI#!HI#!HI#!HI#!H...", 273);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  Hi     " + "'", str4, "  Hi     ");
    }

    @Test
    public void test6340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6340");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("    !ih   ", "hi!######hi##hi!######hi!######hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    !ih   " + "'", str2, "    !ih   ");
    }

    @Test
    public void test6341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6341");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  HI!      HI  HI!      HI!      H                                                                  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ', 414, 99);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  " + "'", str3, "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test6342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6342");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "  hi  ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6343");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi", (int) ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi" + "'", str3, "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi");
    }

    @Test
    public void test6344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6344");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "h444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }

    @Test
    public void test6345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6345");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("      HI                                                                                        ", "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6346");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!hihi!", ' ', 368);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6347");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("HI!", 'a');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test6348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6348");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("44444444444444444444444444444444444444444444444hia!4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444hia!4" + "'", str1, "44444444444444444444444444444444444444444444444hia!4");
    }

    @Test
    public void test6349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6349");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6350");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("... ... h", "Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6351");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("                                                                          #                        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        #                                                                          " + "'", str1, "                        #                                                                          ");
    }

    @Test
    public void test6352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6352");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("  HI                                          ...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI                                          ..." + "'", str2, "  HI                                          ...");
    }

    @Test
    public void test6353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6353");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("ah                          h                       ", "!44444444444444444444444444444444444hi!Hi!!IH!IHa444444444444444444444444444444444444444444444444HI", "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test6354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6354");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("h   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6355");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi", "       !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444", 25);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6356");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi" + "'", str2, "HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test6357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6357");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "                                                                                        i!hihi!hi!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", "444444hi#!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6359");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("  hi!      hi  hi!      hi!      h", charArray4);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("                                                          ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6360");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("       Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!      h       Hi!      hi         Hi!             Hi!", "               !ih!ihih!ih                ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6361");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("!IH!IH!I#!I#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", "    I!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6362");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44  hiHihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6363");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     4444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     4444444444444444444" + "'", str1, "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     4444444444444444444");
    }

    @Test
    public void test6364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6364");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#h", 91, "aaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test6365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6365");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("######                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6366");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("##################################    Hi##################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6367");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI", "!IH                                   I!      HI  HI!      HI!!IH                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6368");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny(" hi  hi!      hi!", "...     !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6369");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444444444444H", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444444444444444444444444444H" + "'", str2, "444444444444444444444444444444444H");
    }

    @Test
    public void test6370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6370");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi      !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6371");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I!      hi  hi!      hi!      hi", "HI!!IH!IH");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 101, 0);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("           hi", "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test6373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6373");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6374");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("hi#!!IH!IH!", "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!" + "'", str2, "hi#!!IH!IH!");
    }

    @Test
    public void test6375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6375");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "ih!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6376");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("i!      hi  hi!      hi!      hi", "!IH       ", " Hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test6377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6377");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("   hi!    i", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i" + "'", str2, "hi!i");
    }

    @Test
    public void test6378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6378");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("HI!!IH!IH", "H ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6379");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", " i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test6380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6380");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                          ih                                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                          ih                                               " + "'", str1, "                                          ih                                               ");
    }

    @Test
    public void test6381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6381");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("     hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("  H   H       H       H ", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("  hi     ###########################################################################################", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6382");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("i!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, "H!IH!IH!IH");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!" + "'", str3, "i!");
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test6383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6383");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("#########                                            hi!    !ih  ########444444hi#!444444hi#!444444h", 434);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#########                                            hi!    !ih  ########444444hi#!444444hi#!444444h                                                                                                                                                                                                                                                                                                                                              " + "'", str2, "#########                                            hi!    !ih  ########444444hi#!444444hi#!444444h                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test6384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6384");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6385");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##################################  hi!      hi  hi!      hi!#################################", "       hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 8);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6386");
        char[] charArray9 = new char[] {};
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray9);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray9);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray9);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray9);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray9);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      h                                                                  ", charArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!  hihi!  hi!", charArray9);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsNone("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHI", charArray9);
        boolean boolean18 = org.apache.commons.lang3.StringUtils.containsOnly("                        HI#                         ", charArray9);
        org.junit.Assert.assertNotNull(charArray9);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6387");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("       hI!", "                                          ih                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Hi     ###########################################################################################", 422, 201);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6389");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44  hiHihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44  hiHihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44" + "'", str1, "Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44  hiHihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44");
    }

    @Test
    public void test6390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6390");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444" + "'", str1, "444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444");
    }

    @Test
    public void test6391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6391");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    i!    ", "Hi     ###########################################################################################", 27);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "    i!    " + "'", str5, "    i!    ");
    }

    @Test
    public void test6392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6392");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("", "a!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6393");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6394");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("HI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6395");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("  HI                                          ...", 88, "H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HHHHHHHHHHHHHHHHHHH  HI                                          ...HHHHHHHHHHHHHHHHHHHH" + "'", str3, "HHHHHHHHHHHHHHHHHHH  HI                                          ...HHHHHHHHHHHHHHHHHHHH");
    }

    @Test
    public void test6396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6396");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!IAAAAA...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IAAAAA.." + "'", str1, "!IAAAAA..");
    }

    @Test
    public void test6397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6397");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("hI  444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6398");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!      hi  hi!      hi!", 96, (int) ' ');
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  ");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444hiIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444" + "'", str9, "444444444444444444444444444444444444444444444444hiIH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  !44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test6399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6399");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!", "Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6400");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6401");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!", "H   H       H    hi!      hi  hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", (int) (byte) 0, 242);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6403");
        char[] charArray3 = new char[] {};
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                                                                                                                                                                                                                                                                                                                              ", charArray3);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ", charArray3);
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6404");
        int int1 = org.apache.commons.lang3.StringUtils.length("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 152 + "'", int1 == 152);
    }

    @Test
    public void test6405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6405");
        int int1 = org.apache.commons.lang3.StringUtils.length("       hI!########################################");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 50 + "'", int1 == 50);
    }

    @Test
    public void test6406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6406");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6407");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("    i!    ", "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    i!    " + "'", str2, "    i!    ");
    }

    @Test
    public void test6408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "  hi!      hi  hi!      hi!...iH  iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6409");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444                                                          hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444                                                          hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               " + "'", str1, "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444                                                          hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
    }

    @Test
    public void test6410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6410");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("44444", "!ih                                                                                  ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6411");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!" + "'", str1, "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!");
    }

    @Test
    public void test6412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6412");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("hi!      hi  hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6413");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih                                                                                                 ", "hI!!ih!ih", (int) '4');
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6414");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#  ", "                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#" + "'", str2, "#");
    }

    @Test
    public void test6415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6415");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("I!!#IH####", "I!!#IH####");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6416");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                            hi!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6417");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("####hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6418");
        int int1 = org.apache.commons.lang3.StringUtils.length("..    I       HI..    I!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 24 + "'", int1 == 24);
    }

    @Test
    public void test6419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6419");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6420");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  hi!      hi  hi!      hi!", "!hihi!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6421");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("", "h#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#hh#h#h#haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6422");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!ih      !ih  ih      !ih         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6423");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!ih                                                                                                 !ih", " Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6424");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI", "!IH                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#" + "'", str2, "hI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#");
    }

    @Test
    public void test6425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6425");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("  HI  HI!      HI!I!      HI  HI hI  hI      hI     ", 13, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  HI  HI!      HI!I!      HI  HI hI  hI      hI     " + "'", str3, "  HI  HI!      HI!I!      HI  HI hI  hI      hI     ");
    }

    @Test
    public void test6426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6426");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center(" i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!", 216, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test6427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6427");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ih!ih!ihih!ih", "hi!hi!!ih!ih!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "Ih######!ih######!ih##i", 20, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6428");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!     " + "'", str1, "  hi!     ");
    }

    @Test
    public void test6429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6429");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(" HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test6430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6430");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "...                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6431");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("!      hi!444 hi!444444 hi!444444 hi!44", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6432");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", 216, "hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!" + "'", str3, "hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hIhih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!hI!");
    }

    @Test
    public void test6433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6433");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!i!!!!", "             hi!      hi  hi!      hi!i!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih!hi!hi!!#ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 91 + "'", int2 == 91);
    }

    @Test
    public void test6434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6434");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...aaaaaaaaaaaaaaaaaaaaaaaa", "       hi!      hi  hi!      hi!       ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6435");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hhhhhhhh", "  hi!                                  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6436");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ", "                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", "HIa!hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      " + "'", str3, "      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test6437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6437");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 254, "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#" + "'", str3, "HiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!hihi!hi!hiHiHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#");
    }

    @Test
    public void test6438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6438");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("i!      hi  hi!      hi!      hi                               ", "##################################    Hi##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!      hi  hi!      hi!      h" + "'", str2, "!      hi  hi!      hi!      h");
    }

    @Test
    public void test6439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6439");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("##hi!####", "       Hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', 440, 22);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test6440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6440");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("", 17, 119);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test6441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6441");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("!ih                                                                                                 !ih                                                                                                 ", "                                                                                                                                                                                                                                                                                                                                                              ", 966, 442);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih                                                                                                 !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                               " + "'", str4, "!ih                                                                                                 !ih                                                                                                                                                                                                                                                                                                                                                                                                                                                               ");
    }

    @Test
    public void test6442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6442");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!" + "'", str2, "Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!  hiHihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!Hihi!hihi!hi!");
    }

    @Test
    public void test6443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6443");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("...    !ih      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...    !ih      !" + "'", str1, "...    !ih      !");
    }

    @Test
    public void test6444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6444");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ", "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", "444444hi#!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH444H4444444H4444444HH444H4444444H4444444HH444H4444444H4444444HH444H4444444H44H444H4444444H4444444H4" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH444H4444444H4444444HH444H4444444H4444444HH444H4444444H4444444HH444H4444444H44H444H4444444H4444444H4");
    }

    @Test
    public void test6445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6445");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!" + "'", str1, "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test6446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6446");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                    ih!ih!ihih!ih                                                    ", 157);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6447");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hihi!hi!i!hihiHiHiHi", 'a', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test6448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6448");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6449");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi", "!IAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6450");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi! hi hi!", "                                                                                                                     ...", "...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!.hi.hi!" + "'", str3, "hi!.hi.hi!");
    }

    @Test
    public void test6451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6451");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI", "ah                          h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI" + "'", str2, "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test6452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6452");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("######Ih", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6453");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     ", "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", "hi!                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!!!!!! hi!!#hi!!!!!!!hi!!!!!! hi!iI !!!!!" + "'", str3, "...!!!!!!!!!!!!!!!!!!!!!!!!!!!!!Hh!!Hh...!! hi!!!!!! hi!!hi!!!!!! hi!!#hi!!!!!!!hi!!!!!! hi!iI !!!!!");
    }

    @Test
    public void test6454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6454");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi" + "'", str1, "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
    }

    @Test
    public void test6455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6455");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("                                                                           HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########                                                   ", "!ih                                                                                                 !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test6456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6456");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                        ih!ih!ihih!ih", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                        ih!ih!ihih!ih" + "'", str2, "                                        ih!ih!ihih!ih");
    }

    @Test
    public void test6457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6457");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!                                                                                                                                                                                                                                                                                                                                                                                                                                         ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6458");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("######           ", "i!      hi           444444444444444444444444444444444H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6459");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "hi!hi!!ih!ih           ", 50);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test6460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6460");
        char[] charArray5 = new char[] {};
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("       HI", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("iHi...", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6461");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi" + "'", str2, "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test6462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6462");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!      hi                               ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi                               " + "'", str2, "i!      hi                               ");
    }

    @Test
    public void test6463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6463");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      hi!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                                                        ", charArray6);
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
    public void test6464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6464");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("4444444hia!4444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444hia!4444444444444" + "'", str1, "4444444hia!4444444444444");
    }

    @Test
    public void test6465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("iHiHiHiH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "iHiHiHi" + "'", str1, "iHiHiHi");
    }

    @Test
    public void test6466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6466");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih", "      HI                                                                                        ");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test6467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6467");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hhhHI!HIHI!HI!hhhhhhhhhhhh");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test6468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6468");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("   hi#!Hi!H  hi#!Hi!i  hi#!Hi!!", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test6469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6469");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("hi!      hi  hi!      hi!      hi", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("         ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("  hi                                                ", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("I", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("hi!  hihi!  hi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test6470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("hi!hihi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!h" + "'", str1, "hi!hihi!h");
    }

    @Test
    public void test6471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6471");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "    I!    aaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6472");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("!ih      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH      " + "'", str1, "!IH      ");
    }

    @Test
    public void test6473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6473");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "hi!a");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test6474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6474");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("  hi!      hi  h  Hi       hi!      hi  hi", "  Hi     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
    }

    @Test
    public void test6475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6475");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", "hi!hihi!hi!                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH" + "'", str2, "IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH");
    }

    @Test
    public void test6476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6476");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test6477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6477");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test6478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6478");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("                                          IH                                               ", (int) (byte) 0, "!h...#!hi#!hi#!hi#!hi#...hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                          IH                                               " + "'", str3, "                                          IH                                               ");
    }

    @Test
    public void test6479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6479");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", "a");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6480");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hihi###########################################################################################                             ...!", 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hihi###########################################################################################                             ...!" + "'", str2, "hihi###########################################################################################                             ...!");
    }

    @Test
    public void test6481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("Ahh", 34, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "###############################Ahh" + "'", str3, "###############################Ahh");
    }

    @Test
    public void test6482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6482");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("                hI  hI...HI#!HI#!HI#!HI#!HI#!H...", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test6483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6483");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H!IH!IH!IH!", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6484");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!", "                                 !44444444444444444444444444444444444hi!Hi!!IH!  Hi...                                  ", "", 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!" + "'", str4, "HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!");
    }

    @Test
    public void test6485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6485");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("   !!!!!!  !!   !!!!!!   ", "                                          IH                                               ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6486");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", " HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test6487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6487");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("ih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih#ihih!ih!ihih!ih", "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih    i!hihi!hi!hiHi  Hi...  !ih      !ih  ih      !ih  #ih       ih    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6488");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ", "h !                                                                                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test6489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6489");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', (int) '#', 0);
        int int9 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("h !", strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("    !ih   ", strArray4);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray14);
        int int17 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray14);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("hI  hI      hI      hI", strArray14);
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray14);
        java.lang.String[] strArray21 = org.apache.commons.lang3.StringUtils.stripAll(strArray14, "                     hi                   ");
        java.lang.String[] strArray22 = org.apache.commons.lang3.StringUtils.stripAll(strArray21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = org.apache.commons.lang3.StringUtils.replaceEach("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", strArray4, strArray21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 2 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(strArray22);
    }

    @Test
    public void test6490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6490");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("      hi        Hi!!ih...", '4');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("!ih!ih");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("  hi     ###########################################################################################", strArray3, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test6491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6491");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ", "                               h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test6492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6492");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("iHiHiHiH", "hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih", "#########                                            hi!    !ih  ########444444hi#!444444hi#!444444h                                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "iHiHiHiH" + "'", str3, "iHiHiHiH");
    }

    @Test
    public void test6493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("!ih                       !ih                      ", "     ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!ih                       !ih" + "'", str2, "!ih                       !ih");
    }

    @Test
    public void test6494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6494");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA" + "'", str1, "h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA    !i    h                          hA");
    }

    @Test
    public void test6495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6495");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", 295);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!" + "'", str2, "IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!");
    }

    @Test
    public void test6496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6496");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!HI!!IH!IH!", "H ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test6497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6497");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!", 101, "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4" + "'", str3, "444444444444444444444444444444444444444444444444hi#!44444444444444444444444444444444444hi!hi!!ih!ih!4");
    }

    @Test
    public void test6498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6498");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 135, "hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!      hi  hi!      hi!      hi        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!      hi         " + "'", str3, "hi!      hi  hi!      hi!      hi        aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!      hi  hi!      hi!      hi         ");
    }

    @Test
    public void test6499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6499");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("   hi!    ", " hi  hi!      hi!      hi", 1);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!Hi!!IH!IH!", strArray4);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, " Hi!");
        int int8 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test6500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test6500");
        java.lang.String[] strArray1 = null;
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", strArray1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }
}
