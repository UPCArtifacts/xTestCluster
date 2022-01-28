import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test2001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2001");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, ".");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1, " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        java.lang.Class<?> wildcardClass6 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("  ...", 12, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  ...#######" + "'", str3, "  ...#######");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween(" h            h        h        ", "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str1, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi", " ...");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h#", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!iH", (int) '#', 121);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", 8, 882);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi" + "'", str3, "hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("                                                                                      !!!hhihhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("hi#################################################################################################", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", "          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h" + "'", str2, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens(" h            h        h        ", '#');
        java.lang.Class<?> wildcardClass3 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("I...", "Hi!    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I..." + "'", str2, "I...");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("  HI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                hi#!!IH!IH!                 ", 67, (int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("####          !ih####          !ih####          !ih####          !ih####          !####          !ih", "                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("!IH", 350, 116);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH" + "'", str3, "!IH");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("Hi#!", "aaaaaaaaaa                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("...   ...", (-1), 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...   ..." + "'", str3, "...   ...");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("a###", "hi!#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  hi", 5);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi" + "'", str2, "  hi");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("    !iH", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", (int) (short) -1, "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  " + "'", str3, "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ");
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!!!hhIHhIHh", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!hhIHhIHh" + "'", str2, "!!!hhIHhIHh");
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", "####          !IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi" + "'", str2, "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "   hi!    ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 121);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str2, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("hi!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!Hi!!IH!IH" + "'", str1, "hi!Hi!!IH!IH");
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!!!HHIHHIHH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!HHIHHIHH" + "'", str1, "!!!HHIHHIHH");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove(" Hi!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!" + "'", str2, "Hi!");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        " + "'", str1, "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ");
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("                 ..                ", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", "!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!" + "'", str3, "!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("", ' ', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("i", "hi!i#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!IH                                                                                            ", "Hi!    ", 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!i!  ..." + "'", str2, "Hi!i!  ...");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("   ", "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", 121, 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI" + "'", str4, "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfterLast("          !ih", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi#!!IH!IH!", 'a', 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 65, 0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("     !ih");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("                      ", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", 67);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH" + "'", str1, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(" ...", "                                                                                                                                                                                iH                                                                                                                                                                            ", (int) 'a');
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("################!!!hhihhihh#################", "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray7, "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", strArray4, strArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strArray10);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!#iH", "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("I", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("#        I##", "Hi!i!  ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "#        I##" + "'", str2, "#        I##");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) " ..");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.reverseDelimited(" Hi  Hi...", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi..." + "'", str2, " Hi  Hi...");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!#i", 350, 1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("...!IH ...", "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     " + "'", str1, "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("Hi!!IH!IH!", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, '#');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!!IH!IH!" + "'", str4, "Hi!!IH!IH!");
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi#", "HI#       ");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', 1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 116, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", 2, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str3, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#        I##  HI!      HI  HI!      HI!     " + "'", str1, "#        I##  HI!      HI  HI!      HI!     ");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", "HI", (int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 33 + "'", int3 == 33);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        char[] charArray6 = new char[] { '4' };
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", charArray6);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsAny("  HI", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[4]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("!iH", "aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!iH" + "'", str2, "!iH");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "    !iH");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#############################################################################################################################################################################!IH##############################################################################################################################################################################" + "'", str1, "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                        hi#                         ", (int) (byte) 100, 44);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str1, "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH..." + "'", str2, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIH...");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("Hi!i!       aaHi!i!       ");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("!!!hi!!!!!", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!!hi!!!!!" + "'", str2, "!!!hi!!!!!");
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!    hI  hI...HI#!HI#!" + "'", str2, "  hi!    hI  hI...HI#!HI#!");
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("#######hi#", "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!      hi  hi!      hi!      h Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("####          !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####          !ih" + "'", str1, "####          !ih");
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("    !i", ' ');
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "     hi ");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "     hi      hi      hi      hi !i" + "'", str4, "     hi      hi      hi      hi !i");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "!i" + "'", str5, "!i");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("#        I##", 882);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##" + "'", str2, "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf(" Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 94 + "'", int2 == 94);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi!      hi  hi!      hi!      hi                       !i!", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi                       !i!" + "'", str2, "hi!      hi  hi!      hi!      hi                       !i!");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray8 = org.apache.commons.lang3.StringUtils.stripAll(strArray7);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "" };
        java.lang.String[] strArray12 = org.apache.commons.lang3.StringUtils.stripAll(strArray11);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEach("", strArray7, strArray12);
        int int14 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!ih", strArray7);
        java.lang.String str18 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray7, '#', (int) (short) 1, 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i", strArray2, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 41 vs 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "!!!                                                                                                 ", "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI" + "'", str3, "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("I#", "          ", (int) (byte) -1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars(" h            h        h        ", "a###                                                                                     ", "!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", 'a');
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEach("       Hi!", strArray4, strArray7);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, '#');
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "hi!#");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "       Hi!" + "'", str8, "       Hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("       hi#", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", 369);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("hi!      hi  hi!      hi!      hi                       !i!", "                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi                       !i!" + "'", str2, "hi!      hi  hi!      hi!      hi                       !i!");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("a###", "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "a###" + "'", str2, "a###");
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", 0, 4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!   " + "'", str3, "!   ");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("                    ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                   " + "'", str2, "                                   ");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("HI#!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", 121);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str2, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("   hi!    ", ' ', 882);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType(" h            h        h        ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("Hi#", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("", (int) '4', 3);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("!!!HHIHHIHH", "####          !ih####          !ih####          !ih####          !ih####          !####          !ih", "                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!HHIHHIHH" + "'", str3, "!!!HHIHHIHH");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "Hi!i!       aaHi!i!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("HI#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("!IH", 89, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!IH");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("aaaaaaaaaa                                                                                      !!!hhIHhIHh", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaa                                                                                      !!!h" + "'", str2, "aaaaaaaaaa                                                                                      !!!h");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "HI#!!IH!IH!", "     hi ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH", "hi!Hi!!IH!IH!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("  ...#######", " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "...#######" + "'", str2, "...#######");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("i", '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("4444444444444444444444444          ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444" + "'", str1, "4444444444444444444444444");
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("       Hi!       ", "aaaaaaaaaa                                                                                      !!!hhIHhIHh", 94);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("hi#################################################################################################", 26);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#####################..." + "'", str2, "hi#####################...");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "hi#####################...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("###aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + "'", str1, "###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH" + "'", str1, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, "       hI!");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str4, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str6, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("!HI!HI!!#ih", "#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!HI!HI!!#ih" + "'", str2, "!HI!HI!!#ih");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip(" Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h" + "'", str1, "Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!", 349);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!" + "'", str2, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("  hi!  ...", "###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("!#i", 89);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!#i" + "'", str2, "!#i");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "hi!Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("    !i", "####          !IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("ih      !", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "ih      !" + "'", str2, "ih      !");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        java.lang.Object[] objArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.join(objArray0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  " + "'", str1, "44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ");
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("                                                                                     #######hi#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("h", (int) 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("", "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", 'a', 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str3, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "", (int) (short) 1);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("HI#       ", "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#       " + "'", str2, "HI#       ");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isWhitespace("44444444444444444444444444444444444");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("Hi!!IH!IH!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 62 + "'", int2 == 62);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI", " HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H" + "'", str2, " HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("  ...#######", (int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("          !ih", 0, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "          !ih" + "'", str3, "          !ih");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("       HI!                                                                                       ", ' ');
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.stripAll(strArray2, "####          !ih####          !ih####          !ih####          !ih####          !####          !ih");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "..");
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HI" + "'", str6, "HI");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("                                                                                                                                  ", "####          !IH", "HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                                                  " + "'", str3, "                                                                                                                                  ");
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("Hi!i!       aaHi!i!       ", "                        HI#                         ", 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("... ", "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!Hi!iHi!i!Hi!i!Hi!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "... " + "'", str2, "... ");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     " + "'", str3, "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("Hi#!", "HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ", "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("", "I...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha(" hi  hi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("iH", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH" + "'", str2, "iH");
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("HI#", "!iH", "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HI#" + "'", str4, "HI#");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate(" Hi  Hi...", 9, (int) (short) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " Hi  Hi..." + "'", str3, " Hi  Hi...");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("hi!", "", (-1));
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!IH", strArray6);
        int int8 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("   ", strArray6);
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.stripAll(strArray6, "...   ...");
        java.lang.String[] strArray13 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi#", "hi#");
        java.lang.String[] strArray14 = org.apache.commons.lang3.StringUtils.stripAll(strArray13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  HI!    ", strArray6, strArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Search and Replace array lengths don't match: 1 vs 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(strArray14);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa", 'a', (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h" + "'", str1, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!      hi  hi!      hi!      h" + "'", str1, "Hi!      hi  hi!      hi!      h");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("i", "i#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", " hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i" + "'", str2, "H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("...");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("  hi!    ", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!ih                                                                                                 ");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("                                                                                                    ", strArray2);
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "!ih" + "'", str4, "!ih");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("aaaaaaaaaa                                                                                      !!!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5, "Hi!!IH!IH!");
        java.lang.String[] strArray10 = org.apache.commons.lang3.StringUtils.split("...");
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray10);
        int int12 = org.apache.commons.lang3.StringUtils.indexOfAny("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", strArray10);
        java.lang.String str13 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  hi!      hi  hi!      hi!      h", strArray5, strArray10);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.startsWithAny("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", strArray10);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Hi!" + "'", str7, "Hi!");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "..." + "'", str11, "...");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str13, "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("H", "#        I##");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("", 6);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "###");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", "#######hi#");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.abbreviate("  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ", 116);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!                                                                                                            ..." + "'", str2, "  hi!                                                                                                            ...");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", ' ', ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str3, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi#!");
        boolean boolean3 = org.apache.commons.lang3.StringUtils.startsWithAny("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH", strArray2);
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi #!" + "'", str5, "hi #!");
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                      !!!hhihhihh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!!hhihhihh" + "'", str1, "!!!hhihhihh");
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!" + "'", str1, "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!");
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("#############################################################################################################################################################################!IH##############################################################################################################################################################################", "!   ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("    !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    !i" + "'", str1, "    !i");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i" + "'", str1, "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("#        I##  hi!      hi  hi!      hi!     ", "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi", "####          !ih####          !ih####          !ih####          !ih####          !####          !ih", "#############################################################################################################################################################################!IH##############################################################################################################################################################################");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi" + "'", str3, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        char[] charArray6 = new char[] {};
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray6);
        boolean boolean8 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray6);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray6);
        boolean boolean10 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray6);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!", charArray6);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsAny("  ...", charArray6);
        org.junit.Assert.assertNotNull(charArray6);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray6), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray6), "[]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split("", "                                                                                                    ", (int) (byte) 10);
        java.lang.String[] strArray6 = org.apache.commons.lang3.StringUtils.splitByCharacterType("");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray6, "!ih                                                                                                 ", (int) ' ', 1);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEach("#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih", strArray4, strArray6);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih" + "'", str11, "#ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih    !ih   #ih");
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, ' ');
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("a###      ", 100, "!!!hhIHhIHh");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###      !!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!" + "'", str3, "!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!a###      !!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!!!hhIHhIHh!");
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("    !i", '4', '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "    !i" + "'", str3, "    !i");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("h", " Hi  Hi      Hi      Hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi      Hi      Hi" + "'", str2, " Hi  Hi      Hi      Hi");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("i#", '#', '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i#" + "'", str3, "i#");
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "  HI44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("", 25, "hi!hihi!hi!hHi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!Hi!HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hi!hhi!hihi!hi!hH" + "'", str3, "hi!hihi!hi!hhi!hihi!hi!hH");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference(" Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("H", "  hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", "       hI!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 339 + "'", int2 == 339);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                                                                                     #######hi#", "!iH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi#####################...", " !i!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi#####################..." + "'", str2, "hi#####################...");
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("", "!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih!hi!!ih!ih");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", "!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih", " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("", "                                                                                                                                                                                iH                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("i#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#" + "'", str1, "I#");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("", 349, "!IH!IH!");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH" + "'", str3, "!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("  hi!  ...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!  ..." + "'", str1, "hi!  ...");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI", "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split("H");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  hi!  ...", "hi!I#");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!#Ih", 'a');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("hi!      hi  hi!      hi!      hi                       !i!", "hi#!", (int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("aaaaaaaaaaaaaaaaaaaaaaaaa", " Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! Hi! HHi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("hi#!", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("iH", "aaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "iH" + "'", str2, "iH");
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize(" hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi!" + "'", str1, " hi!");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!" + "'", str1, "HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ", "                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     " + "'", str2, "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi", '#', 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi", "");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ');
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi" + "'", str4, "hi");
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", "                 ..                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        " + "'", str2, "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###" + "'", str1, "                        hi#                         a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###a###");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("", "  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!                                                                                     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!" + "'", str2, "Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ", "hi...", "                                   i#                              ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        " + "'", str3, "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.chomp("Hi#!", "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#!" + "'", str2, "Hi#!");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI" + "'", str1, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi", '#');
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("     hi      hi      hi      hi !i");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("hi!Hi!!IH!I", "       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!", "                                                                                                I");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!Hi!!IH!I" + "'", str3, "hi!Hi!!IH!I");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("  ...#######", "H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("     hi ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi...");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi..." + "'", str1, "hi...");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("", "       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("!!!hhihhihh");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.abbreviate("...!ih ...", 0, 67);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "...!ih ..." + "'", str3, "...!ih ...");
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("hi!i#", "  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("", "                                                                                                                                                                            Hi                                                                                                                                                                                ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsOnly("                        HI#                         ", "                                                                                                                                  ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI#!", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!" + "'", str2, "HI!");
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI", 'a');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI" + "'", str2, "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("aaaaaaaaaa                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "aaaaaaaaaa                                                                                      !!!hhIHhIHh" + "'", str1, "aaaaaaaaaa                                                                                      !!!hhIHhIHh");
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!", "!#Ih!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!" + "'", str2, "       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(" hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        java.lang.Class<?> wildcardClass2 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hI!44");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!", '#', 62);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("       Hi!       ", "                                                                                      !!!hhIHhIHh");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllUpperCase("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str1, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("!ih", "", "4444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!ih" + "'", str3, "!ih");
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", 5, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H" + "'", str3, " HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("ih      !ih      !ih  ih      !ih", "                                   ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("       HI!                                                                                       ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "       HI!                                                                                       " + "'", str1, "       HI!                                                                                       ");
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!      hi  hi!      hi!      hi                       !i!", 882, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!" + "'", str3, "hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!");
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("                                                                                                I", "                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                I" + "'", str2, "                                                                                                I");
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi", "                HI#!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("HI#", 35, "        I#");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "        I#        I#        I#  HI#" + "'", str3, "        I#        I#        I#  HI#");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("   ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "   " + "'", str1, "   ");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "  ...");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("", " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", 35);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("44444444444444444444444444444444444", 0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("hi#################################################################################################");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hI!44");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith(" Hi  Hi      Hi      Hi", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("    !iH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("   hi !i");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi !i" + "'", str1, "hi !i");
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.lowerCase("...", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultString("", "  hi!                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("!ih                                                                                                 ", "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i!    ", (int) '#', "hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!      hi  hi!    hi!      hi  hi" + "'", str3, "hi!      hi  hi!    hi!      hi  hi");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trim("  hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "hi!    hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("                        hi#                         ", "aaaaaaaaaa                                                                                      !!!h");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                        hi#                         " + "'", str2, "                        hi#                         ");
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "Hi!i!       aaHi!i!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh", 24, '#');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" + "'", str3, "hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace("4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH", "!!!hhIHhIHh", "          !ih");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH" + "'", str3, "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("ahi!", "  hi!      hi  hi!      hi!      h", "a###");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "a##" + "'", str3, "a##");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH", "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("####          !ih####          !ih####          !ih####          !ih####          !####          !ih", 89, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "####          !ih####          !ih####          !ih####          !ih####          !####          !ih" + "'", str3, "####          !ih####          !ih####          !ih####          !ih####          !####          !ih");
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "hi!      hi  hi!      hi!       hi!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "i!......hi..hi!......hi!......hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!" + "'", str1, "Hi!i!Hi!iHi!i!Hi!i!Hi!iHi!i!");
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        java.lang.Object[] objArray0 = null;
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.join(objArray0, "");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  h  h  ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "                                                                                                                                                                            Hi                                                                                                                                                                                ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!", "  HI444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", " HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", (int) (short) -1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!" + "'", str4, "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("####          !ih####      !!!hhihhihh####          !ih####      ", "hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#                                                                                                                                                                                                                                                         ", "I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I            I            I        I        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isEmpty((java.lang.CharSequence) "  HI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("hi!      hi  hi!      hi!", "  hi!      hi  hi!      hi!      hi");
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.split("#", "  hi!      hi  hi!      hi!      hi", 0);
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("HI#!", strArray3, strArray7);
        java.lang.Class<?> wildcardClass9 = strArray7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HI#!" + "'", str8, "HI#!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumeric("...   ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("hi!  ...", (int) (byte) -1, "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!  ..." + "'", str3, "hi!  ...");
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("  hi!    ", " hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("a##");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "a##" + "'", str1, "a##");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("hi!hihi!hi!hhi!hihi!hi!hH", "!!!                                                                                                 ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("4444444444444444444444444", "HI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HIHI!HIHI!HI!HI");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI" + "'", str1, "HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI");
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("HI#       ", "      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("...!ih ...", "H");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("..", "                                                                                                                                                                                iH                                                                                                                                                                            ");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, 'a', (int) (short) -1, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        char[] charArray5 = new char[] {};
        int int6 = org.apache.commons.lang3.StringUtils.indexOfAny("   hi!    ", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsNone("hi!", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("i!      hi  hi!      hi!      hi", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsOnly("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", charArray5);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("a###", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByCharacterType("hi!");
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray2, ' ', (int) '#', 0);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#!", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equalsIgnoreCase("44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444ih  ", "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi!      hi  hi!      hi!      h", "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("!IH");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("", "!i");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i" + "'", str2, "!i");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h", 25);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h" + "'", str2, "!!hi#   !iH   hi#   hi!    hi#   !!hi#   !iH   hi#   hi!    hi#   h");
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.leftPad("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", 65);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str2, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("   ", "!IH                                                                                            ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", " ", "aaaaaaaaahi!I#aaaaaaaaaa");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.equals("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!", "       hi#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase(" h            h        h        ", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!HI!", " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi", (int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfDifference("!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!I!I!!I!!!!!!I!!!!!!", "#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("################!!!hhihhihh#################", " ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "################!!!hhihhihh#################" + "'", str2, "################!!!hhihhihh#################");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "  ...");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.lowerCase("Hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore("!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi" + "'", str2, "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWith("Hi!i!  ...", "          ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
        int int2 = org.apache.commons.lang3.StringUtils.countMatches("hi!", "!    ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("a###", "  hi", 349);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("   hi !i", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "   hi !i" + "'", str3, "   hi !i");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IHhi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi!      hi  hi!      hi!      hi                       !i!", "!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi!Hi!!IH!IH", "       HI!                                                                                       ", "hi#####################...", 116);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!Hi!!IH!IH" + "'", str4, "hi!Hi!!IH!IH");
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.right("     hi ", 95);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     hi " + "'", str2, "     hi ");
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!", "###");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!" + "'", str2, "h  h  h  h  h  h  h  h  h  h  h    h        h   h        h        hh  h  h  h  h  h  h  h  h  hhi!");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("                                                                                                I", (int) (byte) 0, (int) '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                    " + "'", str3, "                                                    ");
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("###AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA", "  Hi     ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("       Hi!       ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("!#Ih", "Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I" + "'", str2, "I");
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.strip("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!", "  hi!                                                                                                            ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H" + "'", str2, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("H !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "                                                                                                I", 65);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("!   ", 350);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                             !                                                                                                                                                                                " + "'", str2, "                                                                                                                                                                             !                                                                                                                                                                                ");
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.center("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H", (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H " + "'", str2, " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H ");
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i" + "'", str2, "     hi      hi      hi      hi !i!iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !iH !i");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.split("Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i", "!!!HHIHHIHH");
        int int4 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("!IH", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.mid("    !iH", 10, 99);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", "hi!Hi!!IH!IH");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 341 + "'", int2 == 341);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("   ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        java.util.Locale locale1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.commons.lang3.StringUtils.upperCase("  HI!      HI  HI!      HI!      H", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str1, "!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumericSpace("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.capitalize("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str1, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripEnd("                      ", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                      " + "'", str2, "                      ");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("h", "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        int int4 = org.apache.commons.lang3.StringUtils.indexOfAny("HI#!", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!IHih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !ihih      !ih      !ih  ih      !", "hi!hihi!hi!hhi!hihi!hi!hH");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                                                                                                                                                iH                                                                                                                                                                            ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("hi #!", '4', 95);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWith("hI!44", "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("!IH", 44, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "h#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("Hi!      hi  hi!      hi!      h", "!Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih !Ih", " !i!");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "                        HI#                         ");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("I...");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("444444444444444444444444444444444444444444444444hi#!444444444444444444444444444444444444444444444444", "hi #!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.stripToNull("!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih" + "'", str1, "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih");
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("                                                                                     #######hi#", "  Hi     ");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                     #######hi#" + "'", str2, "                                                                                     #######hi#");
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" !i!", "################!!!hhihhihh#################");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.stripAll(strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.substringsBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "HI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI", " Hi  Hi...");
        org.junit.Assert.assertNull(strArray3);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("HI#!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HI#!" + "'", str2, "HI#!");
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi!Hi!!IH!IH", (int) '#', 350);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("         Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ", "...   ...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      " + "'", str2, "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         Hi!i!      ");
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("      !ih      !ih  ih ih      !ih      !ih  ih !ih      !ih      !ih  ih ih      !ih      !ih  ih ", "  hi!    hI  hI...HI#!HI#!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.split("!Ih", "hi!hihi!hi!hhi!hihi!hi!hH");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("Hi!i!       aaHi!i!       ", "ih      !", "  hi!    ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Hi!i!       aaHi!i!       " + "'", str4, "Hi!i!       aaHi!i!       ");
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("I#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I#" + "'", str1, "I#");
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("!IH                                                                                            ", "  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ", "!!!HHIHHIHH");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!IH                                                                                            " + "'", str3, "!IH                                                                                            ");
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#" + "'", str1, "!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsIgnoreCase("i!      hi  hi!      hi!      hi", "aaaaaaaaahi!I#aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", (int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("####          !ih####      !!!hhihhihh####          !ih####      ", (int) '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####          !ih####      !!!hhihh" + "'", str2, "####          !ih####      !!!hhihh");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " hi" + "'", str1, " hi");
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("Hi!!IH!IH!", '#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("hI!", "aaaaaaaaahi!I#aaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAny("hi!      hi  hi!      hi!", " hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "  hi!    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#" + "'", str1, "!!HI#   !IH   HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#   HI!    HI#");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", 33, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      " + "'", str3, "hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("####          !ih####      !!!hhihh");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "####          !ih####      !!!hhihh" + "'", str1, "####          !ih####      !!!hhihh");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlpha("          !ih");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull("hi#!!IH!IH!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#!!IH!IH!" + "'", str1, "hi#!!IH!IH!");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("                                                                                      !!!hhIHhIHh", "hi!      hi  hi!      hi!      hi", "i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        int int3 = org.apache.commons.lang3.StringUtils.lastIndexOf("  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!                                                                                     ", '4', 12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBefore(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi", "hi...");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray1);
        java.lang.String[] strArray5 = org.apache.commons.lang3.StringUtils.stripAll(strArray1);
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray5);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.leftPad("                                                                                                I", 32, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                                                                I" + "'", str3, "                                                                                                I");
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.rightPad("####          !ih####      !!!hhihh", (int) (byte) -1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "####          !ih####      !!!hhihh" + "'", str2, "####          !ih####      !!!hhihh");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!Haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "!ih                                ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("################!!!hhihhihh#################", "    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.replace("hi#!!IH!IH!", "Hi!    ", " hi!  Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi       Hi", 65);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi#!!IH!IH!" + "'", str4, "hi#!!IH!IH!");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substring("hi #!", 4, 62);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "!" + "'", str3, "!");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("Hi!", "  hi!      hi  hi!      hi!      hi", (int) 'a');
        java.lang.String str6 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, "Hi!!IH!IH!");
        java.lang.String[] strArray9 = org.apache.commons.lang3.StringUtils.split("...");
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9);
        int int11 = org.apache.commons.lang3.StringUtils.indexOfAny("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", strArray9);
        java.lang.String str12 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("  hi!      hi  hi!      hi!      h", strArray4, strArray9);
        java.lang.String str14 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray9, 'a');
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Hi!" + "'", str6, "Hi!");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "..." + "'", str10, "...");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "  hi!      hi  hi!      hi!      h" + "'", str12, "  hi!      hi  hi!      hi!      h");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "..." + "'", str14, "...");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replace(" ", "          !ih", "..");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + " " + "'", str3, " ");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("                                                                                                    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "                                                                                                    " + "'", str1, "                                                                                                    ");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.difference("hi#####################...", " hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + " hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi" + "'", str2, " hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable(" hi  hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStart("!i", "####          !ih####          !ih####          !ih####          !ih####          !####          !ih");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!i" + "'", str2, "!i");
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("Hi!", '4', (int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        int int2 = org.apache.commons.lang3.StringUtils.getLevenshteinDistance("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 119 + "'", int2 == 119);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("i!      hi  hi!      hi!      hi", '#');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str2, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.upperCase("aaaaaaaaa Hi  Hi      Hi      Hiaaaaaaaa");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "AAAAAAAAA HI  HI      HI      HIAAAAAAAA" + "'", str1, "AAAAAAAAA HI  HI      HI      HIAAAAAAAA");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToEmpty(" hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitByCharacterTypeCamelCase("hi!      hi  hi!      hi!");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.substringBetween("       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!       Hi!", "!ih!ihihih!ih!ihih!ih!ih!ihihih!ih!ihih", "!!!hhihhihh");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEnd("  hi!  ...", ".");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  hi!  .." + "'", str2, "  hi!  ..");
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.startsWithIgnoreCase("     hi      hi      hi      hi !i", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("!Ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!I" + "'", str1, "!I");
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("                                                                                                I");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "I" + "'", str1, "I");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsAny("       Hi!", " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        int int1 = org.apache.commons.lang3.StringUtils.length("   hi !i");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 8 + "'", int1 == 8);
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
        java.lang.String[] strArray2 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator("HI", "Hi#!");
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.remove("  hi!    hI  hI...HI#!HI#!", ' ');
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!hIhI...HI#!HI#!" + "'", str2, "hi!hIhI...HI#!HI#!");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("hi...", "hi!#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBeforeLast("                                                                                                                                                                                iH                                                                                                                                                                            ", "4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444#IH");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "                                                                                                                                                                                iH                                                                                                                                                                            " + "'", str2, "                                                                                                                                                                                iH                                                                                                                                                                            ");
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("  hi!                                                                                                            ...", "hi");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("I#I!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", 3);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str2, "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringAfter("Hi!!IH!IH!i#!", "hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hihi!hi!hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("hi!  ...", "      hi ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAllLowerCase("hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("hI!44", "  hi!  ..");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "I!44" + "'", str2, "I!44");
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!  hi!      hi  hi!      hi!      hhi!hi!hi!hi!hi!hi!hi!hi!hi!hi!hi!", "h#  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi" + "'", str1, "  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH!Hi!!IH!IH", "hi!  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphanumericSpace("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HIi!      hi!      hi");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.splitByWholeSeparator(" HI  HI!      HI!      HI HI  HI!      HI!      HI! HI  HI!      HI!      HI HI  HI!      HI!      H", "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444", 99);
        java.lang.String[] strArray7 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str8 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray7);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfDifference(strArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny("   ", strArray7);
        java.lang.String str11 = org.apache.commons.lang3.StringUtils.replaceEachRepeatedly("!!!hhihhihh", strArray4, strArray7);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "!!!hhihhihh" + "'", str11, "!!!hhihhihh");
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("                      ", " hi  hi!      hi!      hi", 89);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray3, '#', 2, 64);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("    !iH", (int) (byte) 100, ' ');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "                                                  !iH                                               " + "'", str3, "                                                  !iH                                               ");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.splitPreserveAllTokens("hi!");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, "  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi  hi!      hi  hi!      hi!      hi");
        java.lang.Class<?> wildcardClass4 = strArray1.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h" + "'", str1, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAlphaSpace("                hi#!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substring("haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", 8);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa" + "'", str2, "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.left("AAAAAAAAA HI  HI      HI      HIAAAAAAAA", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "AAAAAAAAA " + "'", str2, "AAAAAAAAA ");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.stripStart("Hi!i!       aaHi!i!       ", "hi!I#");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi!i!       aaHi!i!       " + "'", str2, "Hi!i!       aaHi!i!       ");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.trimToNull(" hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H" + "'", str1, "hI  hI...HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!HI#!H");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaa", '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isBlank((java.lang.CharSequence) "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.defaultIfEmpty("hi !i", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi !i" + "'", str2, "hi !i");
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop(" !i!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " !i" + "'", str1, " !i");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotBlank((java.lang.CharSequence) "                HI#!!IH!IH!                 ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "I!      HI  HI!      HI!      HIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.swapCase("hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!hi!  hi!      hi  hi!      hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!" + "'", str1, "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi!      hi  hi!      hi!      h", "####");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray5);
        boolean boolean7 = org.apache.commons.lang3.StringUtils.containsOnly("", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("   ", charArray5);
        int int9 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h", (-1), 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h" + "'", str3, "hi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!hihi!hihi!hi!h");
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        java.lang.String[] strArray1 = org.apache.commons.lang3.StringUtils.split(".");
        java.lang.String str5 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray1, '#', 8, 8);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI", " Hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf("!#i", 'a', 35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString("!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI" + "'", str1, "!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI  HI!      HI  HI!      HI!      HI");
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.center("i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        ", 350, 'a');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa" + "'", str3, "aai            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i            i            i        i        aa");
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        java.lang.String[] strArray3 = org.apache.commons.lang3.StringUtils.splitByWholeSeparatorPreserveAllTokens("#############################################################################################################################################################################!IH##############################################################################################################################################################################", "aaaaa", 350);
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("  HI", 99);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI" + "'", str2, "  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI  HI");
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("!ih", "################!!!hhihhihh#################");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.defaultString(" Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h" + "'", str1, " Hi  Hi...hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!h");
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceOnce("  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! ", "i!      hi  hi!      hi!      hi");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "i!      hi  hi!      hi!      hi" + "'", str3, "i!      hi  hi!      hi!      hi");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase(" hi!", "                                                                                                    ");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.repeat("hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH!hi#!!IH!IH", "i!    ", (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.contains("    HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI! Hi  Hi      Hi      Hi  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI!      H  HI!      HI  HI!      HI", ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#        I##  hi!      hi  hi!      hi!     " + "'", str1, "#        I##  hi!      hi  hi!      hi!     ");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNumeric("  #hi#!#                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        char[] charArray5 = new char[] { '4' };
        boolean boolean6 = org.apache.commons.lang3.StringUtils.containsAny("Hi!", charArray5);
        int int7 = org.apache.commons.lang3.StringUtils.indexOfAny("hi#", charArray5);
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("!ih                                                                                                 ", charArray5);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("!#Ih", charArray5);
        org.junit.Assert.assertNotNull(charArray5);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray5), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray5), "[4]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.deleteWhitespace("HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI" + "'", str1, "HI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHIhhHI!hhhhhhHIhhHI!hhhhhhHI!hhhhhhHI");
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        char[] charArray7 = new char[] {};
        int int8 = org.apache.commons.lang3.StringUtils.indexOfAny("!ih", charArray7);
        boolean boolean9 = org.apache.commons.lang3.StringUtils.containsAny("!ih                                                                                                 ", charArray7);
        int int10 = org.apache.commons.lang3.StringUtils.indexOfAny(" hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      ", charArray7);
        boolean boolean11 = org.apache.commons.lang3.StringUtils.containsOnly("#############################################################################################################################################################################!IH##############################################################################################################################################################################", charArray7);
        boolean boolean12 = org.apache.commons.lang3.StringUtils.containsOnly("  hi!    ", charArray7);
        boolean boolean13 = org.apache.commons.lang3.StringUtils.containsOnly("                hi#!!IH!IH!                 ", charArray7);
        boolean boolean14 = org.apache.commons.lang3.StringUtils.containsOnly(" hi  hi!      hi!      hi", charArray7);
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray7), "");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray7), "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.endsWithIgnoreCase("  hi!   ", "HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!HI!  HI!      HI  HI!      HI!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("ih      !ih      !ih  ih      !ih");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ih      !ih      !ih  ih      !i" + "'", str1, "ih      !ih      !ih  ih      !i");
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
        java.lang.String str4 = org.apache.commons.lang3.StringUtils.overlay("hi#   !iH   hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#   hi!    hi#", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah", (int) (short) 1, 119);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah" + "'", str4, "haaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaah");
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        boolean boolean2 = org.apache.commons.lang3.StringUtils.containsNone("!ih                                ", "i");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        int int1 = org.apache.commons.lang3.StringUtils.length("i!      hi  hi!      hi!      hiaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 100 + "'", int1 == 100);
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chop("#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "#        I##  hi!      hi  hi!      hi!    " + "'", str1, "#        I##  hi!      hi  hi!      hi!    ");
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.rightPad("       Hi!       ", 26, '4');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "       Hi!       444444444" + "'", str3, "       Hi!       444444444");
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.chomp("4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444" + "'", str1, "4444444444444444444444444444444444444444444Hi!!IH!IH!44444444444444444444444444444444444444444444");
    }

    @Test
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeStartIgnoreCase("Hi#!", "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Hi#!" + "'", str2, "Hi#!");
    }

    @Test
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isNotEmpty((java.lang.CharSequence) "                                                  !iH                                               ");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.repeat("hi!      hi  hi!      hi!      ", (int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      " + "'", str2, "hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      hi!      hi  hi!      hi!      ");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        java.lang.String str3 = org.apache.commons.lang3.StringUtils.replaceChars("  hi!   ", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "a###                                                                                     ");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.substringBetween("!!!                                                                                                 ", "!!hi#   !iH   hi#   hi!!hi#   !iH   hi#   hi");
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        java.lang.String[] strArray4 = org.apache.commons.lang3.StringUtils.split(" hi  hi!      hi!      hi", '#');
        int int5 = org.apache.commons.lang3.StringUtils.lastIndexOfAny("...   ...", strArray4);
        boolean boolean6 = org.apache.commons.lang3.StringUtils.startsWithAny("    !i", strArray4);
        java.lang.String str10 = org.apache.commons.lang3.StringUtils.join((java.lang.Object[]) strArray4, ' ', (int) (short) 1, (-1));
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        java.lang.String[] strArray0 = null;
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.getCommonPrefix(strArray0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.uncapitalize("hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444" + "'", str1, "hi#4444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
        int int3 = org.apache.commons.lang3.StringUtils.ordinalIndexOf("  hi44444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444444", "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      #        I##", 33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
        int int3 = org.apache.commons.lang3.StringUtils.indexOf(" hi  hi!      hi!      hi", "!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH!!IH!IH", 116);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
        java.lang.String str2 = org.apache.commons.lang3.StringUtils.removeEndIgnoreCase("!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi", "Hi!i!             Hi!i         Hi!i!             Hi!i!             Hi!i         H");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi" + "'", str2, "!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi#!hi# Hi  Hi...hi");
    }

    @Test
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
        java.lang.String str1 = null; // flaky: org.apache.commons.lang3.StringUtils.stripAccents("Hi!i!       aaHi!i!       ");
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Hi!i!       aaHi!i!       " + "'", str1, "Hi!i!       aaHi!i!       ");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
        boolean boolean1 = org.apache.commons.lang3.StringUtils.isAsciiPrintable("hi!i#");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.reverse("hi!    ");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "    !ih" + "'", str1, "    !ih");
    }

    @Test
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
        int int2 = org.apache.commons.lang3.StringUtils.lastIndexOf("hi !i", "  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi! hI  hI      hI      hI  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!      h  hi!      hi  hi!      hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        java.lang.String str1 = org.apache.commons.lang3.StringUtils.strip("  hi");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi" + "'", str1, "hi");
    }

    @Test
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        int int2 = org.apache.commons.lang3.StringUtils.indexOf("HI", " Hi! hi  hi!      hi!      hi hi  hi!      hi!      hi! hi  hi!      hi!      hi hi  hi!      hi!      h");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        int int2 = org.apache.commons.lang3.StringUtils.indexOfAnyBut("hi!    ", "#        I##  hi!      hi  hi!      hi!     ");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + (-1) + "'", int2 == (-1));
    }
}
