import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("i  Hi...", "                                                                                      ", 0);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "iHi..." + "'", str4, "iHi...");
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  ", "  hi!      hi  hi!   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("4hi4!4      4hi4  4hi4!4      4hi4!4      4hi", "hi!#", "hi!      hi  hi!      hi!      hi", (int) 'a');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "4hi4!4      4hi4  4hi4!4      4hi4!4      4hi" + "'", str4, "4hi4!4      4hi4  4hi4!4      4hi4!4      4hi");
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...hi#!hi#!hi#!hi#!hi#!h...", 196);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi#!hi#!hi#!hi#!hi#!h..." + "'", str2, "...hi#!hi#!hi#!hi#!hi#!h...");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!ih                       !ih                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih                       !ih                      " + "'", str1, "!ih                       !ih                      ");
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", (int) (byte) 10, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  " + "'", str3, "h      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi  hi!      hi!i!      hi  hi Hi  Hi      Hi", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("H   H       H       H", "#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H       H       H" + "'", str2, "H   H       H       H");
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI", 2, 151);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI     " + "'", str3, "      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI     ");
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str1, "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                                                                                                                                                                                                                                                                              ", "!                                                                                        i!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("    Hi!  H", "ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", 216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("##########################################################################################################################################################################hi###########################################################################################################################################################################");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("               HI#                        ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("                     hi                   ", strArray2, strArray4);
        java.lang.Class<?> wildcardClass6 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                     hi                   " + "'", str5, "                     hi                   ");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", "444 hi!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#" + "'", str2, "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", "    !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!" + "'", str2, "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!i", 350, 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i" + "'", str3, "!i");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("H ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                    ", "", 254);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", "ih!ih", "hi!hi! !..   hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#" + "'", str3, "       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi# hi!       hi#");
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i", "ih      !ih      !ih  ih      !ih  aaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i" + "'", str2, "i");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi  ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", "hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "##hi!#######hi##hi!#######hi##hi!#######hi##hi!#######hi#");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hI  hI      hI      hI", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                     hi                   ");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("    I!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi###########################################################################################                             ...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("##hi!#######hi##hi!#######hi##hi!#######hi##hi!#######hi#", "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString(" hi  ...", "    ...  ih  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  ..." + "'", str2, " hi  ...");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("#", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  HI!      HI  HI!      HI!      H                                                                  ");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH", 1, 216);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  " + "'", str3, "  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ");
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                                             ah                          h                                                                                                ", "hi!ihi!ihi!ihi!ihi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("        ########  hi!      hi  hi!      ...         ", "444444444444444444444444444444444H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ########  hi!      hi  hi!      ...         " + "'", str2, "        ########  hi!      hi  hi!      ...         ");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("  hi#!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("      ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444hi#!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "Hi!");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  !ih      !ih  ih      !ih  ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("   hi!    i!", " hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi!    i!" + "'", str2, "   hi!    i!");
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444hi#!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444hi#!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444hi#!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase(" Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       " + "'", str1, " hI#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444                                                                                                                                                                                                                                       ");
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        int int1 = org.apache.commons.lang3.StringUtils.length("                                          IH                                               ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 91 + "'", int1 == 91);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H                                                                                                       ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(" ih     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("    I!    aaaaaaaaaaaaaaaaaaaaaaaa", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull(" HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI" + "'", str1, "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("444444444444444444444444444444444444444444444444HI#!444444444444444444444444444444444444444444444444", "  hi!      hi  hi!   ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("...hi#!hi#!hi#!hi#!hi#!h...", "######");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi#!hi#!hi#!hi#!hi#!h..." + "'", str2, "...hi#!hi#!hi#!hi#!hi#!h...");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  hi!     ", "AhhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("#######");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("                                                                                        I!HIHI!HI!HI", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("#################################!ih      !ih  ih      !ih  ##################################", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("H                                                                                                   ", "i!      hi                               ", 216);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", "   Hi!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("                       Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########                                                                                                                                                                                                                                                                                                                              ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########" + "'", str1, "Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("hi###########################################################################################                             ...", "hi!                                                                                                 hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi###########################################################################################                             ..." + "'", str2, "hi###########################################################################################                             ...");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!44444444444444444444444444444444444hi!Hi!!IH!IHa444444444444444444444444444444444444444444444444HI", "", 422);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("      hi        Hi!!ih...", "hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i", "hI!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "      hI        HI!!Ih..." + "'", str3, "      hI        HI!!Ih...");
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("H   H       H    hi!      hi  hi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi!hi! !..   hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("!IAAAAA...", 4);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!IAAAAA..." + "'", str2, "!IAAAAA...");
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!  hihi!  hi!", ' ', 7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...", "   hi!    i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi..." + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...");
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H", 452, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihih");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih", "...                             ", "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHi!      hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      ", "  H   H       H       H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("44444", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaH   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("ih!ih!ihih!ih", "!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih!ih!ihih!ih" + "'", str2, "ih!ih!ihih!ih");
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HI!", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ", "!44444444444444444444444444444444444hi!Hi!!IH!IHa444444444444444444444444444444444444444444444444HI");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  " + "'", str3, "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!", 52, "  hi#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!" + "'", str3, "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH!");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih...", 434, "HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih...HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIH" + "'", str3, "!ih...HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIH");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains(" hi ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("H   hi!    i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h   hi!    i" + "'", str1, "h   hi!    i");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!      hi       hia  hi!      hi  hi!      hi!  ...iH  iH", "ih", 10);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", 93, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444" + "'", str3, "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("#########                                                                  h      !ih      !ih  ih      !ih  ########", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "###" + "'", str2, "###");
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#  hi#", 343, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hI", '4', 472);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ", 96, 24);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " H       " + "'", str3, " H       ");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     aaaaaaaaaaaaaaaaahi!Hi!!IH!IH!                                                       #########", "aahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahhi!aaaaaahiaahi!aaaaaahi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", "  hi!      hi  hi!      hi!", 55);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("ih      !ih      !ih  i", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !i!      hi  hi!      hi!      h                                                                           ", "                        HI", 295);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           ", 170);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, "                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", 242, 435);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 242");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("hi!ihi!ihi!ihi!ihi!              hi#                         ", "ah                          h                        ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihi!ihi!ihi!ihi!              hi#                         " + "'", str2, "hi!ihi!ihi!ihi!ihi!              hi#                         ");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("!iH", "h                                   i!      hi  hi!      hi!!ih                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("H                                                                                                   ", "hi!ihi!ihi!ihi!ihi!              hi#                         ", "#########hi!!ih########");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("##HI!####", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi", 101, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            " + "'", str3, "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi                                            ");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("i!ihi!ihi!ihi!ihi!              hi#                         ", "##########################################################################################################################################################################hi###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                     ", "i!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#" + "'", str1, "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#");
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("hi", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsOnly("...  ...", charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     ", "!       H Hi!    !       Hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace(" Hi  H");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("444444hi#!", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("..    I!    aaaaaaaaaaaaaaaaaaaaaaaa", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih", "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi! hi! hi! hi! hi! hi! hi! hi       !iH            !iH   a hi! hi! hi! hi! hi! hi! hi! hi!", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("444444444444444444444444444444444H");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444H" + "'", str1, "444444444444444444444444444444444H");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#" + "'", str1, " HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#");
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        char[] charArray8 = new char[] {};
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!!IH!IH!i#!", charArray8);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", charArray8);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsNone("##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsAny("                                            hi!     ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAny("                                                       h", charArray8);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hI  444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH", charArray8);
        org.junit.Assert.assertNotNull(charArray8);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray8), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray8), "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("4444444444444444444   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444" + "'", str1, "4444444444444444444");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", "                               hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("                    ", " !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    " + "'", str2, "                    ");
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("                                                                    hi!     ", "       hi!      hi  hi!           ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                                       h", "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!i!ih      !ih  ih      !ih             ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("ahhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!", "   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("    I!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("i!      hi                               ", 93, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444i!      hi                               " + "'", str3, "4444444444444444444444444444444444444444444444444444i!      hi                               ");
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ", 36, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  " + "'", str3, "Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                ", "", "hi", (int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                " + "'", str4, "                                                                                                ");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        char[] charArray4 = new char[] {};
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("hi#", charArray4);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i!hi", charArray4);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("hi!ihi!ihi!ihi!ihi!", charArray4);
        org.junit.Assert.assertNotNull(charArray4);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray4), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray4), "[]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaI!HIHI!HI!HIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi", "!ih                                                                                                 !ih");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!ih                                                                                                 ", "      hi ", (-1));
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("    !iH   ", "                          h                        ", (int) (byte) -1);
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "HI#", 1);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray14);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  hi!      hi  hi!      hi!      h", strArray10, strArray15);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("h !", strArray5, strArray15);
        java.lang.String[] strArray23 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        HI#                        ", "       hi#");
        boolean boolean24 = org.apache.commons.lang3.StringUtils.startsWithAny("   hi!    ", strArray23);
        java.lang.String[] strArray26 = org.apache.commons.lang3.StringUtils.split("hi!    i!");
        java.lang.String str27 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray23, strArray26);
        java.lang.String str31 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray26, "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ", 157, 3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str32 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("#ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ih#      #!#ih#  ###ih#       #ih#      #!#ih#      #!#ih#  #ih#      #!#ih#  ", strArray5, strArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str16, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str17, "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "h !" + "'", str18, "h !");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahi!aaaaaahiaahi!aaaaaahiaahi!aaaaaahhi!aaaaaahiaahi!aaaaaahi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("hi!######hi##hi!######hi!######hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("ahh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ahh" + "'", str1, "ahh");
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("a!444444444444444444444444444444444444444444444444", "... ... h", (int) (short) 100);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a', 242, 53);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     aaaaaaaaaaaaaaaaahi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!ih...HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIH", 60, "       !iH        444444444444444444444444444444444444444444444444    !iH   a 44444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih...HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIH" + "'", str3, "!ih...HIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!HIHI!HI!HIHIHI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIH");
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("  hi!      hi  hi!      hi!      h", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("a                                                   ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!  hihi!  hi!", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("##########################################################################################################################################################################Hi###########################################################################################################################################################################", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hI  hI      hI      hI", ' ');
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "!ih      !ih  ih      !ih  ");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "   hi!    ", (int) '4', 10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("!ih                                   i!      hi  hi!      hi!!ih", strArray3, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 15 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!    i!", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!           hi#!h         ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("  hi!                                                                                                                   ", "AH                          H                        ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("iHiHiHiH44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray5);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray5);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!hi! !..   hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", charArray5);
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
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("aaaa...", "444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 273 + "'", int2 == 273);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ", 'a');
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, 'a');
        int int6 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("! !IH IH !IH IH !IH !IH HI!IH HIHI! HI! !IH IH !IHH IH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               " + "'", str5, "                      HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...", "ah                          h", "########  hi!      hi  hi!      ...");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi..." + "'", str3, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("H                          h", "ihihihihihihihihihihihihihihihihihihihihihihihihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("!IH      !", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) '#', 0);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '4', (int) (short) 10, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #HI!!!!!I!ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("                               h", "  hi#!Hi!", "!IH                                   I!      HI  HI!      HI!!IH                                   ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                               h" + "'", str3, "                               h");
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("##########################################################################################################################################################################Hi###########################################################################################################################################################################", "hi!i", 23);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!i!ih      !ih  ih      !ih  ", " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################", 422);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     aaaaaaaaaaaaaaaaahi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#HI#HI#HI#HI#aaaaaaaaaaaaaaaaahi!Hi!!IH!IH!#########" + "'", str1, "HI#HI#HI#HI#HI#aaaaaaaaaaaaaaaaahi!Hi!!IH!IH!#########");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi!      hi  hi!      hi!      hi", " HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", (int) (short) 100, 22);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!      hi  hi!       HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str4, "hi!      hi  hi!       HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HIHI!      HI  HI!      HI!      HI HI  HI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("Ih      !ihi  Hi...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("      HI                                                                                        ", "h                                   i!      hi  hi!      hi!!ih                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "      HI                                                                                        " + "'", str2, "      HI                                                                                        ");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("#HIa!hi!Hi!!IH!IH!##", "HI                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#HIa!hi!Hi!!IH!IH!##" + "'", str2, "#HIa!hi!Hi!!IH!IH!##");
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly(" !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", "I#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH   ", "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih hI!     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "H                          h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("   hi!    i   hi!    i   hi!    i   hi!    i   hi! ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("   i!     444444444444444444444444444444444444444444444444i!a 444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444 a!i444444444444444444444444444444444444444444444444     !i   " + "'", str1, "444444444444444444444444444444444444444444444444 a!i444444444444444444444444444444444444444444444444     !i   ");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "!h...#!hi#!hi#!hi#!hi#...hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("                        #                        HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("4444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!ihi!ihi!ihi!ihi!", "!ih      !ih  ih      !ih         ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 3, 157);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi  hi!      hi!i!      hi  hi Hi  Hi      Hi", 24);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi  hi!      hi!i!   ..." + "'", str2, "hi  hi!      hi!i!   ...");
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!       HI!  HI!HI!HI!HI!HI!H!IHHI!HI!HI!HI!HI!HI   HI!       HI!  ", 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!     ...", "hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi", " hi  hi...hi#!hi#!hi#!hi#!hi#!h...", "  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi" + "'", str3, "hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444", 8, "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444" + "'", str3, "!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("", "hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi", "#######");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihi", "       HI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hihi###########################################################################################                             ...!", "                                                       ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!" + "'", str1, "HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!");
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 10, "hi!######hi##hi!######hi!######hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("aaaaaaaaaaaaaaaaaaaaaaaaaaaa   Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("!ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "   Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ", "!ih                                                                                                 !ih                                                                                                 ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#" + "'", str2, "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#");
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                        #                        HI", " hi!      hi  hi!      hi!      h                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("hI", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI" + "'", str2, "hI");
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str1, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("         ", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("                                                                                              !IH   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  4hi4!4      4hi4  4hi4!4      4hi4!4      4hi", 60, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      ", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("i#!!IH!IH!hi#!!IH!IH!hi#!!IH!");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hi!hi! !..   hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 428 + "'", int3 == 428);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi" + "'", str1, "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("    i!    ", "hi!a");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("       !iH        444444444444444444444444444444444444444444444444    !iH   a 44444444444444444444444444444444444444444444444");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       !iH        444444444444444444444444444444444444444444444444    !iH   a 44444444444444444444444444444444444444444444444" + "'", str1, "       !iH        444444444444444444444444444444444444444444444444    !iH   a 44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #HI!!!!!I!ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #i", "!ih", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 98 + "'", int3 == 98);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("  hi!      hi  hi!   ...", "hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!i!ih      !ih  ih      !ih             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "    H", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("!IH", "hi#!!IH!IH", 24);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("!44444444444444444444444444444444444hi!Hi!!IH!  Hi...", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!44444444444444444444444444444444444hi!Hi!!IH!  Hi..." + "'", str2, "!44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                   H", "H   hi!    i");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                   H" + "'", str3, "                                                                                                   H");
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        java.lang.String[] strArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("    H#", strArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi" + "'", str1, "HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("HI                                                  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI                                                  " + "'", str1, "hI                                                  ");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("  hi!    ", '4');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   hi!    ", strArray9, strArray13);
        java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEach("  hi!      hi  hi!      hi!", strArray3, strArray9);
        int int16 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.Class<?> wildcardClass18 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "   Hi!    " + "'", str14, "   Hi!    ");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!  hihi!  hi!" + "'", str15, "hi!  hihi!  hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "  hi!    " + "'", str17, "  hi!    ");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("H", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H" + "'", str2, "H");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("!IAAAAA...", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                     hi                   ", 8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("##hi!####");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.split("  hi!      hi  hi!      ", '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.replaceEach("                                                   ", strArray2, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 3 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  hi      ", "################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                          h                        ", "  hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih", 99, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih" + "'", str3, "ih      !ih      !ih  HI  HI!      HI!I!      HI  HI hI  hI      hI     h      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("444444444444444444444444444444444444444444444444a44444444444444444444444444444444444444444444...", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 48 + "'", int2 == 48);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("       hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#", "    I!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("hi!      hi  hi!      hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ' ');
        int int4 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi! hi hi! hi!" + "'", str3, "hi! hi hi! hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("h Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 39, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "h Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "hi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("ahhHI!!!!!I!HI!!!!!I!HI!!!!!I!HI!!!", "                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("   hi#!Hi!H  hi#!Hi!i  hi#!Hi!!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi" + "'", str2, "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("               HI#                        ", "ih", "       ", 29);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "               HI#                        " + "'", str4, "               HI#                        ");
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                        HI", "  hi      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hI...", "hi!    i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("       hi!      hi  hi!           ", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "  hi             hi#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("h !", 32);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h !" + "'", str2, "h !");
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaahi!aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("hi!i", "HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      HI       HI#  HI!      HI  HI!      HI!      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!i" + "'", str2, "hi!i");
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!hi! !..   hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi       hi  hi!      hi  hi!      hi!      hi", "hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!I" + "'", str1, "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!I");
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("  Hi     ###########################################################################################", "!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hI                                                  ", "HI#44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hI                                                  " + "'", str2, "hI                                                  ");
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("aaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "h                          h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!44444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!44444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!44444444444444444444");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...  ...", 39);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...  ..." + "'", str2, "...  ...");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "!ih                                                                                  ...", 242);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "                                                   ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!" + "'", str2, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!");
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!ihi!i", ' ');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("   Hi!    ####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minimum abbreviation width is 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "Ah                          h                       ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!h#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hihi!      hi  hi!      hi!      hi Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444" + "'", str2, "h444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray6);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!hi!hihi!", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi" + "'", str1, "!Hi!!#!Hi!i  hi#!Hi!H  hi#   hi");
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("i!      hi  hi!      hi!      hi                               ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("hi!hi!!ih!ih!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hi!!ih!ih!" + "'", str1, "hi!hi!!ih!ih!");
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH#IHIH!IH!IHIH!IH", "H   H       H    hi!      hi  hi!  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("    !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH       !iH   ", "       HH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################", "I!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################" + "'", str2, " Hi!######################################################################################################################################################################################################################################################################################################################################################################################################################################################");
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("...iH  iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left(" Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str2, " Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...", 121, 72);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...     !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih..." + "'", str3, "...     !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "Hi!");
        int int5 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#!!IH!IH!", strArray4);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '4', 442, 435);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.startsWithAny("HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!", strArray4);
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strArray11);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("ih      !hi!ihi!ihi!ihi!ihi!              hi#                         #!  hi#", "444 hi!444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444 hi!444" + "'", str2, "444 hi!444");
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("  HI!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("# hi!       hi# hi!       hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "HI!     ", (int) (short) 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "!ih                                                                                                 !ih");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", "    !ih  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("hi#", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("      HI ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("44444", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("h#h#h#h", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("", 273, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        HI#                        ", " Hi  Hi      Hi      Hi", (int) (short) 10);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "hi!hihi!hi!                                                                                                             ");
        boolean boolean8 = org.apache.commons.lang3.StringUtils.startsWithAny("", strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, 'a', 72, 12);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.startsWithAny("#######################################...", strArray7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray5);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.replaceEach("!iH", strArray5, strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("Hi!!IH!IH!i#!", strArray5);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.stripAll(strArray5, "ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        int int16 = org.apache.commons.lang3.StringUtils.indexOfAny("Hi!!IH!IH!                                                                                       ", strArray5);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "!iH" + "'", str10, "!iH");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 13 + "'", int11 == 13);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi" + "'", str13, "hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!ihi!ihi!ihi!ihi!              hi#                         ", "       ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("     ", "hi!       hi!      hi  hi!           ", "I!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "     " + "'", str3, "     ");
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  !i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("############################################################", "i!ihi!ihi!ihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("   hi!    i");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "i!", 12, 3);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!i" + "'", str6, "hi!i");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################");
        boolean boolean4 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi!!IH!IH!                                                                                       ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("!iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444", 472, "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi      !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi       " + "'", str3, "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi      !iH        444444444444444444444444444444444444444444444444    !iH   a 444444444444444444444444444444444444444444444444                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                                             Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi       ");
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("!i", (int) '#', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!i                                 " + "'", str3, "!i                                 ");
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  H   H       H       H ", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  H   H       H       H " + "'", str2, "  H   H       H       H ");
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                        HI#                         ", "                        hi#                         ", 34);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("                                                                                                                                                ", 52);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                            " + "'", str2, "                                                                                            ");
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H", "                               h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("    ...  ih  ", " hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "    ...  ih  " + "'", str2, "    ...  ih  ");
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!ihi!ihi!ihi!ihi!              hi#                           H   H      ", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase(" 4H4i4  4H4i4      4H4i4      4H4i");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("               HI#                        ", "                                 hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                                                                hi!      hi  hi!      hi!      hi                               ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("                        HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  H   H       H       H ", "      hi        Hi!!ih...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hI!     ", "hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("  Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ", 157, 343);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  " + "'", str3, "  Hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444  ");
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("       !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !   !!  !  !i!      hi  hi!      hi!      h                                                                           ", "Hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("hih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", 434, 17);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...    !ih      !" + "'", str3, "...    !ih      !");
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hI  hI      hI      hI", "444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", "hi! hi hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hI  hI      hI      hI" + "'", str3, "hI  hI      hI      hI");
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", (int) (byte) 0, (int) 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA..." + "'", str3, "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA...");
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!IH!", 24, 21);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", "       hi#", (int) (byte) 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("hi!", "#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!  hihi!  hi!", "4444444444");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H", "Hi  Hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H" + "'", str2, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H");
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("# Hi  Hi      Hi      Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         ", "H!IH!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         " + "'", str2, "H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H       H                                                                                                                                                                                                                                                                                                                                         ");
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("                                                                                                                                                                                                                                                                                                                                                       ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", 157);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                          ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str2, "                                                          ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("Ih      !ih      !ih  i", "hi!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ih      !ih      !ih  i" + "'", str2, "Ih      !ih      !ih  i");
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !" + "'", str1, "hih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hI", "I!!#IH####");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("i!      hi  hi!      hi!", "H                                                                                                     HI                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!" + "'", str2, "i!      hi  hi!      hi!");
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        char[] charArray8 = new char[] {};
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray8);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray8);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsNone(" Hi  Hi      Hi      Hi", charArray8);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("hi#!!IH!IH!", charArray8);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi#", charArray8);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      h                                                                  ", charArray8);
        int int15 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!  hihi!  hi!", charArray8);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih    i!hihi!hi!hiHi  Hi...  !ih      !ih  ih      !ih  #ih       ih    ", charArray8);
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
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!     ...", 42, "                       Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi                      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                       Hi  Hi...h!     ..." + "'", str3, "                       Hi  Hi...h!     ...");
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("A!444444444444444444444444444444444444444444444444", "      HI                                                                                      hI!           HI                                                                                      ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("h !", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h !                                                                                                " + "'", str2, "h !                                                                                                ");
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#", "..    I!    aaaaaaa...", "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#" + "'", str3, "HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#HI#");
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("I!HIHI!HI!H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!HIHI!HI!H" + "'", str1, "i!HIHI!HI!H");
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents(" H       ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + " H       " + "'", str1, " H       ");
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    Hi", 74, "######");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "##################################    Hi##################################" + "'", str3, "##################################    Hi##################################");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", 0, 6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444" + "'", str3, "444444");
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ", "hi!i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          " + "'", str2, "        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        char[] charArray6 = new char[] {};
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray6);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", charArray6);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("                                                                                                ", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsNone("444444444444444444444444444444444444444444444444 a!i444444444444444444444444444444444444444444444444     !i   ", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", 'a');
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, ' ', 414, 428);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 414");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444" + "'", str4, "444444444444444444444444444444444444444444444444hi!44444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("...ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !...", '#', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 52 + "'", int3 == 52);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi!hihi!hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("HI!     I  HI!  HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444 I  HI!     ...  HI!", "     ", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i     ###########################################################################################", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i     ###########################################################################################" + "'", str2, "i     ###########################################################################################");
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        int int1 = org.apache.commons.lang3.StringUtils.length("H ");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!                                                                                                 hi!", "");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("...  ...", "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!##########################################################################################################################################################################hi###########################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("  hi!      hi  hi!      ", "Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44  hiHihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44444444444444444444444444444444444444Hihi!hihi!hi!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!      hi  hi!      " + "'", str2, "  hi!      hi  hi!      ");
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("h   hi!    i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h   hi!    i" + "'", str1, "h   hi!    i");
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches(" Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa Hi!    ", "Hi!#####################################################################################################################################################################################################################################################################################################################################################################################################################################################");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" #h  #hi      #hi      #");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#h  #hi      #hi      #" + "'", str1, "#h  #hi      #hi      #");
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                       Hi  Hi...h!     ...", "      ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                       Hi  Hi...h!     ..." + "'", str2, "                       Hi  Hi...h!     ...");
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("HI!", "!I                                                                                                  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 9, "i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str3, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("H   H       H    hi!      hi  hi!", "!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToEmpty("!..");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!.." + "'", str1, "!..");
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("                                                                                                ");
        int int3 = org.apache.commons.lang3.StringUtils.indexOfAny("i!      hi                               ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("                        HI#", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#" + "'", str2, "                        HI#");
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "Ih      !ihi  Hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "IHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIHIaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast(" ih     ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ih     " + "'", str2, " ih     ");
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih" + "'", str1, "Ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih");
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str1, " Hi!hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!ih                                                                                                 !ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("      ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("ahi!", "      Ih      !ihi  Hi...                                                                                                                                                                                                                                                                                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" hi  hi!      hi!      h", (int) (short) 0, "...  ih  ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " hi  hi!      hi!      h" + "'", str3, " hi  hi!      hi!      h");
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("#########hi!!ih########", "Hi!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("ah                          h                        ", "!     ...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("  hi!     HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ", (int) (byte) 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          " + "'", str3, "        HI!     I  HI!  hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444 i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ");
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi" + "'", str1, "Hi");
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("i!ihi!ihi!ihi!ihi!              hi#                         ", "#################################!ih      !ih  ih      !ih  ##################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!ihi!ihi!ihi!ihi!              hi#                         " + "'", str2, "i!ihi!ihi!ihi!ihi!              hi#                         ");
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("    Hi", "i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("iHiHiHiH", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa i  Hi... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", (-1));
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("I!      HI  HI!      HI!      HI                               ", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!      HI  HI!      HI!      HI                               " + "'", str2, "I!      HI  HI!      HI!      HI                               ");
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("                               h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                               h" + "'", str1, "                               h");
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("   !!!!!!  !!   !!!!!!   ", 12);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   !!!!!!  !!   !!!!!!   " + "'", str2, "   !!!!!!  !!   !!!!!!   ");
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad(" hI  hI...HI#!HI#!HI#!HI#!HI#!H...", 49);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                hI  hI...HI#!HI#!HI#!HI#!HI#!H..." + "'", str2, "                hI  hI...HI#!HI#!HI#!HI#!HI#!H...");
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HIa!hi!Hi!!IH!IH!", "Ah                          h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("        ########  hi!      hi  hi!      ...         ", 55);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "        ########  hi!      hi  hi!      ...         " + "'", str2, "        ########  hi!      hi  hi!      ...         ");
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("4444444hia!4444444444444", 53);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!" + "'", str1, "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihih", 472);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihih" + "'", str2, "HiHi...!ih!ihih!ih#ihihi!hihi!hi!hiHiHi...!ih!ihih!ih#ihih");
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("    hi# hi!       hi# hi!       hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    hi# hi!       hi# hi!       hi#" + "'", str1, "    hi# hi!       hi# hi!       hi#");
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h    i!    Ah                          h", 11, 13);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "             " + "'", str3, "             ");
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("H                                                                                                     HI                                                ", "444444hi#!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H                                                                                                     HI                                                " + "'", str2, "H                                                                                                     HI                                                ");
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("... ... h", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("##################################    Hi##################################", 52, 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...####..." + "'", str3, "...####...");
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("HI  HI!      HI!I!      HI  HI hI  hI      hI", "i!hi", "                                                    ih!ih!ihih!ih                                                    ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI  HI!      HI!I!      HI  HI hI  hI      hI" + "'", str3, "HI  HI!      HI!I!      HI  HI hI  hI      hI");
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("ah                          h                        ...                                                                                                 ...                                        ", 20);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                    " + "'", str2, "                    ");
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                        HI#                        ", "       hi#");
        boolean boolean5 = org.apache.commons.lang3.StringUtils.startsWithAny("   hi!    ", strArray4);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("hi!    i!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("", strArray4, strArray7);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, "  hi  hi!      hi!i!      hi  hi Hi  Hi      Hi     ", 157, 3);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, ' ');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi! i!" + "'", str14, "hi! i!");
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("######", 'a', 419);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                               Hi!                                         ", "!ih", (int) 'a');
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.split(" Hi!");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!" + "'", str7, "hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("    i!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    !i    " + "'", str1, "    !i    ");
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih  ih      !ih      !ih  ih      !ih", "", 22);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("    I!    aaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    I!    aaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "    I!    aaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("Hi!", ' ');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!", "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("Hi!!IH!IH!", strArray4, strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!      hi                               ", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi#!!IH!IH!" + "'", str8, "hi#!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "HI#", 1);
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, " Hi!", (int) (byte) 100, 9);
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444" + "'", str9, "444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "##########################################################################################################################################################################  Hi     ###########################################################################################################################################################################");
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  H   H       H       H", 32, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  H   H       H       H         " + "'", str3, "  H   H       H       H         ");
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("HI#                                 hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi                                ih                                       hi!      hi  hi!      hi!      hi", "i!ihi!ihi!ihi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5877");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!IH!IH!I#!I#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "!IH!IH!I#!I#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test5878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5878");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        int int5 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray3);
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("", strArray3);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hI  hI      hI      hI", strArray3);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray3);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "                     hi                   ");
        java.lang.Class<?> wildcardClass11 = strArray10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5879");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("444444hia!", "I!HIHI!HI!HI", "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444hia!" + "'", str3, "444444hia!");
    }

    @Test
    public void test5880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5880");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "########  hi!      hi  hi!      ...", 6);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5881");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("i!      hi  hi!      hi!", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!" + "'", str2, "i!      hi  hi!      hi!");
    }

    @Test
    public void test5882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5882");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("ahh", "   hi#!Hi!H  hi#!Hi!i  hi#!Hi!!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5883");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str2, "       HI#AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test5884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5884");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("ahh", "!ih      !ih  ih      !ih         ", "hi#!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ahh" + "'", str3, "ahh");
    }

    @Test
    public void test5885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5885");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" Hi!");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  HI!     ", "########  hi!444444444444444444444444444444444444444444444444HI#!44444444444444444444444444444444444hi!Hi!!IH!IH!                                                       #########");
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("hi!      hi  hi!      hi", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 4 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "  HI!     " + "'", str7, "  HI!     ");
    }

    @Test
    public void test5886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5886");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("", 42);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5887");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("     ", "                                                       hi!                                                           ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     " + "'", str2, "     ");
    }

    @Test
    public void test5888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5888");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("...hi#!hi#!hi#!hi#!hi#!h...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "...hi#!hi#!hi#!hi#!hi#!h..." + "'", str1, "...hi#!hi#!hi#!hi#!hi#!h...");
    }

    @Test
    public void test5889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5889");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi#!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi#!" + "'", str2, "  hi#!");
    }

    @Test
    public void test5890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5890");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("!ih!ihih!ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ihih!ih" + "'", str1, "!ih!ihih!ih");
    }

    @Test
    public void test5891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5891");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########", "  hi!      hi  hi!      hi!      h                                                                    hi!      hi  hi!      hi!      h           hi!hi!!ih!ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########" + "'", str2, "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
    }

    @Test
    public void test5892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5892");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" hi  hi!      hi!      hi", "HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI      HI       HI#  HI      HI  HI      HI", 21);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5893");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("44444444444444444hi!Hi!!IH!IH!                                                       #########", "        ########  hi!      hi  hi!      ...         ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444hi!Hi!!IH!IH" + "'", str2, "44444444444444444hi!Hi!!IH!IH");
    }

    @Test
    public void test5894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5894");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("                                                                                                                     ...", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa  H   H       H       H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5895");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("iHiHiHiH");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5896");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("                        HI#                        ", '4');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        HI#                        " + "'", str2, "                        HI#                        ");
    }

    @Test
    public void test5897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5897");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("                                 !44444444444444444444444444444444444hi!Hi!!IH!  Hi...                                  ", "!       Hi!  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi   Hi!       Hi!  ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "44444444444444444444444444444444444hi!Hi!!IH!  Hi..." + "'", str2, "44444444444444444444444444444444444hi!Hi!!IH!  Hi...");
    }

    @Test
    public void test5898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5898");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("   hi!    ");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "   hi!    ", (int) '4', 10);
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "hi!hihi!hi!", (int) '#', (int) '#');
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       Hi!", "!IH", (int) (byte) 1);
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray15);
        java.lang.String str17 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hhi!      hi  hi!      hi!", strArray2, strArray15);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "       Hi!" + "'", str16, "       Hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "       Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!      h       Hi!      hi         Hi!             Hi!" + "'", str17, "       Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!      h       Hi!      hi         Hi!             Hi!");
    }

    @Test
    public void test5899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5899");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                          ih                                               ", '4');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5900");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       hi#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5901");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" #h  #hi      #hi      #", "!ih          ", "  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaa                                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " #h  #hi      #hi      #" + "'", str3, " #h  #hi      #hi      #");
    }

    @Test
    public void test5902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5902");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str1, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test5903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5903");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5904");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("hi! hi hi! hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi! hi hi! hi!" + "'", str1, "hi! hi hi! hi!");
    }

    @Test
    public void test5905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5905");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("Hi!", "Hi!");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#!!IH!IH!", strArray3);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.stripAll(strArray3, "");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "hi!       hi!      hi  hi!           ");
        java.lang.String str9 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!       hi!      hi  hi!           hi!       hi!      hi  hi!           hi!       hi!      hi  hi!           " + "'", str8, "hi!       hi!      hi  hi!           hi!       hi!      hi  hi!           hi!       hi!      hi  hi!           ");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5906");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########", 170, "ih      !ih      !ih  ih      !ih  aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########" + "'", str3, "HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########HI#                                                 HI#                                                 HI#                                                 HI#                                                 HI#                     44444444444444444hi!Hi!!IH!IH!                                                       #########");
    }

    @Test
    public void test5907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5907");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                        hi#                         ", 'a', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                        hi#                         " + "'", str3, "                        hi#                         ");
    }

    @Test
    public void test5908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5908");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("#########                                                                  h      !ih      !ih  ih      !ih  ########", "H   H       H     ih            hi   ih        ", 0);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5909");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                        HI", "hih      !ih      !ih  ih      !ih  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "H                          h", 11);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                        HI" + "'", str4, "                        HI");
    }

    @Test
    public void test5910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5910");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("   hi#!Hi!H  hi#!Hi!i  hi#!Hi!!", "HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "   hi#!Hi!H  hi#!Hi!i  hi#!Hi!!" + "'", str2, "   hi#!Hi!H  hi#!Hi!i  hi#!Hi!!");
    }

    @Test
    public void test5911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5911");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi  hi!      hi!i!   ...", "hi!!IH!IH!i#!i#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "I!HIHI!HI!H");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi  hi!      hi!i!   ..." + "'", str3, "hi  hi!      hi!i!   ...");
    }

    @Test
    public void test5912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5912");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("Hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa..." + "'", str1, "hi###########################################################################################aaaaaaaaaaaaaaaaaaaaaaaaaaaaa...");
    }

    @Test
    public void test5913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5913");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("IH", 0, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "IH" + "'", str3, "IH");
    }

    @Test
    public void test5914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5914");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "  H   H       H       H         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test5915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5915");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IH      !IHH  IH      !IH      HI!  HIHI!  HI!IH      !IH      !IH  IH      !IH  IH      !IH      !", "4H4i4  4H");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5916");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi", "       hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test5917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5917");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!" + "'", str1, "Hi!");
    }

    @Test
    public void test5918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5918");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str1, "HiaHi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test5919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5919");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited("444444444h444444444444444444444444444444444444444444444444hia!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!a444444444h444444444444444444444444444444444444444444444444hi" + "'", str2, "!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444hi!a444444444h444444444444444444444444444444444444444444444444hi");
    }

    @Test
    public void test5920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5920");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("  hi!    ", "");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("hI!     ", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
    }

    @Test
    public void test5921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5921");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad(" !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", 23, "  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH" + "'", str3, " !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH");
    }

    @Test
    public void test5922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5922");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("# hi!       hi# hi!       hi# hi!       hi# hi!       hi#", "    ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5923");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                          IH                                               ", "                      HI#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                          IH                                               " + "'", str2, "                                          IH                                               ");
    }

    @Test
    public void test5924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5924");
        char[] charArray2 = new char[] {};
        boolean boolean3 = org.apache.commons.lang3.StringUtils.containsNone("", charArray2);
        boolean boolean4 = org.apache.commons.lang3.StringUtils.containsAny("hi!Hi!!IH!IH!", charArray2);
        org.junit.Assert.assertNotNull(charArray2);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray2), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray2), "[]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5925");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart(" ih     ", "  Hi     ###########################################################################################");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ih     " + "'", str2, " ih     ");
    }

    @Test
    public void test5926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5926");
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
    public void test5927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5927");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("ih      !ih      !ih  ih      !ih    hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#!  hi#", "    hi# hi!       hi# hi!       hi#", 7);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5928");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("444444", "h                          h", " hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "444444" + "'", str3, "444444");
    }

    @Test
    public void test5929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5929");
        char[] charArray1 = null;
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("44444444444444444hi!Hi!!IH!IH!#########", charArray1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5930");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("HI                                                  ", "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5931");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("hi!      hi  hi!      hi!...iH  iH", ' ', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!aaaaaahiaahi!aaaaaahi!...iHaaiH" + "'", str3, "hi!aaaaaahiaahi!aaaaaahi!...iHaaiH");
    }

    @Test
    public void test5932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5932");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("hi!ihi!ihi!ihi!ihi!              hi#                           H   H      ", "   #");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!ihi!ihi!ihi!ihi!              hi#                           H   H      " + "'", str2, "hi!ihi!ihi!ihi!ihi!              hi#                           H   H      ");
    }

    @Test
    public void test5933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5933");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("...HI#!HI#!HI#!HI#!HI#!H...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5934");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444444444444444444444444444444444444", "                                                                                                 ", 414);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5935");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("H   H   ", "                                   ", 55);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5936");
        char[] charArray7 = new char[] { '4', '4' };
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsNone(" ih      ", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("  hi!      hi  hi!      hi!", charArray7);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("Hi!", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("I!HIHI!HI!H", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "44");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "44");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[4, 4]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5937");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5938");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right(" ih     ", 120);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " ih     " + "'", str2, " ih     ");
    }

    @Test
    public void test5939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5939");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("...     HI#                        ", 216);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...     HI#                        " + "'", str2, "...     HI#                        ");
    }

    @Test
    public void test5940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5940");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("       hi!      hi  hi!      hi!       ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       hi!      hi  hi!      hi!       " + "'", str1, "       hi!      hi  hi!      hi!       ");
    }

    @Test
    public void test5941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5941");
        char[] charArray10 = new char[] { '4' };
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray10);
        int int13 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray10);
        int int14 = org.apache.commons.lang3.StringUtils.indexOfAnyBut(" Hi!", charArray10);
        boolean boolean15 = org.apache.commons.lang3.StringUtils.containsNone("hi!Hi!!IH!IH!", charArray10);
        boolean boolean16 = org.apache.commons.lang3.StringUtils.containsAny("  Hi                                                                                                                                                                                                                                                                                                                                                                                                                                                      ", charArray10);
        boolean boolean17 = org.apache.commons.lang3.StringUtils.containsOnly("!IH                                   I!      HI  HI!      HI!!IH                                   ", charArray10);
        int int18 = org.apache.commons.lang3.StringUtils.indexOfAny("  hi!      hi  hi!      hi!...iH  iH", charArray10);
        boolean boolean19 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444444444hia!44444444444444444444444444444444444444444444444", charArray10);
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5942");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("   4");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   4" + "'", str1, "   4");
    }

    @Test
    public void test5943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5943");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("                                          IH                                               ", "!ih                                   i!      hi  hi!      hi!!ih", "                                                                                                                                                      ");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test5944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5944");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("##########################################################################################################################################################################HI###########################################################################################################################################################################", "!!!IH!I!!!!!IH!I!!!!!IH!I!!!!!IHhha");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##########################################################################################################################################################################HI###########################################################################################################################################################################" + "'", str2, "##########################################################################################################################################################################HI###########################################################################################################################################################################");
    }

    @Test
    public void test5945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5945");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("     ...", "    !ih   ", (int) 'a', 99);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     ...    !ih   " + "'", str4, "     ...    !ih   ");
    }

    @Test
    public void test5946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5946");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("", "      HI                                                                                      hI!           HI                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5947");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("                                                                                                ", "!h...#!hi#!hi#!hi#!hi#...hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5948");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("Ah                          h", "hI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ah                          h" + "'", str2, "Ah                          h");
    }

    @Test
    public void test5949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5949");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("hi!ihi!ihi!ihi!ihi!              hi#                         ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5950");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi!      hi  hi!      hi!...iH  iH", "ih######!ih######!ih##i");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5951");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi", "!iH       !iH       !iH     ...");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test5952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5952");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!      hi  hi!      hi!      h                                                                  ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test5953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5953");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("", '#');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "       hI!########################################");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test5954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5954");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("#########                                                                  h      !ih      !ih  ih      !i!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH!HI!HI!!#IH####");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5955");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi#444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "      HI                                                                                      hI!           HI                                                                                      ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5956");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Haia###########################################################################################", "hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Haia###########################################################################################" + "'", str2, "Haia###########################################################################################");
    }

    @Test
    public void test5957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5957");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hI!HHHHHH!I!HHHHHH!I!HHI!HHHHHH!I!HHI!HHHHHH!I!HHHHHH!I!HH!I!I!HH!I!I!HHHHHH!I!HHHHHH!I!HHI!HHHHHH!I!HHI!HHHHHH!I!HHHHHH!", "hi!      hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi                                ih                                                                                           hi                                                                                                          hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5958");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("#HIa!hi!Hi!!IH!IH!##", "  hi!      hi  hi!      hi!...iH  iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#HIa!hi!Hi!!IH!IH!##" + "'", str2, "#HIa!hi!Hi!!IH!IH!##");
    }

    @Test
    public void test5959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5959");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("       HI");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5960");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("                                              ##########################################################################################################################################################################HI###########################################################################################################################################################################                                              ", "####HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!HI#!!IH!IH!i!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5961");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("                        HI#                        ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5962");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...", 254);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ..." + "'", str2, "...hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!  ...iH  iH                             ...");
    }

    @Test
    public void test5963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5963");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("4444444444444444444", "  ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test5964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5964");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("ih      !ihh  ih      !ih      hi!  hihi!  hi!ih      !ih      !ih  ih      !ih  ih      !ih      !", "HIa!hi!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 90 + "'", int2 == 90);
    }

    @Test
    public void test5965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5965");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("IIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIIII", "                                                                                                                                                                                                                                                                                                                   hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!                                                                                                                                                                                                                                                                                                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5966");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("A!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "A!444444444444444444444444444444444444444444444444" + "'", str1, "A!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5967");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("########  hi!      hi  hi!      hi!      h                                                                  #########");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5968");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("       hI!", "iHi...", 9);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test5969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5969");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ih######!ih######!ih##i", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test5970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5970");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("############################################################", "444444444444444444444444aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa444444444444444444444444", "HI!!!!!I!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test5971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5971");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("H   H       H    hi!      hi  hi!  ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5972");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test5973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5973");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#  hi!      hi  hi!      hi!      hi       hi#", "!ih                       !ih                       ", 27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5974");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("                        HI", "       HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                 " + "'", str2, "                 ");
    }

    @Test
    public void test5975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5975");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  hi", 88, "444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444444hi!Hi!!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444" + "'", str3, "  hi444444444444444444444444444444444444444444444444HIa!44444444444444444444444444444444");
    }

    @Test
    public void test5976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5976");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("                                                                                                                                                                                                                                                                                                                                                              ", "...  ih  ", "ih!ih!ihih!ih", 48);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                              " + "'", str4, "                                                                                                                                                                                                                                                                                                                                                              ");
    }

    @Test
    public void test5977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5977");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("hi!    444444444444444444444444444444444444444444444444hia!444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444" + "'", str1, "HI!    444444444444444444444444444444444444444444444444HIA!444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test5978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5978");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("##HI!####");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "##HI!####" + "'", str1, "##HI!####");
    }

    @Test
    public void test5979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5979");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!hi#!!ih!ih!", "                                   ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5980");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("ahi!ahi!ahi!ahihi!ihi!ihi!ihi!ihi!ahi!ahi!ahi!ahi", "hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#hi!hihi!hi!hihi#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5981");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("  hi  ih      !ih      !ih  ih      !ih  aaaaaaaaaaa i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!i!aaaaaaaaaaaaaaaaaaaaaaaaa                                              ", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5982");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa i  Hi... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa i  Hi... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa i  Hi... aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5983");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI  HI!      HI!I!      HI  HI hI  hI      hI", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI  HI!      HI!I!      HI  HI hI  hI      hI" + "'", str2, "HI  HI!      HI!I!      HI  HI hI  hI      hI");
    }

    @Test
    public void test5984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5984");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("h                                   i!      hi  hi!      hi!!ih                                   ", "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5985");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("  hi                                                ", "        HI!     I  HI!     h  HI!             HI!     !  HI!     ihi  HI!         HI!     H  HI!     i  HI!     ...  HI!                                                                                                                                                                                                                                                                                                                                                          ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi                                                " + "'", str2, "  hi                                                ");
    }

    @Test
    public void test5986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5986");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("IHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi  Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHIHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi      Hi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!HiHHi!Hi!Hi!Hi!Hi!H!ihHi!Hi!Hi!Hi!Hi!Hi                                                                  ", "!ih!ihih!ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 518 + "'", int2 == 518);
    }

    @Test
    public void test5987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5987");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "       Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!             Hi!      hi         Hi!      hi         Hi!      h       Hi!      hi         Hi!             Hi!", "h   hi!    i");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "!iaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test5988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5988");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "!i                                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test5989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5989");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH  #IH       IH      !IH      !IH  IH      !IH", "!IH      !");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("!IH");
        java.lang.String[] strArray11 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray11);
        java.lang.String[] strArray15 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!", "hi#");
        java.lang.String str16 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("   hi!    ", strArray11, strArray15);
        java.lang.String[] strArray18 = org.apache.commons.lang3.StringUtils.stripAll(strArray11, "  hi!     ");
        java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("ah                          h", strArray6, strArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = org.apache.commons.lang3.StringUtils.replaceEach("                                                                                      ", strArray3, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 11 vs 1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "   Hi!    " + "'", str16, "   Hi!    ");
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ah                          h" + "'", str19, "ah                          h");
    }

    @Test
    public void test5990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5990");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("", "I!!#IH####");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test5991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5991");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("       HI!", "...                             Hi  Hi...  !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih      !ih  #ih       ih      !ih      !ih  ih...");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5992");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("!ih          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih" + "'", str1, "!ih");
    }

    @Test
    public void test5993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5993");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("", "     ..");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
    }

    @Test
    public void test5994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5994");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("                        #                        HI", " hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 50 + "'", int2 == 50);
    }

    @Test
    public void test5995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5995");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("H!IH!IH!IH  hi!      hi  hi!      h", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5996");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("H   H       H    hi!      hi  hi!      hi!      HH   H       H       HH   H       H  H   H       H");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h   h       h    hi!      hi  hi!      hi!      hh   h       h       hh   h       h  h   h       h" + "'", str1, "h   h       h    hi!      hi  hi!      hi!      hh   h       h       hh   h       h  h   h       h");
    }

    @Test
    public void test5997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5997");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("H   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "h   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H " + "'", str1, "h   H       H       HH   H       H       HH   H       H       HH   H       H  H   H       H       H ");
    }

    @Test
    public void test5998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5998");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("I!HIHI!HI!HI");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!HIHI!HI!HI" + "'", str2, "I!HIHI!HI!HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test5999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5999");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("##################################    Hi##################################", 201);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "##################################    Hi##################################" + "'", str2, "##################################    Hi##################################");
    }

    @Test
    public void test6000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test6000");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("444444hi#!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 273);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "444444hi#!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str2, "444444hi#!444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }
}
